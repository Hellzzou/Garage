package com.greg.option;
import java.io.Serializable;

public class GPS implements Option, Serializable {
    private String name;

    public GPS() {
        this.name = "GPS";
    }

    @Override
    public Double getPrice() {
        return 547.0;
    }

    @Override
    public String getName() {
        return name;
    }
}
