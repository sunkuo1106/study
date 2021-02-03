package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertisementInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisementInfoExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Long value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Long value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Long value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Long value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Long> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Long> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Long value1, Long value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNull() {
            addCriterion("ad_name is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("ad_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("ad_name =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("ad_name <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("ad_name >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_name >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("ad_name <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("ad_name <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("ad_name like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("ad_name not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("ad_name in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("ad_name not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("ad_name between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("ad_name not between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdRemarksIsNull() {
            addCriterion("ad_remarks is null");
            return (Criteria) this;
        }

        public Criteria andAdRemarksIsNotNull() {
            addCriterion("ad_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andAdRemarksEqualTo(String value) {
            addCriterion("ad_remarks =", value, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksNotEqualTo(String value) {
            addCriterion("ad_remarks <>", value, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksGreaterThan(String value) {
            addCriterion("ad_remarks >", value, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("ad_remarks >=", value, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksLessThan(String value) {
            addCriterion("ad_remarks <", value, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksLessThanOrEqualTo(String value) {
            addCriterion("ad_remarks <=", value, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksLike(String value) {
            addCriterion("ad_remarks like", value, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksNotLike(String value) {
            addCriterion("ad_remarks not like", value, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksIn(List<String> values) {
            addCriterion("ad_remarks in", values, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksNotIn(List<String> values) {
            addCriterion("ad_remarks not in", values, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksBetween(String value1, String value2) {
            addCriterion("ad_remarks between", value1, value2, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdRemarksNotBetween(String value1, String value2) {
            addCriterion("ad_remarks not between", value1, value2, "adRemarks");
            return (Criteria) this;
        }

        public Criteria andAdImgIsNull() {
            addCriterion("ad_img is null");
            return (Criteria) this;
        }

        public Criteria andAdImgIsNotNull() {
            addCriterion("ad_img is not null");
            return (Criteria) this;
        }

        public Criteria andAdImgEqualTo(String value) {
            addCriterion("ad_img =", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgNotEqualTo(String value) {
            addCriterion("ad_img <>", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgGreaterThan(String value) {
            addCriterion("ad_img >", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgGreaterThanOrEqualTo(String value) {
            addCriterion("ad_img >=", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgLessThan(String value) {
            addCriterion("ad_img <", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgLessThanOrEqualTo(String value) {
            addCriterion("ad_img <=", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgLike(String value) {
            addCriterion("ad_img like", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgNotLike(String value) {
            addCriterion("ad_img not like", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgIn(List<String> values) {
            addCriterion("ad_img in", values, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgNotIn(List<String> values) {
            addCriterion("ad_img not in", values, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgBetween(String value1, String value2) {
            addCriterion("ad_img between", value1, value2, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgNotBetween(String value1, String value2) {
            addCriterion("ad_img not between", value1, value2, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdUrlIsNull() {
            addCriterion("ad_url is null");
            return (Criteria) this;
        }

        public Criteria andAdUrlIsNotNull() {
            addCriterion("ad_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdUrlEqualTo(String value) {
            addCriterion("ad_url =", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlNotEqualTo(String value) {
            addCriterion("ad_url <>", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlGreaterThan(String value) {
            addCriterion("ad_url >", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ad_url >=", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlLessThan(String value) {
            addCriterion("ad_url <", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlLessThanOrEqualTo(String value) {
            addCriterion("ad_url <=", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlLike(String value) {
            addCriterion("ad_url like", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlNotLike(String value) {
            addCriterion("ad_url not like", value, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlIn(List<String> values) {
            addCriterion("ad_url in", values, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlNotIn(List<String> values) {
            addCriterion("ad_url not in", values, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlBetween(String value1, String value2) {
            addCriterion("ad_url between", value1, value2, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdUrlNotBetween(String value1, String value2) {
            addCriterion("ad_url not between", value1, value2, "adUrl");
            return (Criteria) this;
        }

        public Criteria andAdTitleIsNull() {
            addCriterion("ad_title is null");
            return (Criteria) this;
        }

        public Criteria andAdTitleIsNotNull() {
            addCriterion("ad_title is not null");
            return (Criteria) this;
        }

        public Criteria andAdTitleEqualTo(String value) {
            addCriterion("ad_title =", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotEqualTo(String value) {
            addCriterion("ad_title <>", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleGreaterThan(String value) {
            addCriterion("ad_title >", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ad_title >=", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLessThan(String value) {
            addCriterion("ad_title <", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLessThanOrEqualTo(String value) {
            addCriterion("ad_title <=", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLike(String value) {
            addCriterion("ad_title like", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotLike(String value) {
            addCriterion("ad_title not like", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleIn(List<String> values) {
            addCriterion("ad_title in", values, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotIn(List<String> values) {
            addCriterion("ad_title not in", values, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleBetween(String value1, String value2) {
            addCriterion("ad_title between", value1, value2, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotBetween(String value1, String value2) {
            addCriterion("ad_title not between", value1, value2, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdSequenceIsNull() {
            addCriterion("ad_sequence is null");
            return (Criteria) this;
        }

        public Criteria andAdSequenceIsNotNull() {
            addCriterion("ad_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andAdSequenceEqualTo(Integer value) {
            addCriterion("ad_sequence =", value, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceNotEqualTo(Integer value) {
            addCriterion("ad_sequence <>", value, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceGreaterThan(Integer value) {
            addCriterion("ad_sequence >", value, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_sequence >=", value, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceLessThan(Integer value) {
            addCriterion("ad_sequence <", value, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("ad_sequence <=", value, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceIn(List<Integer> values) {
            addCriterion("ad_sequence in", values, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceNotIn(List<Integer> values) {
            addCriterion("ad_sequence not in", values, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceBetween(Integer value1, Integer value2) {
            addCriterion("ad_sequence between", value1, value2, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_sequence not between", value1, value2, "adSequence");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateIsNull() {
            addCriterion("ad_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateIsNotNull() {
            addCriterion("ad_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateEqualTo(Date value) {
            addCriterion("ad_gmt_create =", value, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateNotEqualTo(Date value) {
            addCriterion("ad_gmt_create <>", value, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateGreaterThan(Date value) {
            addCriterion("ad_gmt_create >", value, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_gmt_create >=", value, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateLessThan(Date value) {
            addCriterion("ad_gmt_create <", value, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("ad_gmt_create <=", value, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateIn(List<Date> values) {
            addCriterion("ad_gmt_create in", values, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateNotIn(List<Date> values) {
            addCriterion("ad_gmt_create not in", values, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateBetween(Date value1, Date value2) {
            addCriterion("ad_gmt_create between", value1, value2, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("ad_gmt_create not between", value1, value2, "adGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedIsNull() {
            addCriterion("ad_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedIsNotNull() {
            addCriterion("ad_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedEqualTo(Date value) {
            addCriterion("ad_gmt_modified =", value, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedNotEqualTo(Date value) {
            addCriterion("ad_gmt_modified <>", value, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedGreaterThan(Date value) {
            addCriterion("ad_gmt_modified >", value, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_gmt_modified >=", value, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedLessThan(Date value) {
            addCriterion("ad_gmt_modified <", value, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("ad_gmt_modified <=", value, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedIn(List<Date> values) {
            addCriterion("ad_gmt_modified in", values, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedNotIn(List<Date> values) {
            addCriterion("ad_gmt_modified not in", values, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("ad_gmt_modified between", value1, value2, "adGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("ad_gmt_modified not between", value1, value2, "adGmtModified");
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