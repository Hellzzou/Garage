package com.greg.motor;
import java.io.Serializable;

public class GasolineMotor extends Motor implements Serializable {
    public GasolineMotor(String name) {
        super(name);
        this.price = MotorType.ESSENCE.getPrice();
        this.type = MotorType.ESSENCE;
    }
}
