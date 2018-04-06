package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallUserPoint implements Serializable {
    private String id;

    private String userid;

    private String pointinfodetail;

    private String pointchange;

    private String pointtype;

    private Date pointtime;

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

    public String getPointinfodetail() {
        return pointinfodetail;
    }

    public void setPointinfodetail(String pointinfodetail) {
        this.pointinfodetail = pointinfodetail;
    }

    public String getPointchange() {
        return pointchange;
    }

    public void setPointchange(String pointchange) {
        this.pointchange = pointchange;
    }

    public String getPointtype() {
        return pointtype;
    }

    public void setPointtype(String pointtype) {
        this.pointtype = pointtype;
    }

    public Date getPointtime() {
        return pointtime;
    }

    public void setPointtime(Date pointtime) {
        this.pointtime = pointtime;
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
        OnlinemallUserPoint other = (OnlinemallUserPoint) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getPointinfodetail() == null ? other.getPointinfodetail() == null : this.getPointinfodetail().equals(other.getPointinfodetail()))
            && (this.getPointchange() == null ? other.getPointchange() == null : this.getPointchange().equals(other.getPointchange()))
            && (this.getPointtype() == null ? other.getPointtype() == null : this.getPointtype().equals(other.getPointtype()))
            && (this.getPointtime() == null ? other.getPointtime() == null : this.getPointtime().equals(other.getPointtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getPointinfodetail() == null) ? 0 : getPointinfodetail().hashCode());
        result = prime * result + ((getPointchange() == null) ? 0 : getPointchange().hashCode());
        result = prime * result + ((getPointtype() == null) ? 0 : getPointtype().hashCode());
        result = prime * result + ((getPointtime() == null) ? 0 : getPointtime().hashCode());
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
        sb.append(", pointinfodetail=").append(pointinfodetail);
        sb.append(", pointchange=").append(pointchange);
        sb.append(", pointtype=").append(pointtype);
        sb.append(", pointtime=").append(pointtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}