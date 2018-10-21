package org.hansen.www.src.concreteImpl;

import java.math.BigDecimal;
import org.hansen.www.src.entities.Net;
import org.hansen.www.src.product.Product;

public class ProductNet implements Product {
    Net net;

    public ProductNet(Net net) {
      this.net = net;
    }

  @Override
  public String getTitle() {
    return net.getModel();
  }

  @Override
  public String getDescription() {
    return net.getDescription();
  }

  @Override
  public BigDecimal getPrice() {
    return net.getPrice();
  }

  @Override
  public Integer getQuantity() {
    return net.getQuantity();
  }
}
