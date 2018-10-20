package com.shoptime.inter;

import java.math.BigDecimal;

public interface Shopping {
    boolean validatePayment(Long dni, BigDecimal quantity);
    boolean pay(Long dni, BigDecimal quantity);
    boolean doPaymentSlip(Long dni, Long paymentId, BigDecimal quantity);
    //Methods additioned for integrate the payment system in a new country
    boolean validatePeruPayment(Long dni, BigDecimal quantity);
    boolean peruPayment(Long dni, BigDecimal quantity);
}
