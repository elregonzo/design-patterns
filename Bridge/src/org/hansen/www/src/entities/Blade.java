package org.hansen.www.src.entities;

import java.math.BigDecimal;

public class Blade {
    String modelBlade;
    BigDecimal price;
    String description;
    Integer quantity;
    String gripStyle;

  public Blade(String modelBlade, BigDecimal price, String description, Integer quantity,
      String gripStyle) {
    this.modelBlade = modelBlade;
    this.price = price;
    this.description = description;
    this.quantity = quantity;
    this.gripStyle = gripStyle;
  }

  public String getModelBlade() {
    return modelBlade;
  }

  public void setModelBlade(String modelBlade) {
    this.modelBlade = modelBlade;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getGripStyle() {
    return gripStyle;
  }

  public void setGripStyle(String gripStyle) {
    this.gripStyle = gripStyle;
  }
}
