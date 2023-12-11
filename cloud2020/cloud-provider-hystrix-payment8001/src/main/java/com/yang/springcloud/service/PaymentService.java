package com.yang.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    //HystrixCommand
    // fallbackMethod 设置 paymentInfo_timeout 方法出错了由 paymentInfo_timeoutHandler 方法兜底
    //commandProperties HystrixProperty 设置正常方法的执行时间
    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public  String paymentInfo_timeout(Integer id){

        int timeNumber=3;
        // int num = 10/0;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "线程池"+Thread.currentThread().getName()
                +"paymentInfo_timeout,id: "+id+"\t"+"hahha"+"耗时（秒）+"+timeNumber;
    }

    public String paymentInfo_timeoutHandler(Integer id){
        return "线程池"+Thread.currentThread().getName()
                +"系统忙或系统错误，请稍后再试 id: "+id+"\t"+"ka le";
    }

}
