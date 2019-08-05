package com.greg.motor;
import java.io.Serializable;

public class DieselMotor extends Motor implements Serializable {

    public DieselMotor(String name){
        super(name);
        this.price = MotorType.DIESEL.getPrice();
        this.type = MotorType.DIESEL;
    }
}
