package org.hansen.www.src.concreteView;

import org.hansen.www.src.product.Product;
import org.hansen.www.src.product.View;

public class TabletView extends View {

  public TabletView(Product product) {
    super(product);
  }

  @Override
  public void show() {
    System.out.println(" Title: " + product.getTitle());
    String description = product.getDescription();
    System.out.println(" Description:" +  description.substring(0,Math.min(13,description.length())) );
    System.out.println(" Price "+ product.getPrice());

  }
}
