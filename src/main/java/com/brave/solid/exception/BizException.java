package com.brave.solid.exception;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description
 * @createTime 2020年10月21日 18:58:00
 */
public class BizException extends RuntimeException {
    private String msg;
    private Long code;

    public BizException(String msg){
        super(msg);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(String msg,Long code){
        super(msg);
        this.code = code;
    }

    public Long getCode(){
        return code;
    }
}

