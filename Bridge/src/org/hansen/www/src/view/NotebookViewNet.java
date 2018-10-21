package org.hansen.www.src.view;

import org.hansen.www.src.entities.Net;

public class NotebookViewNet {
    Net net;

    public NotebookViewNet(Net net) {
        this.net = net;
    }

    public void show(){
        System.out.println(" Title: " + net.getModel());
        System.out.println(" Description: grip style " + net.getDescription() );
        System.out.println(" Price "+ net.getPrice());
        System.out.println(" Quantity "+ net.getQuantity());
    }
}
