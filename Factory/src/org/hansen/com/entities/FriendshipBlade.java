package org.hansen.com.entities;

import java.math.BigDecimal;

public class FriendshipBlade {

  private final String brand = "Friendship";
  private BigDecimal minPrice;
  private BigDecimal maxPrice;

  public String getBrand() {
    return brand;
  }

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
}
