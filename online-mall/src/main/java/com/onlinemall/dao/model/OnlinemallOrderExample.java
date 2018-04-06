package com.onlinemall.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OnlinemallOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OnlinemallOrderExample() {
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

        public Criteria andOrdertypeIsNull() {
            addCriterion("ordertype is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("ordertype is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(String value) {
            addCriterion("ordertype =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(String value) {
            addCriterion("ordertype <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(String value) {
            addCriterion("ordertype >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(String value) {
            addCriterion("ordertype >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(String value) {
            addCriterion("ordertype <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(String value) {
            addCriterion("ordertype <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLike(String value) {
            addCriterion("ordertype like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotLike(String value) {
            addCriterion("ordertype not like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<String> values) {
            addCriterion("ordertype in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<String> values) {
            addCriterion("ordertype not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(String value1, String value2) {
            addCriterion("ordertype between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(String value1, String value2) {
            addCriterion("ordertype not between", value1, value2, "ordertype");
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

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(String value) {
            addCriterion("goodsprice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(String value) {
            addCriterion("goodsprice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(String value) {
            addCriterion("goodsprice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(String value) {
            addCriterion("goodsprice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(String value) {
            addCriterion("goodsprice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(String value) {
            addCriterion("goodsprice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLike(String value) {
            addCriterion("goodsprice like", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotLike(String value) {
            addCriterion("goodsprice not like", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<String> values) {
            addCriterion("goodsprice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<String> values) {
            addCriterion("goodsprice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(String value1, String value2) {
            addCriterion("goodsprice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(String value1, String value2) {
            addCriterion("goodsprice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodscountIsNull() {
            addCriterion("goodscount is null");
            return (Criteria) this;
        }

        public Criteria andGoodscountIsNotNull() {
            addCriterion("goodscount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscountEqualTo(Integer value) {
            addCriterion("goodscount =", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotEqualTo(Integer value) {
            addCriterion("goodscount <>", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountGreaterThan(Integer value) {
            addCriterion("goodscount >", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodscount >=", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountLessThan(Integer value) {
            addCriterion("goodscount <", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountLessThanOrEqualTo(Integer value) {
            addCriterion("goodscount <=", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountIn(List<Integer> values) {
            addCriterion("goodscount in", values, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotIn(List<Integer> values) {
            addCriterion("goodscount not in", values, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountBetween(Integer value1, Integer value2) {
            addCriterion("goodscount between", value1, value2, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodscount not between", value1, value2, "goodscount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountIsNull() {
            addCriterion("ordertotalamount is null");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountIsNotNull() {
            addCriterion("ordertotalamount is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountEqualTo(String value) {
            addCriterion("ordertotalamount =", value, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountNotEqualTo(String value) {
            addCriterion("ordertotalamount <>", value, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountGreaterThan(String value) {
            addCriterion("ordertotalamount >", value, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountGreaterThanOrEqualTo(String value) {
            addCriterion("ordertotalamount >=", value, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountLessThan(String value) {
            addCriterion("ordertotalamount <", value, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountLessThanOrEqualTo(String value) {
            addCriterion("ordertotalamount <=", value, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountLike(String value) {
            addCriterion("ordertotalamount like", value, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountNotLike(String value) {
            addCriterion("ordertotalamount not like", value, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountIn(List<String> values) {
            addCriterion("ordertotalamount in", values, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountNotIn(List<String> values) {
            addCriterion("ordertotalamount not in", values, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountBetween(String value1, String value2) {
            addCriterion("ordertotalamount between", value1, value2, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrdertotalamountNotBetween(String value1, String value2) {
            addCriterion("ordertotalamount not between", value1, value2, "ordertotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountIsNull() {
            addCriterion("orderwuliutotalamount is null");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountIsNotNull() {
            addCriterion("orderwuliutotalamount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountEqualTo(String value) {
            addCriterion("orderwuliutotalamount =", value, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountNotEqualTo(String value) {
            addCriterion("orderwuliutotalamount <>", value, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountGreaterThan(String value) {
            addCriterion("orderwuliutotalamount >", value, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountGreaterThanOrEqualTo(String value) {
            addCriterion("orderwuliutotalamount >=", value, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountLessThan(String value) {
            addCriterion("orderwuliutotalamount <", value, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountLessThanOrEqualTo(String value) {
            addCriterion("orderwuliutotalamount <=", value, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountLike(String value) {
            addCriterion("orderwuliutotalamount like", value, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountNotLike(String value) {
            addCriterion("orderwuliutotalamount not like", value, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountIn(List<String> values) {
            addCriterion("orderwuliutotalamount in", values, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountNotIn(List<String> values) {
            addCriterion("orderwuliutotalamount not in", values, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountBetween(String value1, String value2) {
            addCriterion("orderwuliutotalamount between", value1, value2, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andOrderwuliutotalamountNotBetween(String value1, String value2) {
            addCriterion("orderwuliutotalamount not between", value1, value2, "orderwuliutotalamount");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateIsNull() {
            addCriterion("goodsoperate is null");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateIsNotNull() {
            addCriterion("goodsoperate is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateEqualTo(String value) {
            addCriterion("goodsoperate =", value, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateNotEqualTo(String value) {
            addCriterion("goodsoperate <>", value, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateGreaterThan(String value) {
            addCriterion("goodsoperate >", value, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateGreaterThanOrEqualTo(String value) {
            addCriterion("goodsoperate >=", value, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateLessThan(String value) {
            addCriterion("goodsoperate <", value, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateLessThanOrEqualTo(String value) {
            addCriterion("goodsoperate <=", value, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateLike(String value) {
            addCriterion("goodsoperate like", value, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateNotLike(String value) {
            addCriterion("goodsoperate not like", value, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateIn(List<String> values) {
            addCriterion("goodsoperate in", values, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateNotIn(List<String> values) {
            addCriterion("goodsoperate not in", values, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateBetween(String value1, String value2) {
            addCriterion("goodsoperate between", value1, value2, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andGoodsoperateNotBetween(String value1, String value2) {
            addCriterion("goodsoperate not between", value1, value2, "goodsoperate");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("ordertime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ordertime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("ordertime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("ordertime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("ordertime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ordertime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("ordertime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("ordertime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("ordertime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("ordertime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("ordertime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("ordertime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrderaddressIsNull() {
            addCriterion("orderaddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderaddressIsNotNull() {
            addCriterion("orderaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderaddressEqualTo(String value) {
            addCriterion("orderaddress =", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressNotEqualTo(String value) {
            addCriterion("orderaddress <>", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressGreaterThan(String value) {
            addCriterion("orderaddress >", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressGreaterThanOrEqualTo(String value) {
            addCriterion("orderaddress >=", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressLessThan(String value) {
            addCriterion("orderaddress <", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressLessThanOrEqualTo(String value) {
            addCriterion("orderaddress <=", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressLike(String value) {
            addCriterion("orderaddress like", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressNotLike(String value) {
            addCriterion("orderaddress not like", value, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressIn(List<String> values) {
            addCriterion("orderaddress in", values, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressNotIn(List<String> values) {
            addCriterion("orderaddress not in", values, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressBetween(String value1, String value2) {
            addCriterion("orderaddress between", value1, value2, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderaddressNotBetween(String value1, String value2) {
            addCriterion("orderaddress not between", value1, value2, "orderaddress");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderstatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(String value) {
            addCriterion("orderstatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(String value) {
            addCriterion("orderstatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(String value) {
            addCriterion("orderstatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderstatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(String value) {
            addCriterion("orderstatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(String value) {
            addCriterion("orderstatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLike(String value) {
            addCriterion("orderstatus like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotLike(String value) {
            addCriterion("orderstatus not like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<String> values) {
            addCriterion("orderstatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<String> values) {
            addCriterion("orderstatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(String value1, String value2) {
            addCriterion("orderstatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(String value1, String value2) {
            addCriterion("orderstatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeIsNull() {
            addCriterion("goodsreturntime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeIsNotNull() {
            addCriterion("goodsreturntime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeEqualTo(Date value) {
            addCriterion("goodsreturntime =", value, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeNotEqualTo(Date value) {
            addCriterion("goodsreturntime <>", value, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeGreaterThan(Date value) {
            addCriterion("goodsreturntime >", value, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goodsreturntime >=", value, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeLessThan(Date value) {
            addCriterion("goodsreturntime <", value, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeLessThanOrEqualTo(Date value) {
            addCriterion("goodsreturntime <=", value, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeIn(List<Date> values) {
            addCriterion("goodsreturntime in", values, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeNotIn(List<Date> values) {
            addCriterion("goodsreturntime not in", values, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeBetween(Date value1, Date value2) {
            addCriterion("goodsreturntime between", value1, value2, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturntimeNotBetween(Date value1, Date value2) {
            addCriterion("goodsreturntime not between", value1, value2, "goodsreturntime");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberIsNull() {
            addCriterion("goodsreturnnumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberIsNotNull() {
            addCriterion("goodsreturnnumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberEqualTo(String value) {
            addCriterion("goodsreturnnumber =", value, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberNotEqualTo(String value) {
            addCriterion("goodsreturnnumber <>", value, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberGreaterThan(String value) {
            addCriterion("goodsreturnnumber >", value, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberGreaterThanOrEqualTo(String value) {
            addCriterion("goodsreturnnumber >=", value, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberLessThan(String value) {
            addCriterion("goodsreturnnumber <", value, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberLessThanOrEqualTo(String value) {
            addCriterion("goodsreturnnumber <=", value, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberLike(String value) {
            addCriterion("goodsreturnnumber like", value, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberNotLike(String value) {
            addCriterion("goodsreturnnumber not like", value, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberIn(List<String> values) {
            addCriterion("goodsreturnnumber in", values, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberNotIn(List<String> values) {
            addCriterion("goodsreturnnumber not in", values, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberBetween(String value1, String value2) {
            addCriterion("goodsreturnnumber between", value1, value2, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnnumberNotBetween(String value1, String value2) {
            addCriterion("goodsreturnnumber not between", value1, value2, "goodsreturnnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusIsNull() {
            addCriterion("goodsreturnstatus is null");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusIsNotNull() {
            addCriterion("goodsreturnstatus is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusEqualTo(String value) {
            addCriterion("goodsreturnstatus =", value, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusNotEqualTo(String value) {
            addCriterion("goodsreturnstatus <>", value, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusGreaterThan(String value) {
            addCriterion("goodsreturnstatus >", value, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusGreaterThanOrEqualTo(String value) {
            addCriterion("goodsreturnstatus >=", value, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusLessThan(String value) {
            addCriterion("goodsreturnstatus <", value, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusLessThanOrEqualTo(String value) {
            addCriterion("goodsreturnstatus <=", value, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusLike(String value) {
            addCriterion("goodsreturnstatus like", value, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusNotLike(String value) {
            addCriterion("goodsreturnstatus not like", value, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusIn(List<String> values) {
            addCriterion("goodsreturnstatus in", values, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusNotIn(List<String> values) {
            addCriterion("goodsreturnstatus not in", values, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusBetween(String value1, String value2) {
            addCriterion("goodsreturnstatus between", value1, value2, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsreturnstatusNotBetween(String value1, String value2) {
            addCriterion("goodsreturnstatus not between", value1, value2, "goodsreturnstatus");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeIsNull() {
            addCriterion("ordercreatetime is null");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeIsNotNull() {
            addCriterion("ordercreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeEqualTo(Date value) {
            addCriterion("ordercreatetime =", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotEqualTo(Date value) {
            addCriterion("ordercreatetime <>", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeGreaterThan(Date value) {
            addCriterion("ordercreatetime >", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ordercreatetime >=", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeLessThan(Date value) {
            addCriterion("ordercreatetime <", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ordercreatetime <=", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeIn(List<Date> values) {
            addCriterion("ordercreatetime in", values, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotIn(List<Date> values) {
            addCriterion("ordercreatetime not in", values, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeBetween(Date value1, Date value2) {
            addCriterion("ordercreatetime between", value1, value2, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ordercreatetime not between", value1, value2, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeIsNull() {
            addCriterion("orderpaytime is null");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeIsNotNull() {
            addCriterion("orderpaytime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeEqualTo(Date value) {
            addCriterion("orderpaytime =", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeNotEqualTo(Date value) {
            addCriterion("orderpaytime <>", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeGreaterThan(Date value) {
            addCriterion("orderpaytime >", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderpaytime >=", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeLessThan(Date value) {
            addCriterion("orderpaytime <", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeLessThanOrEqualTo(Date value) {
            addCriterion("orderpaytime <=", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeIn(List<Date> values) {
            addCriterion("orderpaytime in", values, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeNotIn(List<Date> values) {
            addCriterion("orderpaytime not in", values, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeBetween(Date value1, Date value2) {
            addCriterion("orderpaytime between", value1, value2, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeNotBetween(Date value1, Date value2) {
            addCriterion("orderpaytime not between", value1, value2, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeIsNull() {
            addCriterion("orderchengjiaotime is null");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeIsNotNull() {
            addCriterion("orderchengjiaotime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeEqualTo(Date value) {
            addCriterion("orderchengjiaotime =", value, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeNotEqualTo(Date value) {
            addCriterion("orderchengjiaotime <>", value, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeGreaterThan(Date value) {
            addCriterion("orderchengjiaotime >", value, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderchengjiaotime >=", value, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeLessThan(Date value) {
            addCriterion("orderchengjiaotime <", value, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeLessThanOrEqualTo(Date value) {
            addCriterion("orderchengjiaotime <=", value, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeIn(List<Date> values) {
            addCriterion("orderchengjiaotime in", values, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeNotIn(List<Date> values) {
            addCriterion("orderchengjiaotime not in", values, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeBetween(Date value1, Date value2) {
            addCriterion("orderchengjiaotime between", value1, value2, "orderchengjiaotime");
            return (Criteria) this;
        }

        public Criteria andOrderchengjiaotimeNotBetween(Date value1, Date value2) {
            addCriterion("orderchengjiaotime not between", value1, value2, "orderchengjiaotime");
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