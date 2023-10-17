package com.yang.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.config
 * @date 2023/10/17 14:19
 * @description
 */
@Configuration
public class ApplicationContextConfig {

     @Bean
     public RestTemplate getRestTemplate(){
         return new RestTemplate();
     }
}
