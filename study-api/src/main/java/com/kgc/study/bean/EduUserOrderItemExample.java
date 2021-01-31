package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduUserOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduUserOrderItemExample() {
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

        public Criteria andEduOrderNameIsNull() {
            addCriterion("edu_order_name is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameIsNotNull() {
            addCriterion("edu_order_name is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameEqualTo(String value) {
            addCriterion("edu_order_name =", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameNotEqualTo(String value) {
            addCriterion("edu_order_name <>", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameGreaterThan(String value) {
            addCriterion("edu_order_name >", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("edu_order_name >=", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameLessThan(String value) {
            addCriterion("edu_order_name <", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameLessThanOrEqualTo(String value) {
            addCriterion("edu_order_name <=", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameLike(String value) {
            addCriterion("edu_order_name like", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameNotLike(String value) {
            addCriterion("edu_order_name not like", value, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameIn(List<String> values) {
            addCriterion("edu_order_name in", values, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameNotIn(List<String> values) {
            addCriterion("edu_order_name not in", values, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameBetween(String value1, String value2) {
            addCriterion("edu_order_name between", value1, value2, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderNameNotBetween(String value1, String value2) {
            addCriterion("edu_order_name not between", value1, value2, "eduOrderName");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardIsNull() {
            addCriterion("edu_order_id_card is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardIsNotNull() {
            addCriterion("edu_order_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardEqualTo(String value) {
            addCriterion("edu_order_id_card =", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardNotEqualTo(String value) {
            addCriterion("edu_order_id_card <>", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardGreaterThan(String value) {
            addCriterion("edu_order_id_card >", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("edu_order_id_card >=", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardLessThan(String value) {
            addCriterion("edu_order_id_card <", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardLessThanOrEqualTo(String value) {
            addCriterion("edu_order_id_card <=", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardLike(String value) {
            addCriterion("edu_order_id_card like", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardNotLike(String value) {
            addCriterion("edu_order_id_card not like", value, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardIn(List<String> values) {
            addCriterion("edu_order_id_card in", values, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardNotIn(List<String> values) {
            addCriterion("edu_order_id_card not in", values, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardBetween(String value1, String value2) {
            addCriterion("edu_order_id_card between", value1, value2, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderIdCardNotBetween(String value1, String value2) {
            addCriterion("edu_order_id_card not between", value1, value2, "eduOrderIdCard");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneIsNull() {
            addCriterion("edu_order_phone is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneIsNotNull() {
            addCriterion("edu_order_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneEqualTo(String value) {
            addCriterion("edu_order_phone =", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneNotEqualTo(String value) {
            addCriterion("edu_order_phone <>", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneGreaterThan(String value) {
            addCriterion("edu_order_phone >", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("edu_order_phone >=", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneLessThan(String value) {
            addCriterion("edu_order_phone <", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneLessThanOrEqualTo(String value) {
            addCriterion("edu_order_phone <=", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneLike(String value) {
            addCriterion("edu_order_phone like", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneNotLike(String value) {
            addCriterion("edu_order_phone not like", value, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneIn(List<String> values) {
            addCriterion("edu_order_phone in", values, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneNotIn(List<String> values) {
            addCriterion("edu_order_phone not in", values, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneBetween(String value1, String value2) {
            addCriterion("edu_order_phone between", value1, value2, "eduOrderPhone");
            return (Criteria) this;
        }

        public Criteria andEduOrderPhoneNotBetween(String value1, String value2) {
            addCriterion("edu_order_phone not between", value1, value2, "eduOrderPhone");
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

        public Criteria andAgencyAddressNameIsNull() {
            addCriterion("agency_address_name is null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameIsNotNull() {
            addCriterion("agency_address_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameEqualTo(String value) {
            addCriterion("agency_address_name =", value, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameNotEqualTo(String value) {
            addCriterion("agency_address_name <>", value, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameGreaterThan(String value) {
            addCriterion("agency_address_name >", value, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("agency_address_name >=", value, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameLessThan(String value) {
            addCriterion("agency_address_name <", value, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameLessThanOrEqualTo(String value) {
            addCriterion("agency_address_name <=", value, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameLike(String value) {
            addCriterion("agency_address_name like", value, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameNotLike(String value) {
            addCriterion("agency_address_name not like", value, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameIn(List<String> values) {
            addCriterion("agency_address_name in", values, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameNotIn(List<String> values) {
            addCriterion("agency_address_name not in", values, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameBetween(String value1, String value2) {
            addCriterion("agency_address_name between", value1, value2, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNameNotBetween(String value1, String value2) {
            addCriterion("agency_address_name not between", value1, value2, "agencyAddressName");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeIsNull() {
            addCriterion("edu_order_class_type is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeIsNotNull() {
            addCriterion("edu_order_class_type is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeEqualTo(String value) {
            addCriterion("edu_order_class_type =", value, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeNotEqualTo(String value) {
            addCriterion("edu_order_class_type <>", value, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeGreaterThan(String value) {
            addCriterion("edu_order_class_type >", value, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeGreaterThanOrEqualTo(String value) {
            addCriterion("edu_order_class_type >=", value, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeLessThan(String value) {
            addCriterion("edu_order_class_type <", value, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeLessThanOrEqualTo(String value) {
            addCriterion("edu_order_class_type <=", value, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeLike(String value) {
            addCriterion("edu_order_class_type like", value, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeNotLike(String value) {
            addCriterion("edu_order_class_type not like", value, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeIn(List<String> values) {
            addCriterion("edu_order_class_type in", values, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeNotIn(List<String> values) {
            addCriterion("edu_order_class_type not in", values, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeBetween(String value1, String value2) {
            addCriterion("edu_order_class_type between", value1, value2, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassTypeNotBetween(String value1, String value2) {
            addCriterion("edu_order_class_type not between", value1, value2, "eduOrderClassType");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceIsNull() {
            addCriterion("edu_order_class_price is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceIsNotNull() {
            addCriterion("edu_order_class_price is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceEqualTo(Long value) {
            addCriterion("edu_order_class_price =", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceNotEqualTo(Long value) {
            addCriterion("edu_order_class_price <>", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceGreaterThan(Long value) {
            addCriterion("edu_order_class_price >", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("edu_order_class_price >=", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceLessThan(Long value) {
            addCriterion("edu_order_class_price <", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceLessThanOrEqualTo(Long value) {
            addCriterion("edu_order_class_price <=", value, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceIn(List<Long> values) {
            addCriterion("edu_order_class_price in", values, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceNotIn(List<Long> values) {
            addCriterion("edu_order_class_price not in", values, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceBetween(Long value1, Long value2) {
            addCriterion("edu_order_class_price between", value1, value2, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassPriceNotBetween(Long value1, Long value2) {
            addCriterion("edu_order_class_price not between", value1, value2, "eduOrderClassPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceIsNull() {
            addCriterion("edu_order_class_discount_price is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceIsNotNull() {
            addCriterion("edu_order_class_discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceEqualTo(Long value) {
            addCriterion("edu_order_class_discount_price =", value, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceNotEqualTo(Long value) {
            addCriterion("edu_order_class_discount_price <>", value, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceGreaterThan(Long value) {
            addCriterion("edu_order_class_discount_price >", value, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("edu_order_class_discount_price >=", value, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceLessThan(Long value) {
            addCriterion("edu_order_class_discount_price <", value, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceLessThanOrEqualTo(Long value) {
            addCriterion("edu_order_class_discount_price <=", value, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceIn(List<Long> values) {
            addCriterion("edu_order_class_discount_price in", values, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceNotIn(List<Long> values) {
            addCriterion("edu_order_class_discount_price not in", values, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceBetween(Long value1, Long value2) {
            addCriterion("edu_order_class_discount_price between", value1, value2, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderClassDiscountPriceNotBetween(Long value1, Long value2) {
            addCriterion("edu_order_class_discount_price not between", value1, value2, "eduOrderClassDiscountPrice");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeIsNull() {
            addCriterion("edu_order_type is null");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeIsNotNull() {
            addCriterion("edu_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeEqualTo(Integer value) {
            addCriterion("edu_order_type =", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeNotEqualTo(Integer value) {
            addCriterion("edu_order_type <>", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeGreaterThan(Integer value) {
            addCriterion("edu_order_type >", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_order_type >=", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeLessThan(Integer value) {
            addCriterion("edu_order_type <", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("edu_order_type <=", value, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeIn(List<Integer> values) {
            addCriterion("edu_order_type in", values, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeNotIn(List<Integer> values) {
            addCriterion("edu_order_type not in", values, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("edu_order_type between", value1, value2, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andEduOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_order_type not between", value1, value2, "eduOrderType");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(String value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(String value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(String value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(String value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(String value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLike(String value) {
            addCriterion("agency_id like", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotLike(String value) {
            addCriterion("agency_id not like", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<String> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<String> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(String value1, String value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(String value1, String value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIsNull() {
            addCriterion("agency_name is null");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIsNotNull() {
            addCriterion("agency_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyNameEqualTo(String value) {
            addCriterion("agency_name =", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotEqualTo(String value) {
            addCriterion("agency_name <>", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameGreaterThan(String value) {
            addCriterion("agency_name >", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("agency_name >=", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLessThan(String value) {
            addCriterion("agency_name <", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLessThanOrEqualTo(String value) {
            addCriterion("agency_name <=", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLike(String value) {
            addCriterion("agency_name like", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotLike(String value) {
            addCriterion("agency_name not like", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIn(List<String> values) {
            addCriterion("agency_name in", values, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotIn(List<String> values) {
            addCriterion("agency_name not in", values, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameBetween(String value1, String value2) {
            addCriterion("agency_name between", value1, value2, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotBetween(String value1, String value2) {
            addCriterion("agency_name not between", value1, value2, "agencyName");
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