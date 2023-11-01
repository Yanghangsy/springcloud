package com.yang.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.lb
 * @date 2023/11/1 15:04
 * @description
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> instances);
}
