package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallUserBalance implements Serializable {
    private String id;

    private String userid;

    private String balanceinfodetail;

    private String balancenumber;

    private Date balancetime;

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

    public String getBalanceinfodetail() {
        return balanceinfodetail;
    }

    public void setBalanceinfodetail(String balanceinfodetail) {
        this.balanceinfodetail = balanceinfodetail;
    }

    public String getBalancenumber() {
        return balancenumber;
    }

    public void setBalancenumber(String balancenumber) {
        this.balancenumber = balancenumber;
    }

    public Date getBalancetime() {
        return balancetime;
    }

    public void setBalancetime(Date balancetime) {
        this.balancetime = balancetime;
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
        OnlinemallUserBalance other = (OnlinemallUserBalance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getBalanceinfodetail() == null ? other.getBalanceinfodetail() == null : this.getBalanceinfodetail().equals(other.getBalanceinfodetail()))
            && (this.getBalancenumber() == null ? other.getBalancenumber() == null : this.getBalancenumber().equals(other.getBalancenumber()))
            && (this.getBalancetime() == null ? other.getBalancetime() == null : this.getBalancetime().equals(other.getBalancetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getBalanceinfodetail() == null) ? 0 : getBalanceinfodetail().hashCode());
        result = prime * result + ((getBalancenumber() == null) ? 0 : getBalancenumber().hashCode());
        result = prime * result + ((getBalancetime() == null) ? 0 : getBalancetime().hashCode());
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
        sb.append(", balanceinfodetail=").append(balanceinfodetail);
        sb.append(", balancenumber=").append(balancenumber);
        sb.append(", balancetime=").append(balancetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}