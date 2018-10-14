package org.hansen.com.entities;

import java.math.BigDecimal;

public class StigaBlade extends Blade {

  public StigaBlade() {
    this.minPrice = BigDecimal.ONE;
    this.maxPrice = BigDecimal.valueOf(1000);
  }

  @Override
  public String getBrand() {
      return "stiga brand";
  }
}
