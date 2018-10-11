package com.cloud.mp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginAccountIsNull() {
            addCriterion("loginAccount is null");
            return (Criteria) this;
        }

        public Criteria andLoginAccountIsNotNull() {
            addCriterion("loginAccount is not null");
            return (Criteria) this;
        }

        public Criteria andLoginAccountEqualTo(String value) {
            addCriterion("loginAccount =", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotEqualTo(String value) {
            addCriterion("loginAccount <>", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountGreaterThan(String value) {
            addCriterion("loginAccount >", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountGreaterThanOrEqualTo(String value) {
            addCriterion("loginAccount >=", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLessThan(String value) {
            addCriterion("loginAccount <", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLessThanOrEqualTo(String value) {
            addCriterion("loginAccount <=", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLike(String value) {
            addCriterion("loginAccount like", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotLike(String value) {
            addCriterion("loginAccount not like", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountIn(List<String> values) {
            addCriterion("loginAccount in", values, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotIn(List<String> values) {
            addCriterion("loginAccount not in", values, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountBetween(String value1, String value2) {
            addCriterion("loginAccount between", value1, value2, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotBetween(String value1, String value2) {
            addCriterion("loginAccount not between", value1, value2, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNull() {
            addCriterion("loginPassword is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("loginPassword is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("loginPassword =", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("loginPassword <>", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("loginPassword >", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("loginPassword >=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("loginPassword <", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("loginPassword <=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("loginPassword like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("loginPassword not like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("loginPassword in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("loginPassword not in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("loginPassword between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("loginPassword not between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andBindEmailIsNull() {
            addCriterion("bindEmail is null");
            return (Criteria) this;
        }

        public Criteria andBindEmailIsNotNull() {
            addCriterion("bindEmail is not null");
            return (Criteria) this;
        }

        public Criteria andBindEmailEqualTo(String value) {
            addCriterion("bindEmail =", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailNotEqualTo(String value) {
            addCriterion("bindEmail <>", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailGreaterThan(String value) {
            addCriterion("bindEmail >", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailGreaterThanOrEqualTo(String value) {
            addCriterion("bindEmail >=", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailLessThan(String value) {
            addCriterion("bindEmail <", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailLessThanOrEqualTo(String value) {
            addCriterion("bindEmail <=", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailLike(String value) {
            addCriterion("bindEmail like", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailNotLike(String value) {
            addCriterion("bindEmail not like", value, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailIn(List<String> values) {
            addCriterion("bindEmail in", values, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailNotIn(List<String> values) {
            addCriterion("bindEmail not in", values, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailBetween(String value1, String value2) {
            addCriterion("bindEmail between", value1, value2, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindEmailNotBetween(String value1, String value2) {
            addCriterion("bindEmail not between", value1, value2, "bindEmail");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNull() {
            addCriterion("bindMobile is null");
            return (Criteria) this;
        }

        public Criteria andBindMobileIsNotNull() {
            addCriterion("bindMobile is not null");
            return (Criteria) this;
        }

        public Criteria andBindMobileEqualTo(String value) {
            addCriterion("bindMobile =", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotEqualTo(String value) {
            addCriterion("bindMobile <>", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThan(String value) {
            addCriterion("bindMobile >", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileGreaterThanOrEqualTo(String value) {
            addCriterion("bindMobile >=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThan(String value) {
            addCriterion("bindMobile <", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLessThanOrEqualTo(String value) {
            addCriterion("bindMobile <=", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileLike(String value) {
            addCriterion("bindMobile like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotLike(String value) {
            addCriterion("bindMobile not like", value, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileIn(List<String> values) {
            addCriterion("bindMobile in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotIn(List<String> values) {
            addCriterion("bindMobile not in", values, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileBetween(String value1, String value2) {
            addCriterion("bindMobile between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andBindMobileNotBetween(String value1, String value2) {
            addCriterion("bindMobile not between", value1, value2, "bindMobile");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nickName =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nickName <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nickName like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nickName not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nickName in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatarUrl is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatarUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatarUrl =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatarUrl <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatarUrl >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatarUrl >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatarUrl <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatarUrl <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatarUrl like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatarUrl not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatarUrl in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatarUrl not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatarUrl between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatarUrl not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdIsNull() {
            addCriterion("thirdPartyOpenId is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdIsNotNull() {
            addCriterion("thirdPartyOpenId is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdEqualTo(String value) {
            addCriterion("thirdPartyOpenId =", value, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdNotEqualTo(String value) {
            addCriterion("thirdPartyOpenId <>", value, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdGreaterThan(String value) {
            addCriterion("thirdPartyOpenId >", value, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("thirdPartyOpenId >=", value, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdLessThan(String value) {
            addCriterion("thirdPartyOpenId <", value, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdLessThanOrEqualTo(String value) {
            addCriterion("thirdPartyOpenId <=", value, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdLike(String value) {
            addCriterion("thirdPartyOpenId like", value, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdNotLike(String value) {
            addCriterion("thirdPartyOpenId not like", value, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdIn(List<String> values) {
            addCriterion("thirdPartyOpenId in", values, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdNotIn(List<String> values) {
            addCriterion("thirdPartyOpenId not in", values, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdBetween(String value1, String value2) {
            addCriterion("thirdPartyOpenId between", value1, value2, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyOpenIdNotBetween(String value1, String value2) {
            addCriterion("thirdPartyOpenId not between", value1, value2, "thirdPartyOpenId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeIsNull() {
            addCriterion("thirdPartyType is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeIsNotNull() {
            addCriterion("thirdPartyType is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeEqualTo(String value) {
            addCriterion("thirdPartyType =", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeNotEqualTo(String value) {
            addCriterion("thirdPartyType <>", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeGreaterThan(String value) {
            addCriterion("thirdPartyType >", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("thirdPartyType >=", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeLessThan(String value) {
            addCriterion("thirdPartyType <", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeLessThanOrEqualTo(String value) {
            addCriterion("thirdPartyType <=", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeLike(String value) {
            addCriterion("thirdPartyType like", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeNotLike(String value) {
            addCriterion("thirdPartyType not like", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeIn(List<String> values) {
            addCriterion("thirdPartyType in", values, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeNotIn(List<String> values) {
            addCriterion("thirdPartyType not in", values, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeBetween(String value1, String value2) {
            addCriterion("thirdPartyType between", value1, value2, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeNotBetween(String value1, String value2) {
            addCriterion("thirdPartyType not between", value1, value2, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("userType =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("userType <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("userType >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("userType >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("userType <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("userType <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("userType in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("userType not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("userType between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("userType not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Integer value) {
            addCriterion("userState =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Integer value) {
            addCriterion("userState <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Integer value) {
            addCriterion("userState >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("userState >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Integer value) {
            addCriterion("userState <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Integer value) {
            addCriterion("userState <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Integer> values) {
            addCriterion("userState in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Integer> values) {
            addCriterion("userState not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Integer value1, Integer value2) {
            addCriterion("userState between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("userState not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("registerTime =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("registerTime <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("registerTime >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registerTime >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("registerTime <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("registerTime <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("registerTime in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("registerTime not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("registerTime between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("registerTime not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
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