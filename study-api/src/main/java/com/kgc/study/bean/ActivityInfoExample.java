package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityInfoExample() {
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

        public Criteria andAcInfoSummaryIsNull() {
            addCriterion("ac_info_summary is null");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryIsNotNull() {
            addCriterion("ac_info_summary is not null");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryEqualTo(String value) {
            addCriterion("ac_info_summary =", value, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryNotEqualTo(String value) {
            addCriterion("ac_info_summary <>", value, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryGreaterThan(String value) {
            addCriterion("ac_info_summary >", value, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("ac_info_summary >=", value, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryLessThan(String value) {
            addCriterion("ac_info_summary <", value, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryLessThanOrEqualTo(String value) {
            addCriterion("ac_info_summary <=", value, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryLike(String value) {
            addCriterion("ac_info_summary like", value, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryNotLike(String value) {
            addCriterion("ac_info_summary not like", value, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryIn(List<String> values) {
            addCriterion("ac_info_summary in", values, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryNotIn(List<String> values) {
            addCriterion("ac_info_summary not in", values, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryBetween(String value1, String value2) {
            addCriterion("ac_info_summary between", value1, value2, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSummaryNotBetween(String value1, String value2) {
            addCriterion("ac_info_summary not between", value1, value2, "acInfoSummary");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceIsNull() {
            addCriterion("ac_info_source is null");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceIsNotNull() {
            addCriterion("ac_info_source is not null");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceEqualTo(String value) {
            addCriterion("ac_info_source =", value, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceNotEqualTo(String value) {
            addCriterion("ac_info_source <>", value, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceGreaterThan(String value) {
            addCriterion("ac_info_source >", value, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("ac_info_source >=", value, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceLessThan(String value) {
            addCriterion("ac_info_source <", value, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceLessThanOrEqualTo(String value) {
            addCriterion("ac_info_source <=", value, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceLike(String value) {
            addCriterion("ac_info_source like", value, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceNotLike(String value) {
            addCriterion("ac_info_source not like", value, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceIn(List<String> values) {
            addCriterion("ac_info_source in", values, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceNotIn(List<String> values) {
            addCriterion("ac_info_source not in", values, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceBetween(String value1, String value2) {
            addCriterion("ac_info_source between", value1, value2, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoSourceNotBetween(String value1, String value2) {
            addCriterion("ac_info_source not between", value1, value2, "acInfoSource");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorIsNull() {
            addCriterion("ac_info_author is null");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorIsNotNull() {
            addCriterion("ac_info_author is not null");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorEqualTo(String value) {
            addCriterion("ac_info_author =", value, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorNotEqualTo(String value) {
            addCriterion("ac_info_author <>", value, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorGreaterThan(String value) {
            addCriterion("ac_info_author >", value, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("ac_info_author >=", value, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorLessThan(String value) {
            addCriterion("ac_info_author <", value, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorLessThanOrEqualTo(String value) {
            addCriterion("ac_info_author <=", value, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorLike(String value) {
            addCriterion("ac_info_author like", value, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorNotLike(String value) {
            addCriterion("ac_info_author not like", value, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorIn(List<String> values) {
            addCriterion("ac_info_author in", values, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorNotIn(List<String> values) {
            addCriterion("ac_info_author not in", values, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorBetween(String value1, String value2) {
            addCriterion("ac_info_author between", value1, value2, "acInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andAcInfoAuthorNotBetween(String value1, String value2) {
            addCriterion("ac_info_author not between", value1, value2, "acInfoAuthor");
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

        public Criteria andAcInfoClickNumIsNull() {
            addCriterion("ac_info_click_num is null");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumIsNotNull() {
            addCriterion("ac_info_click_num is not null");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumEqualTo(Integer value) {
            addCriterion("ac_info_click_num =", value, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumNotEqualTo(Integer value) {
            addCriterion("ac_info_click_num <>", value, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumGreaterThan(Integer value) {
            addCriterion("ac_info_click_num >", value, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_info_click_num >=", value, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumLessThan(Integer value) {
            addCriterion("ac_info_click_num <", value, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("ac_info_click_num <=", value, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumIn(List<Integer> values) {
            addCriterion("ac_info_click_num in", values, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumNotIn(List<Integer> values) {
            addCriterion("ac_info_click_num not in", values, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumBetween(Integer value1, Integer value2) {
            addCriterion("ac_info_click_num between", value1, value2, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_info_click_num not between", value1, value2, "acInfoClickNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountIsNull() {
            addCriterion("ac_info_praise_count is null");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountIsNotNull() {
            addCriterion("ac_info_praise_count is not null");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountEqualTo(Integer value) {
            addCriterion("ac_info_praise_count =", value, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountNotEqualTo(Integer value) {
            addCriterion("ac_info_praise_count <>", value, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountGreaterThan(Integer value) {
            addCriterion("ac_info_praise_count >", value, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_info_praise_count >=", value, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountLessThan(Integer value) {
            addCriterion("ac_info_praise_count <", value, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountLessThanOrEqualTo(Integer value) {
            addCriterion("ac_info_praise_count <=", value, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountIn(List<Integer> values) {
            addCriterion("ac_info_praise_count in", values, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountNotIn(List<Integer> values) {
            addCriterion("ac_info_praise_count not in", values, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountBetween(Integer value1, Integer value2) {
            addCriterion("ac_info_praise_count between", value1, value2, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoPraiseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_info_praise_count not between", value1, value2, "acInfoPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumIsNull() {
            addCriterion("ac_info_comment_num is null");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumIsNotNull() {
            addCriterion("ac_info_comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumEqualTo(Integer value) {
            addCriterion("ac_info_comment_num =", value, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumNotEqualTo(Integer value) {
            addCriterion("ac_info_comment_num <>", value, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumGreaterThan(Integer value) {
            addCriterion("ac_info_comment_num >", value, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_info_comment_num >=", value, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumLessThan(Integer value) {
            addCriterion("ac_info_comment_num <", value, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("ac_info_comment_num <=", value, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumIn(List<Integer> values) {
            addCriterion("ac_info_comment_num in", values, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumNotIn(List<Integer> values) {
            addCriterion("ac_info_comment_num not in", values, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("ac_info_comment_num between", value1, value2, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcInfoCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_info_comment_num not between", value1, value2, "acInfoCommentNum");
            return (Criteria) this;
        }

        public Criteria andAcIstopIsNull() {
            addCriterion("ac_isTop is null");
            return (Criteria) this;
        }

        public Criteria andAcIstopIsNotNull() {
            addCriterion("ac_isTop is not null");
            return (Criteria) this;
        }

        public Criteria andAcIstopEqualTo(Integer value) {
            addCriterion("ac_isTop =", value, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopNotEqualTo(Integer value) {
            addCriterion("ac_isTop <>", value, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopGreaterThan(Integer value) {
            addCriterion("ac_isTop >", value, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_isTop >=", value, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopLessThan(Integer value) {
            addCriterion("ac_isTop <", value, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopLessThanOrEqualTo(Integer value) {
            addCriterion("ac_isTop <=", value, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopIn(List<Integer> values) {
            addCriterion("ac_isTop in", values, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopNotIn(List<Integer> values) {
            addCriterion("ac_isTop not in", values, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopBetween(Integer value1, Integer value2) {
            addCriterion("ac_isTop between", value1, value2, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_isTop not between", value1, value2, "acIstop");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdIsNull() {
            addCriterion("ac_type_id is null");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdIsNotNull() {
            addCriterion("ac_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdEqualTo(Integer value) {
            addCriterion("ac_type_id =", value, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdNotEqualTo(Integer value) {
            addCriterion("ac_type_id <>", value, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdGreaterThan(Integer value) {
            addCriterion("ac_type_id >", value, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_type_id >=", value, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdLessThan(Integer value) {
            addCriterion("ac_type_id <", value, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ac_type_id <=", value, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdIn(List<Integer> values) {
            addCriterion("ac_type_id in", values, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdNotIn(List<Integer> values) {
            addCriterion("ac_type_id not in", values, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("ac_type_id between", value1, value2, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_type_id not between", value1, value2, "acTypeId");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailIsNull() {
            addCriterion("ac_thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailIsNotNull() {
            addCriterion("ac_thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailEqualTo(Integer value) {
            addCriterion("ac_thumbnail =", value, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailNotEqualTo(Integer value) {
            addCriterion("ac_thumbnail <>", value, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailGreaterThan(Integer value) {
            addCriterion("ac_thumbnail >", value, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_thumbnail >=", value, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailLessThan(Integer value) {
            addCriterion("ac_thumbnail <", value, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailLessThanOrEqualTo(Integer value) {
            addCriterion("ac_thumbnail <=", value, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailIn(List<Integer> values) {
            addCriterion("ac_thumbnail in", values, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailNotIn(List<Integer> values) {
            addCriterion("ac_thumbnail not in", values, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailBetween(Integer value1, Integer value2) {
            addCriterion("ac_thumbnail between", value1, value2, "acThumbnail");
            return (Criteria) this;
        }

        public Criteria andAcThumbnailNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_thumbnail not between", value1, value2, "acThumbnail");
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