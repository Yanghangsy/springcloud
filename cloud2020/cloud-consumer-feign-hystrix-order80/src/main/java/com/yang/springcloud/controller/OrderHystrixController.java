package com.yang.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
// DefaultProperties 配置统一的服务降级方法
// @DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("consumer/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        // int num = 10/0;
        String s = paymentHystrixService.paymentInfo_ok(id);
        return s;
    }

    @GetMapping("consumer/hystrix/timeout/{id}")
    // @HystrixCommand(fallbackMethod = "paymentTimeoutFallbackMethod",commandProperties = {
    //         @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds" ,value = "1500")
    // })
    //方法上使用注释 HystrixCommand 就说明该方法使用了服务降级方法
    @HystrixCommand
    public  String paymentInfo_timeout(@PathVariable("id")Integer id){
        int num = 10/0;
        String s = paymentHystrixService.paymentInfo_timeout(id);
        return s;
    }

    public String paymentTimeoutFallbackMethod(@PathVariable("id") Integer id){
        return "我是消费者，对方支付系统繁忙请10秒后再试或系统错误，请检查系统";
    }

    //全局fallback
    public String payment_Global_FallbackMethod(){
        return "Global异常，请检查系统";
    }
}
