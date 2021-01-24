package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamInfoExample() {
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

        public Criteria andExamGmtCreateIsNull() {
            addCriterion("exam_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateIsNotNull() {
            addCriterion("exam_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateEqualTo(Date value) {
            addCriterion("exam_gmt_create =", value, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateNotEqualTo(Date value) {
            addCriterion("exam_gmt_create <>", value, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateGreaterThan(Date value) {
            addCriterion("exam_gmt_create >", value, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_gmt_create >=", value, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateLessThan(Date value) {
            addCriterion("exam_gmt_create <", value, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("exam_gmt_create <=", value, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateIn(List<Date> values) {
            addCriterion("exam_gmt_create in", values, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateNotIn(List<Date> values) {
            addCriterion("exam_gmt_create not in", values, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateBetween(Date value1, Date value2) {
            addCriterion("exam_gmt_create between", value1, value2, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("exam_gmt_create not between", value1, value2, "examGmtCreate");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedIsNull() {
            addCriterion("exam_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedIsNotNull() {
            addCriterion("exam_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedEqualTo(Date value) {
            addCriterion("exam_gmt_modified =", value, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedNotEqualTo(Date value) {
            addCriterion("exam_gmt_modified <>", value, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedGreaterThan(Date value) {
            addCriterion("exam_gmt_modified >", value, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_gmt_modified >=", value, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedLessThan(Date value) {
            addCriterion("exam_gmt_modified <", value, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("exam_gmt_modified <=", value, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedIn(List<Date> values) {
            addCriterion("exam_gmt_modified in", values, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedNotIn(List<Date> values) {
            addCriterion("exam_gmt_modified not in", values, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("exam_gmt_modified between", value1, value2, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("exam_gmt_modified not between", value1, value2, "examGmtModified");
            return (Criteria) this;
        }

        public Criteria andExamUserIdIsNull() {
            addCriterion("exam_user_id is null");
            return (Criteria) this;
        }

        public Criteria andExamUserIdIsNotNull() {
            addCriterion("exam_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamUserIdEqualTo(Integer value) {
            addCriterion("exam_user_id =", value, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdNotEqualTo(Integer value) {
            addCriterion("exam_user_id <>", value, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdGreaterThan(Integer value) {
            addCriterion("exam_user_id >", value, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_user_id >=", value, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdLessThan(Integer value) {
            addCriterion("exam_user_id <", value, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_user_id <=", value, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdIn(List<Integer> values) {
            addCriterion("exam_user_id in", values, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdNotIn(List<Integer> values) {
            addCriterion("exam_user_id not in", values, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_user_id between", value1, value2, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_user_id not between", value1, value2, "examUserId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdIsNull() {
            addCriterion("exam_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdIsNotNull() {
            addCriterion("exam_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdEqualTo(Integer value) {
            addCriterion("exam_grade_id =", value, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdNotEqualTo(Integer value) {
            addCriterion("exam_grade_id <>", value, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdGreaterThan(Integer value) {
            addCriterion("exam_grade_id >", value, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_grade_id >=", value, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdLessThan(Integer value) {
            addCriterion("exam_grade_id <", value, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_grade_id <=", value, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdIn(List<Integer> values) {
            addCriterion("exam_grade_id in", values, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdNotIn(List<Integer> values) {
            addCriterion("exam_grade_id not in", values, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_grade_id between", value1, value2, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_grade_id not between", value1, value2, "examGradeId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdIsNull() {
            addCriterion("exam_qb_id is null");
            return (Criteria) this;
        }

        public Criteria andExamQbIdIsNotNull() {
            addCriterion("exam_qb_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamQbIdEqualTo(Integer value) {
            addCriterion("exam_qb_id =", value, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdNotEqualTo(Integer value) {
            addCriterion("exam_qb_id <>", value, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdGreaterThan(Integer value) {
            addCriterion("exam_qb_id >", value, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_qb_id >=", value, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdLessThan(Integer value) {
            addCriterion("exam_qb_id <", value, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_qb_id <=", value, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdIn(List<Integer> values) {
            addCriterion("exam_qb_id in", values, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdNotIn(List<Integer> values) {
            addCriterion("exam_qb_id not in", values, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_qb_id between", value1, value2, "examQbId");
            return (Criteria) this;
        }

        public Criteria andExamQbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_qb_id not between", value1, value2, "examQbId");
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