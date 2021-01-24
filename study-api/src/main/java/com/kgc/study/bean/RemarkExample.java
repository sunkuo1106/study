package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemarkExample() {
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

        public Criteria andRemarkIdIsNull() {
            addCriterion("remark_id is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIdIsNotNull() {
            addCriterion("remark_id is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkIdEqualTo(Long value) {
            addCriterion("remark_id =", value, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdNotEqualTo(Long value) {
            addCriterion("remark_id <>", value, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdGreaterThan(Long value) {
            addCriterion("remark_id >", value, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("remark_id >=", value, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdLessThan(Long value) {
            addCriterion("remark_id <", value, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdLessThanOrEqualTo(Long value) {
            addCriterion("remark_id <=", value, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdIn(List<Long> values) {
            addCriterion("remark_id in", values, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdNotIn(List<Long> values) {
            addCriterion("remark_id not in", values, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdBetween(Long value1, Long value2) {
            addCriterion("remark_id between", value1, value2, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkIdNotBetween(Long value1, Long value2) {
            addCriterion("remark_id not between", value1, value2, "remarkId");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateIsNull() {
            addCriterion("remark_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateIsNotNull() {
            addCriterion("remark_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateEqualTo(Date value) {
            addCriterion("remark_gmt_create =", value, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateNotEqualTo(Date value) {
            addCriterion("remark_gmt_create <>", value, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateGreaterThan(Date value) {
            addCriterion("remark_gmt_create >", value, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("remark_gmt_create >=", value, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateLessThan(Date value) {
            addCriterion("remark_gmt_create <", value, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("remark_gmt_create <=", value, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateIn(List<Date> values) {
            addCriterion("remark_gmt_create in", values, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateNotIn(List<Date> values) {
            addCriterion("remark_gmt_create not in", values, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateBetween(Date value1, Date value2) {
            addCriterion("remark_gmt_create between", value1, value2, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("remark_gmt_create not between", value1, value2, "remarkGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedIsNull() {
            addCriterion("remark_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedIsNotNull() {
            addCriterion("remark_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedEqualTo(Date value) {
            addCriterion("remark_gmt_modified =", value, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedNotEqualTo(Date value) {
            addCriterion("remark_gmt_modified <>", value, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedGreaterThan(Date value) {
            addCriterion("remark_gmt_modified >", value, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("remark_gmt_modified >=", value, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedLessThan(Date value) {
            addCriterion("remark_gmt_modified <", value, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("remark_gmt_modified <=", value, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedIn(List<Date> values) {
            addCriterion("remark_gmt_modified in", values, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedNotIn(List<Date> values) {
            addCriterion("remark_gmt_modified not in", values, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("remark_gmt_modified between", value1, value2, "remarkGmtModified");
            return (Criteria) this;
        }

        public Criteria andRemarkGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("remark_gmt_modified not between", value1, value2, "remarkGmtModified");
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

        public Criteria andRemarkSumIsNull() {
            addCriterion("remark_sum is null");
            return (Criteria) this;
        }

        public Criteria andRemarkSumIsNotNull() {
            addCriterion("remark_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkSumEqualTo(Integer value) {
            addCriterion("remark_sum =", value, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumNotEqualTo(Integer value) {
            addCriterion("remark_sum <>", value, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumGreaterThan(Integer value) {
            addCriterion("remark_sum >", value, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("remark_sum >=", value, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumLessThan(Integer value) {
            addCriterion("remark_sum <", value, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumLessThanOrEqualTo(Integer value) {
            addCriterion("remark_sum <=", value, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumIn(List<Integer> values) {
            addCriterion("remark_sum in", values, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumNotIn(List<Integer> values) {
            addCriterion("remark_sum not in", values, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumBetween(Integer value1, Integer value2) {
            addCriterion("remark_sum between", value1, value2, "remarkSum");
            return (Criteria) this;
        }

        public Criteria andRemarkSumNotBetween(Integer value1, Integer value2) {
            addCriterion("remark_sum not between", value1, value2, "remarkSum");
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

        public Criteria andRemarkDetailsIsNull() {
            addCriterion("remark_details is null");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsIsNotNull() {
            addCriterion("remark_details is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsEqualTo(String value) {
            addCriterion("remark_details =", value, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsNotEqualTo(String value) {
            addCriterion("remark_details <>", value, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsGreaterThan(String value) {
            addCriterion("remark_details >", value, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("remark_details >=", value, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsLessThan(String value) {
            addCriterion("remark_details <", value, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsLessThanOrEqualTo(String value) {
            addCriterion("remark_details <=", value, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsLike(String value) {
            addCriterion("remark_details like", value, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsNotLike(String value) {
            addCriterion("remark_details not like", value, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsIn(List<String> values) {
            addCriterion("remark_details in", values, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsNotIn(List<String> values) {
            addCriterion("remark_details not in", values, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsBetween(String value1, String value2) {
            addCriterion("remark_details between", value1, value2, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkDetailsNotBetween(String value1, String value2) {
            addCriterion("remark_details not between", value1, value2, "remarkDetails");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsIsNull() {
            addCriterion("remark_ids is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsIsNotNull() {
            addCriterion("remark_ids is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsEqualTo(Integer value) {
            addCriterion("remark_ids =", value, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsNotEqualTo(Integer value) {
            addCriterion("remark_ids <>", value, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsGreaterThan(Integer value) {
            addCriterion("remark_ids >", value, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("remark_ids >=", value, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsLessThan(Integer value) {
            addCriterion("remark_ids <", value, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsLessThanOrEqualTo(Integer value) {
            addCriterion("remark_ids <=", value, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsIn(List<Integer> values) {
            addCriterion("remark_ids in", values, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsNotIn(List<Integer> values) {
            addCriterion("remark_ids not in", values, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsBetween(Integer value1, Integer value2) {
            addCriterion("remark_ids between", value1, value2, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkIdsNotBetween(Integer value1, Integer value2) {
            addCriterion("remark_ids not between", value1, value2, "remarkIds");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeIsNull() {
            addCriterion("remark_addtime is null");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeIsNotNull() {
            addCriterion("remark_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeEqualTo(Date value) {
            addCriterion("remark_addtime =", value, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeNotEqualTo(Date value) {
            addCriterion("remark_addtime <>", value, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeGreaterThan(Date value) {
            addCriterion("remark_addtime >", value, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("remark_addtime >=", value, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeLessThan(Date value) {
            addCriterion("remark_addtime <", value, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("remark_addtime <=", value, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeIn(List<Date> values) {
            addCriterion("remark_addtime in", values, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeNotIn(List<Date> values) {
            addCriterion("remark_addtime not in", values, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeBetween(Date value1, Date value2) {
            addCriterion("remark_addtime between", value1, value2, "remarkAddtime");
            return (Criteria) this;
        }

        public Criteria andRemarkAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("remark_addtime not between", value1, value2, "remarkAddtime");
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