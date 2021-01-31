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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListIsNull() {
            addCriterion("record_test_id_list is null");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListIsNotNull() {
            addCriterion("record_test_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListEqualTo(String value) {
            addCriterion("record_test_id_list =", value, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListNotEqualTo(String value) {
            addCriterion("record_test_id_list <>", value, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListGreaterThan(String value) {
            addCriterion("record_test_id_list >", value, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListGreaterThanOrEqualTo(String value) {
            addCriterion("record_test_id_list >=", value, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListLessThan(String value) {
            addCriterion("record_test_id_list <", value, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListLessThanOrEqualTo(String value) {
            addCriterion("record_test_id_list <=", value, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListLike(String value) {
            addCriterion("record_test_id_list like", value, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListNotLike(String value) {
            addCriterion("record_test_id_list not like", value, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListIn(List<String> values) {
            addCriterion("record_test_id_list in", values, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListNotIn(List<String> values) {
            addCriterion("record_test_id_list not in", values, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListBetween(String value1, String value2) {
            addCriterion("record_test_id_list between", value1, value2, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestIdListNotBetween(String value1, String value2) {
            addCriterion("record_test_id_list not between", value1, value2, "recordTestIdList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListIsNull() {
            addCriterion("record_test_keys_list is null");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListIsNotNull() {
            addCriterion("record_test_keys_list is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListEqualTo(String value) {
            addCriterion("record_test_keys_list =", value, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListNotEqualTo(String value) {
            addCriterion("record_test_keys_list <>", value, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListGreaterThan(String value) {
            addCriterion("record_test_keys_list >", value, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListGreaterThanOrEqualTo(String value) {
            addCriterion("record_test_keys_list >=", value, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListLessThan(String value) {
            addCriterion("record_test_keys_list <", value, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListLessThanOrEqualTo(String value) {
            addCriterion("record_test_keys_list <=", value, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListLike(String value) {
            addCriterion("record_test_keys_list like", value, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListNotLike(String value) {
            addCriterion("record_test_keys_list not like", value, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListIn(List<String> values) {
            addCriterion("record_test_keys_list in", values, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListNotIn(List<String> values) {
            addCriterion("record_test_keys_list not in", values, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListBetween(String value1, String value2) {
            addCriterion("record_test_keys_list between", value1, value2, "recordTestKeysList");
            return (Criteria) this;
        }

        public Criteria andRecordTestKeysListNotBetween(String value1, String value2) {
            addCriterion("record_test_keys_list not between", value1, value2, "recordTestKeysList");
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