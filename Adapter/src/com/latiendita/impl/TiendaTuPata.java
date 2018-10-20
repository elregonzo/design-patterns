package com.latiendita.impl;

import com.latiendita.inter.PeruShopping;

public class TiendaTuPata implements PeruShopping {
    public String pagar(Long dni, Long valor){
      //Logica compleja(Complex logic)
      System.out.println("Ya está pago "+valor+" soles para el cholo "+ dni);//successful payment
      return "si";
    }
    public String validar(Long dni, Long valor){
      //Logica compleja(Complex Logic)
      System.out.println("Todo validado "+valor+" soles para el cholo "+ dni);//successful validation
      return "si";
    }

}
