package com.cyn.common.exception;

/**
 * @author chenyanan
 * @date 2021/2/22
 * Created by chenyanan on 2021/2/22
 */

public enum BizCodeEnum {
    /**
     * 异常错误信息
     */
    UNKNOW_EXCRPTION(10000, "系统位置异常"),

    VAILD_EXCEPTION(10001, "参数格式校验失败");

    private final int  code;
    private final String msg;

    BizCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
