package com.cloud.mp.domain;

import java.util.Date;

public class Product {
    private Integer productId;

    private String itemId;

    private String categoryId;

    private String categoryTitle;

    private String parentCategoryId;

    private String parentCategoryTitle;

    private String productTitle;

    private String smallImages;

    private String coverPic;

    private Float marketPrice;

    private Float finalPrice;

    private String nickName;

    private String shopTitle;

    private Integer volume;

    private String itemUrl;

    private Integer dsr;

    private String provCity;

    private String sellerId;

    private Integer userType;

    private String couponStartFee;

    private Integer couponRemainCount;

    private Integer couponTotalCount;

    private Date couponStartTime;

    private Date couponEndTime;

    private Float couponAmount;

    private String couponInfo;

    private String couponShareUrl;

    private String description;

    private String json;

    private Date createTime;

    private Date updateTime;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle == null ? null : categoryTitle.trim();
    }

    public String getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId == null ? null : parentCategoryId.trim();
    }

    public String getParentCategoryTitle() {
        return parentCategoryTitle;
    }

    public void setParentCategoryTitle(String parentCategoryTitle) {
        this.parentCategoryTitle = parentCategoryTitle == null ? null : parentCategoryTitle.trim();
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    public String getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(String smallImages) {
        this.smallImages = smallImages == null ? null : smallImages.trim();
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic == null ? null : coverPic.trim();
    }

    public Float getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Float marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle == null ? null : shopTitle.trim();
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl == null ? null : itemUrl.trim();
    }

    public Integer getDsr() {
        return dsr;
    }

    public void setDsr(Integer dsr) {
        this.dsr = dsr;
    }

    public String getProvCity() {
        return provCity;
    }

    public void setProvCity(String provCity) {
        this.provCity = provCity == null ? null : provCity.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getCouponStartFee() {
        return couponStartFee;
    }

    public void setCouponStartFee(String couponStartFee) {
        this.couponStartFee = couponStartFee == null ? null : couponStartFee.trim();
    }

    public Integer getCouponRemainCount() {
        return couponRemainCount;
    }

    public void setCouponRemainCount(Integer couponRemainCount) {
        this.couponRemainCount = couponRemainCount;
    }

    public Integer getCouponTotalCount() {
        return couponTotalCount;
    }

    public void setCouponTotalCount(Integer couponTotalCount) {
        this.couponTotalCount = couponTotalCount;
    }

    public Date getCouponStartTime() {
        return couponStartTime;
    }

    public void setCouponStartTime(Date couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public Date getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(Date couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public Float getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Float couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getCouponInfo() {
        return couponInfo;
    }

    public void setCouponInfo(String couponInfo) {
        this.couponInfo = couponInfo == null ? null : couponInfo.trim();
    }

    public String getCouponShareUrl() {
        return couponShareUrl;
    }

    public void setCouponShareUrl(String couponShareUrl) {
        this.couponShareUrl = couponShareUrl == null ? null : couponShareUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json == null ? null : json.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", itemId=").append(itemId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryTitle=").append(categoryTitle);
        sb.append(", parentCategoryId=").append(parentCategoryId);
        sb.append(", parentCategoryTitle=").append(parentCategoryTitle);
        sb.append(", productTitle=").append(productTitle);
        sb.append(", smallImages=").append(smallImages);
        sb.append(", coverPic=").append(coverPic);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", finalPrice=").append(finalPrice);
        sb.append(", nickName=").append(nickName);
        sb.append(", shopTitle=").append(shopTitle);
        sb.append(", volume=").append(volume);
        sb.append(", itemUrl=").append(itemUrl);
        sb.append(", dsr=").append(dsr);
        sb.append(", provCity=").append(provCity);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", userType=").append(userType);
        sb.append(", couponStartFee=").append(couponStartFee);
        sb.append(", couponRemainCount=").append(couponRemainCount);
        sb.append(", couponTotalCount=").append(couponTotalCount);
        sb.append(", couponStartTime=").append(couponStartTime);
        sb.append(", couponEndTime=").append(couponEndTime);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", couponInfo=").append(couponInfo);
        sb.append(", couponShareUrl=").append(couponShareUrl);
        sb.append(", description=").append(description);
        sb.append(", json=").append(json);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}