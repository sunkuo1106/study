package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisementExample() {
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

        public Criteria andAdTimeIsNull() {
            addCriterion("ad_time is null");
            return (Criteria) this;
        }

        public Criteria andAdTimeIsNotNull() {
            addCriterion("ad_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdTimeEqualTo(Date value) {
            addCriterion("ad_time =", value, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeNotEqualTo(Date value) {
            addCriterion("ad_time <>", value, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeGreaterThan(Date value) {
            addCriterion("ad_time >", value, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_time >=", value, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeLessThan(Date value) {
            addCriterion("ad_time <", value, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeLessThanOrEqualTo(Date value) {
            addCriterion("ad_time <=", value, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeIn(List<Date> values) {
            addCriterion("ad_time in", values, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeNotIn(List<Date> values) {
            addCriterion("ad_time not in", values, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeBetween(Date value1, Date value2) {
            addCriterion("ad_time between", value1, value2, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdTimeNotBetween(Date value1, Date value2) {
            addCriterion("ad_time not between", value1, value2, "adTime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeIsNull() {
            addCriterion("ad_endtime is null");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeIsNotNull() {
            addCriterion("ad_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeEqualTo(Date value) {
            addCriterion("ad_endtime =", value, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeNotEqualTo(Date value) {
            addCriterion("ad_endtime <>", value, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeGreaterThan(Date value) {
            addCriterion("ad_endtime >", value, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_endtime >=", value, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeLessThan(Date value) {
            addCriterion("ad_endtime <", value, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ad_endtime <=", value, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeIn(List<Date> values) {
            addCriterion("ad_endtime in", values, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeNotIn(List<Date> values) {
            addCriterion("ad_endtime not in", values, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeBetween(Date value1, Date value2) {
            addCriterion("ad_endtime between", value1, value2, "adEndtime");
            return (Criteria) this;
        }

        public Criteria andAdEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ad_endtime not between", value1, value2, "adEndtime");
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

        public Criteria andAdBzIsNull() {
            addCriterion("ad_bz is null");
            return (Criteria) this;
        }

        public Criteria andAdBzIsNotNull() {
            addCriterion("ad_bz is not null");
            return (Criteria) this;
        }

        public Criteria andAdBzEqualTo(String value) {
            addCriterion("ad_bz =", value, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzNotEqualTo(String value) {
            addCriterion("ad_bz <>", value, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzGreaterThan(String value) {
            addCriterion("ad_bz >", value, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzGreaterThanOrEqualTo(String value) {
            addCriterion("ad_bz >=", value, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzLessThan(String value) {
            addCriterion("ad_bz <", value, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzLessThanOrEqualTo(String value) {
            addCriterion("ad_bz <=", value, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzLike(String value) {
            addCriterion("ad_bz like", value, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzNotLike(String value) {
            addCriterion("ad_bz not like", value, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzIn(List<String> values) {
            addCriterion("ad_bz in", values, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzNotIn(List<String> values) {
            addCriterion("ad_bz not in", values, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzBetween(String value1, String value2) {
            addCriterion("ad_bz between", value1, value2, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdBzNotBetween(String value1, String value2) {
            addCriterion("ad_bz not between", value1, value2, "adBz");
            return (Criteria) this;
        }

        public Criteria andAdPictureIsNull() {
            addCriterion("ad_picture is null");
            return (Criteria) this;
        }

        public Criteria andAdPictureIsNotNull() {
            addCriterion("ad_picture is not null");
            return (Criteria) this;
        }

        public Criteria andAdPictureEqualTo(String value) {
            addCriterion("ad_picture =", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotEqualTo(String value) {
            addCriterion("ad_picture <>", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureGreaterThan(String value) {
            addCriterion("ad_picture >", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ad_picture >=", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLessThan(String value) {
            addCriterion("ad_picture <", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLessThanOrEqualTo(String value) {
            addCriterion("ad_picture <=", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureLike(String value) {
            addCriterion("ad_picture like", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotLike(String value) {
            addCriterion("ad_picture not like", value, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureIn(List<String> values) {
            addCriterion("ad_picture in", values, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotIn(List<String> values) {
            addCriterion("ad_picture not in", values, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureBetween(String value1, String value2) {
            addCriterion("ad_picture between", value1, value2, "adPicture");
            return (Criteria) this;
        }

        public Criteria andAdPictureNotBetween(String value1, String value2) {
            addCriterion("ad_picture not between", value1, value2, "adPicture");
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

        public Criteria andAdTypeIsNull() {
            addCriterion("ad_type is null");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNotNull() {
            addCriterion("ad_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdTypeEqualTo(Integer value) {
            addCriterion("ad_type =", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotEqualTo(Integer value) {
            addCriterion("ad_type <>", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThan(Integer value) {
            addCriterion("ad_type >", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_type >=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThan(Integer value) {
            addCriterion("ad_type <", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ad_type <=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeIn(List<Integer> values) {
            addCriterion("ad_type in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotIn(List<Integer> values) {
            addCriterion("ad_type not in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeBetween(Integer value1, Integer value2) {
            addCriterion("ad_type between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_type not between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andAdleiIdIsNull() {
            addCriterion("adlei_id is null");
            return (Criteria) this;
        }

        public Criteria andAdleiIdIsNotNull() {
            addCriterion("adlei_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdleiIdEqualTo(Integer value) {
            addCriterion("adlei_id =", value, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdNotEqualTo(Integer value) {
            addCriterion("adlei_id <>", value, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdGreaterThan(Integer value) {
            addCriterion("adlei_id >", value, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adlei_id >=", value, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdLessThan(Integer value) {
            addCriterion("adlei_id <", value, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdLessThanOrEqualTo(Integer value) {
            addCriterion("adlei_id <=", value, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdIn(List<Integer> values) {
            addCriterion("adlei_id in", values, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdNotIn(List<Integer> values) {
            addCriterion("adlei_id not in", values, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdBetween(Integer value1, Integer value2) {
            addCriterion("adlei_id between", value1, value2, "adleiId");
            return (Criteria) this;
        }

        public Criteria andAdleiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adlei_id not between", value1, value2, "adleiId");
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