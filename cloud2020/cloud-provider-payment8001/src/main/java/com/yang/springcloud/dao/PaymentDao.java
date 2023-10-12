package com.yang.springcloud.dao;

import com.yang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.dao
 * @date 2023/10/12 15:17
 * @description
 */
@Mapper
public interface PaymentDao {
    public int savePayment(Payment payment);

    public Payment getPaymentId(@Param("id") Long id);
}
