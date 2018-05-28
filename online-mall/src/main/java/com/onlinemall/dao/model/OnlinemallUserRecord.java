package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallUserRecord implements Serializable {
    private String id;

    private String userid;

    private String goodsid;

    private String queryurl;

    private Date recordtime;

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

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getQueryurl() {
        return queryurl;
    }

    public void setQueryurl(String queryurl) {
        this.queryurl = queryurl;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
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
        OnlinemallUserRecord other = (OnlinemallUserRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getQueryurl() == null ? other.getQueryurl() == null : this.getQueryurl().equals(other.getQueryurl()))
            && (this.getRecordtime() == null ? other.getRecordtime() == null : this.getRecordtime().equals(other.getRecordtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getQueryurl() == null) ? 0 : getQueryurl().hashCode());
        result = prime * result + ((getRecordtime() == null) ? 0 : getRecordtime().hashCode());
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
        sb.append(", goodsid=").append(goodsid);
        sb.append(", queryurl=").append(queryurl);
        sb.append(", recordtime=").append(recordtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}