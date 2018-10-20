package org.hansen.com.test;

import com.shoptime.impl.ShoppingImpl;
import com.shoptime.inter.Shopping;
import java.math.BigDecimal;

public class test {

  public static final long CHAOUS_COMPULSIVE_BUYER_DNI = 14231244l;
  public static final long SLIP_BAR_CODE = 2L;

  public static void main(String[] args) {

     Shopping shopping = new ShoppingImpl();
     shopping.validatePayment(CHAOUS_COMPULSIVE_BUYER_DNI,new BigDecimal("100"));
     shopping.pay(CHAOUS_COMPULSIVE_BUYER_DNI,new BigDecimal("10"));
     shopping.doPaymentSlip(CHAOUS_COMPULSIVE_BUYER_DNI, SLIP_BAR_CODE,new BigDecimal("10"));

     //Peru payment
    shopping.validatePeruPayment(CHAOUS_COMPULSIVE_BUYER_DNI,new BigDecimal("100"));
    shopping.peruPayment(CHAOUS_COMPULSIVE_BUYER_DNI,new BigDecimal("100"));
   }

}
