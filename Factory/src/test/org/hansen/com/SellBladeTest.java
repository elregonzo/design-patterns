package test.org.hansen.com;

import org.hansen.com.entities.Blade;
import org.hansen.com.entities.ButterflyBlade;
import org.hansen.com.factory.BladeFactory;

public class SellBladeTest {
  public static void main(String[] args) {
    BladeFactory bladeFactory = new BladeFactory();
    Blade blade = bladeFactory.makeBlade("stiga");
    System.out.println(blade.getBrand());
    blade.printRangePrice();

    blade = bladeFactory.makeBlade("butterfly");
    System.out.println(blade.getBrand());
    blade.printRangePrice();
    System.out.println( "Discount" + ((ButterflyBlade)blade).getStoreDiscount() );

  }
}
