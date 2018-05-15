package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OnlinemallUser implements Serializable {
    private String userid;

    private String account;

    private String phonenumber;

    private String mail;

    private String qqnumber;

    private String weixinnumber;

    private String weibonumber;

    private String password;

    private String password1;

    private String password2;

    private String name;

    private String sex;

    private String birthday;

    private Integer securitydegree;

    private String securitypay;

    private String securityphone;

    private String securitymail;

    private String paypassword;

    private String realname;

    private String identitynumber;

    private String photourl1;

    private String photourl2;

    private String securityproblem1;

    private String securityansower1;

    private String securityproblem2;

    private String securityansower2;

    private Date registertime;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(String qqnumber) {
        this.qqnumber = qqnumber;
    }

    public String getWeixinnumber() {
        return weixinnumber;
    }

    public void setWeixinnumber(String weixinnumber) {
        this.weixinnumber = weixinnumber;
    }

    public String getWeibonumber() {
        return weibonumber;
    }

    public void setWeibonumber(String weibonumber) {
        this.weibonumber = weibonumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getSecuritydegree() {
        return securitydegree;
    }

    public void setSecuritydegree(Integer securitydegree) {
        this.securitydegree = securitydegree;
    }

    public String getSecuritypay() {
        return securitypay;
    }

    public void setSecuritypay(String securitypay) {
        this.securitypay = securitypay;
    }

    public String getSecurityphone() {
        return securityphone;
    }

    public void setSecurityphone(String securityphone) {
        this.securityphone = securityphone;
    }

    public String getSecuritymail() {
        return securitymail;
    }

    public void setSecuritymail(String securitymail) {
        this.securitymail = securitymail;
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdentitynumber() {
        return identitynumber;
    }

    public void setIdentitynumber(String identitynumber) {
        this.identitynumber = identitynumber;
    }

    public String getPhotourl1() {
        return photourl1;
    }

    public void setPhotourl1(String photourl1) {
        this.photourl1 = photourl1;
    }

    public String getPhotourl2() {
        return photourl2;
    }

    public void setPhotourl2(String photourl2) {
        this.photourl2 = photourl2;
    }

    public String getSecurityproblem1() {
        return securityproblem1;
    }

    public void setSecurityproblem1(String securityproblem1) {
        this.securityproblem1 = securityproblem1;
    }

    public String getSecurityansower1() {
        return securityansower1;
    }

    public void setSecurityansower1(String securityansower1) {
        this.securityansower1 = securityansower1;
    }

    public String getSecurityproblem2() {
        return securityproblem2;
    }

    public void setSecurityproblem2(String securityproblem2) {
        this.securityproblem2 = securityproblem2;
    }

    public String getSecurityansower2() {
        return securityansower2;
    }

    public void setSecurityansower2(String securityansower2) {
        this.securityansower2 = securityansower2;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
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
        OnlinemallUser other = (OnlinemallUser) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getPhonenumber() == null ? other.getPhonenumber() == null : this.getPhonenumber().equals(other.getPhonenumber()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getQqnumber() == null ? other.getQqnumber() == null : this.getQqnumber().equals(other.getQqnumber()))
            && (this.getWeixinnumber() == null ? other.getWeixinnumber() == null : this.getWeixinnumber().equals(other.getWeixinnumber()))
            && (this.getWeibonumber() == null ? other.getWeibonumber() == null : this.getWeibonumber().equals(other.getWeibonumber()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPassword1() == null ? other.getPassword1() == null : this.getPassword1().equals(other.getPassword1()))
            && (this.getPassword2() == null ? other.getPassword2() == null : this.getPassword2().equals(other.getPassword2()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getSecuritydegree() == null ? other.getSecuritydegree() == null : this.getSecuritydegree().equals(other.getSecuritydegree()))
            && (this.getSecuritypay() == null ? other.getSecuritypay() == null : this.getSecuritypay().equals(other.getSecuritypay()))
            && (this.getSecurityphone() == null ? other.getSecurityphone() == null : this.getSecurityphone().equals(other.getSecurityphone()))
            && (this.getSecuritymail() == null ? other.getSecuritymail() == null : this.getSecuritymail().equals(other.getSecuritymail()))
            && (this.getPaypassword() == null ? other.getPaypassword() == null : this.getPaypassword().equals(other.getPaypassword()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getIdentitynumber() == null ? other.getIdentitynumber() == null : this.getIdentitynumber().equals(other.getIdentitynumber()))
            && (this.getPhotourl1() == null ? other.getPhotourl1() == null : this.getPhotourl1().equals(other.getPhotourl1()))
            && (this.getPhotourl2() == null ? other.getPhotourl2() == null : this.getPhotourl2().equals(other.getPhotourl2()))
            && (this.getSecurityproblem1() == null ? other.getSecurityproblem1() == null : this.getSecurityproblem1().equals(other.getSecurityproblem1()))
            && (this.getSecurityansower1() == null ? other.getSecurityansower1() == null : this.getSecurityansower1().equals(other.getSecurityansower1()))
            && (this.getSecurityproblem2() == null ? other.getSecurityproblem2() == null : this.getSecurityproblem2().equals(other.getSecurityproblem2()))
            && (this.getSecurityansower2() == null ? other.getSecurityansower2() == null : this.getSecurityansower2().equals(other.getSecurityansower2()))
            && (this.getRegistertime() == null ? other.getRegistertime() == null : this.getRegistertime().equals(other.getRegistertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPhonenumber() == null) ? 0 : getPhonenumber().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getQqnumber() == null) ? 0 : getQqnumber().hashCode());
        result = prime * result + ((getWeixinnumber() == null) ? 0 : getWeixinnumber().hashCode());
        result = prime * result + ((getWeibonumber() == null) ? 0 : getWeibonumber().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPassword1() == null) ? 0 : getPassword1().hashCode());
        result = prime * result + ((getPassword2() == null) ? 0 : getPassword2().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getSecuritydegree() == null) ? 0 : getSecuritydegree().hashCode());
        result = prime * result + ((getSecuritypay() == null) ? 0 : getSecuritypay().hashCode());
        result = prime * result + ((getSecurityphone() == null) ? 0 : getSecurityphone().hashCode());
        result = prime * result + ((getSecuritymail() == null) ? 0 : getSecuritymail().hashCode());
        result = prime * result + ((getPaypassword() == null) ? 0 : getPaypassword().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getIdentitynumber() == null) ? 0 : getIdentitynumber().hashCode());
        result = prime * result + ((getPhotourl1() == null) ? 0 : getPhotourl1().hashCode());
        result = prime * result + ((getPhotourl2() == null) ? 0 : getPhotourl2().hashCode());
        result = prime * result + ((getSecurityproblem1() == null) ? 0 : getSecurityproblem1().hashCode());
        result = prime * result + ((getSecurityansower1() == null) ? 0 : getSecurityansower1().hashCode());
        result = prime * result + ((getSecurityproblem2() == null) ? 0 : getSecurityproblem2().hashCode());
        result = prime * result + ((getSecurityansower2() == null) ? 0 : getSecurityansower2().hashCode());
        result = prime * result + ((getRegistertime() == null) ? 0 : getRegistertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", account=").append(account);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", mail=").append(mail);
        sb.append(", qqnumber=").append(qqnumber);
        sb.append(", weixinnumber=").append(weixinnumber);
        sb.append(", weibonumber=").append(weibonumber);
        sb.append(", password=").append(password);
        sb.append(", password1=").append(password1);
        sb.append(", password2=").append(password2);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", securitydegree=").append(securitydegree);
        sb.append(", securitypay=").append(securitypay);
        sb.append(", securityphone=").append(securityphone);
        sb.append(", securitymail=").append(securitymail);
        sb.append(", paypassword=").append(paypassword);
        sb.append(", realname=").append(realname);
        sb.append(", identitynumber=").append(identitynumber);
        sb.append(", photourl1=").append(photourl1);
        sb.append(", photourl2=").append(photourl2);
        sb.append(", securityproblem1=").append(securityproblem1);
        sb.append(", securityansower1=").append(securityansower1);
        sb.append(", securityproblem2=").append(securityproblem2);
        sb.append(", securityansower2=").append(securityansower2);
        sb.append(", registertime=").append(registertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}