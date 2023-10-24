package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud
 * @date 2023/10/23 12:38
 * @description
 */
@SpringBootApplication
//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
