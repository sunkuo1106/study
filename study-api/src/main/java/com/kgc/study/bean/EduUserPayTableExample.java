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

        public Criteria andEduOrderNameIsNull() {
            addCriterion("edu_order_name is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameIsNotNull() {
            addCriterion("edu_order_name is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameEqualTo(String value) {
            addCriterion("edu_order_name =", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameNotEqualTo(String value) {
            addCriterion("edu_order_name <>", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameGreaterThan(String value) {
            addCriterion("edu_order_name >", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("edu_order_name >=", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameLessThan(String value) {
            addCriterion("edu_order_name <", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameLessThanOrEqualTo(String value) {
            addCriterion("edu_order_name <=", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameLike(String value) {
            addCriterion("edu_order_name like", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameNotLike(String value) {
            addCriterion("edu_order_name not like", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameIn(List<String> values) {
            addCriterion("edu_order_name in", values, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameNotIn(List<String> values) {
            addCriterion("edu_order_name not in", values, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameBetween(String value1, String value2) {
            addCriterion("edu_order_name between", value1, value2, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameNotBetween(String value1, String value2) {
            addCriterion("edu_order_name not between", value1, value2, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardIsNull() {
            addCriterion("edu_order_id_card is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardIsNotNull() {
            addCriterion("edu_order_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardEqualTo(String value) {
            addCriterion("edu_order_id_card =", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardNotEqualTo(String value) {
            addCriterion("edu_order_id_card <>", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardGreaterThan(String value) {
            addCriterion("edu_order_id_card >", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("edu_order_id_card >=", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardLessThan(String value) {
            addCriterion("edu_order_id_card <", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardLessThanOrEqualTo(String value) {
            addCriterion("edu_order_id_card <=", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardLike(String value) {
            addCriterion("edu_order_id_card like", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardNotLike(String value) {
            addCriterion("edu_order_id_card not like", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardIn(List<String> values) {
            addCriterion("edu_order_id_card in", values, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardNotIn(List<String> values) {
            addCriterion("edu_order_id_card not in", values, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardBetween(String value1, String value2) {
            addCriterion("edu_order_id_card between", value1, value2, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardNotBetween(String value1, String value2) {
            addCriterion("edu_order_id_card not between", value1, value2, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneIsNull() {
            addCriterion("edu_order_phone is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneIsNotNull() {
            addCriterion("edu_order_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneEqualTo(String value) {
            addCriterion("edu_order_phone =", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneNotEqualTo(String value) {
            addCriterion("edu_order_phone <>", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneGreaterThan(String value) {
            addCriterion("edu_order_phone >", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("edu_order_phone >=", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneLessThan(String value) {
            addCriterion("edu_order_phone <", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneLessThanOrEqualTo(String value) {
            addCriterion("edu_order_phone <=", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneLike(String value) {
            addCriterion("edu_order_phone like", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneNotLike(String value) {
            addCriterion("edu_order_phone not like", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneIn(List<String> values) {
            addCriterion("edu_order_phone in", values, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneNotIn(List<String> values) {
            addCriterion("edu_order_phone not in", values, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneBetween(String value1, String value2) {
            addCriterion("edu_order_phone between", value1, value2, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneNotBetween(String value1, String value2) {
            addCriterion("edu_order_phone not between", value1, value2, "eduOrderPhone");
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

        public Criteria andEduOrderTypeIsNull() {
            addCriterion("edu_order_type is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeIsNotNull() {
            addCriterion("edu_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeEqualTo(Integer value) {
            addCriterion("edu_order_type =", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeNotEqualTo(Integer value) {
            addCriterion("edu_order_type <>", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeGreaterThan(Integer value) {
            addCriterion("edu_order_type >", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_order_type >=", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeLessThan(Integer value) {
            addCriterion("edu_order_type <", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("edu_order_type <=", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeIn(List<Integer> values) {
            addCriterion("edu_order_type in", values, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeNotIn(List<Integer> values) {
            addCriterion("edu_order_type not in", values, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("edu_order_type between", value1, value2, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_order_type not between", value1, value2, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentIsNull() {
            addCriterion("edu_order_payment is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentIsNotNull() {
            addCriterion("edu_order_payment is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentEqualTo(Integer value) {
            addCriterion("edu_order_payment =", value, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentNotEqualTo(Integer value) {
            addCriterion("edu_order_payment <>", value, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentGreaterThan(Integer value) {
            addCriterion("edu_order_payment >", value, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_order_payment >=", value, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentLessThan(Integer value) {
            addCriterion("edu_order_payment <", value, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("edu_order_payment <=", value, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentIn(List<Integer> values) {
            addCriterion("edu_order_payment in", values, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentNotIn(List<Integer> values) {
            addCriterion("edu_order_payment not in", values, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentBetween(Integer value1, Integer value2) {
            addCriterion("edu_order_payment between", value1, value2, "eduOrderPayment");
            return (Criteria) this;
        }

        public Criteria andEduOrderPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_order_payment not between", value1, value2, "eduOrderPayment");
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