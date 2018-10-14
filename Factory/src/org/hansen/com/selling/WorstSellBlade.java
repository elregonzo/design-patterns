package org.hansen.com.selling;

import org.hansen.com.entities.ButterflyBlade;
import org.hansen.com.entities.FriendshipBlade;
import org.hansen.com.entities.StigaBlade;

public class WorstSellBlade {

  public void getRangePrice(ButterflyBlade butterflyBlade) {
    System.out.println(butterflyBlade.getMinPrice() + "-" + butterflyBlade.getMaxPrice());

  }

  public void getRangePrice(FriendshipBlade friendshipBlade) {
    System.out.println(friendshipBlade.getMinPrice() + "-" + friendshipBlade.getMaxPrice());

  }

  public void getRangePrice(StigaBlade stigaBlade) {
    System.out.println(stigaBlade.getMinPrice() + "-" + stigaBlade.getMaxPrice());
  }

}
