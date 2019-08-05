package com.greg.option;
import java.io.Serializable;

public class HeatedSeat implements Option, Serializable {
    private String name;

    public HeatedSeat(){
        this.name = "Siège chauffant";
    }
    @Override
    public Double getPrice() {
        return 2564.0;
    }

    @Override
    public String getName() {
        return name;
    }
}
