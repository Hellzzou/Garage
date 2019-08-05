package com.greg.motor;

public enum MotorType {
    DIESEL("Diesel",5500.0),
    ESSENCE("Essence",4500.0),
    HYBRIDE("Hybride",6000.0),
    ELECTRIQUE("électrique",4500.0);

    private String name;
    private Double price;

    MotorType(String name,Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
