package org.hansen.www.src.entities;

import java.math.BigDecimal;

public class Net {
    String model;
    String description;
    BigDecimal price;
    Integer quantity;

  public Net(String model, String description, BigDecimal price, Integer quantity) {
    this.model = model;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public String getModel() {
      return model;
    }

    public void setModel(String model) {
      this.model = model;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public BigDecimal getPrice() {
      return price;
    }

    public void setPrice(BigDecimal price) {
      this.price = price;
    }

    public Integer getQuantity() {
      return quantity;
    }

    public void setQuantity(Integer quantity) {
      this.quantity = quantity;
    }
}
