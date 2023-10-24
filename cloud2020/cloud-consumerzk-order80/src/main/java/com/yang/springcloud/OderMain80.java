package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud
 * @date 2023/10/24 10:00
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OderMain80.class,args);
    }
}
