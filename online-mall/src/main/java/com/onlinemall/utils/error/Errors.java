package com.onlinemall.utils.error;

import java.io.Serializable;

/**
 * @author lrr
 */
public class Errors implements Serializable {
    private String errorCode;
    private String errorContent;

    public Errors(String errorCode, String errorContent) {
        this.errorCode = errorCode;
        this.errorContent = errorContent;
    }

    /**
     * 公共模块
     */
    public final static Errors REQUEST_PARAM_ERROR = new Errors("6002","参数不合法");
    public final static Errors SERVICE_DELETE_ERROR = new Errors("6004","删除失败");

    /**
     * 用户模块
     */
    public final static Errors USER_AREADY_EXIST_ERRPOR = new Errors("1000","用户已经存在");
    public final static Errors USER_MOBILE_PHONE_FORMAT_ERROR= new Errors("1001","用户手机格式错误");
    public final static Errors USER_MAIL_FORMAT_ERROR = new Errors("1002","用户邮箱格式错误");
    public final static Errors USER_MAIL_PASSWORD_FORMAT_ERROR = new Errors("1003","用户密码不一致");
    public final static Errors USER_NOT_EXIST_ERRPOR = new Errors("1004","用户不存在");
    public final static Errors USER_NOT_LOGIN = new Errors("1005","用户可能不存在或未登录过");
    public final static Errors USER_UPDATE_ERROR = new Errors("1006","用户更新失败");


    /**
     * 用户银行卡模块
     */
    public final static Errors USER_BANK_CARD_ALREADY_BIND = new Errors("2000","银行卡已经被绑定了");


    /**
     * 用户地址模块
     */
    public final static Errors USER_ADDRESS_NOT_EXITS = new Errors("3000","地址不存在");

}

