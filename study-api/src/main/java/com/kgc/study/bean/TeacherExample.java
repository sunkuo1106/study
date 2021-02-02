package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTchNameIsNull() {
            addCriterion("tch_name is null");
            return (Criteria) this;
        }

        public Criteria andTchNameIsNotNull() {
            addCriterion("tch_name is not null");
            return (Criteria) this;
        }

        public Criteria andTchNameEqualTo(String value) {
            addCriterion("tch_name =", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotEqualTo(String value) {
            addCriterion("tch_name <>", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameGreaterThan(String value) {
            addCriterion("tch_name >", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameGreaterThanOrEqualTo(String value) {
            addCriterion("tch_name >=", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLessThan(String value) {
            addCriterion("tch_name <", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLessThanOrEqualTo(String value) {
            addCriterion("tch_name <=", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLike(String value) {
            addCriterion("tch_name like", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotLike(String value) {
            addCriterion("tch_name not like", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameIn(List<String> values) {
            addCriterion("tch_name in", values, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotIn(List<String> values) {
            addCriterion("tch_name not in", values, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameBetween(String value1, String value2) {
            addCriterion("tch_name between", value1, value2, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotBetween(String value1, String value2) {
            addCriterion("tch_name not between", value1, value2, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchPicPathIsNull() {
            addCriterion("tch_pic_path is null");
            return (Criteria) this;
        }

        public Criteria andTchPicPathIsNotNull() {
            addCriterion("tch_pic_path is not null");
            return (Criteria) this;
        }

        public Criteria andTchPicPathEqualTo(String value) {
            addCriterion("tch_pic_path =", value, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathNotEqualTo(String value) {
            addCriterion("tch_pic_path <>", value, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathGreaterThan(String value) {
            addCriterion("tch_pic_path >", value, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("tch_pic_path >=", value, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathLessThan(String value) {
            addCriterion("tch_pic_path <", value, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathLessThanOrEqualTo(String value) {
            addCriterion("tch_pic_path <=", value, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathLike(String value) {
            addCriterion("tch_pic_path like", value, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathNotLike(String value) {
            addCriterion("tch_pic_path not like", value, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathIn(List<String> values) {
            addCriterion("tch_pic_path in", values, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathNotIn(List<String> values) {
            addCriterion("tch_pic_path not in", values, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathBetween(String value1, String value2) {
            addCriterion("tch_pic_path between", value1, value2, "tchPicPath");
            return (Criteria) this;
        }

        public Criteria andTchPicPathNotBetween(String value1, String value2) {
            addCriterion("tch_pic_path not between", value1, value2, "tchPicPath");
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

        public Criteria andTchSubjectIsNull() {
            addCriterion("tch_subject is null");
            return (Criteria) this;
        }

        public Criteria andTchSubjectIsNotNull() {
            addCriterion("tch_subject is not null");
            return (Criteria) this;
        }

        public Criteria andTchSubjectEqualTo(String value) {
            addCriterion("tch_subject =", value, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectNotEqualTo(String value) {
            addCriterion("tch_subject <>", value, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectGreaterThan(String value) {
            addCriterion("tch_subject >", value, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("tch_subject >=", value, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectLessThan(String value) {
            addCriterion("tch_subject <", value, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectLessThanOrEqualTo(String value) {
            addCriterion("tch_subject <=", value, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectLike(String value) {
            addCriterion("tch_subject like", value, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectNotLike(String value) {
            addCriterion("tch_subject not like", value, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectIn(List<String> values) {
            addCriterion("tch_subject in", values, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectNotIn(List<String> values) {
            addCriterion("tch_subject not in", values, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectBetween(String value1, String value2) {
            addCriterion("tch_subject between", value1, value2, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchSubjectNotBetween(String value1, String value2) {
            addCriterion("tch_subject not between", value1, value2, "tchSubject");
            return (Criteria) this;
        }

        public Criteria andTchStatusIsNull() {
            addCriterion("tch_status is null");
            return (Criteria) this;
        }

        public Criteria andTchStatusIsNotNull() {
            addCriterion("tch_status is not null");
            return (Criteria) this;
        }

        public Criteria andTchStatusEqualTo(Integer value) {
            addCriterion("tch_status =", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusNotEqualTo(Integer value) {
            addCriterion("tch_status <>", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusGreaterThan(Integer value) {
            addCriterion("tch_status >", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tch_status >=", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusLessThan(Integer value) {
            addCriterion("tch_status <", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusLessThanOrEqualTo(Integer value) {
            addCriterion("tch_status <=", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusIn(List<Integer> values) {
            addCriterion("tch_status in", values, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusNotIn(List<Integer> values) {
            addCriterion("tch_status not in", values, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusBetween(Integer value1, Integer value2) {
            addCriterion("tch_status between", value1, value2, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tch_status not between", value1, value2, "tchStatus");
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