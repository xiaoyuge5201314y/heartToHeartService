package com.yu.hearttoheart.vo;

import com.yu.hearttoheart.constant.StatusConst;
import lombok.Data;

/**
 * @ClassName Result
 * @Description TODU
 * @Author 吴东宇
 * @Date 2022/6/11 16:25
 * @Version 1.0
 **/

@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = (T) data;
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(StatusConst statusConst) {
        this.code = statusConst.getCode();
        this.message = statusConst.getMessage();
    }

    public Result() {
        this.code = StatusConst.SUCCESS.getCode();
        this.message = StatusConst.SUCCESS.getMessage();
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setData(data);
        return result;
    }

    public static Result fail(StatusConst statusConst) {
        Result result = new Result();
        result.code = statusConst.getCode();
        result.message = statusConst.getMessage();
        return result;
    }
}

