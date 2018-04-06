package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinemallGoodsStationeryExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallGoodsStationeryExample() {
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

        public Criteria andShopIsNull() {
            addCriterion("shop is null");
            return (Criteria) this;
        }

        public Criteria andShopIsNotNull() {
            addCriterion("shop is not null");
            return (Criteria) this;
        }

        public Criteria andShopEqualTo(String value) {
            addCriterion("shop =", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotEqualTo(String value) {
            addCriterion("shop <>", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopGreaterThan(String value) {
            addCriterion("shop >", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopGreaterThanOrEqualTo(String value) {
            addCriterion("shop >=", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLessThan(String value) {
            addCriterion("shop <", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLessThanOrEqualTo(String value) {
            addCriterion("shop <=", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLike(String value) {
            addCriterion("shop like", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotLike(String value) {
            addCriterion("shop not like", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopIn(List<String> values) {
            addCriterion("shop in", values, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotIn(List<String> values) {
            addCriterion("shop not in", values, "shop");
            return (Criteria) this;
        }

        public Criteria andShopBetween(String value1, String value2) {
            addCriterion("shop between", value1, value2, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotBetween(String value1, String value2) {
            addCriterion("shop not between", value1, value2, "shop");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNull() {
            addCriterion("discountid is null");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNotNull() {
            addCriterion("discountid is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountidEqualTo(String value) {
            addCriterion("discountid =", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotEqualTo(String value) {
            addCriterion("discountid <>", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThan(String value) {
            addCriterion("discountid >", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThanOrEqualTo(String value) {
            addCriterion("discountid >=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThan(String value) {
            addCriterion("discountid <", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThanOrEqualTo(String value) {
            addCriterion("discountid <=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLike(String value) {
            addCriterion("discountid like", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotLike(String value) {
            addCriterion("discountid not like", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidIn(List<String> values) {
            addCriterion("discountid in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotIn(List<String> values) {
            addCriterion("discountid not in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidBetween(String value1, String value2) {
            addCriterion("discountid between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotBetween(String value1, String value2) {
            addCriterion("discountid not between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNull() {
            addCriterion("originalprice is null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNotNull() {
            addCriterion("originalprice is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceEqualTo(Integer value) {
            addCriterion("originalprice =", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotEqualTo(Integer value) {
            addCriterion("originalprice <>", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThan(Integer value) {
            addCriterion("originalprice >", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("originalprice >=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThan(Integer value) {
            addCriterion("originalprice <", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThanOrEqualTo(Integer value) {
            addCriterion("originalprice <=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIn(List<Integer> values) {
            addCriterion("originalprice in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotIn(List<Integer> values) {
            addCriterion("originalprice not in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceBetween(Integer value1, Integer value2) {
            addCriterion("originalprice between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("originalprice not between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceIsNull() {
            addCriterion("discouuntprice is null");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceIsNotNull() {
            addCriterion("discouuntprice is not null");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceEqualTo(Integer value) {
            addCriterion("discouuntprice =", value, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceNotEqualTo(Integer value) {
            addCriterion("discouuntprice <>", value, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceGreaterThan(Integer value) {
            addCriterion("discouuntprice >", value, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("discouuntprice >=", value, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceLessThan(Integer value) {
            addCriterion("discouuntprice <", value, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceLessThanOrEqualTo(Integer value) {
            addCriterion("discouuntprice <=", value, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceIn(List<Integer> values) {
            addCriterion("discouuntprice in", values, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceNotIn(List<Integer> values) {
            addCriterion("discouuntprice not in", values, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceBetween(Integer value1, Integer value2) {
            addCriterion("discouuntprice between", value1, value2, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andDiscouuntpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("discouuntprice not between", value1, value2, "discouuntprice");
            return (Criteria) this;
        }

        public Criteria andSalesmonthIsNull() {
            addCriterion("salesmonth is null");
            return (Criteria) this;
        }

        public Criteria andSalesmonthIsNotNull() {
            addCriterion("salesmonth is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmonthEqualTo(Integer value) {
            addCriterion("salesmonth =", value, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthNotEqualTo(Integer value) {
            addCriterion("salesmonth <>", value, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthGreaterThan(Integer value) {
            addCriterion("salesmonth >", value, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesmonth >=", value, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthLessThan(Integer value) {
            addCriterion("salesmonth <", value, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthLessThanOrEqualTo(Integer value) {
            addCriterion("salesmonth <=", value, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthIn(List<Integer> values) {
            addCriterion("salesmonth in", values, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthNotIn(List<Integer> values) {
            addCriterion("salesmonth not in", values, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthBetween(Integer value1, Integer value2) {
            addCriterion("salesmonth between", value1, value2, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalesmonthNotBetween(Integer value1, Integer value2) {
            addCriterion("salesmonth not between", value1, value2, "salesmonth");
            return (Criteria) this;
        }

        public Criteria andSalescountIsNull() {
            addCriterion("salescount is null");
            return (Criteria) this;
        }

        public Criteria andSalescountIsNotNull() {
            addCriterion("salescount is not null");
            return (Criteria) this;
        }

        public Criteria andSalescountEqualTo(Integer value) {
            addCriterion("salescount =", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountNotEqualTo(Integer value) {
            addCriterion("salescount <>", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountGreaterThan(Integer value) {
            addCriterion("salescount >", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountGreaterThanOrEqualTo(Integer value) {
            addCriterion("salescount >=", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountLessThan(Integer value) {
            addCriterion("salescount <", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountLessThanOrEqualTo(Integer value) {
            addCriterion("salescount <=", value, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountIn(List<Integer> values) {
            addCriterion("salescount in", values, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountNotIn(List<Integer> values) {
            addCriterion("salescount not in", values, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountBetween(Integer value1, Integer value2) {
            addCriterion("salescount between", value1, value2, "salescount");
            return (Criteria) this;
        }

        public Criteria andSalescountNotBetween(Integer value1, Integer value2) {
            addCriterion("salescount not between", value1, value2, "salescount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountIsNull() {
            addCriterion("evaluatecount is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountIsNotNull() {
            addCriterion("evaluatecount is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountEqualTo(Integer value) {
            addCriterion("evaluatecount =", value, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountNotEqualTo(Integer value) {
            addCriterion("evaluatecount <>", value, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountGreaterThan(Integer value) {
            addCriterion("evaluatecount >", value, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluatecount >=", value, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountLessThan(Integer value) {
            addCriterion("evaluatecount <", value, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountLessThanOrEqualTo(Integer value) {
            addCriterion("evaluatecount <=", value, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountIn(List<Integer> values) {
            addCriterion("evaluatecount in", values, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountNotIn(List<Integer> values) {
            addCriterion("evaluatecount not in", values, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountBetween(Integer value1, Integer value2) {
            addCriterion("evaluatecount between", value1, value2, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluatecountNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluatecount not between", value1, value2, "evaluatecount");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentIsNull() {
            addCriterion("evaluateprecent is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentIsNotNull() {
            addCriterion("evaluateprecent is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentEqualTo(String value) {
            addCriterion("evaluateprecent =", value, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentNotEqualTo(String value) {
            addCriterion("evaluateprecent <>", value, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentGreaterThan(String value) {
            addCriterion("evaluateprecent >", value, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluateprecent >=", value, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentLessThan(String value) {
            addCriterion("evaluateprecent <", value, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentLessThanOrEqualTo(String value) {
            addCriterion("evaluateprecent <=", value, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentLike(String value) {
            addCriterion("evaluateprecent like", value, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentNotLike(String value) {
            addCriterion("evaluateprecent not like", value, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentIn(List<String> values) {
            addCriterion("evaluateprecent in", values, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentNotIn(List<String> values) {
            addCriterion("evaluateprecent not in", values, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentBetween(String value1, String value2) {
            addCriterion("evaluateprecent between", value1, value2, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andEvaluateprecentNotBetween(String value1, String value2) {
            addCriterion("evaluateprecent not between", value1, value2, "evaluateprecent");
            return (Criteria) this;
        }

        public Criteria andStationerytypeIsNull() {
            addCriterion("stationerytype is null");
            return (Criteria) this;
        }

        public Criteria andStationerytypeIsNotNull() {
            addCriterion("stationerytype is not null");
            return (Criteria) this;
        }

        public Criteria andStationerytypeEqualTo(String value) {
            addCriterion("stationerytype =", value, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeNotEqualTo(String value) {
            addCriterion("stationerytype <>", value, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeGreaterThan(String value) {
            addCriterion("stationerytype >", value, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeGreaterThanOrEqualTo(String value) {
            addCriterion("stationerytype >=", value, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeLessThan(String value) {
            addCriterion("stationerytype <", value, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeLessThanOrEqualTo(String value) {
            addCriterion("stationerytype <=", value, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeLike(String value) {
            addCriterion("stationerytype like", value, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeNotLike(String value) {
            addCriterion("stationerytype not like", value, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeIn(List<String> values) {
            addCriterion("stationerytype in", values, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeNotIn(List<String> values) {
            addCriterion("stationerytype not in", values, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeBetween(String value1, String value2) {
            addCriterion("stationerytype between", value1, value2, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerytypeNotBetween(String value1, String value2) {
            addCriterion("stationerytype not between", value1, value2, "stationerytype");
            return (Criteria) this;
        }

        public Criteria andStationerypersonIsNull() {
            addCriterion("stationeryperson is null");
            return (Criteria) this;
        }

        public Criteria andStationerypersonIsNotNull() {
            addCriterion("stationeryperson is not null");
            return (Criteria) this;
        }

        public Criteria andStationerypersonEqualTo(String value) {
            addCriterion("stationeryperson =", value, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonNotEqualTo(String value) {
            addCriterion("stationeryperson <>", value, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonGreaterThan(String value) {
            addCriterion("stationeryperson >", value, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonGreaterThanOrEqualTo(String value) {
            addCriterion("stationeryperson >=", value, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonLessThan(String value) {
            addCriterion("stationeryperson <", value, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonLessThanOrEqualTo(String value) {
            addCriterion("stationeryperson <=", value, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonLike(String value) {
            addCriterion("stationeryperson like", value, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonNotLike(String value) {
            addCriterion("stationeryperson not like", value, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonIn(List<String> values) {
            addCriterion("stationeryperson in", values, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonNotIn(List<String> values) {
            addCriterion("stationeryperson not in", values, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonBetween(String value1, String value2) {
            addCriterion("stationeryperson between", value1, value2, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerypersonNotBetween(String value1, String value2) {
            addCriterion("stationeryperson not between", value1, value2, "stationeryperson");
            return (Criteria) this;
        }

        public Criteria andStationerybrandIsNull() {
            addCriterion("stationerybrand is null");
            return (Criteria) this;
        }

        public Criteria andStationerybrandIsNotNull() {
            addCriterion("stationerybrand is not null");
            return (Criteria) this;
        }

        public Criteria andStationerybrandEqualTo(String value) {
            addCriterion("stationerybrand =", value, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandNotEqualTo(String value) {
            addCriterion("stationerybrand <>", value, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandGreaterThan(String value) {
            addCriterion("stationerybrand >", value, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandGreaterThanOrEqualTo(String value) {
            addCriterion("stationerybrand >=", value, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandLessThan(String value) {
            addCriterion("stationerybrand <", value, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandLessThanOrEqualTo(String value) {
            addCriterion("stationerybrand <=", value, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandLike(String value) {
            addCriterion("stationerybrand like", value, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandNotLike(String value) {
            addCriterion("stationerybrand not like", value, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandIn(List<String> values) {
            addCriterion("stationerybrand in", values, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandNotIn(List<String> values) {
            addCriterion("stationerybrand not in", values, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandBetween(String value1, String value2) {
            addCriterion("stationerybrand between", value1, value2, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerybrandNotBetween(String value1, String value2) {
            addCriterion("stationerybrand not between", value1, value2, "stationerybrand");
            return (Criteria) this;
        }

        public Criteria andStationerycountIsNull() {
            addCriterion("stationerycount is null");
            return (Criteria) this;
        }

        public Criteria andStationerycountIsNotNull() {
            addCriterion("stationerycount is not null");
            return (Criteria) this;
        }

        public Criteria andStationerycountEqualTo(String value) {
            addCriterion("stationerycount =", value, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountNotEqualTo(String value) {
            addCriterion("stationerycount <>", value, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountGreaterThan(String value) {
            addCriterion("stationerycount >", value, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountGreaterThanOrEqualTo(String value) {
            addCriterion("stationerycount >=", value, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountLessThan(String value) {
            addCriterion("stationerycount <", value, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountLessThanOrEqualTo(String value) {
            addCriterion("stationerycount <=", value, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountLike(String value) {
            addCriterion("stationerycount like", value, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountNotLike(String value) {
            addCriterion("stationerycount not like", value, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountIn(List<String> values) {
            addCriterion("stationerycount in", values, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountNotIn(List<String> values) {
            addCriterion("stationerycount not in", values, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountBetween(String value1, String value2) {
            addCriterion("stationerycount between", value1, value2, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycountNotBetween(String value1, String value2) {
            addCriterion("stationerycount not between", value1, value2, "stationerycount");
            return (Criteria) this;
        }

        public Criteria andStationerycodeIsNull() {
            addCriterion("stationerycode is null");
            return (Criteria) this;
        }

        public Criteria andStationerycodeIsNotNull() {
            addCriterion("stationerycode is not null");
            return (Criteria) this;
        }

        public Criteria andStationerycodeEqualTo(String value) {
            addCriterion("stationerycode =", value, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeNotEqualTo(String value) {
            addCriterion("stationerycode <>", value, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeGreaterThan(String value) {
            addCriterion("stationerycode >", value, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeGreaterThanOrEqualTo(String value) {
            addCriterion("stationerycode >=", value, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeLessThan(String value) {
            addCriterion("stationerycode <", value, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeLessThanOrEqualTo(String value) {
            addCriterion("stationerycode <=", value, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeLike(String value) {
            addCriterion("stationerycode like", value, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeNotLike(String value) {
            addCriterion("stationerycode not like", value, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeIn(List<String> values) {
            addCriterion("stationerycode in", values, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeNotIn(List<String> values) {
            addCriterion("stationerycode not in", values, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeBetween(String value1, String value2) {
            addCriterion("stationerycode between", value1, value2, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerycodeNotBetween(String value1, String value2) {
            addCriterion("stationerycode not between", value1, value2, "stationerycode");
            return (Criteria) this;
        }

        public Criteria andStationerytimeIsNull() {
            addCriterion("stationerytime is null");
            return (Criteria) this;
        }

        public Criteria andStationerytimeIsNotNull() {
            addCriterion("stationerytime is not null");
            return (Criteria) this;
        }

        public Criteria andStationerytimeEqualTo(Date value) {
            addCriterion("stationerytime =", value, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeNotEqualTo(Date value) {
            addCriterion("stationerytime <>", value, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeGreaterThan(Date value) {
            addCriterion("stationerytime >", value, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stationerytime >=", value, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeLessThan(Date value) {
            addCriterion("stationerytime <", value, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeLessThanOrEqualTo(Date value) {
            addCriterion("stationerytime <=", value, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeIn(List<Date> values) {
            addCriterion("stationerytime in", values, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeNotIn(List<Date> values) {
            addCriterion("stationerytime not in", values, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeBetween(Date value1, Date value2) {
            addCriterion("stationerytime between", value1, value2, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andStationerytimeNotBetween(Date value1, Date value2) {
            addCriterion("stationerytime not between", value1, value2, "stationerytime");
            return (Criteria) this;
        }

        public Criteria andProducttimeIsNull() {
            addCriterion("producttime is null");
            return (Criteria) this;
        }

        public Criteria andProducttimeIsNotNull() {
            addCriterion("producttime is not null");
            return (Criteria) this;
        }

        public Criteria andProducttimeEqualTo(Date value) {
            addCriterion("producttime =", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotEqualTo(Date value) {
            addCriterion("producttime <>", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeGreaterThan(Date value) {
            addCriterion("producttime >", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("producttime >=", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeLessThan(Date value) {
            addCriterion("producttime <", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeLessThanOrEqualTo(Date value) {
            addCriterion("producttime <=", value, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeIn(List<Date> values) {
            addCriterion("producttime in", values, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotIn(List<Date> values) {
            addCriterion("producttime not in", values, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeBetween(Date value1, Date value2) {
            addCriterion("producttime between", value1, value2, "producttime");
            return (Criteria) this;
        }

        public Criteria andProducttimeNotBetween(Date value1, Date value2) {
            addCriterion("producttime not between", value1, value2, "producttime");
            return (Criteria) this;
        }

        public Criteria andProductcompanyIsNull() {
            addCriterion("productcompany is null");
            return (Criteria) this;
        }

        public Criteria andProductcompanyIsNotNull() {
            addCriterion("productcompany is not null");
            return (Criteria) this;
        }

        public Criteria andProductcompanyEqualTo(String value) {
            addCriterion("productcompany =", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyNotEqualTo(String value) {
            addCriterion("productcompany <>", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyGreaterThan(String value) {
            addCriterion("productcompany >", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("productcompany >=", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyLessThan(String value) {
            addCriterion("productcompany <", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyLessThanOrEqualTo(String value) {
            addCriterion("productcompany <=", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyLike(String value) {
            addCriterion("productcompany like", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyNotLike(String value) {
            addCriterion("productcompany not like", value, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyIn(List<String> values) {
            addCriterion("productcompany in", values, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyNotIn(List<String> values) {
            addCriterion("productcompany not in", values, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyBetween(String value1, String value2) {
            addCriterion("productcompany between", value1, value2, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductcompanyNotBetween(String value1, String value2) {
            addCriterion("productcompany not between", value1, value2, "productcompany");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productid like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productid not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductplaceIsNull() {
            addCriterion("productplace is null");
            return (Criteria) this;
        }

        public Criteria andProductplaceIsNotNull() {
            addCriterion("productplace is not null");
            return (Criteria) this;
        }

        public Criteria andProductplaceEqualTo(String value) {
            addCriterion("productplace =", value, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceNotEqualTo(String value) {
            addCriterion("productplace <>", value, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceGreaterThan(String value) {
            addCriterion("productplace >", value, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceGreaterThanOrEqualTo(String value) {
            addCriterion("productplace >=", value, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceLessThan(String value) {
            addCriterion("productplace <", value, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceLessThanOrEqualTo(String value) {
            addCriterion("productplace <=", value, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceLike(String value) {
            addCriterion("productplace like", value, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceNotLike(String value) {
            addCriterion("productplace not like", value, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceIn(List<String> values) {
            addCriterion("productplace in", values, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceNotIn(List<String> values) {
            addCriterion("productplace not in", values, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceBetween(String value1, String value2) {
            addCriterion("productplace between", value1, value2, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductplaceNotBetween(String value1, String value2) {
            addCriterion("productplace not between", value1, value2, "productplace");
            return (Criteria) this;
        }

        public Criteria andProductallowIsNull() {
            addCriterion("productallow is null");
            return (Criteria) this;
        }

        public Criteria andProductallowIsNotNull() {
            addCriterion("productallow is not null");
            return (Criteria) this;
        }

        public Criteria andProductallowEqualTo(String value) {
            addCriterion("productallow =", value, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowNotEqualTo(String value) {
            addCriterion("productallow <>", value, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowGreaterThan(String value) {
            addCriterion("productallow >", value, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowGreaterThanOrEqualTo(String value) {
            addCriterion("productallow >=", value, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowLessThan(String value) {
            addCriterion("productallow <", value, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowLessThanOrEqualTo(String value) {
            addCriterion("productallow <=", value, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowLike(String value) {
            addCriterion("productallow like", value, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowNotLike(String value) {
            addCriterion("productallow not like", value, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowIn(List<String> values) {
            addCriterion("productallow in", values, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowNotIn(List<String> values) {
            addCriterion("productallow not in", values, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowBetween(String value1, String value2) {
            addCriterion("productallow between", value1, value2, "productallow");
            return (Criteria) this;
        }

        public Criteria andProductallowNotBetween(String value1, String value2) {
            addCriterion("productallow not between", value1, value2, "productallow");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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