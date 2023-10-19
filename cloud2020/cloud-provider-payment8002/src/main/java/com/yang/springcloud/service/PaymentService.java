package com.yang.springcloud.service;

import com.yang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.service
 * @date 2023/10/12 15:34
 * @description
 */

public interface PaymentService {
    public int savePayment(Payment payment);

    public Payment getPaymentId(@Param("id") Long id);
}
