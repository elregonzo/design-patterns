package org.hansen.www.src.concreteView;

import org.hansen.www.src.product.Product;
import org.hansen.www.src.product.View;

public class NotebookView extends View {

  public NotebookView(Product product) {
    super(product);
  }

  @Override
  public void show() {
    System.out.println(" Title: " + product.getTitle());
    System.out.println(" Description:" +  product.getDescription() );
    System.out.println(" Price "+ product.getPrice());
    System.out.println(" Quantity "+ product.getQuantity());
  }
}
