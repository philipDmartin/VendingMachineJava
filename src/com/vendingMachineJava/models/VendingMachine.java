package com.vendingMachineJava.models;

import java.io.Serializable;

//java beans must be Serializable
public class VendingMachine implements Serializable {

    public int Id;

    public String Name;

    public int PricePerSoda;

    //java beans require empty constructor
    public VendingMachine() {

    }

    //because we have an empty constructor that meets the requirements for a java bean
    //we can now use a constructor with the filled out arguments
    public VendingMachine(int Id, String Name, int PricePerSoda) {

        this.Id = Id;
        this.Name = Name;
        this.PricePerSoda = PricePerSoda;

    }

    //getter for property Id
    public int getId() {
        return Id;
    }

    //setter for property Id
    public void setId(int Id) {
        this.Id = Id;
    }

    //getter for property Name
    public String getPurchaseName() {
        return Name;
    }

    //setter for property Name
    public void setPurchaseName(String Name) {
        this.Name = Name;
    }

    //getter for property PricePerSoda
    public int getPricePerSoda() {
        return PricePerSoda;
    }

    //setter for property PricePerSoda
    public void setPricePerSoda(int PricePerSoda) {
        this.PricePerSoda = PricePerSoda;
    }
}
