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
 * @date 2023/10/23 12:42
 * @description
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String paymentZk(){
        return "springcloud with zookeeper"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
