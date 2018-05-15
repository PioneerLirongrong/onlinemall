package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinemallUserExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phonenumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phonenumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phonenumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phonenumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phonenumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phonenumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phonenumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phonenumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phonenumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phonenumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phonenumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phonenumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andQqnumberIsNull() {
            addCriterion("qqnumber is null");
            return (Criteria) this;
        }

        public Criteria andQqnumberIsNotNull() {
            addCriterion("qqnumber is not null");
            return (Criteria) this;
        }

        public Criteria andQqnumberEqualTo(String value) {
            addCriterion("qqnumber =", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotEqualTo(String value) {
            addCriterion("qqnumber <>", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberGreaterThan(String value) {
            addCriterion("qqnumber >", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberGreaterThanOrEqualTo(String value) {
            addCriterion("qqnumber >=", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLessThan(String value) {
            addCriterion("qqnumber <", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLessThanOrEqualTo(String value) {
            addCriterion("qqnumber <=", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberLike(String value) {
            addCriterion("qqnumber like", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotLike(String value) {
            addCriterion("qqnumber not like", value, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberIn(List<String> values) {
            addCriterion("qqnumber in", values, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotIn(List<String> values) {
            addCriterion("qqnumber not in", values, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberBetween(String value1, String value2) {
            addCriterion("qqnumber between", value1, value2, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andQqnumberNotBetween(String value1, String value2) {
            addCriterion("qqnumber not between", value1, value2, "qqnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberIsNull() {
            addCriterion("weixinnumber is null");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberIsNotNull() {
            addCriterion("weixinnumber is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberEqualTo(String value) {
            addCriterion("weixinnumber =", value, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberNotEqualTo(String value) {
            addCriterion("weixinnumber <>", value, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberGreaterThan(String value) {
            addCriterion("weixinnumber >", value, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberGreaterThanOrEqualTo(String value) {
            addCriterion("weixinnumber >=", value, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberLessThan(String value) {
            addCriterion("weixinnumber <", value, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberLessThanOrEqualTo(String value) {
            addCriterion("weixinnumber <=", value, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberLike(String value) {
            addCriterion("weixinnumber like", value, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberNotLike(String value) {
            addCriterion("weixinnumber not like", value, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberIn(List<String> values) {
            addCriterion("weixinnumber in", values, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberNotIn(List<String> values) {
            addCriterion("weixinnumber not in", values, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberBetween(String value1, String value2) {
            addCriterion("weixinnumber between", value1, value2, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeixinnumberNotBetween(String value1, String value2) {
            addCriterion("weixinnumber not between", value1, value2, "weixinnumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberIsNull() {
            addCriterion("weibonumber is null");
            return (Criteria) this;
        }

        public Criteria andWeibonumberIsNotNull() {
            addCriterion("weibonumber is not null");
            return (Criteria) this;
        }

        public Criteria andWeibonumberEqualTo(String value) {
            addCriterion("weibonumber =", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberNotEqualTo(String value) {
            addCriterion("weibonumber <>", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberGreaterThan(String value) {
            addCriterion("weibonumber >", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberGreaterThanOrEqualTo(String value) {
            addCriterion("weibonumber >=", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberLessThan(String value) {
            addCriterion("weibonumber <", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberLessThanOrEqualTo(String value) {
            addCriterion("weibonumber <=", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberLike(String value) {
            addCriterion("weibonumber like", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberNotLike(String value) {
            addCriterion("weibonumber not like", value, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberIn(List<String> values) {
            addCriterion("weibonumber in", values, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberNotIn(List<String> values) {
            addCriterion("weibonumber not in", values, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberBetween(String value1, String value2) {
            addCriterion("weibonumber between", value1, value2, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andWeibonumberNotBetween(String value1, String value2) {
            addCriterion("weibonumber not between", value1, value2, "weibonumber");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPassword1IsNull() {
            addCriterion("password1 is null");
            return (Criteria) this;
        }

        public Criteria andPassword1IsNotNull() {
            addCriterion("password1 is not null");
            return (Criteria) this;
        }

        public Criteria andPassword1EqualTo(String value) {
            addCriterion("password1 =", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1NotEqualTo(String value) {
            addCriterion("password1 <>", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1GreaterThan(String value) {
            addCriterion("password1 >", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1GreaterThanOrEqualTo(String value) {
            addCriterion("password1 >=", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1LessThan(String value) {
            addCriterion("password1 <", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1LessThanOrEqualTo(String value) {
            addCriterion("password1 <=", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1Like(String value) {
            addCriterion("password1 like", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1NotLike(String value) {
            addCriterion("password1 not like", value, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1In(List<String> values) {
            addCriterion("password1 in", values, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1NotIn(List<String> values) {
            addCriterion("password1 not in", values, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1Between(String value1, String value2) {
            addCriterion("password1 between", value1, value2, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword1NotBetween(String value1, String value2) {
            addCriterion("password1 not between", value1, value2, "password1");
            return (Criteria) this;
        }

        public Criteria andPassword2IsNull() {
            addCriterion("password2 is null");
            return (Criteria) this;
        }

        public Criteria andPassword2IsNotNull() {
            addCriterion("password2 is not null");
            return (Criteria) this;
        }

        public Criteria andPassword2EqualTo(String value) {
            addCriterion("password2 =", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2NotEqualTo(String value) {
            addCriterion("password2 <>", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2GreaterThan(String value) {
            addCriterion("password2 >", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2GreaterThanOrEqualTo(String value) {
            addCriterion("password2 >=", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2LessThan(String value) {
            addCriterion("password2 <", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2LessThanOrEqualTo(String value) {
            addCriterion("password2 <=", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2Like(String value) {
            addCriterion("password2 like", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2NotLike(String value) {
            addCriterion("password2 not like", value, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2In(List<String> values) {
            addCriterion("password2 in", values, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2NotIn(List<String> values) {
            addCriterion("password2 not in", values, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2Between(String value1, String value2) {
            addCriterion("password2 between", value1, value2, "password2");
            return (Criteria) this;
        }

        public Criteria andPassword2NotBetween(String value1, String value2) {
            addCriterion("password2 not between", value1, value2, "password2");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeIsNull() {
            addCriterion("securitydegree is null");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeIsNotNull() {
            addCriterion("securitydegree is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeEqualTo(Integer value) {
            addCriterion("securitydegree =", value, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeNotEqualTo(Integer value) {
            addCriterion("securitydegree <>", value, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeGreaterThan(Integer value) {
            addCriterion("securitydegree >", value, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("securitydegree >=", value, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeLessThan(Integer value) {
            addCriterion("securitydegree <", value, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeLessThanOrEqualTo(Integer value) {
            addCriterion("securitydegree <=", value, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeIn(List<Integer> values) {
            addCriterion("securitydegree in", values, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeNotIn(List<Integer> values) {
            addCriterion("securitydegree not in", values, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeBetween(Integer value1, Integer value2) {
            addCriterion("securitydegree between", value1, value2, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritydegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("securitydegree not between", value1, value2, "securitydegree");
            return (Criteria) this;
        }

        public Criteria andSecuritypayIsNull() {
            addCriterion("securitypay is null");
            return (Criteria) this;
        }

        public Criteria andSecuritypayIsNotNull() {
            addCriterion("securitypay is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritypayEqualTo(String value) {
            addCriterion("securitypay =", value, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayNotEqualTo(String value) {
            addCriterion("securitypay <>", value, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayGreaterThan(String value) {
            addCriterion("securitypay >", value, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayGreaterThanOrEqualTo(String value) {
            addCriterion("securitypay >=", value, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayLessThan(String value) {
            addCriterion("securitypay <", value, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayLessThanOrEqualTo(String value) {
            addCriterion("securitypay <=", value, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayLike(String value) {
            addCriterion("securitypay like", value, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayNotLike(String value) {
            addCriterion("securitypay not like", value, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayIn(List<String> values) {
            addCriterion("securitypay in", values, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayNotIn(List<String> values) {
            addCriterion("securitypay not in", values, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayBetween(String value1, String value2) {
            addCriterion("securitypay between", value1, value2, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecuritypayNotBetween(String value1, String value2) {
            addCriterion("securitypay not between", value1, value2, "securitypay");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneIsNull() {
            addCriterion("securityphone is null");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneIsNotNull() {
            addCriterion("securityphone is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneEqualTo(String value) {
            addCriterion("securityphone =", value, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneNotEqualTo(String value) {
            addCriterion("securityphone <>", value, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneGreaterThan(String value) {
            addCriterion("securityphone >", value, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneGreaterThanOrEqualTo(String value) {
            addCriterion("securityphone >=", value, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneLessThan(String value) {
            addCriterion("securityphone <", value, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneLessThanOrEqualTo(String value) {
            addCriterion("securityphone <=", value, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneLike(String value) {
            addCriterion("securityphone like", value, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneNotLike(String value) {
            addCriterion("securityphone not like", value, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneIn(List<String> values) {
            addCriterion("securityphone in", values, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneNotIn(List<String> values) {
            addCriterion("securityphone not in", values, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneBetween(String value1, String value2) {
            addCriterion("securityphone between", value1, value2, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecurityphoneNotBetween(String value1, String value2) {
            addCriterion("securityphone not between", value1, value2, "securityphone");
            return (Criteria) this;
        }

        public Criteria andSecuritymailIsNull() {
            addCriterion("securitymail is null");
            return (Criteria) this;
        }

        public Criteria andSecuritymailIsNotNull() {
            addCriterion("securitymail is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritymailEqualTo(String value) {
            addCriterion("securitymail =", value, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailNotEqualTo(String value) {
            addCriterion("securitymail <>", value, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailGreaterThan(String value) {
            addCriterion("securitymail >", value, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailGreaterThanOrEqualTo(String value) {
            addCriterion("securitymail >=", value, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailLessThan(String value) {
            addCriterion("securitymail <", value, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailLessThanOrEqualTo(String value) {
            addCriterion("securitymail <=", value, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailLike(String value) {
            addCriterion("securitymail like", value, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailNotLike(String value) {
            addCriterion("securitymail not like", value, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailIn(List<String> values) {
            addCriterion("securitymail in", values, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailNotIn(List<String> values) {
            addCriterion("securitymail not in", values, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailBetween(String value1, String value2) {
            addCriterion("securitymail between", value1, value2, "securitymail");
            return (Criteria) this;
        }

        public Criteria andSecuritymailNotBetween(String value1, String value2) {
            addCriterion("securitymail not between", value1, value2, "securitymail");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIsNull() {
            addCriterion("paypassword is null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIsNotNull() {
            addCriterion("paypassword is not null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordEqualTo(String value) {
            addCriterion("paypassword =", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotEqualTo(String value) {
            addCriterion("paypassword <>", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordGreaterThan(String value) {
            addCriterion("paypassword >", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("paypassword >=", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLessThan(String value) {
            addCriterion("paypassword <", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLessThanOrEqualTo(String value) {
            addCriterion("paypassword <=", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLike(String value) {
            addCriterion("paypassword like", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotLike(String value) {
            addCriterion("paypassword not like", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIn(List<String> values) {
            addCriterion("paypassword in", values, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotIn(List<String> values) {
            addCriterion("paypassword not in", values, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordBetween(String value1, String value2) {
            addCriterion("paypassword between", value1, value2, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotBetween(String value1, String value2) {
            addCriterion("paypassword not between", value1, value2, "paypassword");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIsNull() {
            addCriterion("identitynumber is null");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIsNotNull() {
            addCriterion("identitynumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberEqualTo(String value) {
            addCriterion("identitynumber =", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotEqualTo(String value) {
            addCriterion("identitynumber <>", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberGreaterThan(String value) {
            addCriterion("identitynumber >", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberGreaterThanOrEqualTo(String value) {
            addCriterion("identitynumber >=", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLessThan(String value) {
            addCriterion("identitynumber <", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLessThanOrEqualTo(String value) {
            addCriterion("identitynumber <=", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLike(String value) {
            addCriterion("identitynumber like", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotLike(String value) {
            addCriterion("identitynumber not like", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIn(List<String> values) {
            addCriterion("identitynumber in", values, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotIn(List<String> values) {
            addCriterion("identitynumber not in", values, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberBetween(String value1, String value2) {
            addCriterion("identitynumber between", value1, value2, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotBetween(String value1, String value2) {
            addCriterion("identitynumber not between", value1, value2, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andPhotourl1IsNull() {
            addCriterion("photourl1 is null");
            return (Criteria) this;
        }

        public Criteria andPhotourl1IsNotNull() {
            addCriterion("photourl1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourl1EqualTo(String value) {
            addCriterion("photourl1 =", value, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1NotEqualTo(String value) {
            addCriterion("photourl1 <>", value, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1GreaterThan(String value) {
            addCriterion("photourl1 >", value, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1GreaterThanOrEqualTo(String value) {
            addCriterion("photourl1 >=", value, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1LessThan(String value) {
            addCriterion("photourl1 <", value, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1LessThanOrEqualTo(String value) {
            addCriterion("photourl1 <=", value, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1Like(String value) {
            addCriterion("photourl1 like", value, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1NotLike(String value) {
            addCriterion("photourl1 not like", value, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1In(List<String> values) {
            addCriterion("photourl1 in", values, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1NotIn(List<String> values) {
            addCriterion("photourl1 not in", values, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1Between(String value1, String value2) {
            addCriterion("photourl1 between", value1, value2, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl1NotBetween(String value1, String value2) {
            addCriterion("photourl1 not between", value1, value2, "photourl1");
            return (Criteria) this;
        }

        public Criteria andPhotourl2IsNull() {
            addCriterion("photourl2 is null");
            return (Criteria) this;
        }

        public Criteria andPhotourl2IsNotNull() {
            addCriterion("photourl2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourl2EqualTo(String value) {
            addCriterion("photourl2 =", value, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2NotEqualTo(String value) {
            addCriterion("photourl2 <>", value, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2GreaterThan(String value) {
            addCriterion("photourl2 >", value, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2GreaterThanOrEqualTo(String value) {
            addCriterion("photourl2 >=", value, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2LessThan(String value) {
            addCriterion("photourl2 <", value, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2LessThanOrEqualTo(String value) {
            addCriterion("photourl2 <=", value, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2Like(String value) {
            addCriterion("photourl2 like", value, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2NotLike(String value) {
            addCriterion("photourl2 not like", value, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2In(List<String> values) {
            addCriterion("photourl2 in", values, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2NotIn(List<String> values) {
            addCriterion("photourl2 not in", values, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2Between(String value1, String value2) {
            addCriterion("photourl2 between", value1, value2, "photourl2");
            return (Criteria) this;
        }

        public Criteria andPhotourl2NotBetween(String value1, String value2) {
            addCriterion("photourl2 not between", value1, value2, "photourl2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1IsNull() {
            addCriterion("securityproblem1 is null");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1IsNotNull() {
            addCriterion("securityproblem1 is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1EqualTo(String value) {
            addCriterion("securityproblem1 =", value, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1NotEqualTo(String value) {
            addCriterion("securityproblem1 <>", value, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1GreaterThan(String value) {
            addCriterion("securityproblem1 >", value, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1GreaterThanOrEqualTo(String value) {
            addCriterion("securityproblem1 >=", value, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1LessThan(String value) {
            addCriterion("securityproblem1 <", value, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1LessThanOrEqualTo(String value) {
            addCriterion("securityproblem1 <=", value, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1Like(String value) {
            addCriterion("securityproblem1 like", value, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1NotLike(String value) {
            addCriterion("securityproblem1 not like", value, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1In(List<String> values) {
            addCriterion("securityproblem1 in", values, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1NotIn(List<String> values) {
            addCriterion("securityproblem1 not in", values, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1Between(String value1, String value2) {
            addCriterion("securityproblem1 between", value1, value2, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem1NotBetween(String value1, String value2) {
            addCriterion("securityproblem1 not between", value1, value2, "securityproblem1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1IsNull() {
            addCriterion("securityansower1 is null");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1IsNotNull() {
            addCriterion("securityansower1 is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1EqualTo(String value) {
            addCriterion("securityansower1 =", value, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1NotEqualTo(String value) {
            addCriterion("securityansower1 <>", value, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1GreaterThan(String value) {
            addCriterion("securityansower1 >", value, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1GreaterThanOrEqualTo(String value) {
            addCriterion("securityansower1 >=", value, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1LessThan(String value) {
            addCriterion("securityansower1 <", value, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1LessThanOrEqualTo(String value) {
            addCriterion("securityansower1 <=", value, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1Like(String value) {
            addCriterion("securityansower1 like", value, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1NotLike(String value) {
            addCriterion("securityansower1 not like", value, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1In(List<String> values) {
            addCriterion("securityansower1 in", values, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1NotIn(List<String> values) {
            addCriterion("securityansower1 not in", values, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1Between(String value1, String value2) {
            addCriterion("securityansower1 between", value1, value2, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityansower1NotBetween(String value1, String value2) {
            addCriterion("securityansower1 not between", value1, value2, "securityansower1");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2IsNull() {
            addCriterion("securityproblem2 is null");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2IsNotNull() {
            addCriterion("securityproblem2 is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2EqualTo(String value) {
            addCriterion("securityproblem2 =", value, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2NotEqualTo(String value) {
            addCriterion("securityproblem2 <>", value, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2GreaterThan(String value) {
            addCriterion("securityproblem2 >", value, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2GreaterThanOrEqualTo(String value) {
            addCriterion("securityproblem2 >=", value, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2LessThan(String value) {
            addCriterion("securityproblem2 <", value, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2LessThanOrEqualTo(String value) {
            addCriterion("securityproblem2 <=", value, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2Like(String value) {
            addCriterion("securityproblem2 like", value, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2NotLike(String value) {
            addCriterion("securityproblem2 not like", value, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2In(List<String> values) {
            addCriterion("securityproblem2 in", values, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2NotIn(List<String> values) {
            addCriterion("securityproblem2 not in", values, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2Between(String value1, String value2) {
            addCriterion("securityproblem2 between", value1, value2, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityproblem2NotBetween(String value1, String value2) {
            addCriterion("securityproblem2 not between", value1, value2, "securityproblem2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2IsNull() {
            addCriterion("securityansower2 is null");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2IsNotNull() {
            addCriterion("securityansower2 is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2EqualTo(String value) {
            addCriterion("securityansower2 =", value, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2NotEqualTo(String value) {
            addCriterion("securityansower2 <>", value, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2GreaterThan(String value) {
            addCriterion("securityansower2 >", value, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2GreaterThanOrEqualTo(String value) {
            addCriterion("securityansower2 >=", value, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2LessThan(String value) {
            addCriterion("securityansower2 <", value, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2LessThanOrEqualTo(String value) {
            addCriterion("securityansower2 <=", value, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2Like(String value) {
            addCriterion("securityansower2 like", value, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2NotLike(String value) {
            addCriterion("securityansower2 not like", value, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2In(List<String> values) {
            addCriterion("securityansower2 in", values, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2NotIn(List<String> values) {
            addCriterion("securityansower2 not in", values, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2Between(String value1, String value2) {
            addCriterion("securityansower2 between", value1, value2, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andSecurityansower2NotBetween(String value1, String value2) {
            addCriterion("securityansower2 not between", value1, value2, "securityansower2");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registertime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registertime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registertime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registertime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registertime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registertime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registertime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registertime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registertime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registertime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registertime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registertime not between", value1, value2, "registertime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}