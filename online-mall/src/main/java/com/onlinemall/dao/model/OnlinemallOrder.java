package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallOrder implements Serializable {
    private String id;

    private String orderid;

    private String userid;

    private String goodsid;

    private String shopid;

    private String goodsurl;

    private String ordertype;

    private String goodsname;

    private String goodsprice;

    private Integer goodscount;

    private String ordertotalamount;

    private String orderwuliutotalamount;

    private String goodsoperate;

    private Date ordertime;

    private String orderaddress;

    private String orderstatus;

    private Date goodsreturntime;

    private String goodsreturnnumber;

    private String goodsreturnstatus;

    private Date ordercreatetime;

    private Date orderpaytime;

    private Date orderchengjiaotime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getGoodsurl() {
        return goodsurl;
    }

    public void setGoodsurl(String goodsurl) {
        this.goodsurl = goodsurl;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(String goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public String getOrdertotalamount() {
        return ordertotalamount;
    }

    public void setOrdertotalamount(String ordertotalamount) {
        this.ordertotalamount = ordertotalamount;
    }

    public String getOrderwuliutotalamount() {
        return orderwuliutotalamount;
    }

    public void setOrderwuliutotalamount(String orderwuliutotalamount) {
        this.orderwuliutotalamount = orderwuliutotalamount;
    }

    public String getGoodsoperate() {
        return goodsoperate;
    }

    public void setGoodsoperate(String goodsoperate) {
        this.goodsoperate = goodsoperate;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrderaddress() {
        return orderaddress;
    }

    public void setOrderaddress(String orderaddress) {
        this.orderaddress = orderaddress;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Date getGoodsreturntime() {
        return goodsreturntime;
    }

    public void setGoodsreturntime(Date goodsreturntime) {
        this.goodsreturntime = goodsreturntime;
    }

    public String getGoodsreturnnumber() {
        return goodsreturnnumber;
    }

    public void setGoodsreturnnumber(String goodsreturnnumber) {
        this.goodsreturnnumber = goodsreturnnumber;
    }

    public String getGoodsreturnstatus() {
        return goodsreturnstatus;
    }

    public void setGoodsreturnstatus(String goodsreturnstatus) {
        this.goodsreturnstatus = goodsreturnstatus;
    }

    public Date getOrdercreatetime() {
        return ordercreatetime;
    }

    public void setOrdercreatetime(Date ordercreatetime) {
        this.ordercreatetime = ordercreatetime;
    }

    public Date getOrderpaytime() {
        return orderpaytime;
    }

    public void setOrderpaytime(Date orderpaytime) {
        this.orderpaytime = orderpaytime;
    }

    public Date getOrderchengjiaotime() {
        return orderchengjiaotime;
    }

    public void setOrderchengjiaotime(Date orderchengjiaotime) {
        this.orderchengjiaotime = orderchengjiaotime;
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
        OnlinemallOrder other = (OnlinemallOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getGoodsurl() == null ? other.getGoodsurl() == null : this.getGoodsurl().equals(other.getGoodsurl()))
            && (this.getOrdertype() == null ? other.getOrdertype() == null : this.getOrdertype().equals(other.getOrdertype()))
            && (this.getGoodsname() == null ? other.getGoodsname() == null : this.getGoodsname().equals(other.getGoodsname()))
            && (this.getGoodsprice() == null ? other.getGoodsprice() == null : this.getGoodsprice().equals(other.getGoodsprice()))
            && (this.getGoodscount() == null ? other.getGoodscount() == null : this.getGoodscount().equals(other.getGoodscount()))
            && (this.getOrdertotalamount() == null ? other.getOrdertotalamount() == null : this.getOrdertotalamount().equals(other.getOrdertotalamount()))
            && (this.getOrderwuliutotalamount() == null ? other.getOrderwuliutotalamount() == null : this.getOrderwuliutotalamount().equals(other.getOrderwuliutotalamount()))
            && (this.getGoodsoperate() == null ? other.getGoodsoperate() == null : this.getGoodsoperate().equals(other.getGoodsoperate()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getOrderaddress() == null ? other.getOrderaddress() == null : this.getOrderaddress().equals(other.getOrderaddress()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getGoodsreturntime() == null ? other.getGoodsreturntime() == null : this.getGoodsreturntime().equals(other.getGoodsreturntime()))
            && (this.getGoodsreturnnumber() == null ? other.getGoodsreturnnumber() == null : this.getGoodsreturnnumber().equals(other.getGoodsreturnnumber()))
            && (this.getGoodsreturnstatus() == null ? other.getGoodsreturnstatus() == null : this.getGoodsreturnstatus().equals(other.getGoodsreturnstatus()))
            && (this.getOrdercreatetime() == null ? other.getOrdercreatetime() == null : this.getOrdercreatetime().equals(other.getOrdercreatetime()))
            && (this.getOrderpaytime() == null ? other.getOrderpaytime() == null : this.getOrderpaytime().equals(other.getOrderpaytime()))
            && (this.getOrderchengjiaotime() == null ? other.getOrderchengjiaotime() == null : this.getOrderchengjiaotime().equals(other.getOrderchengjiaotime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getGoodsurl() == null) ? 0 : getGoodsurl().hashCode());
        result = prime * result + ((getOrdertype() == null) ? 0 : getOrdertype().hashCode());
        result = prime * result + ((getGoodsname() == null) ? 0 : getGoodsname().hashCode());
        result = prime * result + ((getGoodsprice() == null) ? 0 : getGoodsprice().hashCode());
        result = prime * result + ((getGoodscount() == null) ? 0 : getGoodscount().hashCode());
        result = prime * result + ((getOrdertotalamount() == null) ? 0 : getOrdertotalamount().hashCode());
        result = prime * result + ((getOrderwuliutotalamount() == null) ? 0 : getOrderwuliutotalamount().hashCode());
        result = prime * result + ((getGoodsoperate() == null) ? 0 : getGoodsoperate().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getOrderaddress() == null) ? 0 : getOrderaddress().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getGoodsreturntime() == null) ? 0 : getGoodsreturntime().hashCode());
        result = prime * result + ((getGoodsreturnnumber() == null) ? 0 : getGoodsreturnnumber().hashCode());
        result = prime * result + ((getGoodsreturnstatus() == null) ? 0 : getGoodsreturnstatus().hashCode());
        result = prime * result + ((getOrdercreatetime() == null) ? 0 : getOrdercreatetime().hashCode());
        result = prime * result + ((getOrderpaytime() == null) ? 0 : getOrderpaytime().hashCode());
        result = prime * result + ((getOrderchengjiaotime() == null) ? 0 : getOrderchengjiaotime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", userid=").append(userid);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", shopid=").append(shopid);
        sb.append(", goodsurl=").append(goodsurl);
        sb.append(", ordertype=").append(ordertype);
        sb.append(", goodsname=").append(goodsname);
        sb.append(", goodsprice=").append(goodsprice);
        sb.append(", goodscount=").append(goodscount);
        sb.append(", ordertotalamount=").append(ordertotalamount);
        sb.append(", orderwuliutotalamount=").append(orderwuliutotalamount);
        sb.append(", goodsoperate=").append(goodsoperate);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", orderaddress=").append(orderaddress);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", goodsreturntime=").append(goodsreturntime);
        sb.append(", goodsreturnnumber=").append(goodsreturnnumber);
        sb.append(", goodsreturnstatus=").append(goodsreturnstatus);
        sb.append(", ordercreatetime=").append(ordercreatetime);
        sb.append(", orderpaytime=").append(orderpaytime);
        sb.append(", orderchengjiaotime=").append(orderchengjiaotime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}