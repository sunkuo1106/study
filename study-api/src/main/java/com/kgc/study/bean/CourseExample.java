package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecIsNull() {
            addCriterion("course_subjec is null");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecIsNotNull() {
            addCriterion("course_subjec is not null");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecEqualTo(String value) {
            addCriterion("course_subjec =", value, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecNotEqualTo(String value) {
            addCriterion("course_subjec <>", value, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecGreaterThan(String value) {
            addCriterion("course_subjec >", value, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecGreaterThanOrEqualTo(String value) {
            addCriterion("course_subjec >=", value, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecLessThan(String value) {
            addCriterion("course_subjec <", value, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecLessThanOrEqualTo(String value) {
            addCriterion("course_subjec <=", value, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecLike(String value) {
            addCriterion("course_subjec like", value, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecNotLike(String value) {
            addCriterion("course_subjec not like", value, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecIn(List<String> values) {
            addCriterion("course_subjec in", values, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecNotIn(List<String> values) {
            addCriterion("course_subjec not in", values, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecBetween(String value1, String value2) {
            addCriterion("course_subjec between", value1, value2, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseSubjecNotBetween(String value1, String value2) {
            addCriterion("course_subjec not between", value1, value2, "courseSubjec");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeIsNull() {
            addCriterion("course_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeIsNotNull() {
            addCriterion("course_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeEqualTo(Date value) {
            addCriterion("course_start_time =", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeNotEqualTo(Date value) {
            addCriterion("course_start_time <>", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeGreaterThan(Date value) {
            addCriterion("course_start_time >", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_start_time >=", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeLessThan(Date value) {
            addCriterion("course_start_time <", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("course_start_time <=", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeIn(List<Date> values) {
            addCriterion("course_start_time in", values, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeNotIn(List<Date> values) {
            addCriterion("course_start_time not in", values, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeBetween(Date value1, Date value2) {
            addCriterion("course_start_time between", value1, value2, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("course_start_time not between", value1, value2, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNull() {
            addCriterion("course_introduction is null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIsNotNull() {
            addCriterion("course_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionEqualTo(String value) {
            addCriterion("course_introduction =", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotEqualTo(String value) {
            addCriterion("course_introduction <>", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThan(String value) {
            addCriterion("course_introduction >", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("course_introduction >=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThan(String value) {
            addCriterion("course_introduction <", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLessThanOrEqualTo(String value) {
            addCriterion("course_introduction <=", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionLike(String value) {
            addCriterion("course_introduction like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotLike(String value) {
            addCriterion("course_introduction not like", value, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionIn(List<String> values) {
            addCriterion("course_introduction in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotIn(List<String> values) {
            addCriterion("course_introduction not in", values, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionBetween(String value1, String value2) {
            addCriterion("course_introduction between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseIntroductionNotBetween(String value1, String value2) {
            addCriterion("course_introduction not between", value1, value2, "courseIntroduction");
            return (Criteria) this;
        }

        public Criteria andCourseContentIsNull() {
            addCriterion("course_content is null");
            return (Criteria) this;
        }

        public Criteria andCourseContentIsNotNull() {
            addCriterion("course_content is not null");
            return (Criteria) this;
        }

        public Criteria andCourseContentEqualTo(String value) {
            addCriterion("course_content =", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentNotEqualTo(String value) {
            addCriterion("course_content <>", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentGreaterThan(String value) {
            addCriterion("course_content >", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentGreaterThanOrEqualTo(String value) {
            addCriterion("course_content >=", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentLessThan(String value) {
            addCriterion("course_content <", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentLessThanOrEqualTo(String value) {
            addCriterion("course_content <=", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentLike(String value) {
            addCriterion("course_content like", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentNotLike(String value) {
            addCriterion("course_content not like", value, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentIn(List<String> values) {
            addCriterion("course_content in", values, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentNotIn(List<String> values) {
            addCriterion("course_content not in", values, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentBetween(String value1, String value2) {
            addCriterion("course_content between", value1, value2, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseContentNotBetween(String value1, String value2) {
            addCriterion("course_content not between", value1, value2, "courseContent");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumIsNull() {
            addCriterion("course_lession_num is null");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumIsNotNull() {
            addCriterion("course_lession_num is not null");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumEqualTo(Integer value) {
            addCriterion("course_lession_num =", value, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumNotEqualTo(Integer value) {
            addCriterion("course_lession_num <>", value, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumGreaterThan(Integer value) {
            addCriterion("course_lession_num >", value, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_lession_num >=", value, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumLessThan(Integer value) {
            addCriterion("course_lession_num <", value, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("course_lession_num <=", value, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumIn(List<Integer> values) {
            addCriterion("course_lession_num in", values, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumNotIn(List<Integer> values) {
            addCriterion("course_lession_num not in", values, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumBetween(Integer value1, Integer value2) {
            addCriterion("course_lession_num between", value1, value2, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseLessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("course_lession_num not between", value1, value2, "courseLessionNum");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlIsNull() {
            addCriterion("course_video_url is null");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlIsNotNull() {
            addCriterion("course_video_url is not null");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlEqualTo(String value) {
            addCriterion("course_video_url =", value, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlNotEqualTo(String value) {
            addCriterion("course_video_url <>", value, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlGreaterThan(String value) {
            addCriterion("course_video_url >", value, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("course_video_url >=", value, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlLessThan(String value) {
            addCriterion("course_video_url <", value, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("course_video_url <=", value, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlLike(String value) {
            addCriterion("course_video_url like", value, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlNotLike(String value) {
            addCriterion("course_video_url not like", value, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlIn(List<String> values) {
            addCriterion("course_video_url in", values, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlNotIn(List<String> values) {
            addCriterion("course_video_url not in", values, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlBetween(String value1, String value2) {
            addCriterion("course_video_url between", value1, value2, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseVideoUrlNotBetween(String value1, String value2) {
            addCriterion("course_video_url not between", value1, value2, "courseVideoUrl");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeIsNull() {
            addCriterion("course_end_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeIsNotNull() {
            addCriterion("course_end_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeEqualTo(Date value) {
            addCriterion("course_end_update_time =", value, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeNotEqualTo(Date value) {
            addCriterion("course_end_update_time <>", value, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeGreaterThan(Date value) {
            addCriterion("course_end_update_time >", value, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_end_update_time >=", value, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeLessThan(Date value) {
            addCriterion("course_end_update_time <", value, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("course_end_update_time <=", value, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeIn(List<Date> values) {
            addCriterion("course_end_update_time in", values, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeNotIn(List<Date> values) {
            addCriterion("course_end_update_time not in", values, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("course_end_update_time between", value1, value2, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("course_end_update_time not between", value1, value2, "courseEndUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPageViewcountIsNull() {
            addCriterion("page_viewcount is null");
            return (Criteria) this;
        }

        public Criteria andPageViewcountIsNotNull() {
            addCriterion("page_viewcount is not null");
            return (Criteria) this;
        }

        public Criteria andPageViewcountEqualTo(Integer value) {
            addCriterion("page_viewcount =", value, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountNotEqualTo(Integer value) {
            addCriterion("page_viewcount <>", value, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountGreaterThan(Integer value) {
            addCriterion("page_viewcount >", value, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_viewcount >=", value, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountLessThan(Integer value) {
            addCriterion("page_viewcount <", value, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountLessThanOrEqualTo(Integer value) {
            addCriterion("page_viewcount <=", value, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountIn(List<Integer> values) {
            addCriterion("page_viewcount in", values, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountNotIn(List<Integer> values) {
            addCriterion("page_viewcount not in", values, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountBetween(Integer value1, Integer value2) {
            addCriterion("page_viewcount between", value1, value2, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andPageViewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("page_viewcount not between", value1, value2, "pageViewcount");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIsNull() {
            addCriterion("course_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIsNotNull() {
            addCriterion("course_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeEqualTo(Date value) {
            addCriterion("course_end_time =", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotEqualTo(Date value) {
            addCriterion("course_end_time <>", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeGreaterThan(Date value) {
            addCriterion("course_end_time >", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_end_time >=", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeLessThan(Date value) {
            addCriterion("course_end_time <", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("course_end_time <=", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIn(List<Date> values) {
            addCriterion("course_end_time in", values, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotIn(List<Date> values) {
            addCriterion("course_end_time not in", values, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeBetween(Date value1, Date value2) {
            addCriterion("course_end_time between", value1, value2, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("course_end_time not between", value1, value2, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCurrIdIsNull() {
            addCriterion("curr_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrIdIsNotNull() {
            addCriterion("curr_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrIdEqualTo(Long value) {
            addCriterion("curr_id =", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotEqualTo(Long value) {
            addCriterion("curr_id <>", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdGreaterThan(Long value) {
            addCriterion("curr_id >", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("curr_id >=", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdLessThan(Long value) {
            addCriterion("curr_id <", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdLessThanOrEqualTo(Long value) {
            addCriterion("curr_id <=", value, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdIn(List<Long> values) {
            addCriterion("curr_id in", values, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotIn(List<Long> values) {
            addCriterion("curr_id not in", values, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdBetween(Long value1, Long value2) {
            addCriterion("curr_id between", value1, value2, "currId");
            return (Criteria) this;
        }

        public Criteria andCurrIdNotBetween(Long value1, Long value2) {
            addCriterion("curr_id not between", value1, value2, "currId");
            return (Criteria) this;
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