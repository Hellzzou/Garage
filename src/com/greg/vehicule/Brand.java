package com.greg.vehicule;

public enum Brand {
    Laguna("Renault",15000.0),
    D4("Citroen",17000.0),
    A300B("Peugeot",16000.0);

    private String name;
    private Double price;

    Brand(String name,Double price){
        this.name = name;
        this.price = price;
    }

    String getName(){
        return this.name;
    }

    public Double getPrice() {
        return price;
    }
}
