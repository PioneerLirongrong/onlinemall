package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinemallGoodsDrinkingExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallGoodsDrinkingExample() {
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

        public Criteria andDrinkingtypeIsNull() {
            addCriterion("drinkingtype is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeIsNotNull() {
            addCriterion("drinkingtype is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeEqualTo(String value) {
            addCriterion("drinkingtype =", value, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeNotEqualTo(String value) {
            addCriterion("drinkingtype <>", value, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeGreaterThan(String value) {
            addCriterion("drinkingtype >", value, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeGreaterThanOrEqualTo(String value) {
            addCriterion("drinkingtype >=", value, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeLessThan(String value) {
            addCriterion("drinkingtype <", value, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeLessThanOrEqualTo(String value) {
            addCriterion("drinkingtype <=", value, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeLike(String value) {
            addCriterion("drinkingtype like", value, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeNotLike(String value) {
            addCriterion("drinkingtype not like", value, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeIn(List<String> values) {
            addCriterion("drinkingtype in", values, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeNotIn(List<String> values) {
            addCriterion("drinkingtype not in", values, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeBetween(String value1, String value2) {
            addCriterion("drinkingtype between", value1, value2, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkingtypeNotBetween(String value1, String value2) {
            addCriterion("drinkingtype not between", value1, value2, "drinkingtype");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandIsNull() {
            addCriterion("drinkbrand is null");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandIsNotNull() {
            addCriterion("drinkbrand is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandEqualTo(String value) {
            addCriterion("drinkbrand =", value, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandNotEqualTo(String value) {
            addCriterion("drinkbrand <>", value, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandGreaterThan(String value) {
            addCriterion("drinkbrand >", value, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandGreaterThanOrEqualTo(String value) {
            addCriterion("drinkbrand >=", value, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandLessThan(String value) {
            addCriterion("drinkbrand <", value, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandLessThanOrEqualTo(String value) {
            addCriterion("drinkbrand <=", value, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandLike(String value) {
            addCriterion("drinkbrand like", value, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandNotLike(String value) {
            addCriterion("drinkbrand not like", value, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandIn(List<String> values) {
            addCriterion("drinkbrand in", values, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandNotIn(List<String> values) {
            addCriterion("drinkbrand not in", values, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandBetween(String value1, String value2) {
            addCriterion("drinkbrand between", value1, value2, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkbrandNotBetween(String value1, String value2) {
            addCriterion("drinkbrand not between", value1, value2, "drinkbrand");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeIsNull() {
            addCriterion("drinkingtsize is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeIsNotNull() {
            addCriterion("drinkingtsize is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeEqualTo(String value) {
            addCriterion("drinkingtsize =", value, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeNotEqualTo(String value) {
            addCriterion("drinkingtsize <>", value, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeGreaterThan(String value) {
            addCriterion("drinkingtsize >", value, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeGreaterThanOrEqualTo(String value) {
            addCriterion("drinkingtsize >=", value, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeLessThan(String value) {
            addCriterion("drinkingtsize <", value, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeLessThanOrEqualTo(String value) {
            addCriterion("drinkingtsize <=", value, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeLike(String value) {
            addCriterion("drinkingtsize like", value, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeNotLike(String value) {
            addCriterion("drinkingtsize not like", value, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeIn(List<String> values) {
            addCriterion("drinkingtsize in", values, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeNotIn(List<String> values) {
            addCriterion("drinkingtsize not in", values, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeBetween(String value1, String value2) {
            addCriterion("drinkingtsize between", value1, value2, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andDrinkingtsizeNotBetween(String value1, String value2) {
            addCriterion("drinkingtsize not between", value1, value2, "drinkingtsize");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeIsNull() {
            addCriterion("alcoholdegree is null");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeIsNotNull() {
            addCriterion("alcoholdegree is not null");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeEqualTo(Integer value) {
            addCriterion("alcoholdegree =", value, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeNotEqualTo(Integer value) {
            addCriterion("alcoholdegree <>", value, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeGreaterThan(Integer value) {
            addCriterion("alcoholdegree >", value, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alcoholdegree >=", value, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeLessThan(Integer value) {
            addCriterion("alcoholdegree <", value, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeLessThanOrEqualTo(Integer value) {
            addCriterion("alcoholdegree <=", value, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeIn(List<Integer> values) {
            addCriterion("alcoholdegree in", values, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeNotIn(List<Integer> values) {
            addCriterion("alcoholdegree not in", values, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeBetween(Integer value1, Integer value2) {
            addCriterion("alcoholdegree between", value1, value2, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andAlcoholdegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("alcoholdegree not between", value1, value2, "alcoholdegree");
            return (Criteria) this;
        }

        public Criteria andSavewayIsNull() {
            addCriterion("saveway is null");
            return (Criteria) this;
        }

        public Criteria andSavewayIsNotNull() {
            addCriterion("saveway is not null");
            return (Criteria) this;
        }

        public Criteria andSavewayEqualTo(String value) {
            addCriterion("saveway =", value, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayNotEqualTo(String value) {
            addCriterion("saveway <>", value, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayGreaterThan(String value) {
            addCriterion("saveway >", value, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayGreaterThanOrEqualTo(String value) {
            addCriterion("saveway >=", value, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayLessThan(String value) {
            addCriterion("saveway <", value, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayLessThanOrEqualTo(String value) {
            addCriterion("saveway <=", value, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayLike(String value) {
            addCriterion("saveway like", value, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayNotLike(String value) {
            addCriterion("saveway not like", value, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayIn(List<String> values) {
            addCriterion("saveway in", values, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayNotIn(List<String> values) {
            addCriterion("saveway not in", values, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayBetween(String value1, String value2) {
            addCriterion("saveway between", value1, value2, "saveway");
            return (Criteria) this;
        }

        public Criteria andSavewayNotBetween(String value1, String value2) {
            addCriterion("saveway not between", value1, value2, "saveway");
            return (Criteria) this;
        }

        public Criteria andDelinetimeIsNull() {
            addCriterion("delinetime is null");
            return (Criteria) this;
        }

        public Criteria andDelinetimeIsNotNull() {
            addCriterion("delinetime is not null");
            return (Criteria) this;
        }

        public Criteria andDelinetimeEqualTo(Integer value) {
            addCriterion("delinetime =", value, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeNotEqualTo(Integer value) {
            addCriterion("delinetime <>", value, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeGreaterThan(Integer value) {
            addCriterion("delinetime >", value, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delinetime >=", value, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeLessThan(Integer value) {
            addCriterion("delinetime <", value, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeLessThanOrEqualTo(Integer value) {
            addCriterion("delinetime <=", value, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeIn(List<Integer> values) {
            addCriterion("delinetime in", values, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeNotIn(List<Integer> values) {
            addCriterion("delinetime not in", values, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeBetween(Integer value1, Integer value2) {
            addCriterion("delinetime between", value1, value2, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDelinetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delinetime not between", value1, value2, "delinetime");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountIsNull() {
            addCriterion("drinkingcount is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountIsNotNull() {
            addCriterion("drinkingcount is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountEqualTo(Integer value) {
            addCriterion("drinkingcount =", value, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountNotEqualTo(Integer value) {
            addCriterion("drinkingcount <>", value, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountGreaterThan(Integer value) {
            addCriterion("drinkingcount >", value, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("drinkingcount >=", value, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountLessThan(Integer value) {
            addCriterion("drinkingcount <", value, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountLessThanOrEqualTo(Integer value) {
            addCriterion("drinkingcount <=", value, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountIn(List<Integer> values) {
            addCriterion("drinkingcount in", values, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountNotIn(List<Integer> values) {
            addCriterion("drinkingcount not in", values, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountBetween(Integer value1, Integer value2) {
            addCriterion("drinkingcount between", value1, value2, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andDrinkingcountNotBetween(Integer value1, Integer value2) {
            addCriterion("drinkingcount not between", value1, value2, "drinkingcount");
            return (Criteria) this;
        }

        public Criteria andPeiliaoIsNull() {
            addCriterion("peiliao is null");
            return (Criteria) this;
        }

        public Criteria andPeiliaoIsNotNull() {
            addCriterion("peiliao is not null");
            return (Criteria) this;
        }

        public Criteria andPeiliaoEqualTo(String value) {
            addCriterion("peiliao =", value, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoNotEqualTo(String value) {
            addCriterion("peiliao <>", value, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoGreaterThan(String value) {
            addCriterion("peiliao >", value, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoGreaterThanOrEqualTo(String value) {
            addCriterion("peiliao >=", value, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoLessThan(String value) {
            addCriterion("peiliao <", value, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoLessThanOrEqualTo(String value) {
            addCriterion("peiliao <=", value, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoLike(String value) {
            addCriterion("peiliao like", value, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoNotLike(String value) {
            addCriterion("peiliao not like", value, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoIn(List<String> values) {
            addCriterion("peiliao in", values, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoNotIn(List<String> values) {
            addCriterion("peiliao not in", values, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoBetween(String value1, String value2) {
            addCriterion("peiliao between", value1, value2, "peiliao");
            return (Criteria) this;
        }

        public Criteria andPeiliaoNotBetween(String value1, String value2) {
            addCriterion("peiliao not between", value1, value2, "peiliao");
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

        public Criteria andUsewayIsNull() {
            addCriterion("useway is null");
            return (Criteria) this;
        }

        public Criteria andUsewayIsNotNull() {
            addCriterion("useway is not null");
            return (Criteria) this;
        }

        public Criteria andUsewayEqualTo(String value) {
            addCriterion("useway =", value, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayNotEqualTo(String value) {
            addCriterion("useway <>", value, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayGreaterThan(String value) {
            addCriterion("useway >", value, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayGreaterThanOrEqualTo(String value) {
            addCriterion("useway >=", value, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayLessThan(String value) {
            addCriterion("useway <", value, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayLessThanOrEqualTo(String value) {
            addCriterion("useway <=", value, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayLike(String value) {
            addCriterion("useway like", value, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayNotLike(String value) {
            addCriterion("useway not like", value, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayIn(List<String> values) {
            addCriterion("useway in", values, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayNotIn(List<String> values) {
            addCriterion("useway not in", values, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayBetween(String value1, String value2) {
            addCriterion("useway between", value1, value2, "useway");
            return (Criteria) this;
        }

        public Criteria andUsewayNotBetween(String value1, String value2) {
            addCriterion("useway not between", value1, value2, "useway");
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