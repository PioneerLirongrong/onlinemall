package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallGoodsShoes implements Serializable {
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

    private String shoestype;

    private String shoessex;

    private String shoesperson;

    private String shoescolor;

    private String shoessize;

    private String shoesbrand;

    private String shoescount;

    private String shoescode;

    private Date shoestime;

    private Date producttime;

    private String productcompany;

    private String productid;

    private String productplace;

    private String productallow;

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

    public String getShoestype() {
        return shoestype;
    }

    public void setShoestype(String shoestype) {
        this.shoestype = shoestype;
    }

    public String getShoessex() {
        return shoessex;
    }

    public void setShoessex(String shoessex) {
        this.shoessex = shoessex;
    }

    public String getShoesperson() {
        return shoesperson;
    }

    public void setShoesperson(String shoesperson) {
        this.shoesperson = shoesperson;
    }

    public String getShoescolor() {
        return shoescolor;
    }

    public void setShoescolor(String shoescolor) {
        this.shoescolor = shoescolor;
    }

    public String getShoessize() {
        return shoessize;
    }

    public void setShoessize(String shoessize) {
        this.shoessize = shoessize;
    }

    public String getShoesbrand() {
        return shoesbrand;
    }

    public void setShoesbrand(String shoesbrand) {
        this.shoesbrand = shoesbrand;
    }

    public String getShoescount() {
        return shoescount;
    }

    public void setShoescount(String shoescount) {
        this.shoescount = shoescount;
    }

    public String getShoescode() {
        return shoescode;
    }

    public void setShoescode(String shoescode) {
        this.shoescode = shoescode;
    }

    public Date getShoestime() {
        return shoestime;
    }

    public void setShoestime(Date shoestime) {
        this.shoestime = shoestime;
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

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductplace() {
        return productplace;
    }

    public void setProductplace(String productplace) {
        this.productplace = productplace;
    }

    public String getProductallow() {
        return productallow;
    }

    public void setProductallow(String productallow) {
        this.productallow = productallow;
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
        OnlinemallGoodsShoes other = (OnlinemallGoodsShoes) that;
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
            && (this.getShoestype() == null ? other.getShoestype() == null : this.getShoestype().equals(other.getShoestype()))
            && (this.getShoessex() == null ? other.getShoessex() == null : this.getShoessex().equals(other.getShoessex()))
            && (this.getShoesperson() == null ? other.getShoesperson() == null : this.getShoesperson().equals(other.getShoesperson()))
            && (this.getShoescolor() == null ? other.getShoescolor() == null : this.getShoescolor().equals(other.getShoescolor()))
            && (this.getShoessize() == null ? other.getShoessize() == null : this.getShoessize().equals(other.getShoessize()))
            && (this.getShoesbrand() == null ? other.getShoesbrand() == null : this.getShoesbrand().equals(other.getShoesbrand()))
            && (this.getShoescount() == null ? other.getShoescount() == null : this.getShoescount().equals(other.getShoescount()))
            && (this.getShoescode() == null ? other.getShoescode() == null : this.getShoescode().equals(other.getShoescode()))
            && (this.getShoestime() == null ? other.getShoestime() == null : this.getShoestime().equals(other.getShoestime()))
            && (this.getProducttime() == null ? other.getProducttime() == null : this.getProducttime().equals(other.getProducttime()))
            && (this.getProductcompany() == null ? other.getProductcompany() == null : this.getProductcompany().equals(other.getProductcompany()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getProductplace() == null ? other.getProductplace() == null : this.getProductplace().equals(other.getProductplace()))
            && (this.getProductallow() == null ? other.getProductallow() == null : this.getProductallow().equals(other.getProductallow()))
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
        result = prime * result + ((getShoestype() == null) ? 0 : getShoestype().hashCode());
        result = prime * result + ((getShoessex() == null) ? 0 : getShoessex().hashCode());
        result = prime * result + ((getShoesperson() == null) ? 0 : getShoesperson().hashCode());
        result = prime * result + ((getShoescolor() == null) ? 0 : getShoescolor().hashCode());
        result = prime * result + ((getShoessize() == null) ? 0 : getShoessize().hashCode());
        result = prime * result + ((getShoesbrand() == null) ? 0 : getShoesbrand().hashCode());
        result = prime * result + ((getShoescount() == null) ? 0 : getShoescount().hashCode());
        result = prime * result + ((getShoescode() == null) ? 0 : getShoescode().hashCode());
        result = prime * result + ((getShoestime() == null) ? 0 : getShoestime().hashCode());
        result = prime * result + ((getProducttime() == null) ? 0 : getProducttime().hashCode());
        result = prime * result + ((getProductcompany() == null) ? 0 : getProductcompany().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getProductplace() == null) ? 0 : getProductplace().hashCode());
        result = prime * result + ((getProductallow() == null) ? 0 : getProductallow().hashCode());
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
        sb.append(", shoestype=").append(shoestype);
        sb.append(", shoessex=").append(shoessex);
        sb.append(", shoesperson=").append(shoesperson);
        sb.append(", shoescolor=").append(shoescolor);
        sb.append(", shoessize=").append(shoessize);
        sb.append(", shoesbrand=").append(shoesbrand);
        sb.append(", shoescount=").append(shoescount);
        sb.append(", shoescode=").append(shoescode);
        sb.append(", shoestime=").append(shoestime);
        sb.append(", producttime=").append(producttime);
        sb.append(", productcompany=").append(productcompany);
        sb.append(", productid=").append(productid);
        sb.append(", productplace=").append(productplace);
        sb.append(", productallow=").append(productallow);
        sb.append(", place=").append(place);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}