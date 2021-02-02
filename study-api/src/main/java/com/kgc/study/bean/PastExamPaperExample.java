package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PastExamPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PastExamPaperExample() {
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

        public Criteria andPepImageIsNull() {
            addCriterion("pep_image is null");
            return (Criteria) this;
        }

        public Criteria andPepImageIsNotNull() {
            addCriterion("pep_image is not null");
            return (Criteria) this;
        }

        public Criteria andPepImageEqualTo(String value) {
            addCriterion("pep_image =", value, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageNotEqualTo(String value) {
            addCriterion("pep_image <>", value, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageGreaterThan(String value) {
            addCriterion("pep_image >", value, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageGreaterThanOrEqualTo(String value) {
            addCriterion("pep_image >=", value, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageLessThan(String value) {
            addCriterion("pep_image <", value, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageLessThanOrEqualTo(String value) {
            addCriterion("pep_image <=", value, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageLike(String value) {
            addCriterion("pep_image like", value, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageNotLike(String value) {
            addCriterion("pep_image not like", value, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageIn(List<String> values) {
            addCriterion("pep_image in", values, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageNotIn(List<String> values) {
            addCriterion("pep_image not in", values, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageBetween(String value1, String value2) {
            addCriterion("pep_image between", value1, value2, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepImageNotBetween(String value1, String value2) {
            addCriterion("pep_image not between", value1, value2, "pepImage");
            return (Criteria) this;
        }

        public Criteria andPepExamDateIsNull() {
            addCriterion("pep_exam_date is null");
            return (Criteria) this;
        }

        public Criteria andPepExamDateIsNotNull() {
            addCriterion("pep_exam_date is not null");
            return (Criteria) this;
        }

        public Criteria andPepExamDateEqualTo(Date value) {
            addCriterion("pep_exam_date =", value, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateNotEqualTo(Date value) {
            addCriterion("pep_exam_date <>", value, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateGreaterThan(Date value) {
            addCriterion("pep_exam_date >", value, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pep_exam_date >=", value, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateLessThan(Date value) {
            addCriterion("pep_exam_date <", value, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateLessThanOrEqualTo(Date value) {
            addCriterion("pep_exam_date <=", value, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateIn(List<Date> values) {
            addCriterion("pep_exam_date in", values, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateNotIn(List<Date> values) {
            addCriterion("pep_exam_date not in", values, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateBetween(Date value1, Date value2) {
            addCriterion("pep_exam_date between", value1, value2, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepExamDateNotBetween(Date value1, Date value2) {
            addCriterion("pep_exam_date not between", value1, value2, "pepExamDate");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdIsNull() {
            addCriterion("pep_test_info_id is null");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdIsNotNull() {
            addCriterion("pep_test_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdEqualTo(Long value) {
            addCriterion("pep_test_info_id =", value, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdNotEqualTo(Long value) {
            addCriterion("pep_test_info_id <>", value, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdGreaterThan(Long value) {
            addCriterion("pep_test_info_id >", value, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pep_test_info_id >=", value, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdLessThan(Long value) {
            addCriterion("pep_test_info_id <", value, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("pep_test_info_id <=", value, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdIn(List<Long> values) {
            addCriterion("pep_test_info_id in", values, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdNotIn(List<Long> values) {
            addCriterion("pep_test_info_id not in", values, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdBetween(Long value1, Long value2) {
            addCriterion("pep_test_info_id between", value1, value2, "pepTestInfoId");
            return (Criteria) this;
        }

        public Criteria andPepTestInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("pep_test_info_id not between", value1, value2, "pepTestInfoId");
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