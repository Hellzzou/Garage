package com.greg.vehicule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.greg.motor.Motor;
import com.greg.option.Option;

public class Vehicule implements Serializable {

    protected Double price;
    protected String name;
    private List<Option> optionsList;
    Brand brand;
    private Motor motor;

    Vehicule() {
        this.price = 0.0;
        this.name = "";
        this.optionsList = new ArrayList<>();
    }

    public void addOption(Option opt) {
        this.getOptionsList().add(opt);
        this.setPrice(opt.getPrice()) ;
    }

    public String toString() {
        StringBuilder option = new StringBuilder(" [");
        for (Option opt : this.getOptionsList()) {
            option.append(opt.getName() + " (" + opt.getPrice() + "€),");
        }
        if ( option.length() > 2) option.deleteCharAt(option.length()-1);
        else option.append("sans option]");
        return "Voiture " + this.getBrand().getName() + " : " + this.name + " " + this.motor.toString() + "(" + (this.motor.getPrice() + this.brand.getPrice())+ "€)"  + option + " d'une valeur totale de " + this.getPrice() +" €\n";
    }


    //---------------------GETTERS--------------------------
    public Double getPrice() {
        return this.price;
    }
    public Brand getBrand() {
        return this.brand;
    }

    public List<Option> getOptionsList() {
        return this.optionsList;
    }
    //---------------------SETTERS--------------------------

    public void setMotor(Motor motor) {
        this.motor = motor;
        this.price += motor.getPrice();
    }

    public void setPrice(Double price) {
        this.price = this.price + price;
    }
}
