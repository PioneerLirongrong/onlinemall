package com.onlinemall.utils.error;

public class Errors {
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

    /**
     * 用户模块
     */
    public final static Errors USER_AREADY_EXIST_ERRPOR = new Errors("1000","用户已经存在");
    public final static Errors USER_MOBILE_PHONE_FORMAT_ERROR= new Errors("1001","用户手机格式错误");
    public final static Errors USER_MAIL_FORMAT_ERROR = new Errors("1002","用户邮箱格式错误");
    public final static Errors USER_MAIL_PASSWORD_FORMAT_ERROR = new Errors("1003","用户密码不一致");
    public final static Errors USER_NOT_EXIST_ERRPOR = new Errors("1004","用户不存在");

}
