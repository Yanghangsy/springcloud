package com.yang.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.service
 * @date 2023/12/5 13:45
 * @description
 */
@FeignClient("CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentHystrixService {
    
}
