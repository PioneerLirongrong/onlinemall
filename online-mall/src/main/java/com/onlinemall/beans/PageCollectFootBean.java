package com.onlinemall.beans;

/**
 * @收藏页面的bean
 * @author lrr
 */
public class PageCollectFootBean {

    private String id;

    private String userId;

    private String goodId;

    private String url;

    private String goodName;

    private String originalPrice;

    private String discountPrice;

    private String goodEvaluate;

    private String saleMonth;

    private String queryUrl;

    public PageCollectFootBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getGoodEvaluate() {
        return goodEvaluate;
    }

    public void setGoodEvaluate(String goodEvaluate) {
        this.goodEvaluate = goodEvaluate;
    }

    public String getSaleMonth() {
        return saleMonth;
    }

    public void setSaleMonth(String saleMonth) {
        this.saleMonth = saleMonth;
    }

    public String getQueryUrl() {
        return queryUrl;
    }

    public void setQueryUrl(String queryUrl) {
        this.queryUrl = queryUrl;
    }

    @Override
    public String toString() {
        return "PageCollectFootBean{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", goodId='" + goodId + '\'' +
                ", url='" + url + '\'' +
                ", goodName='" + goodName + '\'' +
                ", originalPrice='" + originalPrice + '\'' +
                ", discountPrice='" + discountPrice + '\'' +
                ", goodEvaluate='" + goodEvaluate + '\'' +
                ", saleMonth='" + saleMonth + '\'' +
                ", queryUrl='" + queryUrl + '\'' +
                '}';
    }
}
