package com.greg.vehicule;
import java.io.Serializable;

public class D4 extends Vehicule implements Serializable {

    public D4(){
        this.price = Brand.D4.getPrice();
        this.name = "D4";
        this.brand = Brand.D4;
    }
}