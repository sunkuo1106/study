package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertificateTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateTableExample() {
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

        public Criteria andLogicDeleteIsNull() {
            addCriterion("logic_delete is null");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIsNotNull() {
            addCriterion("logic_delete is not null");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteEqualTo(Integer value) {
            addCriterion("logic_delete =", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotEqualTo(Integer value) {
            addCriterion("logic_delete <>", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteGreaterThan(Integer value) {
            addCriterion("logic_delete >", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("logic_delete >=", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteLessThan(Integer value) {
            addCriterion("logic_delete <", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("logic_delete <=", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIn(List<Integer> values) {
            addCriterion("logic_delete in", values, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotIn(List<Integer> values) {
            addCriterion("logic_delete not in", values, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteBetween(Integer value1, Integer value2) {
            addCriterion("logic_delete between", value1, value2, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("logic_delete not between", value1, value2, "logicDelete");
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