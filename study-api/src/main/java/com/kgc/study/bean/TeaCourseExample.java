package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeaCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeaCourseExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Long value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Long value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Long value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Long value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Long> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Long> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Long value1, Long value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateIsNull() {
            addCriterion("tea_course_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateIsNotNull() {
            addCriterion("tea_course_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateEqualTo(Date value) {
            addCriterion("tea_course_gmt_create =", value, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateNotEqualTo(Date value) {
            addCriterion("tea_course_gmt_create <>", value, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateGreaterThan(Date value) {
            addCriterion("tea_course_gmt_create >", value, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("tea_course_gmt_create >=", value, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateLessThan(Date value) {
            addCriterion("tea_course_gmt_create <", value, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("tea_course_gmt_create <=", value, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateIn(List<Date> values) {
            addCriterion("tea_course_gmt_create in", values, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateNotIn(List<Date> values) {
            addCriterion("tea_course_gmt_create not in", values, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateBetween(Date value1, Date value2) {
            addCriterion("tea_course_gmt_create between", value1, value2, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourseGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("tea_course_gmt_create not between", value1, value2, "teaCourseGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedIsNull() {
            addCriterion("tea_courser_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedIsNotNull() {
            addCriterion("tea_courser_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedEqualTo(Date value) {
            addCriterion("tea_courser_gmt_modified =", value, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedNotEqualTo(Date value) {
            addCriterion("tea_courser_gmt_modified <>", value, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedGreaterThan(Date value) {
            addCriterion("tea_courser_gmt_modified >", value, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("tea_courser_gmt_modified >=", value, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedLessThan(Date value) {
            addCriterion("tea_courser_gmt_modified <", value, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("tea_courser_gmt_modified <=", value, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedIn(List<Date> values) {
            addCriterion("tea_courser_gmt_modified in", values, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedNotIn(List<Date> values) {
            addCriterion("tea_courser_gmt_modified not in", values, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("tea_courser_gmt_modified between", value1, value2, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeaCourserGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("tea_courser_gmt_modified not between", value1, value2, "teaCourserGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
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