package com.yu.hearttoheart.constant;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 返回码常量
 *
 * @author xiaojie
 */
@Getter
@AllArgsConstructor
public enum StatusConst {
    SUCCESS(20000, "成功"),
    SYSTEM_ERROR(50000, "服务端异常"),
    NOT_LOGIN(40001, "未登录"),
    AUTHORIZED(40003, "无操作权限"),
    ILLEGAL_PARAMETER(40004, "请求参数不合法"),
    LOGIN_FAIL(40005, "用户名或密码不正确"),
    ILLEGAL_TOKEN(40006, "token不合法"),
    ACCOUNT_EXIST(40007, "账号已存在");

    private Integer code;
    private String message;

}
