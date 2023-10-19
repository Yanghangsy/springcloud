package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud
 * @date 2023/10/13 9:03
 * @description
 */


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
