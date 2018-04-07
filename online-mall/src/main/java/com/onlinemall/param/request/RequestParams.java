package com.onlinemall.param.request;

import org.omg.CORBA.ObjectHelper;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 前端的请求参数
 * @param <T>
 * @author lr
 */
public class RequestParams<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Map<String, String> equal = new HashMap<String, String>();
    private Map<String, String> notEqual = new HashMap<String, String>();

    private Map<String,Object> params = new HashMap<String, Object>();

    private List<T> objs;

    private T obj;

    private Map<String, String> like;

    private Map<String, String> startWith;

    private Map<String, String> endWith;

    private String sortName;

    private String orderName = "desc";


    private Map<String,String> isExists;


    /**
     * 每页显示数量
     */
    private int length = 10;
    /**
     * 开始条数
     */
    private int start = 0;
    /**
     * 页数
     */
    private int page = 0;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Map<String, String> getEqual() {
        return equal;
    }

    public void setEqual(Map<String, String> equal) {
        this.equal = equal;
    }

    public Map<String, String> getNotEqual() {
        return notEqual;
    }

    public void setNotEqual(Map<String, String> notEqual) {
        this.notEqual = notEqual;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public List<T> getObjs() {
        return objs;
    }

    public void setObjs(List<T> objs) {
        this.objs = objs;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Map<String, String> getLike() {
        return like;
    }

    public void setLike(Map<String, String> like) {
        this.like = like;
    }

    public Map<String, String> getStartWith() {
        return startWith;
    }

    public void setStartWith(Map<String, String> startWith) {
        this.startWith = startWith;
    }

    public Map<String, String> getEndWith() {
        return endWith;
    }

    public void setEndWith(Map<String, String> endWith) {
        this.endWith = endWith;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Map<String, String> getIsExists() {
        return isExists;
    }

    public void setIsExists(Map<String, String> isExists) {
        this.isExists = isExists;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "RequestParams{" +
                "equal=" + equal +
                ", notEqual=" + notEqual +
                ", params=" + params +
                ", objs=" + objs +
                ", obj=" + obj +
                ", like=" + like +
                ", startWith=" + startWith +
                ", endWith=" + endWith +
                ", sortName='" + sortName + '\'' +
                ", orderName='" + orderName + '\'' +
                ", isExists=" + isExists +
                ", length=" + length +
                ", start=" + start +
                ", page=" + page +
                '}';
    }
}
