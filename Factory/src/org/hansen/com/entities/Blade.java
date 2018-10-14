package org.hansen.com.entities;

import java.math.BigDecimal;

public abstract class Blade {
  protected BigDecimal minPrice;
  protected BigDecimal maxPrice;

  public BigDecimal getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(BigDecimal minPrice) {
    this.minPrice = minPrice;
  }

  public BigDecimal getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(BigDecimal maxPrice) {
    this.maxPrice = maxPrice;
  }

  public void printRangePrice(){
    System.out.println(this.minPrice + "-" + this.maxPrice);
  }

  public abstract String getBrand();
}
