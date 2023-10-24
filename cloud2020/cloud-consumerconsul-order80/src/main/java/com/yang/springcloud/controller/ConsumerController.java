package com.yang.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.controller
 * @date 2023/10/24 14:47
 * @description
 */
@RestController
public class ConsumerController {
    public static final String INVOKE_URL = "http://cloud-provider-payment8006";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String  paymentInfo(){
        String forObject = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return forObject;
    }
}
