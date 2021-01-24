package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerExample() {
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

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Long value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Long value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Long value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Long value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Long value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Long> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Long> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Long value1, Long value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Long value1, Long value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateIsNull() {
            addCriterion("answer_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateIsNotNull() {
            addCriterion("answer_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateEqualTo(Date value) {
            addCriterion("answer_gmt_create =", value, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateNotEqualTo(Date value) {
            addCriterion("answer_gmt_create <>", value, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateGreaterThan(Date value) {
            addCriterion("answer_gmt_create >", value, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_gmt_create >=", value, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateLessThan(Date value) {
            addCriterion("answer_gmt_create <", value, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("answer_gmt_create <=", value, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateIn(List<Date> values) {
            addCriterion("answer_gmt_create in", values, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateNotIn(List<Date> values) {
            addCriterion("answer_gmt_create not in", values, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateBetween(Date value1, Date value2) {
            addCriterion("answer_gmt_create between", value1, value2, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("answer_gmt_create not between", value1, value2, "answerGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedIsNull() {
            addCriterion("answer_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedIsNotNull() {
            addCriterion("answer_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedEqualTo(Date value) {
            addCriterion("answer_gmt_modified =", value, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedNotEqualTo(Date value) {
            addCriterion("answer_gmt_modified <>", value, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedGreaterThan(Date value) {
            addCriterion("answer_gmt_modified >", value, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_gmt_modified >=", value, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedLessThan(Date value) {
            addCriterion("answer_gmt_modified <", value, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("answer_gmt_modified <=", value, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedIn(List<Date> values) {
            addCriterion("answer_gmt_modified in", values, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedNotIn(List<Date> values) {
            addCriterion("answer_gmt_modified not in", values, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("answer_gmt_modified between", value1, value2, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andAnswerGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("answer_gmt_modified not between", value1, value2, "answerGmtModified");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleIsNull() {
            addCriterion("answer_title is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleIsNotNull() {
            addCriterion("answer_title is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleEqualTo(String value) {
            addCriterion("answer_title =", value, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleNotEqualTo(String value) {
            addCriterion("answer_title <>", value, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleGreaterThan(String value) {
            addCriterion("answer_title >", value, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleGreaterThanOrEqualTo(String value) {
            addCriterion("answer_title >=", value, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleLessThan(String value) {
            addCriterion("answer_title <", value, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleLessThanOrEqualTo(String value) {
            addCriterion("answer_title <=", value, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleLike(String value) {
            addCriterion("answer_title like", value, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleNotLike(String value) {
            addCriterion("answer_title not like", value, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleIn(List<String> values) {
            addCriterion("answer_title in", values, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleNotIn(List<String> values) {
            addCriterion("answer_title not in", values, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleBetween(String value1, String value2) {
            addCriterion("answer_title between", value1, value2, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTitleNotBetween(String value1, String value2) {
            addCriterion("answer_title not between", value1, value2, "answerTitle");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeIsNull() {
            addCriterion("answer_type is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeIsNotNull() {
            addCriterion("answer_type is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeEqualTo(Integer value) {
            addCriterion("answer_type =", value, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeNotEqualTo(Integer value) {
            addCriterion("answer_type <>", value, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeGreaterThan(Integer value) {
            addCriterion("answer_type >", value, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_type >=", value, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeLessThan(Integer value) {
            addCriterion("answer_type <", value, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("answer_type <=", value, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeIn(List<Integer> values) {
            addCriterion("answer_type in", values, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeNotIn(List<Integer> values) {
            addCriterion("answer_type not in", values, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeBetween(Integer value1, Integer value2) {
            addCriterion("answer_type between", value1, value2, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_type not between", value1, value2, "answerType");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusIsNull() {
            addCriterion("answer_status is null");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusIsNotNull() {
            addCriterion("answer_status is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusEqualTo(Integer value) {
            addCriterion("answer_status =", value, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusNotEqualTo(Integer value) {
            addCriterion("answer_status <>", value, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusGreaterThan(Integer value) {
            addCriterion("answer_status >", value, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_status >=", value, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusLessThan(Integer value) {
            addCriterion("answer_status <", value, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("answer_status <=", value, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusIn(List<Integer> values) {
            addCriterion("answer_status in", values, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusNotIn(List<Integer> values) {
            addCriterion("answer_status not in", values, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusBetween(Integer value1, Integer value2) {
            addCriterion("answer_status between", value1, value2, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_status not between", value1, value2, "answerStatus");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountIsNull() {
            addCriterion("answer_hui_count is null");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountIsNotNull() {
            addCriterion("answer_hui_count is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountEqualTo(Integer value) {
            addCriterion("answer_hui_count =", value, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountNotEqualTo(Integer value) {
            addCriterion("answer_hui_count <>", value, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountGreaterThan(Integer value) {
            addCriterion("answer_hui_count >", value, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_hui_count >=", value, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountLessThan(Integer value) {
            addCriterion("answer_hui_count <", value, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountLessThanOrEqualTo(Integer value) {
            addCriterion("answer_hui_count <=", value, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountIn(List<Integer> values) {
            addCriterion("answer_hui_count in", values, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountNotIn(List<Integer> values) {
            addCriterion("answer_hui_count not in", values, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountBetween(Integer value1, Integer value2) {
            addCriterion("answer_hui_count between", value1, value2, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerHuiCountNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_hui_count not between", value1, value2, "answerHuiCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountIsNull() {
            addCriterion("answer_dian_count is null");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountIsNotNull() {
            addCriterion("answer_dian_count is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountEqualTo(Integer value) {
            addCriterion("answer_dian_count =", value, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountNotEqualTo(Integer value) {
            addCriterion("answer_dian_count <>", value, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountGreaterThan(Integer value) {
            addCriterion("answer_dian_count >", value, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_dian_count >=", value, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountLessThan(Integer value) {
            addCriterion("answer_dian_count <", value, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountLessThanOrEqualTo(Integer value) {
            addCriterion("answer_dian_count <=", value, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountIn(List<Integer> values) {
            addCriterion("answer_dian_count in", values, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountNotIn(List<Integer> values) {
            addCriterion("answer_dian_count not in", values, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountBetween(Integer value1, Integer value2) {
            addCriterion("answer_dian_count between", value1, value2, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerDianCountNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_dian_count not between", value1, value2, "answerDianCount");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeIsNull() {
            addCriterion("answer_add_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeIsNotNull() {
            addCriterion("answer_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeEqualTo(Date value) {
            addCriterion("answer_add_time =", value, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeNotEqualTo(Date value) {
            addCriterion("answer_add_time <>", value, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeGreaterThan(Date value) {
            addCriterion("answer_add_time >", value, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_add_time >=", value, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeLessThan(Date value) {
            addCriterion("answer_add_time <", value, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("answer_add_time <=", value, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeIn(List<Date> values) {
            addCriterion("answer_add_time in", values, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeNotIn(List<Date> values) {
            addCriterion("answer_add_time not in", values, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeBetween(Date value1, Date value2) {
            addCriterion("answer_add_time between", value1, value2, "answerAddTime");
            return (Criteria) this;
        }

        public Criteria andAnswerAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("answer_add_time not between", value1, value2, "answerAddTime");
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