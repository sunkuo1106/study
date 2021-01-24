package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordInfoExample() {
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

        public Criteria andRecordGmtCreateIsNull() {
            addCriterion("record_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateIsNotNull() {
            addCriterion("record_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateEqualTo(Date value) {
            addCriterion("record_gmt_create =", value, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateNotEqualTo(Date value) {
            addCriterion("record_gmt_create <>", value, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateGreaterThan(Date value) {
            addCriterion("record_gmt_create >", value, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("record_gmt_create >=", value, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateLessThan(Date value) {
            addCriterion("record_gmt_create <", value, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("record_gmt_create <=", value, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateIn(List<Date> values) {
            addCriterion("record_gmt_create in", values, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateNotIn(List<Date> values) {
            addCriterion("record_gmt_create not in", values, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateBetween(Date value1, Date value2) {
            addCriterion("record_gmt_create between", value1, value2, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("record_gmt_create not between", value1, value2, "recordGmtCreate");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedIsNull() {
            addCriterion("record_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedIsNotNull() {
            addCriterion("record_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedEqualTo(Date value) {
            addCriterion("record_gmt_modified =", value, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedNotEqualTo(Date value) {
            addCriterion("record_gmt_modified <>", value, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedGreaterThan(Date value) {
            addCriterion("record_gmt_modified >", value, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("record_gmt_modified >=", value, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedLessThan(Date value) {
            addCriterion("record_gmt_modified <", value, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("record_gmt_modified <=", value, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedIn(List<Date> values) {
            addCriterion("record_gmt_modified in", values, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedNotIn(List<Date> values) {
            addCriterion("record_gmt_modified not in", values, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("record_gmt_modified between", value1, value2, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("record_gmt_modified not between", value1, value2, "recordGmtModified");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameIsNull() {
            addCriterion("record_test_name is null");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameIsNotNull() {
            addCriterion("record_test_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameEqualTo(String value) {
            addCriterion("record_test_name =", value, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameNotEqualTo(String value) {
            addCriterion("record_test_name <>", value, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameGreaterThan(String value) {
            addCriterion("record_test_name >", value, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameGreaterThanOrEqualTo(String value) {
            addCriterion("record_test_name >=", value, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameLessThan(String value) {
            addCriterion("record_test_name <", value, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameLessThanOrEqualTo(String value) {
            addCriterion("record_test_name <=", value, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameLike(String value) {
            addCriterion("record_test_name like", value, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameNotLike(String value) {
            addCriterion("record_test_name not like", value, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameIn(List<String> values) {
            addCriterion("record_test_name in", values, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameNotIn(List<String> values) {
            addCriterion("record_test_name not in", values, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameBetween(String value1, String value2) {
            addCriterion("record_test_name between", value1, value2, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestNameNotBetween(String value1, String value2) {
            addCriterion("record_test_name not between", value1, value2, "recordTestName");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataIsNull() {
            addCriterion("record_test_data is null");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataIsNotNull() {
            addCriterion("record_test_data is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataEqualTo(Date value) {
            addCriterion("record_test_data =", value, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataNotEqualTo(Date value) {
            addCriterion("record_test_data <>", value, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataGreaterThan(Date value) {
            addCriterion("record_test_data >", value, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataGreaterThanOrEqualTo(Date value) {
            addCriterion("record_test_data >=", value, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataLessThan(Date value) {
            addCriterion("record_test_data <", value, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataLessThanOrEqualTo(Date value) {
            addCriterion("record_test_data <=", value, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataIn(List<Date> values) {
            addCriterion("record_test_data in", values, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataNotIn(List<Date> values) {
            addCriterion("record_test_data not in", values, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataBetween(Date value1, Date value2) {
            addCriterion("record_test_data between", value1, value2, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestDataNotBetween(Date value1, Date value2) {
            addCriterion("record_test_data not between", value1, value2, "recordTestData");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreIsNull() {
            addCriterion("record_test_score is null");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreIsNotNull() {
            addCriterion("record_test_score is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreEqualTo(Integer value) {
            addCriterion("record_test_score =", value, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreNotEqualTo(Integer value) {
            addCriterion("record_test_score <>", value, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreGreaterThan(Integer value) {
            addCriterion("record_test_score >", value, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_test_score >=", value, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreLessThan(Integer value) {
            addCriterion("record_test_score <", value, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreLessThanOrEqualTo(Integer value) {
            addCriterion("record_test_score <=", value, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreIn(List<Integer> values) {
            addCriterion("record_test_score in", values, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreNotIn(List<Integer> values) {
            addCriterion("record_test_score not in", values, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreBetween(Integer value1, Integer value2) {
            addCriterion("record_test_score between", value1, value2, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("record_test_score not between", value1, value2, "recordTestScore");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountIsNull() {
            addCriterion("record_test_count is null");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountIsNotNull() {
            addCriterion("record_test_count is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountEqualTo(Integer value) {
            addCriterion("record_test_count =", value, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountNotEqualTo(Integer value) {
            addCriterion("record_test_count <>", value, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountGreaterThan(Integer value) {
            addCriterion("record_test_count >", value, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_test_count >=", value, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountLessThan(Integer value) {
            addCriterion("record_test_count <", value, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountLessThanOrEqualTo(Integer value) {
            addCriterion("record_test_count <=", value, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountIn(List<Integer> values) {
            addCriterion("record_test_count in", values, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountNotIn(List<Integer> values) {
            addCriterion("record_test_count not in", values, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountBetween(Integer value1, Integer value2) {
            addCriterion("record_test_count between", value1, value2, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordTestCountNotBetween(Integer value1, Integer value2) {
            addCriterion("record_test_count not between", value1, value2, "recordTestCount");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIsNull() {
            addCriterion("record_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIsNotNull() {
            addCriterion("record_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdEqualTo(Integer value) {
            addCriterion("record_user_id =", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotEqualTo(Integer value) {
            addCriterion("record_user_id <>", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdGreaterThan(Integer value) {
            addCriterion("record_user_id >", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_user_id >=", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdLessThan(Integer value) {
            addCriterion("record_user_id <", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_user_id <=", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIn(List<Integer> values) {
            addCriterion("record_user_id in", values, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotIn(List<Integer> values) {
            addCriterion("record_user_id not in", values, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdBetween(Integer value1, Integer value2) {
            addCriterion("record_user_id between", value1, value2, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_user_id not between", value1, value2, "recordUserId");
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