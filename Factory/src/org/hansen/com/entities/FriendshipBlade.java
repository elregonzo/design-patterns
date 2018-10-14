package org.hansen.com.entities;

import java.math.BigDecimal;

public class FriendshipBlade extends Blade{

  public FriendshipBlade() {
    this.minPrice = BigDecimal.ONE;
    this.maxPrice = BigDecimal.valueOf(100);
  }

  @Override
  public String getBrand() {
    return "friendship brand";
  }
}
