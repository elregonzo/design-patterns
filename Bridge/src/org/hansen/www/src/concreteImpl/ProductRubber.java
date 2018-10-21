package org.hansen.www.src.concreteImpl;

import java.math.BigDecimal;
import org.hansen.www.src.entities.Rubber;
import org.hansen.www.src.product.Product;

public class ProductRubber implements Product {
    Rubber rubber ;

    public ProductRubber(Rubber rubber) {
      this.rubber = rubber;
    }

  @Override
  public String getTitle() {
    return rubber.getModelRubber() + " " + rubber.getTypeRubber();
  }

  @Override
  public String getDescription() {
    return rubber.getDescription();
  }

  @Override
  public BigDecimal getPrice() {
    return rubber.getPrice();
  }

  @Override
  public Integer getQuantity() {
    return rubber.getQuantity();
  }
}
