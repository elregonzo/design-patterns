package org.hansen.www.src.view;

import org.hansen.www.src.entities.Blade;

public class TabletViewBlade {
    Blade blade;

    public TabletViewBlade(Blade blade) {
      this.blade = blade;
    }

    public void show(){
      System.out.println(" Title: " + blade.getModelBlade());
      String description = " Description: grip style " + blade.getGripStyle() + " " + blade.getDescription();
      System.out.println(
          description.substring(0,Math.min(13,description.length())));
      System.out.println(" Price "+ blade.getPrice());

    }
}
