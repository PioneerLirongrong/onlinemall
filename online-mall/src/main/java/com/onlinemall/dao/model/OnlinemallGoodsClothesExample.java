package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinemallGoodsClothesExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallGoodsClothesExample() {
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

        public Criteria andClothestypeIsNull() {
            addCriterion("clothestype is null");
            return (Criteria) this;
        }

        public Criteria andClothestypeIsNotNull() {
            addCriterion("clothestype is not null");
            return (Criteria) this;
        }

        public Criteria andClothestypeEqualTo(String value) {
            addCriterion("clothestype =", value, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeNotEqualTo(String value) {
            addCriterion("clothestype <>", value, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeGreaterThan(String value) {
            addCriterion("clothestype >", value, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeGreaterThanOrEqualTo(String value) {
            addCriterion("clothestype >=", value, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeLessThan(String value) {
            addCriterion("clothestype <", value, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeLessThanOrEqualTo(String value) {
            addCriterion("clothestype <=", value, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeLike(String value) {
            addCriterion("clothestype like", value, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeNotLike(String value) {
            addCriterion("clothestype not like", value, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeIn(List<String> values) {
            addCriterion("clothestype in", values, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeNotIn(List<String> values) {
            addCriterion("clothestype not in", values, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeBetween(String value1, String value2) {
            addCriterion("clothestype between", value1, value2, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothestypeNotBetween(String value1, String value2) {
            addCriterion("clothestype not between", value1, value2, "clothestype");
            return (Criteria) this;
        }

        public Criteria andClothessexIsNull() {
            addCriterion("clothessex is null");
            return (Criteria) this;
        }

        public Criteria andClothessexIsNotNull() {
            addCriterion("clothessex is not null");
            return (Criteria) this;
        }

        public Criteria andClothessexEqualTo(String value) {
            addCriterion("clothessex =", value, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexNotEqualTo(String value) {
            addCriterion("clothessex <>", value, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexGreaterThan(String value) {
            addCriterion("clothessex >", value, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexGreaterThanOrEqualTo(String value) {
            addCriterion("clothessex >=", value, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexLessThan(String value) {
            addCriterion("clothessex <", value, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexLessThanOrEqualTo(String value) {
            addCriterion("clothessex <=", value, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexLike(String value) {
            addCriterion("clothessex like", value, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexNotLike(String value) {
            addCriterion("clothessex not like", value, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexIn(List<String> values) {
            addCriterion("clothessex in", values, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexNotIn(List<String> values) {
            addCriterion("clothessex not in", values, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexBetween(String value1, String value2) {
            addCriterion("clothessex between", value1, value2, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothessexNotBetween(String value1, String value2) {
            addCriterion("clothessex not between", value1, value2, "clothessex");
            return (Criteria) this;
        }

        public Criteria andClothespersonIsNull() {
            addCriterion("clothesperson is null");
            return (Criteria) this;
        }

        public Criteria andClothespersonIsNotNull() {
            addCriterion("clothesperson is not null");
            return (Criteria) this;
        }

        public Criteria andClothespersonEqualTo(String value) {
            addCriterion("clothesperson =", value, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonNotEqualTo(String value) {
            addCriterion("clothesperson <>", value, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonGreaterThan(String value) {
            addCriterion("clothesperson >", value, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonGreaterThanOrEqualTo(String value) {
            addCriterion("clothesperson >=", value, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonLessThan(String value) {
            addCriterion("clothesperson <", value, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonLessThanOrEqualTo(String value) {
            addCriterion("clothesperson <=", value, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonLike(String value) {
            addCriterion("clothesperson like", value, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonNotLike(String value) {
            addCriterion("clothesperson not like", value, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonIn(List<String> values) {
            addCriterion("clothesperson in", values, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonNotIn(List<String> values) {
            addCriterion("clothesperson not in", values, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonBetween(String value1, String value2) {
            addCriterion("clothesperson between", value1, value2, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothespersonNotBetween(String value1, String value2) {
            addCriterion("clothesperson not between", value1, value2, "clothesperson");
            return (Criteria) this;
        }

        public Criteria andClothescolorIsNull() {
            addCriterion("clothescolor is null");
            return (Criteria) this;
        }

        public Criteria andClothescolorIsNotNull() {
            addCriterion("clothescolor is not null");
            return (Criteria) this;
        }

        public Criteria andClothescolorEqualTo(String value) {
            addCriterion("clothescolor =", value, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorNotEqualTo(String value) {
            addCriterion("clothescolor <>", value, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorGreaterThan(String value) {
            addCriterion("clothescolor >", value, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorGreaterThanOrEqualTo(String value) {
            addCriterion("clothescolor >=", value, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorLessThan(String value) {
            addCriterion("clothescolor <", value, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorLessThanOrEqualTo(String value) {
            addCriterion("clothescolor <=", value, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorLike(String value) {
            addCriterion("clothescolor like", value, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorNotLike(String value) {
            addCriterion("clothescolor not like", value, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorIn(List<String> values) {
            addCriterion("clothescolor in", values, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorNotIn(List<String> values) {
            addCriterion("clothescolor not in", values, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorBetween(String value1, String value2) {
            addCriterion("clothescolor between", value1, value2, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothescolorNotBetween(String value1, String value2) {
            addCriterion("clothescolor not between", value1, value2, "clothescolor");
            return (Criteria) this;
        }

        public Criteria andClothessizeIsNull() {
            addCriterion("clothessize is null");
            return (Criteria) this;
        }

        public Criteria andClothessizeIsNotNull() {
            addCriterion("clothessize is not null");
            return (Criteria) this;
        }

        public Criteria andClothessizeEqualTo(String value) {
            addCriterion("clothessize =", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeNotEqualTo(String value) {
            addCriterion("clothessize <>", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeGreaterThan(String value) {
            addCriterion("clothessize >", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeGreaterThanOrEqualTo(String value) {
            addCriterion("clothessize >=", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeLessThan(String value) {
            addCriterion("clothessize <", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeLessThanOrEqualTo(String value) {
            addCriterion("clothessize <=", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeLike(String value) {
            addCriterion("clothessize like", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeNotLike(String value) {
            addCriterion("clothessize not like", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeIn(List<String> values) {
            addCriterion("clothessize in", values, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeNotIn(List<String> values) {
            addCriterion("clothessize not in", values, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeBetween(String value1, String value2) {
            addCriterion("clothessize between", value1, value2, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeNotBetween(String value1, String value2) {
            addCriterion("clothessize not between", value1, value2, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothesbrandIsNull() {
            addCriterion("clothesbrand is null");
            return (Criteria) this;
        }

        public Criteria andClothesbrandIsNotNull() {
            addCriterion("clothesbrand is not null");
            return (Criteria) this;
        }

        public Criteria andClothesbrandEqualTo(String value) {
            addCriterion("clothesbrand =", value, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandNotEqualTo(String value) {
            addCriterion("clothesbrand <>", value, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandGreaterThan(String value) {
            addCriterion("clothesbrand >", value, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandGreaterThanOrEqualTo(String value) {
            addCriterion("clothesbrand >=", value, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandLessThan(String value) {
            addCriterion("clothesbrand <", value, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandLessThanOrEqualTo(String value) {
            addCriterion("clothesbrand <=", value, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandLike(String value) {
            addCriterion("clothesbrand like", value, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandNotLike(String value) {
            addCriterion("clothesbrand not like", value, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandIn(List<String> values) {
            addCriterion("clothesbrand in", values, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandNotIn(List<String> values) {
            addCriterion("clothesbrand not in", values, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandBetween(String value1, String value2) {
            addCriterion("clothesbrand between", value1, value2, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothesbrandNotBetween(String value1, String value2) {
            addCriterion("clothesbrand not between", value1, value2, "clothesbrand");
            return (Criteria) this;
        }

        public Criteria andClothescountIsNull() {
            addCriterion("clothescount is null");
            return (Criteria) this;
        }

        public Criteria andClothescountIsNotNull() {
            addCriterion("clothescount is not null");
            return (Criteria) this;
        }

        public Criteria andClothescountEqualTo(String value) {
            addCriterion("clothescount =", value, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountNotEqualTo(String value) {
            addCriterion("clothescount <>", value, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountGreaterThan(String value) {
            addCriterion("clothescount >", value, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountGreaterThanOrEqualTo(String value) {
            addCriterion("clothescount >=", value, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountLessThan(String value) {
            addCriterion("clothescount <", value, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountLessThanOrEqualTo(String value) {
            addCriterion("clothescount <=", value, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountLike(String value) {
            addCriterion("clothescount like", value, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountNotLike(String value) {
            addCriterion("clothescount not like", value, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountIn(List<String> values) {
            addCriterion("clothescount in", values, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountNotIn(List<String> values) {
            addCriterion("clothescount not in", values, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountBetween(String value1, String value2) {
            addCriterion("clothescount between", value1, value2, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothescountNotBetween(String value1, String value2) {
            addCriterion("clothescount not between", value1, value2, "clothescount");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoIsNull() {
            addCriterion("clothesmianliao is null");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoIsNotNull() {
            addCriterion("clothesmianliao is not null");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoEqualTo(String value) {
            addCriterion("clothesmianliao =", value, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoNotEqualTo(String value) {
            addCriterion("clothesmianliao <>", value, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoGreaterThan(String value) {
            addCriterion("clothesmianliao >", value, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoGreaterThanOrEqualTo(String value) {
            addCriterion("clothesmianliao >=", value, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoLessThan(String value) {
            addCriterion("clothesmianliao <", value, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoLessThanOrEqualTo(String value) {
            addCriterion("clothesmianliao <=", value, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoLike(String value) {
            addCriterion("clothesmianliao like", value, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoNotLike(String value) {
            addCriterion("clothesmianliao not like", value, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoIn(List<String> values) {
            addCriterion("clothesmianliao in", values, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoNotIn(List<String> values) {
            addCriterion("clothesmianliao not in", values, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoBetween(String value1, String value2) {
            addCriterion("clothesmianliao between", value1, value2, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothesmianliaoNotBetween(String value1, String value2) {
            addCriterion("clothesmianliao not between", value1, value2, "clothesmianliao");
            return (Criteria) this;
        }

        public Criteria andClothercodeIsNull() {
            addCriterion("clothercode is null");
            return (Criteria) this;
        }

        public Criteria andClothercodeIsNotNull() {
            addCriterion("clothercode is not null");
            return (Criteria) this;
        }

        public Criteria andClothercodeEqualTo(String value) {
            addCriterion("clothercode =", value, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeNotEqualTo(String value) {
            addCriterion("clothercode <>", value, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeGreaterThan(String value) {
            addCriterion("clothercode >", value, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeGreaterThanOrEqualTo(String value) {
            addCriterion("clothercode >=", value, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeLessThan(String value) {
            addCriterion("clothercode <", value, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeLessThanOrEqualTo(String value) {
            addCriterion("clothercode <=", value, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeLike(String value) {
            addCriterion("clothercode like", value, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeNotLike(String value) {
            addCriterion("clothercode not like", value, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeIn(List<String> values) {
            addCriterion("clothercode in", values, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeNotIn(List<String> values) {
            addCriterion("clothercode not in", values, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeBetween(String value1, String value2) {
            addCriterion("clothercode between", value1, value2, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothercodeNotBetween(String value1, String value2) {
            addCriterion("clothercode not between", value1, value2, "clothercode");
            return (Criteria) this;
        }

        public Criteria andClothesertimeIsNull() {
            addCriterion("clothesertime is null");
            return (Criteria) this;
        }

        public Criteria andClothesertimeIsNotNull() {
            addCriterion("clothesertime is not null");
            return (Criteria) this;
        }

        public Criteria andClothesertimeEqualTo(Date value) {
            addCriterion("clothesertime =", value, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeNotEqualTo(Date value) {
            addCriterion("clothesertime <>", value, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeGreaterThan(Date value) {
            addCriterion("clothesertime >", value, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("clothesertime >=", value, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeLessThan(Date value) {
            addCriterion("clothesertime <", value, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeLessThanOrEqualTo(Date value) {
            addCriterion("clothesertime <=", value, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeIn(List<Date> values) {
            addCriterion("clothesertime in", values, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeNotIn(List<Date> values) {
            addCriterion("clothesertime not in", values, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeBetween(Date value1, Date value2) {
            addCriterion("clothesertime between", value1, value2, "clothesertime");
            return (Criteria) this;
        }

        public Criteria andClothesertimeNotBetween(Date value1, Date value2) {
            addCriterion("clothesertime not between", value1, value2, "clothesertime");
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