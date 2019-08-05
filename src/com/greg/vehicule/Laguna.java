package com.greg.vehicule;
import java.io.Serializable;

public class Laguna extends Vehicule implements Serializable {

    public Laguna(){
        this.price = Brand.Laguna.getPrice();
        this.name = "Laguna";
        this.brand = Brand.Laguna;
    }

}
