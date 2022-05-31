package org.gl.dy127.service;


import org.apache.ibatis.annotations.Param;
import org.gl.dy127.entities.Payment;

public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}



