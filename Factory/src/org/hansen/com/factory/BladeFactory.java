package org.hansen.com.factory;

import org.hansen.com.entities.Blade;
import org.hansen.com.entities.ButterflyBlade;
import org.hansen.com.entities.FriendshipBlade;
import org.hansen.com.entities.StigaBlade;

public class BladeFactory {

  public Blade makeBlade(String brand){
    switch (brand) {
      case "butterfly":
        return new ButterflyBlade();
      case "friendship":
        return new FriendshipBlade();
      case "stiga":
        return new StigaBlade();
    }
    return null;
  }
}
