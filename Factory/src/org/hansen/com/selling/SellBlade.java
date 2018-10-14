package org.hansen.com.selling;

import org.hansen.com.entities.ButterflyBlade;
import org.hansen.com.entities.FriendshipBlade;
import org.hansen.com.entities.StigaBlade;

public class SellBlade {

  private ButterflyBlade butterflyBlade;
  private FriendshipBlade friendshipBlade;
  private StigaBlade stigaBlade;

  public void createStore(ButterflyBlade butterflyBlade) {
    this.butterflyBlade = butterflyBlade;
  }

  public void createStore(FriendshipBlade friendshipBlade) {
    this.friendshipBlade = friendshipBlade;
  }

  public void createStore(StigaBlade stigaBlade) {
    this.stigaBlade = stigaBlade;
  }

  public void getRangePrice(String blade) {
    switch (blade) {
      case "butterfly":
        System.out.println(butterflyBlade.getMinPrice() + "-" + butterflyBlade.getMaxPrice());
        break;
      case "friendship":
        System.out.println(friendshipBlade.getMinPrice() + "-" + friendshipBlade.getMaxPrice());
        break;
      case "stiga":
        System.out.println(stigaBlade
            .getMinPrice() + "-" + stigaBlade.getMaxPrice());
        break;
    }
  }
}
