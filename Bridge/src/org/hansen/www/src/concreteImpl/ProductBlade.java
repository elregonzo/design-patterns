package org.hansen.www.src.concreteImpl;

import java.math.BigDecimal;
import org.hansen.www.src.entities.Blade;
import org.hansen.www.src.product.Product;

public class ProductBlade implements Product {
    Blade blade ;

    public ProductBlade(Blade blade) {
      this.blade = blade;
    }

  @Override
  public String getTitle() {
    return blade.getModelBlade() ;
  }

  @Override
  public String getDescription() {
    return blade.getGripStyle() +" " + blade.getDescription();
  }

  @Override
  public BigDecimal getPrice() {
    return blade.getPrice();
  }

  @Override
  public Integer getQuantity() {
    return blade.getQuantity();
  }
}
