package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OnelinemallLogisticsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnelinemallLogisticsExample() {
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

        public Criteria andLogisticsidIsNull() {
            addCriterion("logisticsid is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsidIsNotNull() {
            addCriterion("logisticsid is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsidEqualTo(String value) {
            addCriterion("logisticsid =", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotEqualTo(String value) {
            addCriterion("logisticsid <>", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidGreaterThan(String value) {
            addCriterion("logisticsid >", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsid >=", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidLessThan(String value) {
            addCriterion("logisticsid <", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidLessThanOrEqualTo(String value) {
            addCriterion("logisticsid <=", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidLike(String value) {
            addCriterion("logisticsid like", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotLike(String value) {
            addCriterion("logisticsid not like", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidIn(List<String> values) {
            addCriterion("logisticsid in", values, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotIn(List<String> values) {
            addCriterion("logisticsid not in", values, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidBetween(String value1, String value2) {
            addCriterion("logisticsid between", value1, value2, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotBetween(String value1, String value2) {
            addCriterion("logisticsid not between", value1, value2, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("goodsid like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("goodsid not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsurlIsNull() {
            addCriterion("goodsurl is null");
            return (Criteria) this;
        }

        public Criteria andGoodsurlIsNotNull() {
            addCriterion("goodsurl is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsurlEqualTo(String value) {
            addCriterion("goodsurl =", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlNotEqualTo(String value) {
            addCriterion("goodsurl <>", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlGreaterThan(String value) {
            addCriterion("goodsurl >", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlGreaterThanOrEqualTo(String value) {
            addCriterion("goodsurl >=", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlLessThan(String value) {
            addCriterion("goodsurl <", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlLessThanOrEqualTo(String value) {
            addCriterion("goodsurl <=", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlLike(String value) {
            addCriterion("goodsurl like", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlNotLike(String value) {
            addCriterion("goodsurl not like", value, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlIn(List<String> values) {
            addCriterion("goodsurl in", values, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlNotIn(List<String> values) {
            addCriterion("goodsurl not in", values, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlBetween(String value1, String value2) {
            addCriterion("goodsurl between", value1, value2, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andGoodsurlNotBetween(String value1, String value2) {
            addCriterion("goodsurl not between", value1, value2, "goodsurl");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusIsNull() {
            addCriterion("logisticstatus is null");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusIsNotNull() {
            addCriterion("logisticstatus is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusEqualTo(String value) {
            addCriterion("logisticstatus =", value, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusNotEqualTo(String value) {
            addCriterion("logisticstatus <>", value, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusGreaterThan(String value) {
            addCriterion("logisticstatus >", value, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusGreaterThanOrEqualTo(String value) {
            addCriterion("logisticstatus >=", value, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusLessThan(String value) {
            addCriterion("logisticstatus <", value, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusLessThanOrEqualTo(String value) {
            addCriterion("logisticstatus <=", value, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusLike(String value) {
            addCriterion("logisticstatus like", value, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusNotLike(String value) {
            addCriterion("logisticstatus not like", value, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusIn(List<String> values) {
            addCriterion("logisticstatus in", values, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusNotIn(List<String> values) {
            addCriterion("logisticstatus not in", values, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusBetween(String value1, String value2) {
            addCriterion("logisticstatus between", value1, value2, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticstatusNotBetween(String value1, String value2) {
            addCriterion("logisticstatus not between", value1, value2, "logisticstatus");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyIsNull() {
            addCriterion("logisticscompany is null");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyIsNotNull() {
            addCriterion("logisticscompany is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyEqualTo(String value) {
            addCriterion("logisticscompany =", value, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyNotEqualTo(String value) {
            addCriterion("logisticscompany <>", value, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyGreaterThan(String value) {
            addCriterion("logisticscompany >", value, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logisticscompany >=", value, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyLessThan(String value) {
            addCriterion("logisticscompany <", value, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyLessThanOrEqualTo(String value) {
            addCriterion("logisticscompany <=", value, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyLike(String value) {
            addCriterion("logisticscompany like", value, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyNotLike(String value) {
            addCriterion("logisticscompany not like", value, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyIn(List<String> values) {
            addCriterion("logisticscompany in", values, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyNotIn(List<String> values) {
            addCriterion("logisticscompany not in", values, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyBetween(String value1, String value2) {
            addCriterion("logisticscompany between", value1, value2, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticscompanyNotBetween(String value1, String value2) {
            addCriterion("logisticscompany not between", value1, value2, "logisticscompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneIsNull() {
            addCriterion("logisticsphone is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneIsNotNull() {
            addCriterion("logisticsphone is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneEqualTo(String value) {
            addCriterion("logisticsphone =", value, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneNotEqualTo(String value) {
            addCriterion("logisticsphone <>", value, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneGreaterThan(String value) {
            addCriterion("logisticsphone >", value, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsphone >=", value, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneLessThan(String value) {
            addCriterion("logisticsphone <", value, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneLessThanOrEqualTo(String value) {
            addCriterion("logisticsphone <=", value, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneLike(String value) {
            addCriterion("logisticsphone like", value, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneNotLike(String value) {
            addCriterion("logisticsphone not like", value, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneIn(List<String> values) {
            addCriterion("logisticsphone in", values, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneNotIn(List<String> values) {
            addCriterion("logisticsphone not in", values, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneBetween(String value1, String value2) {
            addCriterion("logisticsphone between", value1, value2, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsphoneNotBetween(String value1, String value2) {
            addCriterion("logisticsphone not between", value1, value2, "logisticsphone");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailIsNull() {
            addCriterion("logisticsinfodetail is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailIsNotNull() {
            addCriterion("logisticsinfodetail is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailEqualTo(String value) {
            addCriterion("logisticsinfodetail =", value, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailNotEqualTo(String value) {
            addCriterion("logisticsinfodetail <>", value, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailGreaterThan(String value) {
            addCriterion("logisticsinfodetail >", value, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsinfodetail >=", value, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailLessThan(String value) {
            addCriterion("logisticsinfodetail <", value, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailLessThanOrEqualTo(String value) {
            addCriterion("logisticsinfodetail <=", value, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailLike(String value) {
            addCriterion("logisticsinfodetail like", value, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailNotLike(String value) {
            addCriterion("logisticsinfodetail not like", value, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailIn(List<String> values) {
            addCriterion("logisticsinfodetail in", values, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailNotIn(List<String> values) {
            addCriterion("logisticsinfodetail not in", values, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailBetween(String value1, String value2) {
            addCriterion("logisticsinfodetail between", value1, value2, "logisticsinfodetail");
            return (Criteria) this;
        }

        public Criteria andLogisticsinfodetailNotBetween(String value1, String value2) {
            addCriterion("logisticsinfodetail not between", value1, value2, "logisticsinfodetail");
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