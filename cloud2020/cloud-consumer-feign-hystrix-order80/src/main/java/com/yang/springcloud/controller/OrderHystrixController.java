package com.yang.springcloud.controller;

import com.yang.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hang yang
 * @create 2023-12-06 13:10
 * @description
 */
@RestController
@Slf4j
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("consumer/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_ok(id);
        return s;
    }

    @GetMapping("consumer/hystrix/timeout/{id}")
    public  String paymentInfo_timeout(@PathVariable("id")Integer id){
        String s = paymentHystrixService.paymentInfo_timeout(id);
        return s;
    }
}
