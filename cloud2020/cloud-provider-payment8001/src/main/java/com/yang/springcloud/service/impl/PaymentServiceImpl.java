package com.yang.springcloud.service.impl;

import com.yang.springcloud.dao.PaymentDao;
import com.yang.springcloud.entities.Payment;
import com.yang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.service.impl
 * @date 2023/10/12 15:34
 * @description
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int savePayment(Payment payment) {
        return paymentDao.savePayment(payment);
    }

    @Override
    public Payment getPaymentId(Long id) {
        return paymentDao.getPaymentId(id);
    }
}
