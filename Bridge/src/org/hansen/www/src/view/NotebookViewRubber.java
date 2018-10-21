package org.hansen.www.src.view;

import org.hansen.www.src.entities.Rubber;

public class NotebookViewRubber {
    Rubber rubber;

  public NotebookViewRubber(Rubber rubber) {
    this.rubber = rubber;
  }

  public void show(){
      System.out.println(" Title: " + (rubber.getModelRubber() + " " + rubber.getTypeRubber()));
      System.out.println(" Description:  " + rubber.getDescription() );
      System.out.println(" Price "+ rubber.getPrice());
      System.out.println(" Quantity "+ rubber.getQuantity());
    }
}
