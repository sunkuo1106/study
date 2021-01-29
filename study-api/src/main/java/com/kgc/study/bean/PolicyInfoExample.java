package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PolicyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PolicyInfoExample() {
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

        public Criteria andPolicyInfoTitleIsNull() {
            addCriterion("policy_info_title is null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleIsNotNull() {
            addCriterion("policy_info_title is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleEqualTo(String value) {
            addCriterion("policy_info_title =", value, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleNotEqualTo(String value) {
            addCriterion("policy_info_title <>", value, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleGreaterThan(String value) {
            addCriterion("policy_info_title >", value, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("policy_info_title >=", value, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleLessThan(String value) {
            addCriterion("policy_info_title <", value, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleLessThanOrEqualTo(String value) {
            addCriterion("policy_info_title <=", value, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleLike(String value) {
            addCriterion("policy_info_title like", value, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleNotLike(String value) {
            addCriterion("policy_info_title not like", value, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleIn(List<String> values) {
            addCriterion("policy_info_title in", values, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleNotIn(List<String> values) {
            addCriterion("policy_info_title not in", values, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleBetween(String value1, String value2) {
            addCriterion("policy_info_title between", value1, value2, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoTitleNotBetween(String value1, String value2) {
            addCriterion("policy_info_title not between", value1, value2, "policyInfoTitle");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryIsNull() {
            addCriterion("policy_info_summary is null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryIsNotNull() {
            addCriterion("policy_info_summary is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryEqualTo(String value) {
            addCriterion("policy_info_summary =", value, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryNotEqualTo(String value) {
            addCriterion("policy_info_summary <>", value, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryGreaterThan(String value) {
            addCriterion("policy_info_summary >", value, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("policy_info_summary >=", value, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryLessThan(String value) {
            addCriterion("policy_info_summary <", value, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryLessThanOrEqualTo(String value) {
            addCriterion("policy_info_summary <=", value, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryLike(String value) {
            addCriterion("policy_info_summary like", value, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryNotLike(String value) {
            addCriterion("policy_info_summary not like", value, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryIn(List<String> values) {
            addCriterion("policy_info_summary in", values, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryNotIn(List<String> values) {
            addCriterion("policy_info_summary not in", values, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryBetween(String value1, String value2) {
            addCriterion("policy_info_summary between", value1, value2, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSummaryNotBetween(String value1, String value2) {
            addCriterion("policy_info_summary not between", value1, value2, "policyInfoSummary");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordIsNull() {
            addCriterion("policy_info_key_word is null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordIsNotNull() {
            addCriterion("policy_info_key_word is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordEqualTo(String value) {
            addCriterion("policy_info_key_word =", value, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordNotEqualTo(String value) {
            addCriterion("policy_info_key_word <>", value, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordGreaterThan(String value) {
            addCriterion("policy_info_key_word >", value, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("policy_info_key_word >=", value, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordLessThan(String value) {
            addCriterion("policy_info_key_word <", value, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordLessThanOrEqualTo(String value) {
            addCriterion("policy_info_key_word <=", value, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordLike(String value) {
            addCriterion("policy_info_key_word like", value, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordNotLike(String value) {
            addCriterion("policy_info_key_word not like", value, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordIn(List<String> values) {
            addCriterion("policy_info_key_word in", values, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordNotIn(List<String> values) {
            addCriterion("policy_info_key_word not in", values, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordBetween(String value1, String value2) {
            addCriterion("policy_info_key_word between", value1, value2, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoKeyWordNotBetween(String value1, String value2) {
            addCriterion("policy_info_key_word not between", value1, value2, "policyInfoKeyWord");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceIsNull() {
            addCriterion("policy_info_source is null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceIsNotNull() {
            addCriterion("policy_info_source is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceEqualTo(String value) {
            addCriterion("policy_info_source =", value, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceNotEqualTo(String value) {
            addCriterion("policy_info_source <>", value, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceGreaterThan(String value) {
            addCriterion("policy_info_source >", value, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("policy_info_source >=", value, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceLessThan(String value) {
            addCriterion("policy_info_source <", value, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceLessThanOrEqualTo(String value) {
            addCriterion("policy_info_source <=", value, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceLike(String value) {
            addCriterion("policy_info_source like", value, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceNotLike(String value) {
            addCriterion("policy_info_source not like", value, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceIn(List<String> values) {
            addCriterion("policy_info_source in", values, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceNotIn(List<String> values) {
            addCriterion("policy_info_source not in", values, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceBetween(String value1, String value2) {
            addCriterion("policy_info_source between", value1, value2, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoSourceNotBetween(String value1, String value2) {
            addCriterion("policy_info_source not between", value1, value2, "policyInfoSource");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorIsNull() {
            addCriterion("policy_info_author is null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorIsNotNull() {
            addCriterion("policy_info_author is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorEqualTo(String value) {
            addCriterion("policy_info_author =", value, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorNotEqualTo(String value) {
            addCriterion("policy_info_author <>", value, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorGreaterThan(String value) {
            addCriterion("policy_info_author >", value, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("policy_info_author >=", value, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorLessThan(String value) {
            addCriterion("policy_info_author <", value, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorLessThanOrEqualTo(String value) {
            addCriterion("policy_info_author <=", value, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorLike(String value) {
            addCriterion("policy_info_author like", value, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorNotLike(String value) {
            addCriterion("policy_info_author not like", value, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorIn(List<String> values) {
            addCriterion("policy_info_author in", values, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorNotIn(List<String> values) {
            addCriterion("policy_info_author not in", values, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorBetween(String value1, String value2) {
            addCriterion("policy_info_author between", value1, value2, "policyInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoAuthorNotBetween(String value1, String value2) {
            addCriterion("policy_info_author not between", value1, value2, "policyInfoAuthor");
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

        public Criteria andPolicyInfoIstopIsNull() {
            addCriterion("policy_info_isTop is null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopIsNotNull() {
            addCriterion("policy_info_isTop is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopEqualTo(Integer value) {
            addCriterion("policy_info_isTop =", value, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopNotEqualTo(Integer value) {
            addCriterion("policy_info_isTop <>", value, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopGreaterThan(Integer value) {
            addCriterion("policy_info_isTop >", value, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("policy_info_isTop >=", value, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopLessThan(Integer value) {
            addCriterion("policy_info_isTop <", value, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopLessThanOrEqualTo(Integer value) {
            addCriterion("policy_info_isTop <=", value, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopIn(List<Integer> values) {
            addCriterion("policy_info_isTop in", values, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopNotIn(List<Integer> values) {
            addCriterion("policy_info_isTop not in", values, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopBetween(Integer value1, Integer value2) {
            addCriterion("policy_info_isTop between", value1, value2, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("policy_info_isTop not between", value1, value2, "policyInfoIstop");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailIsNull() {
            addCriterion("policy_info_thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailIsNotNull() {
            addCriterion("policy_info_thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailEqualTo(String value) {
            addCriterion("policy_info_thumbnail =", value, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailNotEqualTo(String value) {
            addCriterion("policy_info_thumbnail <>", value, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailGreaterThan(String value) {
            addCriterion("policy_info_thumbnail >", value, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("policy_info_thumbnail >=", value, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailLessThan(String value) {
            addCriterion("policy_info_thumbnail <", value, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailLessThanOrEqualTo(String value) {
            addCriterion("policy_info_thumbnail <=", value, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailLike(String value) {
            addCriterion("policy_info_thumbnail like", value, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailNotLike(String value) {
            addCriterion("policy_info_thumbnail not like", value, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailIn(List<String> values) {
            addCriterion("policy_info_thumbnail in", values, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailNotIn(List<String> values) {
            addCriterion("policy_info_thumbnail not in", values, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailBetween(String value1, String value2) {
            addCriterion("policy_info_thumbnail between", value1, value2, "policyInfoThumbnail");
            return (Criteria) this;
        }

        public Criteria andPolicyInfoThumbnailNotBetween(String value1, String value2) {
            addCriterion("policy_info_thumbnail not between", value1, value2, "policyInfoThumbnail");
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