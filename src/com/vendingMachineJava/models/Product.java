package com.vendingMachineJava.models;

import java.io.Serializable;

//java beans must be Serializable
public class Product implements Serializable {

    private int Id;

    private String Name;

    //java beans require empty constructor
    public Product() {

    }

    //because we have an empty constructor that meets the requirements for a java bean
    //we can now use a constructor with the filled out arguments
    public Product(int Id, String Name) {

        this.Id = Id;
        this.Name = Name;
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
    public String getName() {
        return Name;
    }

    //setter for property Name
    public void setName(String Name) {
        this.Name = Name;
    }
}
