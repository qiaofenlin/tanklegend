package com.yjg.tanklegend.handle;

import com.sun.org.apache.regexp.internal.RE;
import com.yjg.tanklegend.Exception.GirlException;
import com.yjg.tanklegend.domain.Result;
import com.yjg.tanklegend.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @qfl qiao
 * @date 18-2-4 下午3:51
 */
@ControllerAdvice
public class ExceptionHandle {

    private final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            logger.error("系统异常={}",e);
            return ResultUtil.error(-1,"未知错误.");

        }
    }
}
