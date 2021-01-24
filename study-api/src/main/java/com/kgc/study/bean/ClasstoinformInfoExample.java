package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClasstoinformInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClasstoinformInfoExample() {
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

        public Criteria andCtfGmtCreateIsNull() {
            addCriterion("ctf_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateIsNotNull() {
            addCriterion("ctf_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateEqualTo(Date value) {
            addCriterion("ctf_gmt_create =", value, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateNotEqualTo(Date value) {
            addCriterion("ctf_gmt_create <>", value, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateGreaterThan(Date value) {
            addCriterion("ctf_gmt_create >", value, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("ctf_gmt_create >=", value, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateLessThan(Date value) {
            addCriterion("ctf_gmt_create <", value, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("ctf_gmt_create <=", value, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateIn(List<Date> values) {
            addCriterion("ctf_gmt_create in", values, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateNotIn(List<Date> values) {
            addCriterion("ctf_gmt_create not in", values, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateBetween(Date value1, Date value2) {
            addCriterion("ctf_gmt_create between", value1, value2, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("ctf_gmt_create not between", value1, value2, "ctfGmtCreate");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedIsNull() {
            addCriterion("ctf_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedIsNotNull() {
            addCriterion("ctf_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedEqualTo(Date value) {
            addCriterion("ctf_gmt_modified =", value, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedNotEqualTo(Date value) {
            addCriterion("ctf_gmt_modified <>", value, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedGreaterThan(Date value) {
            addCriterion("ctf_gmt_modified >", value, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("ctf_gmt_modified >=", value, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedLessThan(Date value) {
            addCriterion("ctf_gmt_modified <", value, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("ctf_gmt_modified <=", value, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedIn(List<Date> values) {
            addCriterion("ctf_gmt_modified in", values, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedNotIn(List<Date> values) {
            addCriterion("ctf_gmt_modified not in", values, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("ctf_gmt_modified between", value1, value2, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("ctf_gmt_modified not between", value1, value2, "ctfGmtModified");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdIsNull() {
            addCriterion("ctf_address_id is null");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdIsNotNull() {
            addCriterion("ctf_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdEqualTo(Integer value) {
            addCriterion("ctf_address_id =", value, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdNotEqualTo(Integer value) {
            addCriterion("ctf_address_id <>", value, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdGreaterThan(Integer value) {
            addCriterion("ctf_address_id >", value, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctf_address_id >=", value, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdLessThan(Integer value) {
            addCriterion("ctf_address_id <", value, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("ctf_address_id <=", value, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdIn(List<Integer> values) {
            addCriterion("ctf_address_id in", values, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdNotIn(List<Integer> values) {
            addCriterion("ctf_address_id not in", values, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("ctf_address_id between", value1, value2, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ctf_address_id not between", value1, value2, "ctfAddressId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdIsNull() {
            addCriterion("ctf_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdIsNotNull() {
            addCriterion("ctf_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdEqualTo(String value) {
            addCriterion("ctf_grade_id =", value, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdNotEqualTo(String value) {
            addCriterion("ctf_grade_id <>", value, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdGreaterThan(String value) {
            addCriterion("ctf_grade_id >", value, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ctf_grade_id >=", value, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdLessThan(String value) {
            addCriterion("ctf_grade_id <", value, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdLessThanOrEqualTo(String value) {
            addCriterion("ctf_grade_id <=", value, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdLike(String value) {
            addCriterion("ctf_grade_id like", value, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdNotLike(String value) {
            addCriterion("ctf_grade_id not like", value, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdIn(List<String> values) {
            addCriterion("ctf_grade_id in", values, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdNotIn(List<String> values) {
            addCriterion("ctf_grade_id not in", values, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdBetween(String value1, String value2) {
            addCriterion("ctf_grade_id between", value1, value2, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfGradeIdNotBetween(String value1, String value2) {
            addCriterion("ctf_grade_id not between", value1, value2, "ctfGradeId");
            return (Criteria) this;
        }

        public Criteria andCtfContextIsNull() {
            addCriterion("ctf_context is null");
            return (Criteria) this;
        }

        public Criteria andCtfContextIsNotNull() {
            addCriterion("ctf_context is not null");
            return (Criteria) this;
        }

        public Criteria andCtfContextEqualTo(String value) {
            addCriterion("ctf_context =", value, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextNotEqualTo(String value) {
            addCriterion("ctf_context <>", value, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextGreaterThan(String value) {
            addCriterion("ctf_context >", value, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextGreaterThanOrEqualTo(String value) {
            addCriterion("ctf_context >=", value, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextLessThan(String value) {
            addCriterion("ctf_context <", value, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextLessThanOrEqualTo(String value) {
            addCriterion("ctf_context <=", value, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextLike(String value) {
            addCriterion("ctf_context like", value, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextNotLike(String value) {
            addCriterion("ctf_context not like", value, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextIn(List<String> values) {
            addCriterion("ctf_context in", values, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextNotIn(List<String> values) {
            addCriterion("ctf_context not in", values, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextBetween(String value1, String value2) {
            addCriterion("ctf_context between", value1, value2, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfContextNotBetween(String value1, String value2) {
            addCriterion("ctf_context not between", value1, value2, "ctfContext");
            return (Criteria) this;
        }

        public Criteria andCtfPicIsNull() {
            addCriterion("ctf_pic is null");
            return (Criteria) this;
        }

        public Criteria andCtfPicIsNotNull() {
            addCriterion("ctf_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCtfPicEqualTo(String value) {
            addCriterion("ctf_pic =", value, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicNotEqualTo(String value) {
            addCriterion("ctf_pic <>", value, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicGreaterThan(String value) {
            addCriterion("ctf_pic >", value, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicGreaterThanOrEqualTo(String value) {
            addCriterion("ctf_pic >=", value, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicLessThan(String value) {
            addCriterion("ctf_pic <", value, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicLessThanOrEqualTo(String value) {
            addCriterion("ctf_pic <=", value, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicLike(String value) {
            addCriterion("ctf_pic like", value, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicNotLike(String value) {
            addCriterion("ctf_pic not like", value, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicIn(List<String> values) {
            addCriterion("ctf_pic in", values, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicNotIn(List<String> values) {
            addCriterion("ctf_pic not in", values, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicBetween(String value1, String value2) {
            addCriterion("ctf_pic between", value1, value2, "ctfPic");
            return (Criteria) this;
        }

        public Criteria andCtfPicNotBetween(String value1, String value2) {
            addCriterion("ctf_pic not between", value1, value2, "ctfPic");
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