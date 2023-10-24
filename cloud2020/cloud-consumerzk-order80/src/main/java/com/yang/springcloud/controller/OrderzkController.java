package com.yang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.controller
 * @date 2023/10/24 10:02
 * @description
 */
@RestController
@Slf4j
public class OrderzkController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String  paymentInfo(){
        String forObject = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return forObject;
    }
}
