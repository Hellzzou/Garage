package com.greg.motor;
import java.io.Serializable;

public class HybridMotor extends Motor implements Serializable {

    public HybridMotor(String name){
        super(name);
        this.price = MotorType.HYBRIDE.getPrice();
        this.type = MotorType.HYBRIDE;
    }
}
