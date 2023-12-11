package com.yang.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author hang yang
 * @create 2023-12-11 13:46
 * @description
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_ok(Integer id) {
        return "PaymentFallbackService-paymentInfo_ok";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "PaymentFallbackService-paymentInfo_timeout";
    }
}
