package com.yang.springcloud.controller;

import com.yang.springcloud.entities.CommonResult;
import com.yang.springcloud.entities.Payment;
import com.yang.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @PostMapping(value = "/save")
    public CommonResult savePayment(Payment payment){
        int result = paymentService.savePayment(payment);
        log.info("***插入payment结果：****"+result);
        if (result>0){
            return new CommonResult(200,"success",result);
        }else {
            return new CommonResult(444,"error");
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult savePayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentId(id);
        log.info("***查询payment结果：****"+payment);
        if (payment!=null){
            return new CommonResult(200,"success",payment);
        }else {
            return new CommonResult(444,"error");
        }
    }

}
