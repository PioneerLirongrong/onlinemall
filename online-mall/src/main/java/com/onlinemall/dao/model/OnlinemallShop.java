package com.onlinemall.dao.model;

import java.io.Serializable;

public class OnlinemallShop implements Serializable {
    private String id;

    private String shopid;

    private String shopname;

    private String shopinfodetail;

    private String shopservicedegree;

    private String shoplogisticsdegree;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopinfodetail() {
        return shopinfodetail;
    }

    public void setShopinfodetail(String shopinfodetail) {
        this.shopinfodetail = shopinfodetail;
    }

    public String getShopservicedegree() {
        return shopservicedegree;
    }

    public void setShopservicedegree(String shopservicedegree) {
        this.shopservicedegree = shopservicedegree;
    }

    public String getShoplogisticsdegree() {
        return shoplogisticsdegree;
    }

    public void setShoplogisticsdegree(String shoplogisticsdegree) {
        this.shoplogisticsdegree = shoplogisticsdegree;
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
        OnlinemallShop other = (OnlinemallShop) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShopid() == null ? other.getShopid() == null : this.getShopid().equals(other.getShopid()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getShopinfodetail() == null ? other.getShopinfodetail() == null : this.getShopinfodetail().equals(other.getShopinfodetail()))
            && (this.getShopservicedegree() == null ? other.getShopservicedegree() == null : this.getShopservicedegree().equals(other.getShopservicedegree()))
            && (this.getShoplogisticsdegree() == null ? other.getShoplogisticsdegree() == null : this.getShoplogisticsdegree().equals(other.getShoplogisticsdegree()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShopid() == null) ? 0 : getShopid().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getShopinfodetail() == null) ? 0 : getShopinfodetail().hashCode());
        result = prime * result + ((getShopservicedegree() == null) ? 0 : getShopservicedegree().hashCode());
        result = prime * result + ((getShoplogisticsdegree() == null) ? 0 : getShoplogisticsdegree().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", shopinfodetail=").append(shopinfodetail);
        sb.append(", shopservicedegree=").append(shopservicedegree);
        sb.append(", shoplogisticsdegree=").append(shoplogisticsdegree);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}