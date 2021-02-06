$(document).ready(function () {
    cha();
    // $(".shou").click(function () {
    //     pageIndex = data.firstPage;
    //     cha()
    // })
    // $(".shang").click(function () {
    //     pageIndex = data.prePage;
    //     cha()
    // })
    // $(".xia").click(function () {
    //     pageIndex = data.nextPage;
    //     cha()
    // })
    // $(".wei").click(function () {
    //     pageIndex = data.lastPage;
    //     cha()
    // })
    //
    // $(".chaCustomer").click(function () {
    //     cha();
    // });
    //
    // $(".btn_ins").click(function () {
    //     $(".div_asd").show();
    // });

    // $.post("/doHoust",function (result) {
    //     console.log(result.data)
    //     $.each(result.data,function (i,v) {
    //         var $option = $("<option value='"+v.houseid+"'>"+v.housename+"</option>");
    //         $(".leixing").append($option);
    //     });
    // },"json");
    //
    // $.post("/doCustomerSelAll",function (result) {
    //     console.log(result.data)
    //     $.each(result.data,function (i,v) {
    //         var $option = $("<option value='"+v.customerid+"'>"+v.customerloginname+"</option>");
    //         $(".userSel").append($option);
    //     });
    // },"json");













$("#btn_div").click(function () {
    cha();
});









})


var pageIndex;
var pageSize;

// var data;
function cha() {
    // $(".b_list").remove();
    var start = $("#start").val();
    var end = $("#end").val();
    // var val = Date.parse(start);
    // var val2 = Date.parse(end);
    // var newDate = new Date(val);
    // var newDate2 = new Date(val2);
    var title = $("#title").val();
    alert(start)
    alert(end)
    alert(title)
    var json = {
        pageSize: pageSize,
        pageIndex: pageIndex,
        gmtCreate1: start,
        gmtCreate2: end,
        title: title
    }
    $.post("/news-list-sel", json, function (resoult) {
        // data = resoult.data;
        // $(".ye").text(resoult.data.pageNum + "/" + resoult.data.pages);
        $.each(resoult.pageInfo.list, function (i, v) {
            // yuding = v.checkindate.substring(0,10);
            // tuifang = v.checkoutdate.substring(0,10);
            var $div = $(" <tbody>\n" +
                "                                <tr>\n" +
                "                                  <td>\n" +
                "                                    <input type=\"checkbox\" name=\"\"  lay-skin=\"primary\">\n" +
                "                                  </td>\n" +
                "                                  <td>'" + v.id + "'</td>\n" +
                "                                  <td>'" + v.newsInfoTitle + "'</td>\n" +
                "                                  <td class=\"td-manage\">\n" +
                "                                    <a title=\"编辑\"  onclick=\"xadmin.open('编辑','/news-edit')\" href=\"javascript:;\">\n" +
                "                                      <i class=\"layui-icon\">&#xe642;</i>\n" +
                "                                    </a>\n" +
                "                                    <a title=\"删除\" onclick=\"member_del(this,'要删除的id')\" href=\"javascript:;\">\n" +
                "                                      <i class=\"layui-icon\">&#xe640;</i>\n" +
                "                                    </a>\n" +
                "                                  </td>\n" +
                "                                </tr>\n" +
                "                              </tbody>");
            $("#tableNewsList").append($div);
        })
        // $(".xiu").click(function () {
        //     var id = $(this).parent().prev().prev().prev().prev().prev().prev().prev().prev().text();
        //     alert(id)
        //     var json = {
        //         id : id
        //     }
        //     $.post("/doReservationChuan",json,function (data) {
        //         console.log(data.data)
        //         $("input[name=orderid]").val(data.data.orderid);
        //         $("input[name=userid]").val(data.data.userid);
        //         $("input[name=subordinateRome]").val(data.data.subordinateRome);
        //         $("input[name=checkname]").val(data.data.checkname);
        //         $("input[name=checknumber]").val(data.data.checknumber);
        //         $("input[name=checkphone]").val(data.data.checkphone);
        //         $("input[name=status]").val(data.data.status);
        //     },"json")
        // });

    }, "json");
}