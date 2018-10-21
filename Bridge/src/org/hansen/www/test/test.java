package org.hansen.www.test;

import java.math.BigDecimal;
import org.hansen.www.src.entities.Blade;
import org.hansen.www.src.entities.Net;
import org.hansen.www.src.entities.Rubber;
import org.hansen.www.src.view.NotebookViewBlade;
import org.hansen.www.src.view.NotebookViewNet;
import org.hansen.www.src.view.NotebookViewRubber;
import org.hansen.www.src.view.TabletViewBlade;
import org.hansen.www.src.view.TabletViewNet;
import org.hansen.www.src.view.TabletViewRubber;

public class test{
    public static void main(String[] args){
      //Create Objects
      Blade blade = new Blade("Stiga fire",new BigDecimal("123"),"a great blade for you",12,"classic");
      Rubber rubber= new Rubber("Butterfly sriver",new BigDecimal("120"),"the classic rubber",4,"Attack");
      Net net= new Net("friendship ls","a roundaround net",new BigDecimal("20"),4);

      NotebookViewBlade notebookViewBlade= new NotebookViewBlade(blade);
      notebookViewBlade.show();
      NotebookViewRubber notebookViewRubber= new NotebookViewRubber(rubber);
      notebookViewRubber.show();
      NotebookViewNet notebookViewNet= new NotebookViewNet(net);
      notebookViewNet.show();

      TabletViewBlade tabletViewBlade= new TabletViewBlade(blade);
      tabletViewBlade.show();
      TabletViewRubber tabletViewRubber= new TabletViewRubber(rubber);
      tabletViewRubber.show();
      TabletViewNet tabletViewNet= new TabletViewNet(net);
      tabletViewNet.show();



    }
}