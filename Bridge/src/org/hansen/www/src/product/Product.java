package org.hansen.www.src.product;

import java.math.BigDecimal;

public interface Product {
    String getTitle();
    String getDescription();
    BigDecimal getPrice();
    Integer getQuantity();



}
