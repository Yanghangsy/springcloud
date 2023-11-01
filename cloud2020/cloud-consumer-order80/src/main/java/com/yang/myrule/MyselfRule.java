package com.yang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.myrule
 * @date 2023/10/30 15:32
 * @description
 */

@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        //定义为随机
        return new RandomRule();
    }
}
