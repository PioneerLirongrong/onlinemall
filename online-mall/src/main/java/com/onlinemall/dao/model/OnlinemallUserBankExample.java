package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OnlinemallUserBankExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallUserBankExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andBanknameIsNull() {
            addCriterion("bankname is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankname is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankname =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankname <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankname >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankname >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankname <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankname <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankname like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankname not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankname in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankname not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankname between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankname not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNull() {
            addCriterion("banktype is null");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNotNull() {
            addCriterion("banktype is not null");
            return (Criteria) this;
        }

        public Criteria andBanktypeEqualTo(String value) {
            addCriterion("banktype =", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotEqualTo(String value) {
            addCriterion("banktype <>", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThan(String value) {
            addCriterion("banktype >", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThanOrEqualTo(String value) {
            addCriterion("banktype >=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThan(String value) {
            addCriterion("banktype <", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThanOrEqualTo(String value) {
            addCriterion("banktype <=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLike(String value) {
            addCriterion("banktype like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotLike(String value) {
            addCriterion("banktype not like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeIn(List<String> values) {
            addCriterion("banktype in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotIn(List<String> values) {
            addCriterion("banktype not in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeBetween(String value1, String value2) {
            addCriterion("banktype between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotBetween(String value1, String value2) {
            addCriterion("banktype not between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNull() {
            addCriterion("banknumber is null");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNotNull() {
            addCriterion("banknumber is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumberEqualTo(String value) {
            addCriterion("banknumber =", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotEqualTo(String value) {
            addCriterion("banknumber <>", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThan(String value) {
            addCriterion("banknumber >", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("banknumber >=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThan(String value) {
            addCriterion("banknumber <", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThanOrEqualTo(String value) {
            addCriterion("banknumber <=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLike(String value) {
            addCriterion("banknumber like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotLike(String value) {
            addCriterion("banknumber not like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberIn(List<String> values) {
            addCriterion("banknumber in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotIn(List<String> values) {
            addCriterion("banknumber not in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberBetween(String value1, String value2) {
            addCriterion("banknumber between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotBetween(String value1, String value2) {
            addCriterion("banknumber not between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusIsNull() {
            addCriterion("bankbindstatus is null");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusIsNotNull() {
            addCriterion("bankbindstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusEqualTo(String value) {
            addCriterion("bankbindstatus =", value, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusNotEqualTo(String value) {
            addCriterion("bankbindstatus <>", value, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusGreaterThan(String value) {
            addCriterion("bankbindstatus >", value, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusGreaterThanOrEqualTo(String value) {
            addCriterion("bankbindstatus >=", value, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusLessThan(String value) {
            addCriterion("bankbindstatus <", value, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusLessThanOrEqualTo(String value) {
            addCriterion("bankbindstatus <=", value, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusLike(String value) {
            addCriterion("bankbindstatus like", value, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusNotLike(String value) {
            addCriterion("bankbindstatus not like", value, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusIn(List<String> values) {
            addCriterion("bankbindstatus in", values, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusNotIn(List<String> values) {
            addCriterion("bankbindstatus not in", values, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusBetween(String value1, String value2) {
            addCriterion("bankbindstatus between", value1, value2, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankbindstatusNotBetween(String value1, String value2) {
            addCriterion("bankbindstatus not between", value1, value2, "bankbindstatus");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberIsNull() {
            addCriterion("bankPhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberIsNotNull() {
            addCriterion("bankPhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberEqualTo(String value) {
            addCriterion("bankPhoneNumber =", value, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberNotEqualTo(String value) {
            addCriterion("bankPhoneNumber <>", value, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberGreaterThan(String value) {
            addCriterion("bankPhoneNumber >", value, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("bankPhoneNumber >=", value, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberLessThan(String value) {
            addCriterion("bankPhoneNumber <", value, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberLessThanOrEqualTo(String value) {
            addCriterion("bankPhoneNumber <=", value, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberLike(String value) {
            addCriterion("bankPhoneNumber like", value, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberNotLike(String value) {
            addCriterion("bankPhoneNumber not like", value, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberIn(List<String> values) {
            addCriterion("bankPhoneNumber in", values, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberNotIn(List<String> values) {
            addCriterion("bankPhoneNumber not in", values, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberBetween(String value1, String value2) {
            addCriterion("bankPhoneNumber between", value1, value2, "bankphonenumber");
            return (Criteria) this;
        }

        public Criteria andBankphonenumberNotBetween(String value1, String value2) {
            addCriterion("bankPhoneNumber not between", value1, value2, "bankphonenumber");
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