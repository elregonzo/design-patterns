package org.hansen.www.src.entities;

import java.math.BigDecimal;

public class Rubber {
    String modelRubber;
    BigDecimal price;
    String description;
    Integer quantity;
    String typeRubber;

    public Rubber(String modelRubber, BigDecimal price, String description, Integer quantity,
        String typeRubber) {
        this.modelRubber = modelRubber;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.typeRubber = typeRubber;
    }

    public String getModelRubber() {
        return modelRubber;
    }

    public void setModelRubber(String modelRubber) {
        this.modelRubber = modelRubber;
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

    public String getTypeRubber() {
        return typeRubber;
    }

    public void setTypeRubber(String typeRubber) {
        this.typeRubber = typeRubber;
    }
}
