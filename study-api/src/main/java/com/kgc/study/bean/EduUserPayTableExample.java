package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduUserPayTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduUserPayTableExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andPayUserNameIsNull() {
            addCriterion("pay_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPayUserNameIsNotNull() {
            addCriterion("pay_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserNameEqualTo(String value) {
            addCriterion("pay_user_name =", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotEqualTo(String value) {
            addCriterion("pay_user_name <>", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameGreaterThan(String value) {
            addCriterion("pay_user_name >", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_user_name >=", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLessThan(String value) {
            addCriterion("pay_user_name <", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLessThanOrEqualTo(String value) {
            addCriterion("pay_user_name <=", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLike(String value) {
            addCriterion("pay_user_name like", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotLike(String value) {
            addCriterion("pay_user_name not like", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameIn(List<String> values) {
            addCriterion("pay_user_name in", values, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotIn(List<String> values) {
            addCriterion("pay_user_name not in", values, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameBetween(String value1, String value2) {
            addCriterion("pay_user_name between", value1, value2, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotBetween(String value1, String value2) {
            addCriterion("pay_user_name not between", value1, value2, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardIsNull() {
            addCriterion("pay_user_id_card is null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardIsNotNull() {
            addCriterion("pay_user_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardEqualTo(String value) {
            addCriterion("pay_user_id_card =", value, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardNotEqualTo(String value) {
            addCriterion("pay_user_id_card <>", value, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardGreaterThan(String value) {
            addCriterion("pay_user_id_card >", value, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("pay_user_id_card >=", value, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardLessThan(String value) {
            addCriterion("pay_user_id_card <", value, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardLessThanOrEqualTo(String value) {
            addCriterion("pay_user_id_card <=", value, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardLike(String value) {
            addCriterion("pay_user_id_card like", value, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardNotLike(String value) {
            addCriterion("pay_user_id_card not like", value, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardIn(List<String> values) {
            addCriterion("pay_user_id_card in", values, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardNotIn(List<String> values) {
            addCriterion("pay_user_id_card not in", values, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardBetween(String value1, String value2) {
            addCriterion("pay_user_id_card between", value1, value2, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserIdCardNotBetween(String value1, String value2) {
            addCriterion("pay_user_id_card not between", value1, value2, "payUserIdCard");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneIsNull() {
            addCriterion("pay_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneIsNotNull() {
            addCriterion("pay_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneEqualTo(String value) {
            addCriterion("pay_user_phone =", value, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneNotEqualTo(String value) {
            addCriterion("pay_user_phone <>", value, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneGreaterThan(String value) {
            addCriterion("pay_user_phone >", value, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pay_user_phone >=", value, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneLessThan(String value) {
            addCriterion("pay_user_phone <", value, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("pay_user_phone <=", value, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneLike(String value) {
            addCriterion("pay_user_phone like", value, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneNotLike(String value) {
            addCriterion("pay_user_phone not like", value, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneIn(List<String> values) {
            addCriterion("pay_user_phone in", values, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneNotIn(List<String> values) {
            addCriterion("pay_user_phone not in", values, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneBetween(String value1, String value2) {
            addCriterion("pay_user_phone between", value1, value2, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andPayUserPhoneNotBetween(String value1, String value2) {
            addCriterion("pay_user_phone not between", value1, value2, "payUserPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceIsNull() {
            addCriterion("edu_order_class_price is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceIsNotNull() {
            addCriterion("edu_order_class_price is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceEqualTo(Long value) {
            addCriterion("edu_order_class_price =", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceNotEqualTo(Long value) {
            addCriterion("edu_order_class_price <>", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceGreaterThan(Long value) {
            addCriterion("edu_order_class_price >", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("edu_order_class_price >=", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceLessThan(Long value) {
            addCriterion("edu_order_class_price <", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceLessThanOrEqualTo(Long value) {
            addCriterion("edu_order_class_price <=", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceIn(List<Long> values) {
            addCriterion("edu_order_class_price in", values, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceNotIn(List<Long> values) {
            addCriterion("edu_order_class_price not in", values, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceBetween(Long value1, Long value2) {
            addCriterion("edu_order_class_price between", value1, value2, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceNotBetween(Long value1, Long value2) {
            addCriterion("edu_order_class_price not between", value1, value2, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayMannerIsNull() {
            addCriterion("pay_manner is null");
            return (Criteria) this;
        }

        public Criteria andPayMannerIsNotNull() {
            addCriterion("pay_manner is not null");
            return (Criteria) this;
        }

        public Criteria andPayMannerEqualTo(Integer value) {
            addCriterion("pay_manner =", value, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerNotEqualTo(Integer value) {
            addCriterion("pay_manner <>", value, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerGreaterThan(Integer value) {
            addCriterion("pay_manner >", value, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_manner >=", value, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerLessThan(Integer value) {
            addCriterion("pay_manner <", value, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerLessThanOrEqualTo(Integer value) {
            addCriterion("pay_manner <=", value, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerIn(List<Integer> values) {
            addCriterion("pay_manner in", values, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerNotIn(List<Integer> values) {
            addCriterion("pay_manner not in", values, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerBetween(Integer value1, Integer value2) {
            addCriterion("pay_manner between", value1, value2, "payManner");
            return (Criteria) this;
        }

        public Criteria andPayMannerNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_manner not between", value1, value2, "payManner");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIsNull() {
            addCriterion("logic_delete is null");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIsNotNull() {
            addCriterion("logic_delete is not null");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteEqualTo(Integer value) {
            addCriterion("logic_delete =", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotEqualTo(Integer value) {
            addCriterion("logic_delete <>", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteGreaterThan(Integer value) {
            addCriterion("logic_delete >", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("logic_delete >=", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteLessThan(Integer value) {
            addCriterion("logic_delete <", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("logic_delete <=", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIn(List<Integer> values) {
            addCriterion("logic_delete in", values, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotIn(List<Integer> values) {
            addCriterion("logic_delete not in", values, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteBetween(Integer value1, Integer value2) {
            addCriterion("logic_delete between", value1, value2, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("logic_delete not between", value1, value2, "logicDelete");
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