package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallGoodsBag implements Serializable {
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

    private String bagtype;

    private String bagsex;

    private String bagperson;

    private String bagcolor;

    private String bagsize;

    private String bagrand;

    private String bagcount;

    private String bagmianliao;

    private String bagcode;

    private Date bagtime;

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

    public String getBagtype() {
        return bagtype;
    }

    public void setBagtype(String bagtype) {
        this.bagtype = bagtype;
    }

    public String getBagsex() {
        return bagsex;
    }

    public void setBagsex(String bagsex) {
        this.bagsex = bagsex;
    }

    public String getBagperson() {
        return bagperson;
    }

    public void setBagperson(String bagperson) {
        this.bagperson = bagperson;
    }

    public String getBagcolor() {
        return bagcolor;
    }

    public void setBagcolor(String bagcolor) {
        this.bagcolor = bagcolor;
    }

    public String getBagsize() {
        return bagsize;
    }

    public void setBagsize(String bagsize) {
        this.bagsize = bagsize;
    }

    public String getBagrand() {
        return bagrand;
    }

    public void setBagrand(String bagrand) {
        this.bagrand = bagrand;
    }

    public String getBagcount() {
        return bagcount;
    }

    public void setBagcount(String bagcount) {
        this.bagcount = bagcount;
    }

    public String getBagmianliao() {
        return bagmianliao;
    }

    public void setBagmianliao(String bagmianliao) {
        this.bagmianliao = bagmianliao;
    }

    public String getBagcode() {
        return bagcode;
    }

    public void setBagcode(String bagcode) {
        this.bagcode = bagcode;
    }

    public Date getBagtime() {
        return bagtime;
    }

    public void setBagtime(Date bagtime) {
        this.bagtime = bagtime;
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
        OnlinemallGoodsBag other = (OnlinemallGoodsBag) that;
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
            && (this.getBagtype() == null ? other.getBagtype() == null : this.getBagtype().equals(other.getBagtype()))
            && (this.getBagsex() == null ? other.getBagsex() == null : this.getBagsex().equals(other.getBagsex()))
            && (this.getBagperson() == null ? other.getBagperson() == null : this.getBagperson().equals(other.getBagperson()))
            && (this.getBagcolor() == null ? other.getBagcolor() == null : this.getBagcolor().equals(other.getBagcolor()))
            && (this.getBagsize() == null ? other.getBagsize() == null : this.getBagsize().equals(other.getBagsize()))
            && (this.getBagrand() == null ? other.getBagrand() == null : this.getBagrand().equals(other.getBagrand()))
            && (this.getBagcount() == null ? other.getBagcount() == null : this.getBagcount().equals(other.getBagcount()))
            && (this.getBagmianliao() == null ? other.getBagmianliao() == null : this.getBagmianliao().equals(other.getBagmianliao()))
            && (this.getBagcode() == null ? other.getBagcode() == null : this.getBagcode().equals(other.getBagcode()))
            && (this.getBagtime() == null ? other.getBagtime() == null : this.getBagtime().equals(other.getBagtime()))
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
        result = prime * result + ((getBagtype() == null) ? 0 : getBagtype().hashCode());
        result = prime * result + ((getBagsex() == null) ? 0 : getBagsex().hashCode());
        result = prime * result + ((getBagperson() == null) ? 0 : getBagperson().hashCode());
        result = prime * result + ((getBagcolor() == null) ? 0 : getBagcolor().hashCode());
        result = prime * result + ((getBagsize() == null) ? 0 : getBagsize().hashCode());
        result = prime * result + ((getBagrand() == null) ? 0 : getBagrand().hashCode());
        result = prime * result + ((getBagcount() == null) ? 0 : getBagcount().hashCode());
        result = prime * result + ((getBagmianliao() == null) ? 0 : getBagmianliao().hashCode());
        result = prime * result + ((getBagcode() == null) ? 0 : getBagcode().hashCode());
        result = prime * result + ((getBagtime() == null) ? 0 : getBagtime().hashCode());
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
        sb.append(", bagtype=").append(bagtype);
        sb.append(", bagsex=").append(bagsex);
        sb.append(", bagperson=").append(bagperson);
        sb.append(", bagcolor=").append(bagcolor);
        sb.append(", bagsize=").append(bagsize);
        sb.append(", bagrand=").append(bagrand);
        sb.append(", bagcount=").append(bagcount);
        sb.append(", bagmianliao=").append(bagmianliao);
        sb.append(", bagcode=").append(bagcode);
        sb.append(", bagtime=").append(bagtime);
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