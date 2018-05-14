package com.onlinemall.param.response;

import com.onlinemall.utils.error.Errors;

import java.io.Serializable;
import java.util.Collection;

/**
 * 返回的结果
 * @author lr
 */
public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String SUCCESS = "1";
    public static final String FAIL = "0";
    private long recordsFiltered = 0;
    private String code;
    private String message;
    private String status;
    private Collection<T> dataList;
    private Object dataObj;
    private long timeStamp;
    private Errors errors;

    public long getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public Collection getDataList() {
        return dataList;
    }

    public void setDataList(Collection<T> dataList) {
        this.dataList = dataList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Object getDataObj() {
        return dataObj;
    }

    public void setDataObj(Object dataObj) {
        this.dataObj = dataObj;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "recordsFiltered=" + recordsFiltered +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", dataList=" + dataList +
                ", dataObj=" + dataObj +
                ", timeStamp=" + timeStamp +
                ", errors=" + errors +
                '}';
    }
}
