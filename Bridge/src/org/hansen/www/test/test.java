package org.hansen.www.test;

import java.math.BigDecimal;
import org.hansen.www.src.concreteImpl.ProductBlade;
import org.hansen.www.src.concreteImpl.ProductNet;
import org.hansen.www.src.concreteImpl.ProductRubber;
import org.hansen.www.src.concreteView.NotebookView;
import org.hansen.www.src.concreteView.TabletView;
import org.hansen.www.src.entities.Blade;
import org.hansen.www.src.entities.Net;
import org.hansen.www.src.entities.Rubber;

public class test{
    public static void main(String[] args){
      //Create Objects
      Blade blade = new Blade("Stiga fire",new BigDecimal("123"),"a great blade for you",12,"classic");
      Rubber rubber= new Rubber("Butterfly sriver",new BigDecimal("120"),"the classic rubber",4,"Attack");
      Net net= new Net("friendship ls","a roundaround net",new BigDecimal("20"),4);

      //ConcreteImpl
      ProductBlade productBlade = new ProductBlade(blade);
      ProductRubber productRubber = new ProductRubber(rubber);
      ProductNet productNet = new ProductNet(net);
      NotebookView notebookView = new NotebookView(productBlade);
      notebookView.show();
      notebookView = new NotebookView(productBlade);
      notebookView.show();
      TabletView tabletView = new TabletView(productBlade);
      tabletView.show();
      tabletView = new TabletView(productNet);
      tabletView.show();






    }
}