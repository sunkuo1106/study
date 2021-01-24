package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertificateAllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateAllExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCerNameIsNull() {
            addCriterion("cer_name is null");
            return (Criteria) this;
        }

        public Criteria andCerNameIsNotNull() {
            addCriterion("cer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCerNameEqualTo(String value) {
            addCriterion("cer_name =", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotEqualTo(String value) {
            addCriterion("cer_name <>", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameGreaterThan(String value) {
            addCriterion("cer_name >", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameGreaterThanOrEqualTo(String value) {
            addCriterion("cer_name >=", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLessThan(String value) {
            addCriterion("cer_name <", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLessThanOrEqualTo(String value) {
            addCriterion("cer_name <=", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameLike(String value) {
            addCriterion("cer_name like", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotLike(String value) {
            addCriterion("cer_name not like", value, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameIn(List<String> values) {
            addCriterion("cer_name in", values, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotIn(List<String> values) {
            addCriterion("cer_name not in", values, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameBetween(String value1, String value2) {
            addCriterion("cer_name between", value1, value2, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerNameNotBetween(String value1, String value2) {
            addCriterion("cer_name not between", value1, value2, "cerName");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeIsNull() {
            addCriterion("cer_exam_time is null");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeIsNotNull() {
            addCriterion("cer_exam_time is not null");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeEqualTo(Date value) {
            addCriterion("cer_exam_time =", value, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeNotEqualTo(Date value) {
            addCriterion("cer_exam_time <>", value, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeGreaterThan(Date value) {
            addCriterion("cer_exam_time >", value, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cer_exam_time >=", value, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeLessThan(Date value) {
            addCriterion("cer_exam_time <", value, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeLessThanOrEqualTo(Date value) {
            addCriterion("cer_exam_time <=", value, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeIn(List<Date> values) {
            addCriterion("cer_exam_time in", values, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeNotIn(List<Date> values) {
            addCriterion("cer_exam_time not in", values, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeBetween(Date value1, Date value2) {
            addCriterion("cer_exam_time between", value1, value2, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTimeNotBetween(Date value1, Date value2) {
            addCriterion("cer_exam_time not between", value1, value2, "cerExamTime");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeIsNull() {
            addCriterion("cer_exam_type is null");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeIsNotNull() {
            addCriterion("cer_exam_type is not null");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeEqualTo(Integer value) {
            addCriterion("cer_exam_type =", value, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeNotEqualTo(Integer value) {
            addCriterion("cer_exam_type <>", value, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeGreaterThan(Integer value) {
            addCriterion("cer_exam_type >", value, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cer_exam_type >=", value, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeLessThan(Integer value) {
            addCriterion("cer_exam_type <", value, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cer_exam_type <=", value, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeIn(List<Integer> values) {
            addCriterion("cer_exam_type in", values, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeNotIn(List<Integer> values) {
            addCriterion("cer_exam_type not in", values, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeBetween(Integer value1, Integer value2) {
            addCriterion("cer_exam_type between", value1, value2, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cer_exam_type not between", value1, value2, "cerExamType");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreIsNull() {
            addCriterion("cer_exam_score is null");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreIsNotNull() {
            addCriterion("cer_exam_score is not null");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreEqualTo(Integer value) {
            addCriterion("cer_exam_score =", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreNotEqualTo(Integer value) {
            addCriterion("cer_exam_score <>", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreGreaterThan(Integer value) {
            addCriterion("cer_exam_score >", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("cer_exam_score >=", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreLessThan(Integer value) {
            addCriterion("cer_exam_score <", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("cer_exam_score <=", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreIn(List<Integer> values) {
            addCriterion("cer_exam_score in", values, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreNotIn(List<Integer> values) {
            addCriterion("cer_exam_score not in", values, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreBetween(Integer value1, Integer value2) {
            addCriterion("cer_exam_score between", value1, value2, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("cer_exam_score not between", value1, value2, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateIsNull() {
            addCriterion("admin_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateIsNotNull() {
            addCriterion("admin_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateEqualTo(Date value) {
            addCriterion("admin_gmt_create =", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateNotEqualTo(Date value) {
            addCriterion("admin_gmt_create <>", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateGreaterThan(Date value) {
            addCriterion("admin_gmt_create >", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_gmt_create >=", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateLessThan(Date value) {
            addCriterion("admin_gmt_create <", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("admin_gmt_create <=", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateIn(List<Date> values) {
            addCriterion("admin_gmt_create in", values, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateNotIn(List<Date> values) {
            addCriterion("admin_gmt_create not in", values, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateBetween(Date value1, Date value2) {
            addCriterion("admin_gmt_create between", value1, value2, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("admin_gmt_create not between", value1, value2, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedIsNull() {
            addCriterion("admin_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedIsNotNull() {
            addCriterion("admin_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedEqualTo(Date value) {
            addCriterion("admin_gmt_modified =", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedNotEqualTo(Date value) {
            addCriterion("admin_gmt_modified <>", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedGreaterThan(Date value) {
            addCriterion("admin_gmt_modified >", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_gmt_modified >=", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedLessThan(Date value) {
            addCriterion("admin_gmt_modified <", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("admin_gmt_modified <=", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedIn(List<Date> values) {
            addCriterion("admin_gmt_modified in", values, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedNotIn(List<Date> values) {
            addCriterion("admin_gmt_modified not in", values, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("admin_gmt_modified between", value1, value2, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("admin_gmt_modified not between", value1, value2, "adminGmtModified");
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