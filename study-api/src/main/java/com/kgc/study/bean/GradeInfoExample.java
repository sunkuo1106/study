package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeInfoExample() {
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

        public Criteria andGradeGmtCreateIsNull() {
            addCriterion("grade_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateIsNotNull() {
            addCriterion("grade_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateEqualTo(Date value) {
            addCriterion("grade_gmt_create =", value, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateNotEqualTo(Date value) {
            addCriterion("grade_gmt_create <>", value, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateGreaterThan(Date value) {
            addCriterion("grade_gmt_create >", value, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("grade_gmt_create >=", value, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateLessThan(Date value) {
            addCriterion("grade_gmt_create <", value, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("grade_gmt_create <=", value, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateIn(List<Date> values) {
            addCriterion("grade_gmt_create in", values, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateNotIn(List<Date> values) {
            addCriterion("grade_gmt_create not in", values, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateBetween(Date value1, Date value2) {
            addCriterion("grade_gmt_create between", value1, value2, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGradeGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("grade_gmt_create not between", value1, value2, "gradeGmtCreate");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedIsNull() {
            addCriterion("frade_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedIsNotNull() {
            addCriterion("frade_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedEqualTo(Date value) {
            addCriterion("frade_gmt_modified =", value, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedNotEqualTo(Date value) {
            addCriterion("frade_gmt_modified <>", value, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedGreaterThan(Date value) {
            addCriterion("frade_gmt_modified >", value, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("frade_gmt_modified >=", value, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedLessThan(Date value) {
            addCriterion("frade_gmt_modified <", value, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("frade_gmt_modified <=", value, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedIn(List<Date> values) {
            addCriterion("frade_gmt_modified in", values, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedNotIn(List<Date> values) {
            addCriterion("frade_gmt_modified not in", values, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("frade_gmt_modified between", value1, value2, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andFradeGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("frade_gmt_modified not between", value1, value2, "fradeGmtModified");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdIsNull() {
            addCriterion("grade_address_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdIsNotNull() {
            addCriterion("grade_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdEqualTo(Integer value) {
            addCriterion("grade_address_id =", value, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdNotEqualTo(Integer value) {
            addCriterion("grade_address_id <>", value, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdGreaterThan(Integer value) {
            addCriterion("grade_address_id >", value, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_address_id >=", value, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdLessThan(Integer value) {
            addCriterion("grade_address_id <", value, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_address_id <=", value, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdIn(List<Integer> values) {
            addCriterion("grade_address_id in", values, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdNotIn(List<Integer> values) {
            addCriterion("grade_address_id not in", values, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_address_id between", value1, value2, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_address_id not between", value1, value2, "gradeAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNull() {
            addCriterion("grade_type is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIsNotNull() {
            addCriterion("grade_type is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeEqualTo(String value) {
            addCriterion("grade_type =", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotEqualTo(String value) {
            addCriterion("grade_type <>", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThan(String value) {
            addCriterion("grade_type >", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("grade_type >=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThan(String value) {
            addCriterion("grade_type <", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLessThanOrEqualTo(String value) {
            addCriterion("grade_type <=", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeLike(String value) {
            addCriterion("grade_type like", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotLike(String value) {
            addCriterion("grade_type not like", value, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIn(List<String> values) {
            addCriterion("grade_type in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotIn(List<String> values) {
            addCriterion("grade_type not in", values, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeBetween(String value1, String value2) {
            addCriterion("grade_type between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradeTypeNotBetween(String value1, String value2) {
            addCriterion("grade_type not between", value1, value2, "gradeType");
            return (Criteria) this;
        }

        public Criteria andGradePersonIsNull() {
            addCriterion("grade_person is null");
            return (Criteria) this;
        }

        public Criteria andGradePersonIsNotNull() {
            addCriterion("grade_person is not null");
            return (Criteria) this;
        }

        public Criteria andGradePersonEqualTo(Integer value) {
            addCriterion("grade_person =", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonNotEqualTo(Integer value) {
            addCriterion("grade_person <>", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonGreaterThan(Integer value) {
            addCriterion("grade_person >", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_person >=", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonLessThan(Integer value) {
            addCriterion("grade_person <", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonLessThanOrEqualTo(Integer value) {
            addCriterion("grade_person <=", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonIn(List<Integer> values) {
            addCriterion("grade_person in", values, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonNotIn(List<Integer> values) {
            addCriterion("grade_person not in", values, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonBetween(Integer value1, Integer value2) {
            addCriterion("grade_person between", value1, value2, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_person not between", value1, value2, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradeDateIsNull() {
            addCriterion("grade_date is null");
            return (Criteria) this;
        }

        public Criteria andGradeDateIsNotNull() {
            addCriterion("grade_date is not null");
            return (Criteria) this;
        }

        public Criteria andGradeDateEqualTo(Date value) {
            addCriterion("grade_date =", value, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateNotEqualTo(Date value) {
            addCriterion("grade_date <>", value, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateGreaterThan(Date value) {
            addCriterion("grade_date >", value, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("grade_date >=", value, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateLessThan(Date value) {
            addCriterion("grade_date <", value, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateLessThanOrEqualTo(Date value) {
            addCriterion("grade_date <=", value, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateIn(List<Date> values) {
            addCriterion("grade_date in", values, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateNotIn(List<Date> values) {
            addCriterion("grade_date not in", values, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateBetween(Date value1, Date value2) {
            addCriterion("grade_date between", value1, value2, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradeDateNotBetween(Date value1, Date value2) {
            addCriterion("grade_date not between", value1, value2, "gradeDate");
            return (Criteria) this;
        }

        public Criteria andGradePriceIsNull() {
            addCriterion("grade_price is null");
            return (Criteria) this;
        }

        public Criteria andGradePriceIsNotNull() {
            addCriterion("grade_price is not null");
            return (Criteria) this;
        }

        public Criteria andGradePriceEqualTo(Long value) {
            addCriterion("grade_price =", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceNotEqualTo(Long value) {
            addCriterion("grade_price <>", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceGreaterThan(Long value) {
            addCriterion("grade_price >", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("grade_price >=", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceLessThan(Long value) {
            addCriterion("grade_price <", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceLessThanOrEqualTo(Long value) {
            addCriterion("grade_price <=", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceIn(List<Long> values) {
            addCriterion("grade_price in", values, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceNotIn(List<Long> values) {
            addCriterion("grade_price not in", values, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceBetween(Long value1, Long value2) {
            addCriterion("grade_price between", value1, value2, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceNotBetween(Long value1, Long value2) {
            addCriterion("grade_price not between", value1, value2, "gradePrice");
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