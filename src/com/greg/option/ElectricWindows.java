package com.greg.option;
import java.io.Serializable;

public class ElectricWindows implements Option, Serializable {
    private String name;

    public ElectricWindows(){
        this.name = "Vitres électriques";
    }

    @Override
    public Double getPrice() {
        return 1234.0;
    }

    public String getName() {
        return name;
    }
}
