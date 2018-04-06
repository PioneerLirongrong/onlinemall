package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OnlinemallShopExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallShopExample() {
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

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("shopid like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("shopid not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopname is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopname is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopname =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopname <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopname >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopname >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopname <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopname <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopname like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopname not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopname in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopname not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopname between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopname not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailIsNull() {
            addCriterion("shopinfodetail is null");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailIsNotNull() {
            addCriterion("shopinfodetail is not null");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailEqualTo(String value) {
            addCriterion("shopinfodetail =", value, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailNotEqualTo(String value) {
            addCriterion("shopinfodetail <>", value, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailGreaterThan(String value) {
            addCriterion("shopinfodetail >", value, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailGreaterThanOrEqualTo(String value) {
            addCriterion("shopinfodetail >=", value, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailLessThan(String value) {
            addCriterion("shopinfodetail <", value, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailLessThanOrEqualTo(String value) {
            addCriterion("shopinfodetail <=", value, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailLike(String value) {
            addCriterion("shopinfodetail like", value, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailNotLike(String value) {
            addCriterion("shopinfodetail not like", value, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailIn(List<String> values) {
            addCriterion("shopinfodetail in", values, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailNotIn(List<String> values) {
            addCriterion("shopinfodetail not in", values, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailBetween(String value1, String value2) {
            addCriterion("shopinfodetail between", value1, value2, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopinfodetailNotBetween(String value1, String value2) {
            addCriterion("shopinfodetail not between", value1, value2, "shopinfodetail");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeIsNull() {
            addCriterion("shopservicedegree is null");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeIsNotNull() {
            addCriterion("shopservicedegree is not null");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeEqualTo(String value) {
            addCriterion("shopservicedegree =", value, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeNotEqualTo(String value) {
            addCriterion("shopservicedegree <>", value, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeGreaterThan(String value) {
            addCriterion("shopservicedegree >", value, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeGreaterThanOrEqualTo(String value) {
            addCriterion("shopservicedegree >=", value, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeLessThan(String value) {
            addCriterion("shopservicedegree <", value, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeLessThanOrEqualTo(String value) {
            addCriterion("shopservicedegree <=", value, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeLike(String value) {
            addCriterion("shopservicedegree like", value, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeNotLike(String value) {
            addCriterion("shopservicedegree not like", value, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeIn(List<String> values) {
            addCriterion("shopservicedegree in", values, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeNotIn(List<String> values) {
            addCriterion("shopservicedegree not in", values, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeBetween(String value1, String value2) {
            addCriterion("shopservicedegree between", value1, value2, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShopservicedegreeNotBetween(String value1, String value2) {
            addCriterion("shopservicedegree not between", value1, value2, "shopservicedegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeIsNull() {
            addCriterion("shoplogisticsdegree is null");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeIsNotNull() {
            addCriterion("shoplogisticsdegree is not null");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeEqualTo(String value) {
            addCriterion("shoplogisticsdegree =", value, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeNotEqualTo(String value) {
            addCriterion("shoplogisticsdegree <>", value, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeGreaterThan(String value) {
            addCriterion("shoplogisticsdegree >", value, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("shoplogisticsdegree >=", value, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeLessThan(String value) {
            addCriterion("shoplogisticsdegree <", value, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeLessThanOrEqualTo(String value) {
            addCriterion("shoplogisticsdegree <=", value, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeLike(String value) {
            addCriterion("shoplogisticsdegree like", value, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeNotLike(String value) {
            addCriterion("shoplogisticsdegree not like", value, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeIn(List<String> values) {
            addCriterion("shoplogisticsdegree in", values, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeNotIn(List<String> values) {
            addCriterion("shoplogisticsdegree not in", values, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeBetween(String value1, String value2) {
            addCriterion("shoplogisticsdegree between", value1, value2, "shoplogisticsdegree");
            return (Criteria) this;
        }

        public Criteria andShoplogisticsdegreeNotBetween(String value1, String value2) {
            addCriterion("shoplogisticsdegree not between", value1, value2, "shoplogisticsdegree");
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