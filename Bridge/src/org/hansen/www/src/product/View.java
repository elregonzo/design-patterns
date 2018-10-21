package org.hansen.www.src.product;

public abstract class View {
    protected Product product;

    public View(Product product) {
        this.product = product;
    }
    public abstract void show();
}
