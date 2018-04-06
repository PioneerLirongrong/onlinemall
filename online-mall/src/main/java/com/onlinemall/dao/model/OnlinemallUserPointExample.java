package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinemallUserPointExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallUserPointExample() {
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

        public Criteria andPointinfodetailIsNull() {
            addCriterion("pointinfodetail is null");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailIsNotNull() {
            addCriterion("pointinfodetail is not null");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailEqualTo(String value) {
            addCriterion("pointinfodetail =", value, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailNotEqualTo(String value) {
            addCriterion("pointinfodetail <>", value, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailGreaterThan(String value) {
            addCriterion("pointinfodetail >", value, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailGreaterThanOrEqualTo(String value) {
            addCriterion("pointinfodetail >=", value, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailLessThan(String value) {
            addCriterion("pointinfodetail <", value, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailLessThanOrEqualTo(String value) {
            addCriterion("pointinfodetail <=", value, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailLike(String value) {
            addCriterion("pointinfodetail like", value, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailNotLike(String value) {
            addCriterion("pointinfodetail not like", value, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailIn(List<String> values) {
            addCriterion("pointinfodetail in", values, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailNotIn(List<String> values) {
            addCriterion("pointinfodetail not in", values, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailBetween(String value1, String value2) {
            addCriterion("pointinfodetail between", value1, value2, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointinfodetailNotBetween(String value1, String value2) {
            addCriterion("pointinfodetail not between", value1, value2, "pointinfodetail");
            return (Criteria) this;
        }

        public Criteria andPointchangeIsNull() {
            addCriterion("pointchange is null");
            return (Criteria) this;
        }

        public Criteria andPointchangeIsNotNull() {
            addCriterion("pointchange is not null");
            return (Criteria) this;
        }

        public Criteria andPointchangeEqualTo(String value) {
            addCriterion("pointchange =", value, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeNotEqualTo(String value) {
            addCriterion("pointchange <>", value, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeGreaterThan(String value) {
            addCriterion("pointchange >", value, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeGreaterThanOrEqualTo(String value) {
            addCriterion("pointchange >=", value, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeLessThan(String value) {
            addCriterion("pointchange <", value, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeLessThanOrEqualTo(String value) {
            addCriterion("pointchange <=", value, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeLike(String value) {
            addCriterion("pointchange like", value, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeNotLike(String value) {
            addCriterion("pointchange not like", value, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeIn(List<String> values) {
            addCriterion("pointchange in", values, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeNotIn(List<String> values) {
            addCriterion("pointchange not in", values, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeBetween(String value1, String value2) {
            addCriterion("pointchange between", value1, value2, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointchangeNotBetween(String value1, String value2) {
            addCriterion("pointchange not between", value1, value2, "pointchange");
            return (Criteria) this;
        }

        public Criteria andPointtypeIsNull() {
            addCriterion("pointtype is null");
            return (Criteria) this;
        }

        public Criteria andPointtypeIsNotNull() {
            addCriterion("pointtype is not null");
            return (Criteria) this;
        }

        public Criteria andPointtypeEqualTo(String value) {
            addCriterion("pointtype =", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeNotEqualTo(String value) {
            addCriterion("pointtype <>", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeGreaterThan(String value) {
            addCriterion("pointtype >", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeGreaterThanOrEqualTo(String value) {
            addCriterion("pointtype >=", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeLessThan(String value) {
            addCriterion("pointtype <", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeLessThanOrEqualTo(String value) {
            addCriterion("pointtype <=", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeLike(String value) {
            addCriterion("pointtype like", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeNotLike(String value) {
            addCriterion("pointtype not like", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeIn(List<String> values) {
            addCriterion("pointtype in", values, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeNotIn(List<String> values) {
            addCriterion("pointtype not in", values, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeBetween(String value1, String value2) {
            addCriterion("pointtype between", value1, value2, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeNotBetween(String value1, String value2) {
            addCriterion("pointtype not between", value1, value2, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtimeIsNull() {
            addCriterion("pointtime is null");
            return (Criteria) this;
        }

        public Criteria andPointtimeIsNotNull() {
            addCriterion("pointtime is not null");
            return (Criteria) this;
        }

        public Criteria andPointtimeEqualTo(Date value) {
            addCriterion("pointtime =", value, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeNotEqualTo(Date value) {
            addCriterion("pointtime <>", value, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeGreaterThan(Date value) {
            addCriterion("pointtime >", value, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pointtime >=", value, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeLessThan(Date value) {
            addCriterion("pointtime <", value, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeLessThanOrEqualTo(Date value) {
            addCriterion("pointtime <=", value, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeIn(List<Date> values) {
            addCriterion("pointtime in", values, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeNotIn(List<Date> values) {
            addCriterion("pointtime not in", values, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeBetween(Date value1, Date value2) {
            addCriterion("pointtime between", value1, value2, "pointtime");
            return (Criteria) this;
        }

        public Criteria andPointtimeNotBetween(Date value1, Date value2) {
            addCriterion("pointtime not between", value1, value2, "pointtime");
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