package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallGoodsFreshs implements Serializable {
    private String id;

    private String goodsid;

    private String shop;

    private String goodsname;

    private String discountid;

    private Integer originalprice;

    private Integer discouuntprice;

    private Integer salesmonth;

    private Integer salescount;

    private Integer evaluatecount;

    private String evaluateprecent;

    private String freshstype;

    private String freshsbrand;

    private String saveway;

    private Integer delinetime;

    private Integer freshscount;

    private String peiliao;

    private String productid;

    private String useway;

    private Date producttime;

    private String productcompany;

    private String productallow;

    private String productplace;

    private String place;

    private String url;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getDiscountid() {
        return discountid;
    }

    public void setDiscountid(String discountid) {
        this.discountid = discountid;
    }

    public Integer getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Integer originalprice) {
        this.originalprice = originalprice;
    }

    public Integer getDiscouuntprice() {
        return discouuntprice;
    }

    public void setDiscouuntprice(Integer discouuntprice) {
        this.discouuntprice = discouuntprice;
    }

    public Integer getSalesmonth() {
        return salesmonth;
    }

    public void setSalesmonth(Integer salesmonth) {
        this.salesmonth = salesmonth;
    }

    public Integer getSalescount() {
        return salescount;
    }

    public void setSalescount(Integer salescount) {
        this.salescount = salescount;
    }

    public Integer getEvaluatecount() {
        return evaluatecount;
    }

    public void setEvaluatecount(Integer evaluatecount) {
        this.evaluatecount = evaluatecount;
    }

    public String getEvaluateprecent() {
        return evaluateprecent;
    }

    public void setEvaluateprecent(String evaluateprecent) {
        this.evaluateprecent = evaluateprecent;
    }

    public String getFreshstype() {
        return freshstype;
    }

    public void setFreshstype(String freshstype) {
        this.freshstype = freshstype;
    }

    public String getFreshsbrand() {
        return freshsbrand;
    }

    public void setFreshsbrand(String freshsbrand) {
        this.freshsbrand = freshsbrand;
    }

    public String getSaveway() {
        return saveway;
    }

    public void setSaveway(String saveway) {
        this.saveway = saveway;
    }

    public Integer getDelinetime() {
        return delinetime;
    }

    public void setDelinetime(Integer delinetime) {
        this.delinetime = delinetime;
    }

    public Integer getFreshscount() {
        return freshscount;
    }

    public void setFreshscount(Integer freshscount) {
        this.freshscount = freshscount;
    }

    public String getPeiliao() {
        return peiliao;
    }

    public void setPeiliao(String peiliao) {
        this.peiliao = peiliao;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getUseway() {
        return useway;
    }

    public void setUseway(String useway) {
        this.useway = useway;
    }

    public Date getProducttime() {
        return producttime;
    }

    public void setProducttime(Date producttime) {
        this.producttime = producttime;
    }

    public String getProductcompany() {
        return productcompany;
    }

    public void setProductcompany(String productcompany) {
        this.productcompany = productcompany;
    }

    public String getProductallow() {
        return productallow;
    }

    public void setProductallow(String productallow) {
        this.productallow = productallow;
    }

    public String getProductplace() {
        return productplace;
    }

    public void setProductplace(String productplace) {
        this.productplace = productplace;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OnlinemallGoodsFreshs other = (OnlinemallGoodsFreshs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getShop() == null ? other.getShop() == null : this.getShop().equals(other.getShop()))
            && (this.getGoodsname() == null ? other.getGoodsname() == null : this.getGoodsname().equals(other.getGoodsname()))
            && (this.getDiscountid() == null ? other.getDiscountid() == null : this.getDiscountid().equals(other.getDiscountid()))
            && (this.getOriginalprice() == null ? other.getOriginalprice() == null : this.getOriginalprice().equals(other.getOriginalprice()))
            && (this.getDiscouuntprice() == null ? other.getDiscouuntprice() == null : this.getDiscouuntprice().equals(other.getDiscouuntprice()))
            && (this.getSalesmonth() == null ? other.getSalesmonth() == null : this.getSalesmonth().equals(other.getSalesmonth()))
            && (this.getSalescount() == null ? other.getSalescount() == null : this.getSalescount().equals(other.getSalescount()))
            && (this.getEvaluatecount() == null ? other.getEvaluatecount() == null : this.getEvaluatecount().equals(other.getEvaluatecount()))
            && (this.getEvaluateprecent() == null ? other.getEvaluateprecent() == null : this.getEvaluateprecent().equals(other.getEvaluateprecent()))
            && (this.getFreshstype() == null ? other.getFreshstype() == null : this.getFreshstype().equals(other.getFreshstype()))
            && (this.getFreshsbrand() == null ? other.getFreshsbrand() == null : this.getFreshsbrand().equals(other.getFreshsbrand()))
            && (this.getSaveway() == null ? other.getSaveway() == null : this.getSaveway().equals(other.getSaveway()))
            && (this.getDelinetime() == null ? other.getDelinetime() == null : this.getDelinetime().equals(other.getDelinetime()))
            && (this.getFreshscount() == null ? other.getFreshscount() == null : this.getFreshscount().equals(other.getFreshscount()))
            && (this.getPeiliao() == null ? other.getPeiliao() == null : this.getPeiliao().equals(other.getPeiliao()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getUseway() == null ? other.getUseway() == null : this.getUseway().equals(other.getUseway()))
            && (this.getProducttime() == null ? other.getProducttime() == null : this.getProducttime().equals(other.getProducttime()))
            && (this.getProductcompany() == null ? other.getProductcompany() == null : this.getProductcompany().equals(other.getProductcompany()))
            && (this.getProductallow() == null ? other.getProductallow() == null : this.getProductallow().equals(other.getProductallow()))
            && (this.getProductplace() == null ? other.getProductplace() == null : this.getProductplace().equals(other.getProductplace()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getShop() == null) ? 0 : getShop().hashCode());
        result = prime * result + ((getGoodsname() == null) ? 0 : getGoodsname().hashCode());
        result = prime * result + ((getDiscountid() == null) ? 0 : getDiscountid().hashCode());
        result = prime * result + ((getOriginalprice() == null) ? 0 : getOriginalprice().hashCode());
        result = prime * result + ((getDiscouuntprice() == null) ? 0 : getDiscouuntprice().hashCode());
        result = prime * result + ((getSalesmonth() == null) ? 0 : getSalesmonth().hashCode());
        result = prime * result + ((getSalescount() == null) ? 0 : getSalescount().hashCode());
        result = prime * result + ((getEvaluatecount() == null) ? 0 : getEvaluatecount().hashCode());
        result = prime * result + ((getEvaluateprecent() == null) ? 0 : getEvaluateprecent().hashCode());
        result = prime * result + ((getFreshstype() == null) ? 0 : getFreshstype().hashCode());
        result = prime * result + ((getFreshsbrand() == null) ? 0 : getFreshsbrand().hashCode());
        result = prime * result + ((getSaveway() == null) ? 0 : getSaveway().hashCode());
        result = prime * result + ((getDelinetime() == null) ? 0 : getDelinetime().hashCode());
        result = prime * result + ((getFreshscount() == null) ? 0 : getFreshscount().hashCode());
        result = prime * result + ((getPeiliao() == null) ? 0 : getPeiliao().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getUseway() == null) ? 0 : getUseway().hashCode());
        result = prime * result + ((getProducttime() == null) ? 0 : getProducttime().hashCode());
        result = prime * result + ((getProductcompany() == null) ? 0 : getProductcompany().hashCode());
        result = prime * result + ((getProductallow() == null) ? 0 : getProductallow().hashCode());
        result = prime * result + ((getProductplace() == null) ? 0 : getProductplace().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", shop=").append(shop);
        sb.append(", goodsname=").append(goodsname);
        sb.append(", discountid=").append(discountid);
        sb.append(", originalprice=").append(originalprice);
        sb.append(", discouuntprice=").append(discouuntprice);
        sb.append(", salesmonth=").append(salesmonth);
        sb.append(", salescount=").append(salescount);
        sb.append(", evaluatecount=").append(evaluatecount);
        sb.append(", evaluateprecent=").append(evaluateprecent);
        sb.append(", freshstype=").append(freshstype);
        sb.append(", freshsbrand=").append(freshsbrand);
        sb.append(", saveway=").append(saveway);
        sb.append(", delinetime=").append(delinetime);
        sb.append(", freshscount=").append(freshscount);
        sb.append(", peiliao=").append(peiliao);
        sb.append(", productid=").append(productid);
        sb.append(", useway=").append(useway);
        sb.append(", producttime=").append(producttime);
        sb.append(", productcompany=").append(productcompany);
        sb.append(", productallow=").append(productallow);
        sb.append(", productplace=").append(productplace);
        sb.append(", place=").append(place);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}