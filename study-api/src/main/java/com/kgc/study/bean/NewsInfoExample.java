package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsInfoExample() {
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

        public Criteria andNewsInfoTitleIsNull() {
            addCriterion("news_info_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleIsNotNull() {
            addCriterion("news_info_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleEqualTo(String value) {
            addCriterion("news_info_title =", value, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleNotEqualTo(String value) {
            addCriterion("news_info_title <>", value, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleGreaterThan(String value) {
            addCriterion("news_info_title >", value, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_info_title >=", value, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleLessThan(String value) {
            addCriterion("news_info_title <", value, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleLessThanOrEqualTo(String value) {
            addCriterion("news_info_title <=", value, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleLike(String value) {
            addCriterion("news_info_title like", value, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleNotLike(String value) {
            addCriterion("news_info_title not like", value, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleIn(List<String> values) {
            addCriterion("news_info_title in", values, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleNotIn(List<String> values) {
            addCriterion("news_info_title not in", values, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleBetween(String value1, String value2) {
            addCriterion("news_info_title between", value1, value2, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoTitleNotBetween(String value1, String value2) {
            addCriterion("news_info_title not between", value1, value2, "newsInfoTitle");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceIsNull() {
            addCriterion("news_info_source is null");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceIsNotNull() {
            addCriterion("news_info_source is not null");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceEqualTo(String value) {
            addCriterion("news_info_source =", value, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceNotEqualTo(String value) {
            addCriterion("news_info_source <>", value, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceGreaterThan(String value) {
            addCriterion("news_info_source >", value, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("news_info_source >=", value, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceLessThan(String value) {
            addCriterion("news_info_source <", value, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceLessThanOrEqualTo(String value) {
            addCriterion("news_info_source <=", value, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceLike(String value) {
            addCriterion("news_info_source like", value, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceNotLike(String value) {
            addCriterion("news_info_source not like", value, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceIn(List<String> values) {
            addCriterion("news_info_source in", values, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceNotIn(List<String> values) {
            addCriterion("news_info_source not in", values, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceBetween(String value1, String value2) {
            addCriterion("news_info_source between", value1, value2, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoSourceNotBetween(String value1, String value2) {
            addCriterion("news_info_source not between", value1, value2, "newsInfoSource");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorIsNull() {
            addCriterion("news_info_author is null");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorIsNotNull() {
            addCriterion("news_info_author is not null");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorEqualTo(String value) {
            addCriterion("news_info_author =", value, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorNotEqualTo(String value) {
            addCriterion("news_info_author <>", value, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorGreaterThan(String value) {
            addCriterion("news_info_author >", value, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("news_info_author >=", value, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorLessThan(String value) {
            addCriterion("news_info_author <", value, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorLessThanOrEqualTo(String value) {
            addCriterion("news_info_author <=", value, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorLike(String value) {
            addCriterion("news_info_author like", value, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorNotLike(String value) {
            addCriterion("news_info_author not like", value, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorIn(List<String> values) {
            addCriterion("news_info_author in", values, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorNotIn(List<String> values) {
            addCriterion("news_info_author not in", values, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorBetween(String value1, String value2) {
            addCriterion("news_info_author between", value1, value2, "newsInfoAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsInfoAuthorNotBetween(String value1, String value2) {
            addCriterion("news_info_author not between", value1, value2, "newsInfoAuthor");
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
            addCriterion("\" gmt_modified\" is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("\" gmt_modified\" is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("\" gmt_modified\" =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("\" gmt_modified\" <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("\" gmt_modified\" >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("\" gmt_modified\" >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("\" gmt_modified\" <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("\" gmt_modified\" <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("\" gmt_modified\" in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("\" gmt_modified\" not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("\" gmt_modified\" between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("\" gmt_modified\" not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountIsNull() {
            addCriterion("news_info_click_count is null");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountIsNotNull() {
            addCriterion("news_info_click_count is not null");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountEqualTo(Integer value) {
            addCriterion("news_info_click_count =", value, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountNotEqualTo(Integer value) {
            addCriterion("news_info_click_count <>", value, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountGreaterThan(Integer value) {
            addCriterion("news_info_click_count >", value, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_info_click_count >=", value, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountLessThan(Integer value) {
            addCriterion("news_info_click_count <", value, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("news_info_click_count <=", value, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountIn(List<Integer> values) {
            addCriterion("news_info_click_count in", values, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountNotIn(List<Integer> values) {
            addCriterion("news_info_click_count not in", values, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountBetween(Integer value1, Integer value2) {
            addCriterion("news_info_click_count between", value1, value2, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsInfoClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("news_info_click_count not between", value1, value2, "newsInfoClickCount");
            return (Criteria) this;
        }

        public Criteria andNewsIstopIsNull() {
            addCriterion("news_isTop is null");
            return (Criteria) this;
        }

        public Criteria andNewsIstopIsNotNull() {
            addCriterion("news_isTop is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIstopEqualTo(Integer value) {
            addCriterion("news_isTop =", value, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopNotEqualTo(Integer value) {
            addCriterion("news_isTop <>", value, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopGreaterThan(Integer value) {
            addCriterion("news_isTop >", value, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_isTop >=", value, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopLessThan(Integer value) {
            addCriterion("news_isTop <", value, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopLessThanOrEqualTo(Integer value) {
            addCriterion("news_isTop <=", value, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopIn(List<Integer> values) {
            addCriterion("news_isTop in", values, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopNotIn(List<Integer> values) {
            addCriterion("news_isTop not in", values, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopBetween(Integer value1, Integer value2) {
            addCriterion("news_isTop between", value1, value2, "newsIstop");
            return (Criteria) this;
        }

        public Criteria andNewsIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("news_isTop not between", value1, value2, "newsIstop");
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