package com.greg.option;
import java.io.Serializable;

public class RoofRack implements Option, Serializable {
    private String name;

    public RoofRack(){
        this.name = "Barre de toit";
    }

    @Override
    public Double getPrice() {
        return 934.0;
    }

    @Override
    public String getName() {
        return name;
    }
}
