package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdBrandExample() {
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

        public Criteria andAdBrandIdIsNull() {
            addCriterion("ad_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdIsNotNull() {
            addCriterion("ad_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdEqualTo(Long value) {
            addCriterion("ad_brand_id =", value, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdNotEqualTo(Long value) {
            addCriterion("ad_brand_id <>", value, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdGreaterThan(Long value) {
            addCriterion("ad_brand_id >", value, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_brand_id >=", value, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdLessThan(Long value) {
            addCriterion("ad_brand_id <", value, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_brand_id <=", value, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdIn(List<Long> values) {
            addCriterion("ad_brand_id in", values, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdNotIn(List<Long> values) {
            addCriterion("ad_brand_id not in", values, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdBetween(Long value1, Long value2) {
            addCriterion("ad_brand_id between", value1, value2, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_brand_id not between", value1, value2, "adBrandId");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameIsNull() {
            addCriterion("ad_brand_name is null");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameIsNotNull() {
            addCriterion("ad_brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameEqualTo(String value) {
            addCriterion("ad_brand_name =", value, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameNotEqualTo(String value) {
            addCriterion("ad_brand_name <>", value, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameGreaterThan(String value) {
            addCriterion("ad_brand_name >", value, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_brand_name >=", value, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameLessThan(String value) {
            addCriterion("ad_brand_name <", value, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameLessThanOrEqualTo(String value) {
            addCriterion("ad_brand_name <=", value, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameLike(String value) {
            addCriterion("ad_brand_name like", value, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameNotLike(String value) {
            addCriterion("ad_brand_name not like", value, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameIn(List<String> values) {
            addCriterion("ad_brand_name in", values, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameNotIn(List<String> values) {
            addCriterion("ad_brand_name not in", values, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameBetween(String value1, String value2) {
            addCriterion("ad_brand_name between", value1, value2, "adBrandName");
            return (Criteria) this;
        }

        public Criteria andAdBrandNameNotBetween(String value1, String value2) {
            addCriterion("ad_brand_name not between", value1, value2, "adBrandName");
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