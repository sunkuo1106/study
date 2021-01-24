package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionbankInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionbankInfoExample() {
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

        public Criteria andQbGmtCreateIsNull() {
            addCriterion("qb_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateIsNotNull() {
            addCriterion("qb_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateEqualTo(Date value) {
            addCriterion("qb_gmt_create =", value, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateNotEqualTo(Date value) {
            addCriterion("qb_gmt_create <>", value, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateGreaterThan(Date value) {
            addCriterion("qb_gmt_create >", value, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("qb_gmt_create >=", value, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateLessThan(Date value) {
            addCriterion("qb_gmt_create <", value, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("qb_gmt_create <=", value, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateIn(List<Date> values) {
            addCriterion("qb_gmt_create in", values, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateNotIn(List<Date> values) {
            addCriterion("qb_gmt_create not in", values, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateBetween(Date value1, Date value2) {
            addCriterion("qb_gmt_create between", value1, value2, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("qb_gmt_create not between", value1, value2, "qbGmtCreate");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedIsNull() {
            addCriterion("qb_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedIsNotNull() {
            addCriterion("qb_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedEqualTo(Date value) {
            addCriterion("qb_gmt_modified =", value, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedNotEqualTo(Date value) {
            addCriterion("qb_gmt_modified <>", value, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedGreaterThan(Date value) {
            addCriterion("qb_gmt_modified >", value, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("qb_gmt_modified >=", value, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedLessThan(Date value) {
            addCriterion("qb_gmt_modified <", value, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("qb_gmt_modified <=", value, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedIn(List<Date> values) {
            addCriterion("qb_gmt_modified in", values, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedNotIn(List<Date> values) {
            addCriterion("qb_gmt_modified not in", values, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("qb_gmt_modified between", value1, value2, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("qb_gmt_modified not between", value1, value2, "qbGmtModified");
            return (Criteria) this;
        }

        public Criteria andQbNameIsNull() {
            addCriterion("qb_name is null");
            return (Criteria) this;
        }

        public Criteria andQbNameIsNotNull() {
            addCriterion("qb_name is not null");
            return (Criteria) this;
        }

        public Criteria andQbNameEqualTo(String value) {
            addCriterion("qb_name =", value, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameNotEqualTo(String value) {
            addCriterion("qb_name <>", value, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameGreaterThan(String value) {
            addCriterion("qb_name >", value, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameGreaterThanOrEqualTo(String value) {
            addCriterion("qb_name >=", value, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameLessThan(String value) {
            addCriterion("qb_name <", value, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameLessThanOrEqualTo(String value) {
            addCriterion("qb_name <=", value, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameLike(String value) {
            addCriterion("qb_name like", value, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameNotLike(String value) {
            addCriterion("qb_name not like", value, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameIn(List<String> values) {
            addCriterion("qb_name in", values, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameNotIn(List<String> values) {
            addCriterion("qb_name not in", values, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameBetween(String value1, String value2) {
            addCriterion("qb_name between", value1, value2, "qbName");
            return (Criteria) this;
        }

        public Criteria andQbNameNotBetween(String value1, String value2) {
            addCriterion("qb_name not between", value1, value2, "qbName");
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