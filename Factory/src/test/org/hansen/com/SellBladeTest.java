package test.org.hansen.com;

import java.math.BigDecimal;
import org.hansen.com.entities.ButterflyBlade;
import org.hansen.com.entities.StigaBlade;
import org.hansen.com.selling.SellBlade;
import org.hansen.com.selling.WorstSellBlade;

public class SellBladeTest {
  public static void main(String[] args) {
    ButterflyBlade butterflyBlade = new ButterflyBlade();
    butterflyBlade.setMaxPrice(new BigDecimal("10000"));
    butterflyBlade.setMinPrice(BigDecimal.ZERO);
    StigaBlade stigaBlade= new StigaBlade();
    stigaBlade.setMaxPrice(new BigDecimal("11000"));
    stigaBlade.setMinPrice(BigDecimal.ZERO);
    WorstSellBlade worstSellBlade = new WorstSellBlade();
    worstSellBlade.getRangePrice(butterflyBlade);
    worstSellBlade.getRangePrice(stigaBlade);
    SellBlade sellBlade = new SellBlade();
    sellBlade.createStore(butterflyBlade);
    sellBlade.getRangePrice("butterfly");
  }

}
