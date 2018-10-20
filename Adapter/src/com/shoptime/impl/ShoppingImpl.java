package com.shoptime.impl;

import com.latiendita.TiendaTuPata;
import com.shoptime.inter.Shopping;
import java.math.BigDecimal;

public class ShoppingImpl implements Shopping {

  @Override
  public boolean validatePayment(Long dni, BigDecimal quantity) {
    //Complex logic who calls our service payment
    System.out.println("Validation of $"+ quantity.toString() + "ok" );
    return true;
  }

  @Override
  public boolean pay(Long dni, BigDecimal quantity) {
    //Complex logic who calls our service payment
    System.out.println("Payment of $"+ quantity.toString() + "ok" );
    return true;
  }

  @Override
  public boolean doPaymentSlip(Long dni, Long paymentId, BigDecimal quantity) {
    //Complex logic who calls our service payment
    System.out.println("Payment Slip of $"+ quantity.toString() + "ok" );
    return false;
  }

  @Override
  public boolean validatePeruPayment(Long dni, BigDecimal quantity) {
    TiendaTuPata tiendaTuPata = new TiendaTuPata();
    String result = tiendaTuPata.validar(dni, quantity.longValue());
    return "si".equals(result);
  }

  @Override
  public boolean peruPayment(Long dni, BigDecimal quantity) {
    TiendaTuPata tiendaTuPata = new TiendaTuPata();
    String result = tiendaTuPata.pagar(dni, quantity.longValue());
    return "si".equals(result);
  }
}
