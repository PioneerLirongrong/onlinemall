package com.onlinemall.dao.model;

import java.io.Serializable;

public class OnlinemallUserDiscount implements Serializable {
    private String id;

    private String userid;

    private String discountid;

    private String discountinfodetail;

    private String discounttype;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getDiscountid() {
        return discountid;
    }

    public void setDiscountid(String discountid) {
        this.discountid = discountid;
    }

    public String getDiscountinfodetail() {
        return discountinfodetail;
    }

    public void setDiscountinfodetail(String discountinfodetail) {
        this.discountinfodetail = discountinfodetail;
    }

    public String getDiscounttype() {
        return discounttype;
    }

    public void setDiscounttype(String discounttype) {
        this.discounttype = discounttype;
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
        OnlinemallUserDiscount other = (OnlinemallUserDiscount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getDiscountid() == null ? other.getDiscountid() == null : this.getDiscountid().equals(other.getDiscountid()))
            && (this.getDiscountinfodetail() == null ? other.getDiscountinfodetail() == null : this.getDiscountinfodetail().equals(other.getDiscountinfodetail()))
            && (this.getDiscounttype() == null ? other.getDiscounttype() == null : this.getDiscounttype().equals(other.getDiscounttype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getDiscountid() == null) ? 0 : getDiscountid().hashCode());
        result = prime * result + ((getDiscountinfodetail() == null) ? 0 : getDiscountinfodetail().hashCode());
        result = prime * result + ((getDiscounttype() == null) ? 0 : getDiscounttype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", discountid=").append(discountid);
        sb.append(", discountinfodetail=").append(discountinfodetail);
        sb.append(", discounttype=").append(discounttype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}