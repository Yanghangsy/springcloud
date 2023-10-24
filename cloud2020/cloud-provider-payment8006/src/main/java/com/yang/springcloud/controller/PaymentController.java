package com.yang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.controller
 * @date 2023/10/24 14:31
 * @description
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
