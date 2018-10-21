package org.hansen.www.src.view;

import org.hansen.www.src.entities.Net;

public class TabletViewNet {
    Net net;

  public TabletViewNet(Net net) {
    this.net = net;
  }

  public void show(){
      System.out.println(" Title: " + net.getModel());
      String description = " Description: grip style " + net.getDescription();
      System.out.println(
          description.substring(0,Math.min(13,description.length())));
      System.out.println(" Price "+ net.getPrice());

    }
}
