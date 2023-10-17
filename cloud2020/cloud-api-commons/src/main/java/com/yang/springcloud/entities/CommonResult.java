package com.yang.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.entities
 * @date 2023/10/12 15:12
 * @description
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T date;
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
