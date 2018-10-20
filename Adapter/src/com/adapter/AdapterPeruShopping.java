package com.adapter;

import com.latiendita.inter.PeruShopping;
import com.shoptime.inter.Shopping;
import java.math.BigDecimal;

public class AdapterPeruShopping implements Shopping {
  private PeruShopping peruShopping;

  public AdapterPeruShopping(PeruShopping peruShopping) {
       this.peruShopping = peruShopping;
  }

  @Override
  public boolean validatePayment(Long dni, BigDecimal quantity) {
    String result = peruShopping.validar(dni, quantity.longValue());
    return result.equals("si");
  }

  @Override
  public boolean pay(Long dni, BigDecimal quantity) {
    boolean paymentResult = false;
    String validationResult = peruShopping.validar(dni, quantity.longValue());
    if (validationResult.equals("si")) {
      String result = peruShopping.pagar(dni, quantity.longValue());
      paymentResult = result.equals("si");
    }
    return paymentResult;
  }

  @Override
  public boolean doPaymentSlip(Long dni, Long paymentId, BigDecimal quantity) {
    throw new UnsupportedOperationException("Slip Payment not supported");
  }
}
