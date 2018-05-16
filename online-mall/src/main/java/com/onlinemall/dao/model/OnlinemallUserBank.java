package com.onlinemall.dao.model;

import java.io.Serializable;

public class OnlinemallUserBank implements Serializable {
    private String id;

    private String userid;

    private String bankname;

    private String banktype;

    private String banknumber;

    private String bankbindstatus;

    private String bankphonenumber;

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

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber;
    }

    public String getBankbindstatus() {
        return bankbindstatus;
    }

    public void setBankbindstatus(String bankbindstatus) {
        this.bankbindstatus = bankbindstatus;
    }

    public String getBankphonenumber() {
        return bankphonenumber;
    }

    public void setBankphonenumber(String bankphonenumber) {
        this.bankphonenumber = bankphonenumber;
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
        OnlinemallUserBank other = (OnlinemallUserBank) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getBankname() == null ? other.getBankname() == null : this.getBankname().equals(other.getBankname()))
            && (this.getBanktype() == null ? other.getBanktype() == null : this.getBanktype().equals(other.getBanktype()))
            && (this.getBanknumber() == null ? other.getBanknumber() == null : this.getBanknumber().equals(other.getBanknumber()))
            && (this.getBankbindstatus() == null ? other.getBankbindstatus() == null : this.getBankbindstatus().equals(other.getBankbindstatus()))
            && (this.getBankphonenumber() == null ? other.getBankphonenumber() == null : this.getBankphonenumber().equals(other.getBankphonenumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getBankname() == null) ? 0 : getBankname().hashCode());
        result = prime * result + ((getBanktype() == null) ? 0 : getBanktype().hashCode());
        result = prime * result + ((getBanknumber() == null) ? 0 : getBanknumber().hashCode());
        result = prime * result + ((getBankbindstatus() == null) ? 0 : getBankbindstatus().hashCode());
        result = prime * result + ((getBankphonenumber() == null) ? 0 : getBankphonenumber().hashCode());
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
        sb.append(", bankname=").append(bankname);
        sb.append(", banktype=").append(banktype);
        sb.append(", banknumber=").append(banknumber);
        sb.append(", bankbindstatus=").append(bankbindstatus);
        sb.append(", bankphonenumber=").append(bankphonenumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}