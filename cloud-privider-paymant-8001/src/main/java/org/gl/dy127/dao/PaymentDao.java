package org.gl.dy127.dao;

import org.gl.dy127.entities.Payment;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao {
     int create(Payment payment);

     Payment getPaymentById(Long id);
}
