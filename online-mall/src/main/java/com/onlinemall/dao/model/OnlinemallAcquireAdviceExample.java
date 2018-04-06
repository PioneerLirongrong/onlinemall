package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinemallAcquireAdviceExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallAcquireAdviceExample() {
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

        public Criteria andAcquireadviceflagIsNull() {
            addCriterion("acquireadviceflag is null");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagIsNotNull() {
            addCriterion("acquireadviceflag is not null");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagEqualTo(String value) {
            addCriterion("acquireadviceflag =", value, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagNotEqualTo(String value) {
            addCriterion("acquireadviceflag <>", value, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagGreaterThan(String value) {
            addCriterion("acquireadviceflag >", value, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagGreaterThanOrEqualTo(String value) {
            addCriterion("acquireadviceflag >=", value, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagLessThan(String value) {
            addCriterion("acquireadviceflag <", value, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagLessThanOrEqualTo(String value) {
            addCriterion("acquireadviceflag <=", value, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagLike(String value) {
            addCriterion("acquireadviceflag like", value, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagNotLike(String value) {
            addCriterion("acquireadviceflag not like", value, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagIn(List<String> values) {
            addCriterion("acquireadviceflag in", values, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagNotIn(List<String> values) {
            addCriterion("acquireadviceflag not in", values, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagBetween(String value1, String value2) {
            addCriterion("acquireadviceflag between", value1, value2, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadviceflagNotBetween(String value1, String value2) {
            addCriterion("acquireadviceflag not between", value1, value2, "acquireadviceflag");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeIsNull() {
            addCriterion("acquireadvicetype is null");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeIsNotNull() {
            addCriterion("acquireadvicetype is not null");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeEqualTo(String value) {
            addCriterion("acquireadvicetype =", value, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeNotEqualTo(String value) {
            addCriterion("acquireadvicetype <>", value, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeGreaterThan(String value) {
            addCriterion("acquireadvicetype >", value, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("acquireadvicetype >=", value, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeLessThan(String value) {
            addCriterion("acquireadvicetype <", value, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeLessThanOrEqualTo(String value) {
            addCriterion("acquireadvicetype <=", value, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeLike(String value) {
            addCriterion("acquireadvicetype like", value, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeNotLike(String value) {
            addCriterion("acquireadvicetype not like", value, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeIn(List<String> values) {
            addCriterion("acquireadvicetype in", values, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeNotIn(List<String> values) {
            addCriterion("acquireadvicetype not in", values, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeBetween(String value1, String value2) {
            addCriterion("acquireadvicetype between", value1, value2, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetypeNotBetween(String value1, String value2) {
            addCriterion("acquireadvicetype not between", value1, value2, "acquireadvicetype");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailIsNull() {
            addCriterion("acquireadvicedetail is null");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailIsNotNull() {
            addCriterion("acquireadvicedetail is not null");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailEqualTo(String value) {
            addCriterion("acquireadvicedetail =", value, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailNotEqualTo(String value) {
            addCriterion("acquireadvicedetail <>", value, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailGreaterThan(String value) {
            addCriterion("acquireadvicedetail >", value, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailGreaterThanOrEqualTo(String value) {
            addCriterion("acquireadvicedetail >=", value, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailLessThan(String value) {
            addCriterion("acquireadvicedetail <", value, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailLessThanOrEqualTo(String value) {
            addCriterion("acquireadvicedetail <=", value, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailLike(String value) {
            addCriterion("acquireadvicedetail like", value, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailNotLike(String value) {
            addCriterion("acquireadvicedetail not like", value, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailIn(List<String> values) {
            addCriterion("acquireadvicedetail in", values, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailNotIn(List<String> values) {
            addCriterion("acquireadvicedetail not in", values, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailBetween(String value1, String value2) {
            addCriterion("acquireadvicedetail between", value1, value2, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicedetailNotBetween(String value1, String value2) {
            addCriterion("acquireadvicedetail not between", value1, value2, "acquireadvicedetail");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeIsNull() {
            addCriterion("acquireadvicetime is null");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeIsNotNull() {
            addCriterion("acquireadvicetime is not null");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeEqualTo(Date value) {
            addCriterion("acquireadvicetime =", value, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeNotEqualTo(Date value) {
            addCriterion("acquireadvicetime <>", value, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeGreaterThan(Date value) {
            addCriterion("acquireadvicetime >", value, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("acquireadvicetime >=", value, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeLessThan(Date value) {
            addCriterion("acquireadvicetime <", value, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeLessThanOrEqualTo(Date value) {
            addCriterion("acquireadvicetime <=", value, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeIn(List<Date> values) {
            addCriterion("acquireadvicetime in", values, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeNotIn(List<Date> values) {
            addCriterion("acquireadvicetime not in", values, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeBetween(Date value1, Date value2) {
            addCriterion("acquireadvicetime between", value1, value2, "acquireadvicetime");
            return (Criteria) this;
        }

        public Criteria andAcquireadvicetimeNotBetween(Date value1, Date value2) {
            addCriterion("acquireadvicetime not between", value1, value2, "acquireadvicetime");
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