package com.hand.eureka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description TODO
 * @Author ghost
 * @Date 2020/7/20 20:22
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private int code;
    private String msg;
    private T  data;

    public CommonResult(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
