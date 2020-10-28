package com.brave.solid.exception;

import com.brave.solid.common.ActionResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description
 * @createTime 2020年10月21日 19:00:00
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = BizException.class)
    public ActionResult handle(BizException e) {
/*        if (e.getCode() == null) {
            return ActionResult.exceptionFail(e.getMessage());
        } else {
            return ActionResult.bizReturn(e.getMessage(), e.getCode().intValue(), null);
        }*/
return null;
    }

}
