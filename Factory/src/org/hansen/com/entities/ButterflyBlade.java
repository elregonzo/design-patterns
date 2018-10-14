package org.hansen.com.entities;

import java.math.BigDecimal;

public class ButterflyBlade extends Blade{

  private BigDecimal storeDiscount;

  public ButterflyBlade() {
    this.minPrice = BigDecimal.ZERO;
    this.maxPrice = BigDecimal.valueOf(10000);
    this.storeDiscount = BigDecimal.valueOf(2000);
  }

  public BigDecimal getStoreDiscount() {
    return storeDiscount;
  }

  public void setStoreDiscount(BigDecimal storeDiscount) {
    this.storeDiscount = storeDiscount;
  }


  @Override
  public String getBrand() {
    return "butterfly brand";
  }
}
