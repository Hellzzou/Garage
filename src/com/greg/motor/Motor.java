package com.greg.motor;
import java.io.Serializable;

public class Motor implements Serializable {
    MotorType type;
    protected String name;
    protected Double price;

    Motor(String name) {
        this.name = name;
    }
    public String toString(){
        return "Moteur " + this.type.getName();
    }
    public Double getPrice() {
        return price;
    }
}
