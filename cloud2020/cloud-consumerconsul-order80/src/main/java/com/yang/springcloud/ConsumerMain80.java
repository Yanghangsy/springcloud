package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud
 * @date 2023/10/24 14:44
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain80.class,args);
    }
}
