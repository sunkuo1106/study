package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminLoginExample() {
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

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceIsNull() {
            addCriterion("admin_competence is null");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceIsNotNull() {
            addCriterion("admin_competence is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceEqualTo(Integer value) {
            addCriterion("admin_competence =", value, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceNotEqualTo(Integer value) {
            addCriterion("admin_competence <>", value, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceGreaterThan(Integer value) {
            addCriterion("admin_competence >", value, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_competence >=", value, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceLessThan(Integer value) {
            addCriterion("admin_competence <", value, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceLessThanOrEqualTo(Integer value) {
            addCriterion("admin_competence <=", value, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceIn(List<Integer> values) {
            addCriterion("admin_competence in", values, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceNotIn(List<Integer> values) {
            addCriterion("admin_competence not in", values, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceBetween(Integer value1, Integer value2) {
            addCriterion("admin_competence between", value1, value2, "adminCompetence");
            return (Criteria) this;
        }

        public Criteria andAdminCompetenceNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_competence not between", value1, value2, "adminCompetence");
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