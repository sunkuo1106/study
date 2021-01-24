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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Long value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Long value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Long value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Long value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Long value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Long> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Long> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Long value1, Long value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Long value1, Long value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateIsNull() {
            addCriterion("teacher_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateIsNotNull() {
            addCriterion("teacher_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateEqualTo(Date value) {
            addCriterion("teacher_gmt_create =", value, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateNotEqualTo(Date value) {
            addCriterion("teacher_gmt_create <>", value, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateGreaterThan(Date value) {
            addCriterion("teacher_gmt_create >", value, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_gmt_create >=", value, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateLessThan(Date value) {
            addCriterion("teacher_gmt_create <", value, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("teacher_gmt_create <=", value, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateIn(List<Date> values) {
            addCriterion("teacher_gmt_create in", values, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateNotIn(List<Date> values) {
            addCriterion("teacher_gmt_create not in", values, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateBetween(Date value1, Date value2) {
            addCriterion("teacher_gmt_create between", value1, value2, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("teacher_gmt_create not between", value1, value2, "teacherGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedIsNull() {
            addCriterion("teacher_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedIsNotNull() {
            addCriterion("teacher_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedEqualTo(Date value) {
            addCriterion("teacher_gmt_modified =", value, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedNotEqualTo(Date value) {
            addCriterion("teacher_gmt_modified <>", value, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedGreaterThan(Date value) {
            addCriterion("teacher_gmt_modified >", value, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_gmt_modified >=", value, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedLessThan(Date value) {
            addCriterion("teacher_gmt_modified <", value, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("teacher_gmt_modified <=", value, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedIn(List<Date> values) {
            addCriterion("teacher_gmt_modified in", values, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedNotIn(List<Date> values) {
            addCriterion("teacher_gmt_modified not in", values, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("teacher_gmt_modified between", value1, value2, "teacherGmtModified");
            return (Criteria) this;
        }

        public Criteria andTeacherGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("teacher_gmt_modified not between", value1, value2, "teacherGmtModified");
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

        public Criteria andTchEducationIsNull() {
            addCriterion("tch_education is null");
            return (Criteria) this;
        }

        public Criteria andTchEducationIsNotNull() {
            addCriterion("tch_education is not null");
            return (Criteria) this;
        }

        public Criteria andTchEducationEqualTo(String value) {
            addCriterion("tch_education =", value, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationNotEqualTo(String value) {
            addCriterion("tch_education <>", value, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationGreaterThan(String value) {
            addCriterion("tch_education >", value, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationGreaterThanOrEqualTo(String value) {
            addCriterion("tch_education >=", value, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationLessThan(String value) {
            addCriterion("tch_education <", value, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationLessThanOrEqualTo(String value) {
            addCriterion("tch_education <=", value, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationLike(String value) {
            addCriterion("tch_education like", value, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationNotLike(String value) {
            addCriterion("tch_education not like", value, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationIn(List<String> values) {
            addCriterion("tch_education in", values, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationNotIn(List<String> values) {
            addCriterion("tch_education not in", values, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationBetween(String value1, String value2) {
            addCriterion("tch_education between", value1, value2, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchEducationNotBetween(String value1, String value2) {
            addCriterion("tch_education not between", value1, value2, "tchEducation");
            return (Criteria) this;
        }

        public Criteria andTchIsStarIsNull() {
            addCriterion("tch_is_star is null");
            return (Criteria) this;
        }

        public Criteria andTchIsStarIsNotNull() {
            addCriterion("tch_is_star is not null");
            return (Criteria) this;
        }

        public Criteria andTchIsStarEqualTo(Integer value) {
            addCriterion("tch_is_star =", value, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarNotEqualTo(Integer value) {
            addCriterion("tch_is_star <>", value, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarGreaterThan(Integer value) {
            addCriterion("tch_is_star >", value, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("tch_is_star >=", value, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarLessThan(Integer value) {
            addCriterion("tch_is_star <", value, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarLessThanOrEqualTo(Integer value) {
            addCriterion("tch_is_star <=", value, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarIn(List<Integer> values) {
            addCriterion("tch_is_star in", values, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarNotIn(List<Integer> values) {
            addCriterion("tch_is_star not in", values, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarBetween(Integer value1, Integer value2) {
            addCriterion("tch_is_star between", value1, value2, "tchIsStar");
            return (Criteria) this;
        }

        public Criteria andTchIsStarNotBetween(Integer value1, Integer value2) {
            addCriterion("tch_is_star not between", value1, value2, "tchIsStar");
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

        public Criteria andTchStatusIsNull() {
            addCriterion("tch_status is null");
            return (Criteria) this;
        }

        public Criteria andTchStatusIsNotNull() {
            addCriterion("tch_status is not null");
            return (Criteria) this;
        }

        public Criteria andTchStatusEqualTo(Date value) {
            addCriterion("tch_status =", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusNotEqualTo(Date value) {
            addCriterion("tch_status <>", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusGreaterThan(Date value) {
            addCriterion("tch_status >", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusGreaterThanOrEqualTo(Date value) {
            addCriterion("tch_status >=", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusLessThan(Date value) {
            addCriterion("tch_status <", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusLessThanOrEqualTo(Date value) {
            addCriterion("tch_status <=", value, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusIn(List<Date> values) {
            addCriterion("tch_status in", values, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusNotIn(List<Date> values) {
            addCriterion("tch_status not in", values, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusBetween(Date value1, Date value2) {
            addCriterion("tch_status between", value1, value2, "tchStatus");
            return (Criteria) this;
        }

        public Criteria andTchStatusNotBetween(Date value1, Date value2) {
            addCriterion("tch_status not between", value1, value2, "tchStatus");
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