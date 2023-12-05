package com.yang.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.service
 * @date 2023/12/4 16:59
 * @description
 */
@Service
public class PaymentService {

    //正常访问
    public String paymentInfo_ok(Integer id){
        return "线程池"+Thread.currentThread().getName()
                +"paymentInfo_ok,id:  "+id+"\t"+"hahha";
    }

    public  String paymentInfo_timeout(Integer id){

        int timeNumber=3;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "线程池"+Thread.currentThread().getName()
                +"paymentInfo_timeout,id: "+id+"\t"+"hahha"+"耗时（秒）"+timeNumber;
    }

}
