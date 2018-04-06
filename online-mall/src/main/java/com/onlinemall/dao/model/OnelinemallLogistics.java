package com.onlinemall.dao.model;

import java.io.Serializable;

public class OnelinemallLogistics implements Serializable {
    private String id;

    private String logisticsid;

    private String orderid;

    private String goodsid;

    private String goodsurl;

    private String logisticstatus;

    private String logisticscompany;

    private String logisticsphone;

    private String logisticsinfodetail;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogisticsid() {
        return logisticsid;
    }

    public void setLogisticsid(String logisticsid) {
        this.logisticsid = logisticsid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsurl() {
        return goodsurl;
    }

    public void setGoodsurl(String goodsurl) {
        this.goodsurl = goodsurl;
    }

    public String getLogisticstatus() {
        return logisticstatus;
    }

    public void setLogisticstatus(String logisticstatus) {
        this.logisticstatus = logisticstatus;
    }

    public String getLogisticscompany() {
        return logisticscompany;
    }

    public void setLogisticscompany(String logisticscompany) {
        this.logisticscompany = logisticscompany;
    }

    public String getLogisticsphone() {
        return logisticsphone;
    }

    public void setLogisticsphone(String logisticsphone) {
        this.logisticsphone = logisticsphone;
    }

    public String getLogisticsinfodetail() {
        return logisticsinfodetail;
    }

    public void setLogisticsinfodetail(String logisticsinfodetail) {
        this.logisticsinfodetail = logisticsinfodetail;
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
        OnelinemallLogistics other = (OnelinemallLogistics) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogisticsid() == null ? other.getLogisticsid() == null : this.getLogisticsid().equals(other.getLogisticsid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getGoodsurl() == null ? other.getGoodsurl() == null : this.getGoodsurl().equals(other.getGoodsurl()))
            && (this.getLogisticstatus() == null ? other.getLogisticstatus() == null : this.getLogisticstatus().equals(other.getLogisticstatus()))
            && (this.getLogisticscompany() == null ? other.getLogisticscompany() == null : this.getLogisticscompany().equals(other.getLogisticscompany()))
            && (this.getLogisticsphone() == null ? other.getLogisticsphone() == null : this.getLogisticsphone().equals(other.getLogisticsphone()))
            && (this.getLogisticsinfodetail() == null ? other.getLogisticsinfodetail() == null : this.getLogisticsinfodetail().equals(other.getLogisticsinfodetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogisticsid() == null) ? 0 : getLogisticsid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getGoodsurl() == null) ? 0 : getGoodsurl().hashCode());
        result = prime * result + ((getLogisticstatus() == null) ? 0 : getLogisticstatus().hashCode());
        result = prime * result + ((getLogisticscompany() == null) ? 0 : getLogisticscompany().hashCode());
        result = prime * result + ((getLogisticsphone() == null) ? 0 : getLogisticsphone().hashCode());
        result = prime * result + ((getLogisticsinfodetail() == null) ? 0 : getLogisticsinfodetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logisticsid=").append(logisticsid);
        sb.append(", orderid=").append(orderid);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", goodsurl=").append(goodsurl);
        sb.append(", logisticstatus=").append(logisticstatus);
        sb.append(", logisticscompany=").append(logisticscompany);
        sb.append(", logisticsphone=").append(logisticsphone);
        sb.append(", logisticsinfodetail=").append(logisticsinfodetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}