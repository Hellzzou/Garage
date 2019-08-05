package com.greg.vehicule;
import java.io.Serializable;

public class A300B extends Vehicule implements Serializable {

    public A300B(){
        this.price = Brand.A300B.getPrice();
        this.name = "A300B";
        this.brand = Brand.A300B;
    }
}