package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertificateManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateManageExample() {
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

        public Criteria andCerAllIdIsNull() {
            addCriterion("cer_all_id is null");
            return (Criteria) this;
        }

        public Criteria andCerAllIdIsNotNull() {
            addCriterion("cer_all_id is not null");
            return (Criteria) this;
        }

        public Criteria andCerAllIdEqualTo(Integer value) {
            addCriterion("cer_all_id =", value, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdNotEqualTo(Integer value) {
            addCriterion("cer_all_id <>", value, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdGreaterThan(Integer value) {
            addCriterion("cer_all_id >", value, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cer_all_id >=", value, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdLessThan(Integer value) {
            addCriterion("cer_all_id <", value, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdLessThanOrEqualTo(Integer value) {
            addCriterion("cer_all_id <=", value, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdIn(List<Integer> values) {
            addCriterion("cer_all_id in", values, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdNotIn(List<Integer> values) {
            addCriterion("cer_all_id not in", values, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdBetween(Integer value1, Integer value2) {
            addCriterion("cer_all_id between", value1, value2, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerAllIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cer_all_id not between", value1, value2, "cerAllId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdIsNull() {
            addCriterion("cer_student_id is null");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdIsNotNull() {
            addCriterion("cer_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdEqualTo(Integer value) {
            addCriterion("cer_student_id =", value, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdNotEqualTo(Integer value) {
            addCriterion("cer_student_id <>", value, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdGreaterThan(Integer value) {
            addCriterion("cer_student_id >", value, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cer_student_id >=", value, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdLessThan(Integer value) {
            addCriterion("cer_student_id <", value, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("cer_student_id <=", value, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdIn(List<Integer> values) {
            addCriterion("cer_student_id in", values, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdNotIn(List<Integer> values) {
            addCriterion("cer_student_id not in", values, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("cer_student_id between", value1, value2, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cer_student_id not between", value1, value2, "cerStudentId");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreIsNull() {
            addCriterion("cer_group_exam_score is null");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreIsNotNull() {
            addCriterion("cer_group_exam_score is not null");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreEqualTo(Long value) {
            addCriterion("cer_group_exam_score =", value, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreNotEqualTo(Long value) {
            addCriterion("cer_group_exam_score <>", value, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreGreaterThan(Long value) {
            addCriterion("cer_group_exam_score >", value, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("cer_group_exam_score >=", value, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreLessThan(Long value) {
            addCriterion("cer_group_exam_score <", value, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreLessThanOrEqualTo(Long value) {
            addCriterion("cer_group_exam_score <=", value, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreIn(List<Long> values) {
            addCriterion("cer_group_exam_score in", values, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreNotIn(List<Long> values) {
            addCriterion("cer_group_exam_score not in", values, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreBetween(Long value1, Long value2) {
            addCriterion("cer_group_exam_score between", value1, value2, "cerGroupExamScore");
            return (Criteria) this;
        }

        public Criteria andCerGroupExamScoreNotBetween(Long value1, Long value2) {
            addCriterion("cer_group_exam_score not between", value1, value2, "cerGroupExamScore");
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

        public Criteria andCerExamScoreEqualTo(Long value) {
            addCriterion("cer_exam_score =", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreNotEqualTo(Long value) {
            addCriterion("cer_exam_score <>", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreGreaterThan(Long value) {
            addCriterion("cer_exam_score >", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("cer_exam_score >=", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreLessThan(Long value) {
            addCriterion("cer_exam_score <", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreLessThanOrEqualTo(Long value) {
            addCriterion("cer_exam_score <=", value, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreIn(List<Long> values) {
            addCriterion("cer_exam_score in", values, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreNotIn(List<Long> values) {
            addCriterion("cer_exam_score not in", values, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreBetween(Long value1, Long value2) {
            addCriterion("cer_exam_score between", value1, value2, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerExamScoreNotBetween(Long value1, Long value2) {
            addCriterion("cer_exam_score not between", value1, value2, "cerExamScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreIsNull() {
            addCriterion("cer_sum_score is null");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreIsNotNull() {
            addCriterion("cer_sum_score is not null");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreEqualTo(Long value) {
            addCriterion("cer_sum_score =", value, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreNotEqualTo(Long value) {
            addCriterion("cer_sum_score <>", value, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreGreaterThan(Long value) {
            addCriterion("cer_sum_score >", value, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("cer_sum_score >=", value, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreLessThan(Long value) {
            addCriterion("cer_sum_score <", value, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreLessThanOrEqualTo(Long value) {
            addCriterion("cer_sum_score <=", value, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreIn(List<Long> values) {
            addCriterion("cer_sum_score in", values, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreNotIn(List<Long> values) {
            addCriterion("cer_sum_score not in", values, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreBetween(Long value1, Long value2) {
            addCriterion("cer_sum_score between", value1, value2, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerSumScoreNotBetween(Long value1, Long value2) {
            addCriterion("cer_sum_score not between", value1, value2, "cerSumScore");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateIsNull() {
            addCriterion("cer_examination_date is null");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateIsNotNull() {
            addCriterion("cer_examination_date is not null");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateEqualTo(Date value) {
            addCriterion("cer_examination_date =", value, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateNotEqualTo(Date value) {
            addCriterion("cer_examination_date <>", value, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateGreaterThan(Date value) {
            addCriterion("cer_examination_date >", value, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cer_examination_date >=", value, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateLessThan(Date value) {
            addCriterion("cer_examination_date <", value, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateLessThanOrEqualTo(Date value) {
            addCriterion("cer_examination_date <=", value, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateIn(List<Date> values) {
            addCriterion("cer_examination_date in", values, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateNotIn(List<Date> values) {
            addCriterion("cer_examination_date not in", values, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateBetween(Date value1, Date value2) {
            addCriterion("cer_examination_date between", value1, value2, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerExaminationDateNotBetween(Date value1, Date value2) {
            addCriterion("cer_examination_date not between", value1, value2, "cerExaminationDate");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeIsNull() {
            addCriterion("cer_get_time is null");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeIsNotNull() {
            addCriterion("cer_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeEqualTo(Date value) {
            addCriterion("cer_get_time =", value, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeNotEqualTo(Date value) {
            addCriterion("cer_get_time <>", value, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeGreaterThan(Date value) {
            addCriterion("cer_get_time >", value, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cer_get_time >=", value, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeLessThan(Date value) {
            addCriterion("cer_get_time <", value, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("cer_get_time <=", value, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeIn(List<Date> values) {
            addCriterion("cer_get_time in", values, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeNotIn(List<Date> values) {
            addCriterion("cer_get_time not in", values, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeBetween(Date value1, Date value2) {
            addCriterion("cer_get_time between", value1, value2, "cerGetTime");
            return (Criteria) this;
        }

        public Criteria andCerGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("cer_get_time not between", value1, value2, "cerGetTime");
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