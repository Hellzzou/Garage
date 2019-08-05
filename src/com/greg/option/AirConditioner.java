package com.greg.option;
import java.io.Serializable;

public class AirConditioner implements Option, Serializable {
    private String name;

    public AirConditioner(){
        this.name = "Climatisation";
    }
    @Override
    public Double getPrice() {
        return 1386.0;
    }

    @Override
    public String getName() {
        return name;
    }
}
