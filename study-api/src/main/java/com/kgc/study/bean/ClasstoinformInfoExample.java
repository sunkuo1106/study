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

        public Criteria andAgencyAddressIdIsNull() {
            addCriterion("agency_address_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdIsNotNull() {
            addCriterion("agency_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdEqualTo(Integer value) {
            addCriterion("agency_address_id =", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotEqualTo(Integer value) {
            addCriterion("agency_address_id <>", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdGreaterThan(Integer value) {
            addCriterion("agency_address_id >", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agency_address_id >=", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdLessThan(Integer value) {
            addCriterion("agency_address_id <", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("agency_address_id <=", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdIn(List<Integer> values) {
            addCriterion("agency_address_id in", values, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotIn(List<Integer> values) {
            addCriterion("agency_address_id not in", values, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("agency_address_id between", value1, value2, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agency_address_id not between", value1, value2, "agencyAddressId");
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

        public Criteria andCtfGmtFounderIdIsNull() {
            addCriterion("ctf_gmt_founder_id is null");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdIsNotNull() {
            addCriterion("ctf_gmt_founder_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdEqualTo(Integer value) {
            addCriterion("ctf_gmt_founder_id =", value, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdNotEqualTo(Integer value) {
            addCriterion("ctf_gmt_founder_id <>", value, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdGreaterThan(Integer value) {
            addCriterion("ctf_gmt_founder_id >", value, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctf_gmt_founder_id >=", value, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdLessThan(Integer value) {
            addCriterion("ctf_gmt_founder_id <", value, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ctf_gmt_founder_id <=", value, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdIn(List<Integer> values) {
            addCriterion("ctf_gmt_founder_id in", values, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdNotIn(List<Integer> values) {
            addCriterion("ctf_gmt_founder_id not in", values, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdBetween(Integer value1, Integer value2) {
            addCriterion("ctf_gmt_founder_id between", value1, value2, "ctfGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andCtfGmtFounderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ctf_gmt_founder_id not between", value1, value2, "ctfGmtFounderId");
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