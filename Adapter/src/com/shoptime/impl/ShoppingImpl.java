package com.shoptime.impl;

import com.shoptime.inter.Shopping;
import java.math.BigDecimal;

public class ShoppingImpl implements Shopping {

  @Override
  public boolean validatePayment(Long dni, BigDecimal quantity) {
    //Complex logic who calls our service payment
    System.out.println("Validation of $" + quantity.toString() + "ok");
    return true;
  }

  @Override
  public boolean pay(Long dni, BigDecimal quantity) {
    //Complex logic who calls our service payment
    System.out.println("Payment of $" + quantity.toString() + "ok");
    return true;
  }

  @Override
  public boolean doPaymentSlip(Long dni, Long paymentId, BigDecimal quantity) {
    //Complex logic who calls our service payment
    System.out.println("Payment Slip of $" + quantity.toString() + "ok");
    return false;
  }


}
