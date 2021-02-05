package com.kgc.study.studytravelcoach.utils;


import com.kgc.study.bean.EduUser;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class ExcelUtils {

    //解析excel
    public List<EduUser> createExcel(File file, String originalFileSuffix){
        //封装表头与实体类映射关系
        Map<String,String> headerMapper=new HashMap<>();
        headerMapper.put("用户姓名","eduUserName");
        headerMapper.put("手机号","eduUserPhone");
        headerMapper.put("身份证","eduUserIdCard");
        headerMapper.put("性别 (1男生 0女生)","eduUserGender");
        headerMapper.put("创建学籍时间","eduUserSchoolRoll");
        headerMapper.put("证书状态","eduUserIsPass");
        headerMapper.put("电子邮箱","eduUserEmail");
        headerMapper.put("是否可用 1正常  2冻结","eduUserIsAvalible");
        //输入流
        InputStream inputStream= null;
        try {
            inputStream = new FileInputStream(file);
            Workbook workbook= originalFileSuffix.equals("xls") ? new HSSFWorkbook(inputStream) : new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getPhysicalNumberOfRows();
            //表头
            //解析表头.默认第一行为表头
            Iterator<Row> rowIterator = sheet.rowIterator();
            //第一行
            Row firstRow = rowIterator.next();
            Iterator<Cell> firstCell = firstRow.cellIterator();

            Set<String> existHeaderSet = new HashSet<>();
            List<String> existHeader = new ArrayList<>(headerMapper.size());
            firstCell.forEachRemaining(cell -> {
                if (cell.getCellType() != Cell.CELL_TYPE_STRING) {
                    throw new IllegalArgumentException("第一行必须全部为字符串,第" + cell.getColumnIndex() + 1 + "有问题");
                }
                existHeaderSet.add(cell.getStringCellValue());
                existHeader.add(cell.getStringCellValue());
            });
            //查询出不存在的表头
            for (String s : headerMapper.keySet()) {
                if (!existHeaderSet.contains(s)) {
                    throw new IllegalArgumentException("不存在的表头:" + s);
                }
            }
            Integer lineNumber = 0;
            List<EduUser> result = new ArrayList<EduUser>();

            Map<String, Object> tempMap = new HashMap<>();
            try {
                int rowCount1 = sheet.getPhysicalNumberOfRows();
                for (int rowNum = 1; rowNum < rowCount; rowNum++) {
                    Row rowData = sheet.getRow(rowNum);
                    if (rowData != null) {// 行不为空
                        // 读取cell
                        int cellCount = rowData.getPhysicalNumberOfCells();
                        for (int cellNum = 0; cellNum < cellCount; cellNum++) {
                            Cell cell = rowData.getCell(cellNum);
                            if (cell != null) {
                                int cellType = cell.getCellType();
                                //判断单元格数据类型
                                String cellValue =getCellVaule(cellType,cell);
                                String key = headerMapper.get(existHeader.get(cellNum));
                                tempMap.put(key, cellValue);
                            }
                        }
                        EduUser eduUser = map2Bean(tempMap, EduUser.class);
                        result.add(eduUser);
                    }
                }
            } catch (Exception e) {

            }
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    /**
     * map转bean
     * @param source   map属性
     * @param instance 要转换成的实体类
     * @return
     */
    public <T> T map2Bean(Map<String, Object> source, Class<T> instance) {
        try {
            T object = instance.newInstance();
            Field[] fields = object.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                String value = (String) source.get(field.getName());
                String canonicalName = field.getType().getCanonicalName();
                if (value==null||value.equals("null")){
                    continue;
                }
                switch (canonicalName){
                    case "java.lang.Integer" :
                        field.set(object,Integer.valueOf(value));
                        break;
                    case "java.util.Date"  :
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date parse = simpleDateFormat.parse(value);
                        field.set(object, parse);
                        break;
                    case "java.lang.String" :
                        field.set(object,value);
                        break;
                    default:
                        throw new Exception("错误类型");
                }
            }
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //解析格式
    public String getCellVaule(int cellType,Cell cell){
        String cellValue = "";
        switch (cellType) {
            case HSSFCell.CELL_TYPE_STRING://字符串
                cellValue = cell.getStringCellValue();
                break;

            case HSSFCell.CELL_TYPE_BOOLEAN://布尔
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;

            case HSSFCell.CELL_TYPE_BLANK://空
                break;

            case HSSFCell.CELL_TYPE_NUMERIC:

                if (HSSFDateUtil.isCellDateFormatted(cell)) {//日期
                    Date date = cell.getDateCellValue();
                    cellValue = new DateTime(date).toString("yyyy-MM-dd");
                } else {
                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                    cellValue = cell.toString();
                }
                break;

            case Cell.CELL_TYPE_ERROR:
                break;
        }
        return cellValue;
    }
}
