package com.cloud.mp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("productId =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("productId >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("productId <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("productId in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("itemId is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("itemId is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("itemId =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("itemId <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("itemId >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("itemId >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("itemId <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("itemId <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("itemId like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("itemId not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("itemId in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("itemId not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("itemId between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("itemId not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("categoryId =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("categoryId <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("categoryId >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("categoryId >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("categoryId <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("categoryId <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("categoryId like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("categoryId not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("categoryId in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("categoryId not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("categoryId between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("categoryId not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIsNull() {
            addCriterion("categoryTitle is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIsNotNull() {
            addCriterion("categoryTitle is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleEqualTo(String value) {
            addCriterion("categoryTitle =", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotEqualTo(String value) {
            addCriterion("categoryTitle <>", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleGreaterThan(String value) {
            addCriterion("categoryTitle >", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("categoryTitle >=", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLessThan(String value) {
            addCriterion("categoryTitle <", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLessThanOrEqualTo(String value) {
            addCriterion("categoryTitle <=", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLike(String value) {
            addCriterion("categoryTitle like", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotLike(String value) {
            addCriterion("categoryTitle not like", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIn(List<String> values) {
            addCriterion("categoryTitle in", values, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotIn(List<String> values) {
            addCriterion("categoryTitle not in", values, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleBetween(String value1, String value2) {
            addCriterion("categoryTitle between", value1, value2, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotBetween(String value1, String value2) {
            addCriterion("categoryTitle not between", value1, value2, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNull() {
            addCriterion("parentCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNotNull() {
            addCriterion("parentCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdEqualTo(String value) {
            addCriterion("parentCategoryId =", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotEqualTo(String value) {
            addCriterion("parentCategoryId <>", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThan(String value) {
            addCriterion("parentCategoryId >", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("parentCategoryId >=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThan(String value) {
            addCriterion("parentCategoryId <", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("parentCategoryId <=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLike(String value) {
            addCriterion("parentCategoryId like", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotLike(String value) {
            addCriterion("parentCategoryId not like", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIn(List<String> values) {
            addCriterion("parentCategoryId in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotIn(List<String> values) {
            addCriterion("parentCategoryId not in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdBetween(String value1, String value2) {
            addCriterion("parentCategoryId between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotBetween(String value1, String value2) {
            addCriterion("parentCategoryId not between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleIsNull() {
            addCriterion("parentCategoryTitle is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleIsNotNull() {
            addCriterion("parentCategoryTitle is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleEqualTo(String value) {
            addCriterion("parentCategoryTitle =", value, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleNotEqualTo(String value) {
            addCriterion("parentCategoryTitle <>", value, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleGreaterThan(String value) {
            addCriterion("parentCategoryTitle >", value, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("parentCategoryTitle >=", value, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleLessThan(String value) {
            addCriterion("parentCategoryTitle <", value, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleLessThanOrEqualTo(String value) {
            addCriterion("parentCategoryTitle <=", value, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleLike(String value) {
            addCriterion("parentCategoryTitle like", value, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleNotLike(String value) {
            addCriterion("parentCategoryTitle not like", value, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleIn(List<String> values) {
            addCriterion("parentCategoryTitle in", values, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleNotIn(List<String> values) {
            addCriterion("parentCategoryTitle not in", values, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleBetween(String value1, String value2) {
            addCriterion("parentCategoryTitle between", value1, value2, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andParentCategoryTitleNotBetween(String value1, String value2) {
            addCriterion("parentCategoryTitle not between", value1, value2, "parentCategoryTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNull() {
            addCriterion("productTitle is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNotNull() {
            addCriterion("productTitle is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEqualTo(String value) {
            addCriterion("productTitle =", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotEqualTo(String value) {
            addCriterion("productTitle <>", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThan(String value) {
            addCriterion("productTitle >", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThanOrEqualTo(String value) {
            addCriterion("productTitle >=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThan(String value) {
            addCriterion("productTitle <", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThanOrEqualTo(String value) {
            addCriterion("productTitle <=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLike(String value) {
            addCriterion("productTitle like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotLike(String value) {
            addCriterion("productTitle not like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleIn(List<String> values) {
            addCriterion("productTitle in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotIn(List<String> values) {
            addCriterion("productTitle not in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleBetween(String value1, String value2) {
            addCriterion("productTitle between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotBetween(String value1, String value2) {
            addCriterion("productTitle not between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andSmallImagesIsNull() {
            addCriterion("smallImages is null");
            return (Criteria) this;
        }

        public Criteria andSmallImagesIsNotNull() {
            addCriterion("smallImages is not null");
            return (Criteria) this;
        }

        public Criteria andSmallImagesEqualTo(String value) {
            addCriterion("smallImages =", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotEqualTo(String value) {
            addCriterion("smallImages <>", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesGreaterThan(String value) {
            addCriterion("smallImages >", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesGreaterThanOrEqualTo(String value) {
            addCriterion("smallImages >=", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLessThan(String value) {
            addCriterion("smallImages <", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLessThanOrEqualTo(String value) {
            addCriterion("smallImages <=", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesLike(String value) {
            addCriterion("smallImages like", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotLike(String value) {
            addCriterion("smallImages not like", value, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesIn(List<String> values) {
            addCriterion("smallImages in", values, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotIn(List<String> values) {
            addCriterion("smallImages not in", values, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesBetween(String value1, String value2) {
            addCriterion("smallImages between", value1, value2, "smallImages");
            return (Criteria) this;
        }

        public Criteria andSmallImagesNotBetween(String value1, String value2) {
            addCriterion("smallImages not between", value1, value2, "smallImages");
            return (Criteria) this;
        }

        public Criteria andCoverPicIsNull() {
            addCriterion("coverPic is null");
            return (Criteria) this;
        }

        public Criteria andCoverPicIsNotNull() {
            addCriterion("coverPic is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPicEqualTo(String value) {
            addCriterion("coverPic =", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotEqualTo(String value) {
            addCriterion("coverPic <>", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicGreaterThan(String value) {
            addCriterion("coverPic >", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicGreaterThanOrEqualTo(String value) {
            addCriterion("coverPic >=", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLessThan(String value) {
            addCriterion("coverPic <", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLessThanOrEqualTo(String value) {
            addCriterion("coverPic <=", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLike(String value) {
            addCriterion("coverPic like", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotLike(String value) {
            addCriterion("coverPic not like", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicIn(List<String> values) {
            addCriterion("coverPic in", values, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotIn(List<String> values) {
            addCriterion("coverPic not in", values, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicBetween(String value1, String value2) {
            addCriterion("coverPic between", value1, value2, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotBetween(String value1, String value2) {
            addCriterion("coverPic not between", value1, value2, "coverPic");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("marketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("marketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Float value) {
            addCriterion("marketPrice =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Float value) {
            addCriterion("marketPrice <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Float value) {
            addCriterion("marketPrice >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("marketPrice >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Float value) {
            addCriterion("marketPrice <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Float value) {
            addCriterion("marketPrice <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Float> values) {
            addCriterion("marketPrice in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Float> values) {
            addCriterion("marketPrice not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Float value1, Float value2) {
            addCriterion("marketPrice between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Float value1, Float value2) {
            addCriterion("marketPrice not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIsNull() {
            addCriterion("finalPrice is null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIsNotNull() {
            addCriterion("finalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceEqualTo(Float value) {
            addCriterion("finalPrice =", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotEqualTo(Float value) {
            addCriterion("finalPrice <>", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceGreaterThan(Float value) {
            addCriterion("finalPrice >", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("finalPrice >=", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceLessThan(Float value) {
            addCriterion("finalPrice <", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceLessThanOrEqualTo(Float value) {
            addCriterion("finalPrice <=", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIn(List<Float> values) {
            addCriterion("finalPrice in", values, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotIn(List<Float> values) {
            addCriterion("finalPrice not in", values, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceBetween(Float value1, Float value2) {
            addCriterion("finalPrice between", value1, value2, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotBetween(Float value1, Float value2) {
            addCriterion("finalPrice not between", value1, value2, "finalPrice");
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

        public Criteria andShopTitleIsNull() {
            addCriterion("shopTitle is null");
            return (Criteria) this;
        }

        public Criteria andShopTitleIsNotNull() {
            addCriterion("shopTitle is not null");
            return (Criteria) this;
        }

        public Criteria andShopTitleEqualTo(String value) {
            addCriterion("shopTitle =", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotEqualTo(String value) {
            addCriterion("shopTitle <>", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleGreaterThan(String value) {
            addCriterion("shopTitle >", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleGreaterThanOrEqualTo(String value) {
            addCriterion("shopTitle >=", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLessThan(String value) {
            addCriterion("shopTitle <", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLessThanOrEqualTo(String value) {
            addCriterion("shopTitle <=", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleLike(String value) {
            addCriterion("shopTitle like", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotLike(String value) {
            addCriterion("shopTitle not like", value, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleIn(List<String> values) {
            addCriterion("shopTitle in", values, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotIn(List<String> values) {
            addCriterion("shopTitle not in", values, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleBetween(String value1, String value2) {
            addCriterion("shopTitle between", value1, value2, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andShopTitleNotBetween(String value1, String value2) {
            addCriterion("shopTitle not between", value1, value2, "shopTitle");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Integer value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Integer value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Integer value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Integer value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Integer> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Integer> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Integer value1, Integer value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andItemUrlIsNull() {
            addCriterion("itemUrl is null");
            return (Criteria) this;
        }

        public Criteria andItemUrlIsNotNull() {
            addCriterion("itemUrl is not null");
            return (Criteria) this;
        }

        public Criteria andItemUrlEqualTo(String value) {
            addCriterion("itemUrl =", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotEqualTo(String value) {
            addCriterion("itemUrl <>", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlGreaterThan(String value) {
            addCriterion("itemUrl >", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlGreaterThanOrEqualTo(String value) {
            addCriterion("itemUrl >=", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLessThan(String value) {
            addCriterion("itemUrl <", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLessThanOrEqualTo(String value) {
            addCriterion("itemUrl <=", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLike(String value) {
            addCriterion("itemUrl like", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotLike(String value) {
            addCriterion("itemUrl not like", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlIn(List<String> values) {
            addCriterion("itemUrl in", values, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotIn(List<String> values) {
            addCriterion("itemUrl not in", values, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlBetween(String value1, String value2) {
            addCriterion("itemUrl between", value1, value2, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotBetween(String value1, String value2) {
            addCriterion("itemUrl not between", value1, value2, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andDsrIsNull() {
            addCriterion("dsr is null");
            return (Criteria) this;
        }

        public Criteria andDsrIsNotNull() {
            addCriterion("dsr is not null");
            return (Criteria) this;
        }

        public Criteria andDsrEqualTo(Integer value) {
            addCriterion("dsr =", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrNotEqualTo(Integer value) {
            addCriterion("dsr <>", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrGreaterThan(Integer value) {
            addCriterion("dsr >", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrGreaterThanOrEqualTo(Integer value) {
            addCriterion("dsr >=", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrLessThan(Integer value) {
            addCriterion("dsr <", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrLessThanOrEqualTo(Integer value) {
            addCriterion("dsr <=", value, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrIn(List<Integer> values) {
            addCriterion("dsr in", values, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrNotIn(List<Integer> values) {
            addCriterion("dsr not in", values, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrBetween(Integer value1, Integer value2) {
            addCriterion("dsr between", value1, value2, "dsr");
            return (Criteria) this;
        }

        public Criteria andDsrNotBetween(Integer value1, Integer value2) {
            addCriterion("dsr not between", value1, value2, "dsr");
            return (Criteria) this;
        }

        public Criteria andProvCityIsNull() {
            addCriterion("provCity is null");
            return (Criteria) this;
        }

        public Criteria andProvCityIsNotNull() {
            addCriterion("provCity is not null");
            return (Criteria) this;
        }

        public Criteria andProvCityEqualTo(String value) {
            addCriterion("provCity =", value, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityNotEqualTo(String value) {
            addCriterion("provCity <>", value, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityGreaterThan(String value) {
            addCriterion("provCity >", value, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityGreaterThanOrEqualTo(String value) {
            addCriterion("provCity >=", value, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityLessThan(String value) {
            addCriterion("provCity <", value, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityLessThanOrEqualTo(String value) {
            addCriterion("provCity <=", value, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityLike(String value) {
            addCriterion("provCity like", value, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityNotLike(String value) {
            addCriterion("provCity not like", value, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityIn(List<String> values) {
            addCriterion("provCity in", values, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityNotIn(List<String> values) {
            addCriterion("provCity not in", values, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityBetween(String value1, String value2) {
            addCriterion("provCity between", value1, value2, "provCity");
            return (Criteria) this;
        }

        public Criteria andProvCityNotBetween(String value1, String value2) {
            addCriterion("provCity not between", value1, value2, "provCity");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("sellerId is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("sellerId is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("sellerId =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("sellerId <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("sellerId >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("sellerId >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("sellerId <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("sellerId <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("sellerId like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("sellerId not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("sellerId in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("sellerId not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("sellerId between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("sellerId not between", value1, value2, "sellerId");
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

        public Criteria andCouponStartFeeIsNull() {
            addCriterion("couponStartFee is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeIsNotNull() {
            addCriterion("couponStartFee is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeEqualTo(String value) {
            addCriterion("couponStartFee =", value, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeNotEqualTo(String value) {
            addCriterion("couponStartFee <>", value, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeGreaterThan(String value) {
            addCriterion("couponStartFee >", value, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeGreaterThanOrEqualTo(String value) {
            addCriterion("couponStartFee >=", value, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeLessThan(String value) {
            addCriterion("couponStartFee <", value, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeLessThanOrEqualTo(String value) {
            addCriterion("couponStartFee <=", value, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeLike(String value) {
            addCriterion("couponStartFee like", value, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeNotLike(String value) {
            addCriterion("couponStartFee not like", value, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeIn(List<String> values) {
            addCriterion("couponStartFee in", values, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeNotIn(List<String> values) {
            addCriterion("couponStartFee not in", values, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeBetween(String value1, String value2) {
            addCriterion("couponStartFee between", value1, value2, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponStartFeeNotBetween(String value1, String value2) {
            addCriterion("couponStartFee not between", value1, value2, "couponStartFee");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIsNull() {
            addCriterion("couponRemainCount is null");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIsNotNull() {
            addCriterion("couponRemainCount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountEqualTo(Integer value) {
            addCriterion("couponRemainCount =", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotEqualTo(Integer value) {
            addCriterion("couponRemainCount <>", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountGreaterThan(Integer value) {
            addCriterion("couponRemainCount >", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponRemainCount >=", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountLessThan(Integer value) {
            addCriterion("couponRemainCount <", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountLessThanOrEqualTo(Integer value) {
            addCriterion("couponRemainCount <=", value, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountIn(List<Integer> values) {
            addCriterion("couponRemainCount in", values, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotIn(List<Integer> values) {
            addCriterion("couponRemainCount not in", values, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountBetween(Integer value1, Integer value2) {
            addCriterion("couponRemainCount between", value1, value2, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponRemainCountNotBetween(Integer value1, Integer value2) {
            addCriterion("couponRemainCount not between", value1, value2, "couponRemainCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIsNull() {
            addCriterion("couponTotalCount is null");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIsNotNull() {
            addCriterion("couponTotalCount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountEqualTo(Integer value) {
            addCriterion("couponTotalCount =", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotEqualTo(Integer value) {
            addCriterion("couponTotalCount <>", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountGreaterThan(Integer value) {
            addCriterion("couponTotalCount >", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponTotalCount >=", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountLessThan(Integer value) {
            addCriterion("couponTotalCount <", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("couponTotalCount <=", value, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountIn(List<Integer> values) {
            addCriterion("couponTotalCount in", values, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotIn(List<Integer> values) {
            addCriterion("couponTotalCount not in", values, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("couponTotalCount between", value1, value2, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("couponTotalCount not between", value1, value2, "couponTotalCount");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNull() {
            addCriterion("couponStartTime is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNotNull() {
            addCriterion("couponStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeEqualTo(Date value) {
            addCriterion("couponStartTime =", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotEqualTo(Date value) {
            addCriterion("couponStartTime <>", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThan(Date value) {
            addCriterion("couponStartTime >", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("couponStartTime >=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThan(Date value) {
            addCriterion("couponStartTime <", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("couponStartTime <=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIn(List<Date> values) {
            addCriterion("couponStartTime in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotIn(List<Date> values) {
            addCriterion("couponStartTime not in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeBetween(Date value1, Date value2) {
            addCriterion("couponStartTime between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("couponStartTime not between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNull() {
            addCriterion("couponEndTime is null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIsNotNull() {
            addCriterion("couponEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeEqualTo(Date value) {
            addCriterion("couponEndTime =", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotEqualTo(Date value) {
            addCriterion("couponEndTime <>", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThan(Date value) {
            addCriterion("couponEndTime >", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("couponEndTime >=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThan(Date value) {
            addCriterion("couponEndTime <", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("couponEndTime <=", value, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeIn(List<Date> values) {
            addCriterion("couponEndTime in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotIn(List<Date> values) {
            addCriterion("couponEndTime not in", values, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeBetween(Date value1, Date value2) {
            addCriterion("couponEndTime between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("couponEndTime not between", value1, value2, "couponEndTime");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("couponAmount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("couponAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(Float value) {
            addCriterion("couponAmount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(Float value) {
            addCriterion("couponAmount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(Float value) {
            addCriterion("couponAmount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("couponAmount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(Float value) {
            addCriterion("couponAmount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(Float value) {
            addCriterion("couponAmount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<Float> values) {
            addCriterion("couponAmount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<Float> values) {
            addCriterion("couponAmount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(Float value1, Float value2) {
            addCriterion("couponAmount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(Float value1, Float value2) {
            addCriterion("couponAmount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNull() {
            addCriterion("couponInfo is null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIsNotNull() {
            addCriterion("couponInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCouponInfoEqualTo(String value) {
            addCriterion("couponInfo =", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotEqualTo(String value) {
            addCriterion("couponInfo <>", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThan(String value) {
            addCriterion("couponInfo >", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoGreaterThanOrEqualTo(String value) {
            addCriterion("couponInfo >=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThan(String value) {
            addCriterion("couponInfo <", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLessThanOrEqualTo(String value) {
            addCriterion("couponInfo <=", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoLike(String value) {
            addCriterion("couponInfo like", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotLike(String value) {
            addCriterion("couponInfo not like", value, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoIn(List<String> values) {
            addCriterion("couponInfo in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotIn(List<String> values) {
            addCriterion("couponInfo not in", values, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoBetween(String value1, String value2) {
            addCriterion("couponInfo between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponInfoNotBetween(String value1, String value2) {
            addCriterion("couponInfo not between", value1, value2, "couponInfo");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlIsNull() {
            addCriterion("couponShareUrl is null");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlIsNotNull() {
            addCriterion("couponShareUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlEqualTo(String value) {
            addCriterion("couponShareUrl =", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlNotEqualTo(String value) {
            addCriterion("couponShareUrl <>", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlGreaterThan(String value) {
            addCriterion("couponShareUrl >", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("couponShareUrl >=", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlLessThan(String value) {
            addCriterion("couponShareUrl <", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlLessThanOrEqualTo(String value) {
            addCriterion("couponShareUrl <=", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlLike(String value) {
            addCriterion("couponShareUrl like", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlNotLike(String value) {
            addCriterion("couponShareUrl not like", value, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlIn(List<String> values) {
            addCriterion("couponShareUrl in", values, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlNotIn(List<String> values) {
            addCriterion("couponShareUrl not in", values, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlBetween(String value1, String value2) {
            addCriterion("couponShareUrl between", value1, value2, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andCouponShareUrlNotBetween(String value1, String value2) {
            addCriterion("couponShareUrl not between", value1, value2, "couponShareUrl");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andJsonIsNull() {
            addCriterion("json is null");
            return (Criteria) this;
        }

        public Criteria andJsonIsNotNull() {
            addCriterion("json is not null");
            return (Criteria) this;
        }

        public Criteria andJsonEqualTo(String value) {
            addCriterion("json =", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonNotEqualTo(String value) {
            addCriterion("json <>", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonGreaterThan(String value) {
            addCriterion("json >", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonGreaterThanOrEqualTo(String value) {
            addCriterion("json >=", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonLessThan(String value) {
            addCriterion("json <", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonLessThanOrEqualTo(String value) {
            addCriterion("json <=", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonLike(String value) {
            addCriterion("json like", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonNotLike(String value) {
            addCriterion("json not like", value, "json");
            return (Criteria) this;
        }

        public Criteria andJsonIn(List<String> values) {
            addCriterion("json in", values, "json");
            return (Criteria) this;
        }

        public Criteria andJsonNotIn(List<String> values) {
            addCriterion("json not in", values, "json");
            return (Criteria) this;
        }

        public Criteria andJsonBetween(String value1, String value2) {
            addCriterion("json between", value1, value2, "json");
            return (Criteria) this;
        }

        public Criteria andJsonNotBetween(String value1, String value2) {
            addCriterion("json not between", value1, value2, "json");
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