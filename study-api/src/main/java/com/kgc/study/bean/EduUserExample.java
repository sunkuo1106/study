package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andEduUserNameIsNull() {
            addCriterion("edu_user_name is null");
            return (Criteria) this;
        }

        public Criteria andEduUserNameIsNotNull() {
            addCriterion("edu_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserNameEqualTo(String value) {
            addCriterion("edu_user_name =", value, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameNotEqualTo(String value) {
            addCriterion("edu_user_name <>", value, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameGreaterThan(String value) {
            addCriterion("edu_user_name >", value, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_name >=", value, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameLessThan(String value) {
            addCriterion("edu_user_name <", value, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameLessThanOrEqualTo(String value) {
            addCriterion("edu_user_name <=", value, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameLike(String value) {
            addCriterion("edu_user_name like", value, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameNotLike(String value) {
            addCriterion("edu_user_name not like", value, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameIn(List<String> values) {
            addCriterion("edu_user_name in", values, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameNotIn(List<String> values) {
            addCriterion("edu_user_name not in", values, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameBetween(String value1, String value2) {
            addCriterion("edu_user_name between", value1, value2, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserNameNotBetween(String value1, String value2) {
            addCriterion("edu_user_name not between", value1, value2, "eduUserName");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneIsNull() {
            addCriterion("edu_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneIsNotNull() {
            addCriterion("edu_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneEqualTo(String value) {
            addCriterion("edu_user_phone =", value, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneNotEqualTo(String value) {
            addCriterion("edu_user_phone <>", value, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneGreaterThan(String value) {
            addCriterion("edu_user_phone >", value, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_phone >=", value, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneLessThan(String value) {
            addCriterion("edu_user_phone <", value, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("edu_user_phone <=", value, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneLike(String value) {
            addCriterion("edu_user_phone like", value, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneNotLike(String value) {
            addCriterion("edu_user_phone not like", value, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneIn(List<String> values) {
            addCriterion("edu_user_phone in", values, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneNotIn(List<String> values) {
            addCriterion("edu_user_phone not in", values, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneBetween(String value1, String value2) {
            addCriterion("edu_user_phone between", value1, value2, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserPhoneNotBetween(String value1, String value2) {
            addCriterion("edu_user_phone not between", value1, value2, "eduUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardIsNull() {
            addCriterion("edu_user_id_card is null");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardIsNotNull() {
            addCriterion("edu_user_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardEqualTo(String value) {
            addCriterion("edu_user_id_card =", value, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardNotEqualTo(String value) {
            addCriterion("edu_user_id_card <>", value, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardGreaterThan(String value) {
            addCriterion("edu_user_id_card >", value, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_id_card >=", value, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardLessThan(String value) {
            addCriterion("edu_user_id_card <", value, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardLessThanOrEqualTo(String value) {
            addCriterion("edu_user_id_card <=", value, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardLike(String value) {
            addCriterion("edu_user_id_card like", value, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardNotLike(String value) {
            addCriterion("edu_user_id_card not like", value, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardIn(List<String> values) {
            addCriterion("edu_user_id_card in", values, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardNotIn(List<String> values) {
            addCriterion("edu_user_id_card not in", values, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardBetween(String value1, String value2) {
            addCriterion("edu_user_id_card between", value1, value2, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserIdCardNotBetween(String value1, String value2) {
            addCriterion("edu_user_id_card not between", value1, value2, "eduUserIdCard");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderIsNull() {
            addCriterion("edu_user_gender is null");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderIsNotNull() {
            addCriterion("edu_user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderEqualTo(Byte value) {
            addCriterion("edu_user_gender =", value, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderNotEqualTo(Byte value) {
            addCriterion("edu_user_gender <>", value, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderGreaterThan(Byte value) {
            addCriterion("edu_user_gender >", value, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("edu_user_gender >=", value, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderLessThan(Byte value) {
            addCriterion("edu_user_gender <", value, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderLessThanOrEqualTo(Byte value) {
            addCriterion("edu_user_gender <=", value, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderIn(List<Byte> values) {
            addCriterion("edu_user_gender in", values, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderNotIn(List<Byte> values) {
            addCriterion("edu_user_gender not in", values, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderBetween(Byte value1, Byte value2) {
            addCriterion("edu_user_gender between", value1, value2, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("edu_user_gender not between", value1, value2, "eduUserGender");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgIsNull() {
            addCriterion("edu_user_pic_img is null");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgIsNotNull() {
            addCriterion("edu_user_pic_img is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgEqualTo(String value) {
            addCriterion("edu_user_pic_img =", value, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgNotEqualTo(String value) {
            addCriterion("edu_user_pic_img <>", value, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgGreaterThan(String value) {
            addCriterion("edu_user_pic_img >", value, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_pic_img >=", value, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgLessThan(String value) {
            addCriterion("edu_user_pic_img <", value, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgLessThanOrEqualTo(String value) {
            addCriterion("edu_user_pic_img <=", value, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgLike(String value) {
            addCriterion("edu_user_pic_img like", value, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgNotLike(String value) {
            addCriterion("edu_user_pic_img not like", value, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgIn(List<String> values) {
            addCriterion("edu_user_pic_img in", values, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgNotIn(List<String> values) {
            addCriterion("edu_user_pic_img not in", values, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgBetween(String value1, String value2) {
            addCriterion("edu_user_pic_img between", value1, value2, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserPicImgNotBetween(String value1, String value2) {
            addCriterion("edu_user_pic_img not between", value1, value2, "eduUserPicImg");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollIsNull() {
            addCriterion("edu_user_school_roll is null");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollIsNotNull() {
            addCriterion("edu_user_school_roll is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollEqualTo(Date value) {
            addCriterion("edu_user_school_roll =", value, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollNotEqualTo(Date value) {
            addCriterion("edu_user_school_roll <>", value, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollGreaterThan(Date value) {
            addCriterion("edu_user_school_roll >", value, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollGreaterThanOrEqualTo(Date value) {
            addCriterion("edu_user_school_roll >=", value, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollLessThan(Date value) {
            addCriterion("edu_user_school_roll <", value, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollLessThanOrEqualTo(Date value) {
            addCriterion("edu_user_school_roll <=", value, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollIn(List<Date> values) {
            addCriterion("edu_user_school_roll in", values, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollNotIn(List<Date> values) {
            addCriterion("edu_user_school_roll not in", values, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollBetween(Date value1, Date value2) {
            addCriterion("edu_user_school_roll between", value1, value2, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolRollNotBetween(Date value1, Date value2) {
            addCriterion("edu_user_school_roll not between", value1, value2, "eduUserSchoolRoll");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassIsNull() {
            addCriterion("edu_user_is_pass is null");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassIsNotNull() {
            addCriterion("edu_user_is_pass is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassEqualTo(Byte value) {
            addCriterion("edu_user_is_pass =", value, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassNotEqualTo(Byte value) {
            addCriterion("edu_user_is_pass <>", value, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassGreaterThan(Byte value) {
            addCriterion("edu_user_is_pass >", value, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassGreaterThanOrEqualTo(Byte value) {
            addCriterion("edu_user_is_pass >=", value, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassLessThan(Byte value) {
            addCriterion("edu_user_is_pass <", value, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassLessThanOrEqualTo(Byte value) {
            addCriterion("edu_user_is_pass <=", value, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassIn(List<Byte> values) {
            addCriterion("edu_user_is_pass in", values, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassNotIn(List<Byte> values) {
            addCriterion("edu_user_is_pass not in", values, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassBetween(Byte value1, Byte value2) {
            addCriterion("edu_user_is_pass between", value1, value2, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserIsPassNotBetween(Byte value1, Byte value2) {
            addCriterion("edu_user_is_pass not between", value1, value2, "eduUserIsPass");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailIsNull() {
            addCriterion("edu_user_email is null");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailIsNotNull() {
            addCriterion("edu_user_email is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailEqualTo(String value) {
            addCriterion("edu_user_email =", value, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailNotEqualTo(String value) {
            addCriterion("edu_user_email <>", value, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailGreaterThan(String value) {
            addCriterion("edu_user_email >", value, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_email >=", value, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailLessThan(String value) {
            addCriterion("edu_user_email <", value, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailLessThanOrEqualTo(String value) {
            addCriterion("edu_user_email <=", value, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailLike(String value) {
            addCriterion("edu_user_email like", value, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailNotLike(String value) {
            addCriterion("edu_user_email not like", value, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailIn(List<String> values) {
            addCriterion("edu_user_email in", values, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailNotIn(List<String> values) {
            addCriterion("edu_user_email not in", values, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailBetween(String value1, String value2) {
            addCriterion("edu_user_email between", value1, value2, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserEmailNotBetween(String value1, String value2) {
            addCriterion("edu_user_email not between", value1, value2, "eduUserEmail");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleIsNull() {
            addCriterion("edu_user_is_avalible is null");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleIsNotNull() {
            addCriterion("edu_user_is_avalible is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleEqualTo(String value) {
            addCriterion("edu_user_is_avalible =", value, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleNotEqualTo(String value) {
            addCriterion("edu_user_is_avalible <>", value, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleGreaterThan(String value) {
            addCriterion("edu_user_is_avalible >", value, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_is_avalible >=", value, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleLessThan(String value) {
            addCriterion("edu_user_is_avalible <", value, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleLessThanOrEqualTo(String value) {
            addCriterion("edu_user_is_avalible <=", value, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleLike(String value) {
            addCriterion("edu_user_is_avalible like", value, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleNotLike(String value) {
            addCriterion("edu_user_is_avalible not like", value, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleIn(List<String> values) {
            addCriterion("edu_user_is_avalible in", values, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleNotIn(List<String> values) {
            addCriterion("edu_user_is_avalible not in", values, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleBetween(String value1, String value2) {
            addCriterion("edu_user_is_avalible between", value1, value2, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsAvalibleNotBetween(String value1, String value2) {
            addCriterion("edu_user_is_avalible not between", value1, value2, "eduUserIsAvalible");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentIsNull() {
            addCriterion("edu_user_is_good_student is null");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentIsNotNull() {
            addCriterion("edu_user_is_good_student is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentEqualTo(Integer value) {
            addCriterion("edu_user_is_good_student =", value, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentNotEqualTo(Integer value) {
            addCriterion("edu_user_is_good_student <>", value, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentGreaterThan(Integer value) {
            addCriterion("edu_user_is_good_student >", value, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_user_is_good_student >=", value, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentLessThan(Integer value) {
            addCriterion("edu_user_is_good_student <", value, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentLessThanOrEqualTo(Integer value) {
            addCriterion("edu_user_is_good_student <=", value, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentIn(List<Integer> values) {
            addCriterion("edu_user_is_good_student in", values, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentNotIn(List<Integer> values) {
            addCriterion("edu_user_is_good_student not in", values, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentBetween(Integer value1, Integer value2) {
            addCriterion("edu_user_is_good_student between", value1, value2, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserIsGoodStudentNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_user_is_good_student not between", value1, value2, "eduUserIsGoodStudent");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodIsNull() {
            addCriterion("edu_user_enrollment_method is null");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodIsNotNull() {
            addCriterion("edu_user_enrollment_method is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodEqualTo(Byte value) {
            addCriterion("edu_user_enrollment_method =", value, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodNotEqualTo(Byte value) {
            addCriterion("edu_user_enrollment_method <>", value, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodGreaterThan(Byte value) {
            addCriterion("edu_user_enrollment_method >", value, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodGreaterThanOrEqualTo(Byte value) {
            addCriterion("edu_user_enrollment_method >=", value, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodLessThan(Byte value) {
            addCriterion("edu_user_enrollment_method <", value, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodLessThanOrEqualTo(Byte value) {
            addCriterion("edu_user_enrollment_method <=", value, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodIn(List<Byte> values) {
            addCriterion("edu_user_enrollment_method in", values, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodNotIn(List<Byte> values) {
            addCriterion("edu_user_enrollment_method not in", values, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodBetween(Byte value1, Byte value2) {
            addCriterion("edu_user_enrollment_method between", value1, value2, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andEduUserEnrollmentMethodNotBetween(Byte value1, Byte value2) {
            addCriterion("edu_user_enrollment_method not between", value1, value2, "eduUserEnrollmentMethod");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(Integer value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(Integer value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(Integer value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(Integer value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(Integer value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<Integer> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<Integer> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(Integer value1, Integer value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontIsNull() {
            addCriterion("edu_user_identity_front is null");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontIsNotNull() {
            addCriterion("edu_user_identity_front is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontEqualTo(String value) {
            addCriterion("edu_user_identity_front =", value, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontNotEqualTo(String value) {
            addCriterion("edu_user_identity_front <>", value, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontGreaterThan(String value) {
            addCriterion("edu_user_identity_front >", value, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_identity_front >=", value, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontLessThan(String value) {
            addCriterion("edu_user_identity_front <", value, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontLessThanOrEqualTo(String value) {
            addCriterion("edu_user_identity_front <=", value, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontLike(String value) {
            addCriterion("edu_user_identity_front like", value, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontNotLike(String value) {
            addCriterion("edu_user_identity_front not like", value, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontIn(List<String> values) {
            addCriterion("edu_user_identity_front in", values, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontNotIn(List<String> values) {
            addCriterion("edu_user_identity_front not in", values, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontBetween(String value1, String value2) {
            addCriterion("edu_user_identity_front between", value1, value2, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityFrontNotBetween(String value1, String value2) {
            addCriterion("edu_user_identity_front not between", value1, value2, "eduUserIdentityFront");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseIsNull() {
            addCriterion("edu_user_identity_reverse is null");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseIsNotNull() {
            addCriterion("edu_user_identity_reverse is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseEqualTo(String value) {
            addCriterion("edu_user_identity_reverse =", value, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseNotEqualTo(String value) {
            addCriterion("edu_user_identity_reverse <>", value, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseGreaterThan(String value) {
            addCriterion("edu_user_identity_reverse >", value, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_identity_reverse >=", value, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseLessThan(String value) {
            addCriterion("edu_user_identity_reverse <", value, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseLessThanOrEqualTo(String value) {
            addCriterion("edu_user_identity_reverse <=", value, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseLike(String value) {
            addCriterion("edu_user_identity_reverse like", value, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseNotLike(String value) {
            addCriterion("edu_user_identity_reverse not like", value, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseIn(List<String> values) {
            addCriterion("edu_user_identity_reverse in", values, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseNotIn(List<String> values) {
            addCriterion("edu_user_identity_reverse not in", values, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseBetween(String value1, String value2) {
            addCriterion("edu_user_identity_reverse between", value1, value2, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserIdentityReverseNotBetween(String value1, String value2) {
            addCriterion("edu_user_identity_reverse not between", value1, value2, "eduUserIdentityReverse");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveIsNull() {
            addCriterion("edu_user_school_prove is null");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveIsNotNull() {
            addCriterion("edu_user_school_prove is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveEqualTo(String value) {
            addCriterion("edu_user_school_prove =", value, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveNotEqualTo(String value) {
            addCriterion("edu_user_school_prove <>", value, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveGreaterThan(String value) {
            addCriterion("edu_user_school_prove >", value, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_school_prove >=", value, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveLessThan(String value) {
            addCriterion("edu_user_school_prove <", value, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveLessThanOrEqualTo(String value) {
            addCriterion("edu_user_school_prove <=", value, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveLike(String value) {
            addCriterion("edu_user_school_prove like", value, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveNotLike(String value) {
            addCriterion("edu_user_school_prove not like", value, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveIn(List<String> values) {
            addCriterion("edu_user_school_prove in", values, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveNotIn(List<String> values) {
            addCriterion("edu_user_school_prove not in", values, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveBetween(String value1, String value2) {
            addCriterion("edu_user_school_prove between", value1, value2, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSchoolProveNotBetween(String value1, String value2) {
            addCriterion("edu_user_school_prove not between", value1, value2, "eduUserSchoolProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveIsNull() {
            addCriterion("edu_user_work_prove is null");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveIsNotNull() {
            addCriterion("edu_user_work_prove is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveEqualTo(String value) {
            addCriterion("edu_user_work_prove =", value, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveNotEqualTo(String value) {
            addCriterion("edu_user_work_prove <>", value, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveGreaterThan(String value) {
            addCriterion("edu_user_work_prove >", value, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_work_prove >=", value, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveLessThan(String value) {
            addCriterion("edu_user_work_prove <", value, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveLessThanOrEqualTo(String value) {
            addCriterion("edu_user_work_prove <=", value, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveLike(String value) {
            addCriterion("edu_user_work_prove like", value, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveNotLike(String value) {
            addCriterion("edu_user_work_prove not like", value, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveIn(List<String> values) {
            addCriterion("edu_user_work_prove in", values, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveNotIn(List<String> values) {
            addCriterion("edu_user_work_prove not in", values, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveBetween(String value1, String value2) {
            addCriterion("edu_user_work_prove between", value1, value2, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserWorkProveNotBetween(String value1, String value2) {
            addCriterion("edu_user_work_prove not between", value1, value2, "eduUserWorkProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveIsNull() {
            addCriterion("edu_user_soldier_prove is null");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveIsNotNull() {
            addCriterion("edu_user_soldier_prove is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveEqualTo(String value) {
            addCriterion("edu_user_soldier_prove =", value, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveNotEqualTo(String value) {
            addCriterion("edu_user_soldier_prove <>", value, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveGreaterThan(String value) {
            addCriterion("edu_user_soldier_prove >", value, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_soldier_prove >=", value, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveLessThan(String value) {
            addCriterion("edu_user_soldier_prove <", value, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveLessThanOrEqualTo(String value) {
            addCriterion("edu_user_soldier_prove <=", value, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveLike(String value) {
            addCriterion("edu_user_soldier_prove like", value, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveNotLike(String value) {
            addCriterion("edu_user_soldier_prove not like", value, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveIn(List<String> values) {
            addCriterion("edu_user_soldier_prove in", values, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveNotIn(List<String> values) {
            addCriterion("edu_user_soldier_prove not in", values, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveBetween(String value1, String value2) {
            addCriterion("edu_user_soldier_prove between", value1, value2, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserSoldierProveNotBetween(String value1, String value2) {
            addCriterion("edu_user_soldier_prove not between", value1, value2, "eduUserSoldierProve");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationIsNull() {
            addCriterion("edu_user_highest_education is null");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationIsNotNull() {
            addCriterion("edu_user_highest_education is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationEqualTo(String value) {
            addCriterion("edu_user_highest_education =", value, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationNotEqualTo(String value) {
            addCriterion("edu_user_highest_education <>", value, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationGreaterThan(String value) {
            addCriterion("edu_user_highest_education >", value, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationGreaterThanOrEqualTo(String value) {
            addCriterion("edu_user_highest_education >=", value, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationLessThan(String value) {
            addCriterion("edu_user_highest_education <", value, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationLessThanOrEqualTo(String value) {
            addCriterion("edu_user_highest_education <=", value, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationLike(String value) {
            addCriterion("edu_user_highest_education like", value, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationNotLike(String value) {
            addCriterion("edu_user_highest_education not like", value, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationIn(List<String> values) {
            addCriterion("edu_user_highest_education in", values, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationNotIn(List<String> values) {
            addCriterion("edu_user_highest_education not in", values, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationBetween(String value1, String value2) {
            addCriterion("edu_user_highest_education between", value1, value2, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andEduUserHighestEducationNotBetween(String value1, String value2) {
            addCriterion("edu_user_highest_education not between", value1, value2, "eduUserHighestEducation");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIsNull() {
            addCriterion("grade_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIsNotNull() {
            addCriterion("grade_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdEqualTo(Integer value) {
            addCriterion("grade_type_id =", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotEqualTo(Integer value) {
            addCriterion("grade_type_id <>", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdGreaterThan(Integer value) {
            addCriterion("grade_type_id >", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_type_id >=", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdLessThan(Integer value) {
            addCriterion("grade_type_id <", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_type_id <=", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIn(List<Integer> values) {
            addCriterion("grade_type_id in", values, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotIn(List<Integer> values) {
            addCriterion("grade_type_id not in", values, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_type_id between", value1, value2, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_type_id not between", value1, value2, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdIsNull() {
            addCriterion("agency_address_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdIsNotNull() {
            addCriterion("agency_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdEqualTo(Integer value) {
            addCriterion("agency_address_id =", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotEqualTo(Integer value) {
            addCriterion("agency_address_id <>", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdGreaterThan(Integer value) {
            addCriterion("agency_address_id >", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agency_address_id >=", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdLessThan(Integer value) {
            addCriterion("agency_address_id <", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("agency_address_id <=", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdIn(List<Integer> values) {
            addCriterion("agency_address_id in", values, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotIn(List<Integer> values) {
            addCriterion("agency_address_id not in", values, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("agency_address_id between", value1, value2, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agency_address_id not between", value1, value2, "agencyAddressId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}