package com.brave.solid.common.dto;

import lombok.Data;

/**
 * @author csj
 */
@Data
public class ActionResult {

    private Integer code;
    private String message;
    private Object data;
    private static final int SUCCESS_CODE = 200;
    private static final int FAILURE_CODE = 500;
    private static final int FAILURE_EXCEPTION_CODE = 506;

    public ActionResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ActionResult success(String message, Object data){
        ActionResult actionResult = new ActionResult(SUCCESS_CODE,message);
        actionResult.setData(data);
        return actionResult;
    }

    public static ActionResult fail(String message, Object data){
        ActionResult actionResult = new ActionResult(FAILURE_CODE,message);
        actionResult.setData(data);
        return actionResult;
    }

/*    public static ActionResult exceptionFail(String msg){
        ActionResult actionResult = new ActionResult();
        actionResult.setCode(FAILURE_EXCEPTION_CODE);
        actionResult.setMessage(msg);
        actionResult.setData(null);
        return actionResult;
    }

    public static ActionResult bizReturn(String msg,Integer errorCode,Object data){
        ActionResult actionResult = new ActionResult();
        actionResult.setCode(errorCode);
        actionResult.setMessage(msg);
        actionResult.setData(data);
        return actionResult;
    }*/
}
