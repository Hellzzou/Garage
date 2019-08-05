package com.greg.motor;
import java.io.Serializable;

public class ElectricMotor extends Motor implements Serializable {

    public ElectricMotor(String name) {
        super(name);
        this.price = MotorType.ELECTRIQUE.getPrice();
        this.type = MotorType.ELECTRIQUE;
    }
}
