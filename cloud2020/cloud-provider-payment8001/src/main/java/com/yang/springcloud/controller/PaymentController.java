package com.yang.springcloud.controller;

import com.yang.springcloud.entities.CommonResult;
import com.yang.springcloud.entities.Payment;
import com.yang.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.controller
 * @date 2023/10/12 15:38
 * @description
 */
@RestController
@Slf4j
@RequestMapping(value = "payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/save")

    public CommonResult savePayment(@RequestBody Payment payment){
        int result = paymentService.savePayment(payment);
        log.info("***插入payment参数：****  ,serverPort:"+serverPort+payment);
        log.info("***插入payment结果：****"+result);
        if (result>0){
            return new CommonResult(200,"success",result);
        }else {
            return new CommonResult(444,"error");
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentId(id);
        log.info("***查询payment结果：****,serverPort:"+serverPort+payment);
        if (payment!=null){
            return new CommonResult(200,serverPort,payment);
        }else {
            return new CommonResult(444,"error");
        }
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("service:"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        for (ServiceInstance instance : instances) {
            log.info(instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

    @GetMapping("/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
