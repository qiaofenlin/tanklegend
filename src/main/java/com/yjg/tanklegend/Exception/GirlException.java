package com.yjg.tanklegend.Exception;

/**
 * @qfl qiao
 * @date 18-2-4 下午4:07
 */

import com.yjg.tanklegend.enums.ResultEnum;

/**
 * spring框架只会对RuntimeException进行事物回滚,Exception不会事物会回滚.
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
