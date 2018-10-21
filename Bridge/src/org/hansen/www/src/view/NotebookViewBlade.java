package org.hansen.www.src.view;

import org.hansen.www.src.entities.Blade;

public class NotebookViewBlade {
    Blade blade;

    public NotebookViewBlade(Blade blade) {
      this.blade = blade;
    }

    public void show(){
      System.out.println(" Title: " + blade.getModelBlade());
      System.out.println(" Description: grip style " + blade.getGripStyle() +" " + blade.getDescription() );
      System.out.println(" Price "+ blade.getPrice());
      System.out.println(" Quantity "+ blade.getQuantity());
    }
}
