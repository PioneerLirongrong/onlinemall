package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinemallUserRedEnvelopesExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallUserRedEnvelopesExample() {
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

        public Criteria andRedenvelopesinfodetailIsNull() {
            addCriterion("redenvelopesinfodetail is null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailIsNotNull() {
            addCriterion("redenvelopesinfodetail is not null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailEqualTo(String value) {
            addCriterion("redenvelopesinfodetail =", value, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailNotEqualTo(String value) {
            addCriterion("redenvelopesinfodetail <>", value, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailGreaterThan(String value) {
            addCriterion("redenvelopesinfodetail >", value, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailGreaterThanOrEqualTo(String value) {
            addCriterion("redenvelopesinfodetail >=", value, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailLessThan(String value) {
            addCriterion("redenvelopesinfodetail <", value, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailLessThanOrEqualTo(String value) {
            addCriterion("redenvelopesinfodetail <=", value, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailLike(String value) {
            addCriterion("redenvelopesinfodetail like", value, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailNotLike(String value) {
            addCriterion("redenvelopesinfodetail not like", value, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailIn(List<String> values) {
            addCriterion("redenvelopesinfodetail in", values, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailNotIn(List<String> values) {
            addCriterion("redenvelopesinfodetail not in", values, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailBetween(String value1, String value2) {
            addCriterion("redenvelopesinfodetail between", value1, value2, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesinfodetailNotBetween(String value1, String value2) {
            addCriterion("redenvelopesinfodetail not between", value1, value2, "redenvelopesinfodetail");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeIsNull() {
            addCriterion("redenvelopestype is null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeIsNotNull() {
            addCriterion("redenvelopestype is not null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeEqualTo(String value) {
            addCriterion("redenvelopestype =", value, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeNotEqualTo(String value) {
            addCriterion("redenvelopestype <>", value, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeGreaterThan(String value) {
            addCriterion("redenvelopestype >", value, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeGreaterThanOrEqualTo(String value) {
            addCriterion("redenvelopestype >=", value, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeLessThan(String value) {
            addCriterion("redenvelopestype <", value, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeLessThanOrEqualTo(String value) {
            addCriterion("redenvelopestype <=", value, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeLike(String value) {
            addCriterion("redenvelopestype like", value, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeNotLike(String value) {
            addCriterion("redenvelopestype not like", value, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeIn(List<String> values) {
            addCriterion("redenvelopestype in", values, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeNotIn(List<String> values) {
            addCriterion("redenvelopestype not in", values, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeBetween(String value1, String value2) {
            addCriterion("redenvelopestype between", value1, value2, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopestypeNotBetween(String value1, String value2) {
            addCriterion("redenvelopestype not between", value1, value2, "redenvelopestype");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyIsNull() {
            addCriterion("redenvelopesmoney is null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyIsNotNull() {
            addCriterion("redenvelopesmoney is not null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyEqualTo(Integer value) {
            addCriterion("redenvelopesmoney =", value, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyNotEqualTo(Integer value) {
            addCriterion("redenvelopesmoney <>", value, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyGreaterThan(Integer value) {
            addCriterion("redenvelopesmoney >", value, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("redenvelopesmoney >=", value, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyLessThan(Integer value) {
            addCriterion("redenvelopesmoney <", value, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("redenvelopesmoney <=", value, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyIn(List<Integer> values) {
            addCriterion("redenvelopesmoney in", values, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyNotIn(List<Integer> values) {
            addCriterion("redenvelopesmoney not in", values, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyBetween(Integer value1, Integer value2) {
            addCriterion("redenvelopesmoney between", value1, value2, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("redenvelopesmoney not between", value1, value2, "redenvelopesmoney");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeIsNull() {
            addCriterion("redenvelopesdelinetime is null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeIsNotNull() {
            addCriterion("redenvelopesdelinetime is not null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeEqualTo(Date value) {
            addCriterion("redenvelopesdelinetime =", value, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeNotEqualTo(Date value) {
            addCriterion("redenvelopesdelinetime <>", value, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeGreaterThan(Date value) {
            addCriterion("redenvelopesdelinetime >", value, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("redenvelopesdelinetime >=", value, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeLessThan(Date value) {
            addCriterion("redenvelopesdelinetime <", value, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeLessThanOrEqualTo(Date value) {
            addCriterion("redenvelopesdelinetime <=", value, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeIn(List<Date> values) {
            addCriterion("redenvelopesdelinetime in", values, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeNotIn(List<Date> values) {
            addCriterion("redenvelopesdelinetime not in", values, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeBetween(Date value1, Date value2) {
            addCriterion("redenvelopesdelinetime between", value1, value2, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesdelinetimeNotBetween(Date value1, Date value2) {
            addCriterion("redenvelopesdelinetime not between", value1, value2, "redenvelopesdelinetime");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusIsNull() {
            addCriterion("redenvelopesstatus is null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusIsNotNull() {
            addCriterion("redenvelopesstatus is not null");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusEqualTo(String value) {
            addCriterion("redenvelopesstatus =", value, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusNotEqualTo(String value) {
            addCriterion("redenvelopesstatus <>", value, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusGreaterThan(String value) {
            addCriterion("redenvelopesstatus >", value, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusGreaterThanOrEqualTo(String value) {
            addCriterion("redenvelopesstatus >=", value, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusLessThan(String value) {
            addCriterion("redenvelopesstatus <", value, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusLessThanOrEqualTo(String value) {
            addCriterion("redenvelopesstatus <=", value, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusLike(String value) {
            addCriterion("redenvelopesstatus like", value, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusNotLike(String value) {
            addCriterion("redenvelopesstatus not like", value, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusIn(List<String> values) {
            addCriterion("redenvelopesstatus in", values, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusNotIn(List<String> values) {
            addCriterion("redenvelopesstatus not in", values, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusBetween(String value1, String value2) {
            addCriterion("redenvelopesstatus between", value1, value2, "redenvelopesstatus");
            return (Criteria) this;
        }

        public Criteria andRedenvelopesstatusNotBetween(String value1, String value2) {
            addCriterion("redenvelopesstatus not between", value1, value2, "redenvelopesstatus");
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