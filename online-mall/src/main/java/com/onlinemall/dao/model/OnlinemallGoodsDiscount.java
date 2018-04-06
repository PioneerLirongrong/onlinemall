package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallGoodsDiscount implements Serializable {
    private String id;

    private String discountid;

    private String goodsid;

    private String discountcontext;

    private Date deadtime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiscountid() {
        return discountid;
    }

    public void setDiscountid(String discountid) {
        this.discountid = discountid;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getDiscountcontext() {
        return discountcontext;
    }

    public void setDiscountcontext(String discountcontext) {
        this.discountcontext = discountcontext;
    }

    public Date getDeadtime() {
        return deadtime;
    }

    public void setDeadtime(Date deadtime) {
        this.deadtime = deadtime;
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
        OnlinemallGoodsDiscount other = (OnlinemallGoodsDiscount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDiscountid() == null ? other.getDiscountid() == null : this.getDiscountid().equals(other.getDiscountid()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getDiscountcontext() == null ? other.getDiscountcontext() == null : this.getDiscountcontext().equals(other.getDiscountcontext()))
            && (this.getDeadtime() == null ? other.getDeadtime() == null : this.getDeadtime().equals(other.getDeadtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDiscountid() == null) ? 0 : getDiscountid().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getDiscountcontext() == null) ? 0 : getDiscountcontext().hashCode());
        result = prime * result + ((getDeadtime() == null) ? 0 : getDeadtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", discountid=").append(discountid);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", discountcontext=").append(discountcontext);
        sb.append(", deadtime=").append(deadtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}