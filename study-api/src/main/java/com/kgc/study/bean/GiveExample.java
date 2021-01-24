package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiveExample() {
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

        public Criteria andGiveIdIsNull() {
            addCriterion("give_id is null");
            return (Criteria) this;
        }

        public Criteria andGiveIdIsNotNull() {
            addCriterion("give_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiveIdEqualTo(Long value) {
            addCriterion("give_id =", value, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdNotEqualTo(Long value) {
            addCriterion("give_id <>", value, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdGreaterThan(Long value) {
            addCriterion("give_id >", value, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdGreaterThanOrEqualTo(Long value) {
            addCriterion("give_id >=", value, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdLessThan(Long value) {
            addCriterion("give_id <", value, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdLessThanOrEqualTo(Long value) {
            addCriterion("give_id <=", value, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdIn(List<Long> values) {
            addCriterion("give_id in", values, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdNotIn(List<Long> values) {
            addCriterion("give_id not in", values, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdBetween(Long value1, Long value2) {
            addCriterion("give_id between", value1, value2, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveIdNotBetween(Long value1, Long value2) {
            addCriterion("give_id not between", value1, value2, "giveId");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateIsNull() {
            addCriterion("give_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateIsNotNull() {
            addCriterion("give_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateEqualTo(Date value) {
            addCriterion("give_gmt_create =", value, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateNotEqualTo(Date value) {
            addCriterion("give_gmt_create <>", value, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateGreaterThan(Date value) {
            addCriterion("give_gmt_create >", value, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("give_gmt_create >=", value, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateLessThan(Date value) {
            addCriterion("give_gmt_create <", value, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("give_gmt_create <=", value, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateIn(List<Date> values) {
            addCriterion("give_gmt_create in", values, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateNotIn(List<Date> values) {
            addCriterion("give_gmt_create not in", values, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateBetween(Date value1, Date value2) {
            addCriterion("give_gmt_create between", value1, value2, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("give_gmt_create not between", value1, value2, "giveGmtCreate");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedIsNull() {
            addCriterion("give_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedIsNotNull() {
            addCriterion("give_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedEqualTo(Date value) {
            addCriterion("give_gmt_modified =", value, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedNotEqualTo(Date value) {
            addCriterion("give_gmt_modified <>", value, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedGreaterThan(Date value) {
            addCriterion("give_gmt_modified >", value, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("give_gmt_modified >=", value, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedLessThan(Date value) {
            addCriterion("give_gmt_modified <", value, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("give_gmt_modified <=", value, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedIn(List<Date> values) {
            addCriterion("give_gmt_modified in", values, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedNotIn(List<Date> values) {
            addCriterion("give_gmt_modified not in", values, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("give_gmt_modified between", value1, value2, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andGiveGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("give_gmt_modified not between", value1, value2, "giveGmtModified");
            return (Criteria) this;
        }

        public Criteria andEduUserIdIsNull() {
            addCriterion("edu_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEduUserIdIsNotNull() {
            addCriterion("edu_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEduUserIdEqualTo(Integer value) {
            addCriterion("edu_user_id =", value, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdNotEqualTo(Integer value) {
            addCriterion("edu_user_id <>", value, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdGreaterThan(Integer value) {
            addCriterion("edu_user_id >", value, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_user_id >=", value, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdLessThan(Integer value) {
            addCriterion("edu_user_id <", value, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("edu_user_id <=", value, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdIn(List<Integer> values) {
            addCriterion("edu_user_id in", values, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdNotIn(List<Integer> values) {
            addCriterion("edu_user_id not in", values, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdBetween(Integer value1, Integer value2) {
            addCriterion("edu_user_id between", value1, value2, "eduUserId");
            return (Criteria) this;
        }

        public Criteria andEduUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_user_id not between", value1, value2, "eduUserId");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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