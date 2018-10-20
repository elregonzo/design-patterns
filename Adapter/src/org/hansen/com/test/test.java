package org.hansen.com.test;

import com.adapter.AdapterPeruShopping;
import com.latiendita.impl.TiendaTuPata;
import com.latiendita.inter.PeruShopping;
import com.shoptime.impl.ShoppingImpl;
import com.shoptime.inter.Shopping;
import java.math.BigDecimal;

public class test {

  public static final long CHAOUS_COMPULSIVE_BUYER_DNI = 14231244l;
  public static final long SLIP_BAR_CODE = 2L;

  public static void main(String[] args) {

     Shopping shopping = new ShoppingImpl();
    testChaousPayment(shopping);

     //Peru payment
    PeruShopping peruShopping = new TiendaTuPata();
    shopping = new AdapterPeruShopping(peruShopping);

    testChaousPayment(shopping);
   }

  private static void testChaousPayment(Shopping shopping) {
    shopping.validatePayment(CHAOUS_COMPULSIVE_BUYER_DNI,new BigDecimal("100"));
    shopping.pay(CHAOUS_COMPULSIVE_BUYER_DNI,new BigDecimal("10"));
    shopping.doPaymentSlip(CHAOUS_COMPULSIVE_BUYER_DNI, SLIP_BAR_CODE,new BigDecimal("10"));
  }

}
