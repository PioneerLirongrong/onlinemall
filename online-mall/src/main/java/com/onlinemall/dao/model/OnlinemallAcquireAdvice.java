package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallAcquireAdvice implements Serializable {
    private String id;

    private String userid;

    private String acquireadviceflag;

    private String acquireadvicetype;

    private String acquireadvicedetail;

    private Date acquireadvicetime;

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

    public String getAcquireadviceflag() {
        return acquireadviceflag;
    }

    public void setAcquireadviceflag(String acquireadviceflag) {
        this.acquireadviceflag = acquireadviceflag;
    }

    public String getAcquireadvicetype() {
        return acquireadvicetype;
    }

    public void setAcquireadvicetype(String acquireadvicetype) {
        this.acquireadvicetype = acquireadvicetype;
    }

    public String getAcquireadvicedetail() {
        return acquireadvicedetail;
    }

    public void setAcquireadvicedetail(String acquireadvicedetail) {
        this.acquireadvicedetail = acquireadvicedetail;
    }

    public Date getAcquireadvicetime() {
        return acquireadvicetime;
    }

    public void setAcquireadvicetime(Date acquireadvicetime) {
        this.acquireadvicetime = acquireadvicetime;
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
        OnlinemallAcquireAdvice other = (OnlinemallAcquireAdvice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getAcquireadviceflag() == null ? other.getAcquireadviceflag() == null : this.getAcquireadviceflag().equals(other.getAcquireadviceflag()))
            && (this.getAcquireadvicetype() == null ? other.getAcquireadvicetype() == null : this.getAcquireadvicetype().equals(other.getAcquireadvicetype()))
            && (this.getAcquireadvicedetail() == null ? other.getAcquireadvicedetail() == null : this.getAcquireadvicedetail().equals(other.getAcquireadvicedetail()))
            && (this.getAcquireadvicetime() == null ? other.getAcquireadvicetime() == null : this.getAcquireadvicetime().equals(other.getAcquireadvicetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getAcquireadviceflag() == null) ? 0 : getAcquireadviceflag().hashCode());
        result = prime * result + ((getAcquireadvicetype() == null) ? 0 : getAcquireadvicetype().hashCode());
        result = prime * result + ((getAcquireadvicedetail() == null) ? 0 : getAcquireadvicedetail().hashCode());
        result = prime * result + ((getAcquireadvicetime() == null) ? 0 : getAcquireadvicetime().hashCode());
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
        sb.append(", acquireadviceflag=").append(acquireadviceflag);
        sb.append(", acquireadvicetype=").append(acquireadvicetype);
        sb.append(", acquireadvicedetail=").append(acquireadvicedetail);
        sb.append(", acquireadvicetime=").append(acquireadvicetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}