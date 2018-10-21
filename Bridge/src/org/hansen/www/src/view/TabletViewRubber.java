package org.hansen.www.src.view;

import org.hansen.www.src.entities.Rubber;

public class TabletViewRubber {
    Rubber rubber;

  public TabletViewRubber(Rubber rubber) {
    this.rubber = rubber;
  }

  public void show(){
      System.out.println(" Title: " + rubber.getModelRubber());
      String description = " Description: grip style " + rubber.getDescription();
      System.out.println(
          description.substring(0,Math.min(13,description.length())));
      System.out.println(" Price "+ rubber.getPrice());

    }
}
