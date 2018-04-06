package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallUserRedEnvelopes implements Serializable {
    private String id;

    private String userid;

    private String redenvelopesinfodetail;

    private String redenvelopestype;

    private Integer redenvelopesmoney;

    private Date redenvelopesdelinetime;

    private String redenvelopesstatus;

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

    public String getRedenvelopesinfodetail() {
        return redenvelopesinfodetail;
    }

    public void setRedenvelopesinfodetail(String redenvelopesinfodetail) {
        this.redenvelopesinfodetail = redenvelopesinfodetail;
    }

    public String getRedenvelopestype() {
        return redenvelopestype;
    }

    public void setRedenvelopestype(String redenvelopestype) {
        this.redenvelopestype = redenvelopestype;
    }

    public Integer getRedenvelopesmoney() {
        return redenvelopesmoney;
    }

    public void setRedenvelopesmoney(Integer redenvelopesmoney) {
        this.redenvelopesmoney = redenvelopesmoney;
    }

    public Date getRedenvelopesdelinetime() {
        return redenvelopesdelinetime;
    }

    public void setRedenvelopesdelinetime(Date redenvelopesdelinetime) {
        this.redenvelopesdelinetime = redenvelopesdelinetime;
    }

    public String getRedenvelopesstatus() {
        return redenvelopesstatus;
    }

    public void setRedenvelopesstatus(String redenvelopesstatus) {
        this.redenvelopesstatus = redenvelopesstatus;
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
        OnlinemallUserRedEnvelopes other = (OnlinemallUserRedEnvelopes) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getRedenvelopesinfodetail() == null ? other.getRedenvelopesinfodetail() == null : this.getRedenvelopesinfodetail().equals(other.getRedenvelopesinfodetail()))
            && (this.getRedenvelopestype() == null ? other.getRedenvelopestype() == null : this.getRedenvelopestype().equals(other.getRedenvelopestype()))
            && (this.getRedenvelopesmoney() == null ? other.getRedenvelopesmoney() == null : this.getRedenvelopesmoney().equals(other.getRedenvelopesmoney()))
            && (this.getRedenvelopesdelinetime() == null ? other.getRedenvelopesdelinetime() == null : this.getRedenvelopesdelinetime().equals(other.getRedenvelopesdelinetime()))
            && (this.getRedenvelopesstatus() == null ? other.getRedenvelopesstatus() == null : this.getRedenvelopesstatus().equals(other.getRedenvelopesstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getRedenvelopesinfodetail() == null) ? 0 : getRedenvelopesinfodetail().hashCode());
        result = prime * result + ((getRedenvelopestype() == null) ? 0 : getRedenvelopestype().hashCode());
        result = prime * result + ((getRedenvelopesmoney() == null) ? 0 : getRedenvelopesmoney().hashCode());
        result = prime * result + ((getRedenvelopesdelinetime() == null) ? 0 : getRedenvelopesdelinetime().hashCode());
        result = prime * result + ((getRedenvelopesstatus() == null) ? 0 : getRedenvelopesstatus().hashCode());
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
        sb.append(", redenvelopesinfodetail=").append(redenvelopesinfodetail);
        sb.append(", redenvelopestype=").append(redenvelopestype);
        sb.append(", redenvelopesmoney=").append(redenvelopesmoney);
        sb.append(", redenvelopesdelinetime=").append(redenvelopesdelinetime);
        sb.append(", redenvelopesstatus=").append(redenvelopesstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}