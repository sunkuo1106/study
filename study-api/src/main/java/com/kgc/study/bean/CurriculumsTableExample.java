package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurriculumsTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculumsTableExample() {
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

        public Criteria andCurrIdIsNull() {
            addCriterion("curr_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrIdIsNotNull() {
            addCriterion("curr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrIdEqualTo(Long value) {
            addCriterion("curr_id =", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotEqualTo(Long value) {
            addCriterion("curr_id <>", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdGreaterThan(Long value) {
            addCriterion("curr_id >", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("curr_id >=", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdLessThan(Long value) {
            addCriterion("curr_id <", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdLessThanOrEqualTo(Long value) {
            addCriterion("curr_id <=", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdIn(List<Long> values) {
            addCriterion("curr_id in", values, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotIn(List<Long> values) {
            addCriterion("curr_id not in", values, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdBetween(Long value1, Long value2) {
            addCriterion("curr_id between", value1, value2, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotBetween(Long value1, Long value2) {
            addCriterion("curr_id not between", value1, value2, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrNameIsNull() {
            addCriterion("curr_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrNameIsNotNull() {
            addCriterion("curr_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrNameEqualTo(String value) {
            addCriterion("curr_name =", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotEqualTo(String value) {
            addCriterion("curr_name <>", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameGreaterThan(String value) {
            addCriterion("curr_name >", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameGreaterThanOrEqualTo(String value) {
            addCriterion("curr_name >=", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLessThan(String value) {
            addCriterion("curr_name <", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLessThanOrEqualTo(String value) {
            addCriterion("curr_name <=", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameLike(String value) {
            addCriterion("curr_name like", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotLike(String value) {
            addCriterion("curr_name not like", value, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameIn(List<String> values) {
            addCriterion("curr_name in", values, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotIn(List<String> values) {
            addCriterion("curr_name not in", values, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameBetween(String value1, String value2) {
            addCriterion("curr_name between", value1, value2, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrNameNotBetween(String value1, String value2) {
            addCriterion("curr_name not between", value1, value2, "currName");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdIsNull() {
            addCriterion("curr_mgr_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdIsNotNull() {
            addCriterion("curr_mgr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdEqualTo(Long value) {
            addCriterion("curr_mgr_id =", value, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdNotEqualTo(Long value) {
            addCriterion("curr_mgr_id <>", value, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdGreaterThan(Long value) {
            addCriterion("curr_mgr_id >", value, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("curr_mgr_id >=", value, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdLessThan(Long value) {
            addCriterion("curr_mgr_id <", value, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdLessThanOrEqualTo(Long value) {
            addCriterion("curr_mgr_id <=", value, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdIn(List<Long> values) {
            addCriterion("curr_mgr_id in", values, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdNotIn(List<Long> values) {
            addCriterion("curr_mgr_id not in", values, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdBetween(Long value1, Long value2) {
            addCriterion("curr_mgr_id between", value1, value2, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCurrMgrIdNotBetween(Long value1, Long value2) {
            addCriterion("curr_mgr_id not between", value1, value2, "currMgrId");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateIsNull() {
            addCriterion("course_subject_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateIsNotNull() {
            addCriterion("course_subject_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateEqualTo(Date value) {
            addCriterion("course_subject_gmt_create =", value, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateNotEqualTo(Date value) {
            addCriterion("course_subject_gmt_create <>", value, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateGreaterThan(Date value) {
            addCriterion("course_subject_gmt_create >", value, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("course_subject_gmt_create >=", value, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateLessThan(Date value) {
            addCriterion("course_subject_gmt_create <", value, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("course_subject_gmt_create <=", value, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateIn(List<Date> values) {
            addCriterion("course_subject_gmt_create in", values, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateNotIn(List<Date> values) {
            addCriterion("course_subject_gmt_create not in", values, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateBetween(Date value1, Date value2) {
            addCriterion("course_subject_gmt_create between", value1, value2, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("course_subject_gmt_create not between", value1, value2, "courseSubjectGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedIsNull() {
            addCriterion("course_subject_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedIsNotNull() {
            addCriterion("course_subject_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedEqualTo(Date value) {
            addCriterion("course_subject_gmt_modified =", value, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedNotEqualTo(Date value) {
            addCriterion("course_subject_gmt_modified <>", value, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedGreaterThan(Date value) {
            addCriterion("course_subject_gmt_modified >", value, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("course_subject_gmt_modified >=", value, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedLessThan(Date value) {
            addCriterion("course_subject_gmt_modified <", value, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("course_subject_gmt_modified <=", value, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedIn(List<Date> values) {
            addCriterion("course_subject_gmt_modified in", values, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedNotIn(List<Date> values) {
            addCriterion("course_subject_gmt_modified not in", values, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("course_subject_gmt_modified between", value1, value2, "courseSubjectGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseSubjectGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("course_subject_gmt_modified not between", value1, value2, "courseSubjectGmtModified");
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