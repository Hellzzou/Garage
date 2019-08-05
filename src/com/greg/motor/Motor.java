package com.greg.motor;
import java.io.Serializable;

public class Motor implements Serializable {
    protected MotorType type;
    protected String name;
    protected Double price;

    public Motor(String name) {
        this.name = name;
    }
    public String toString(){
        return "Moteur " + this.type.getName();
    }
    public Double getPrice() {
        return price;
    }
}
