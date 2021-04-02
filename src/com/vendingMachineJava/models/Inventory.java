package com.vendingMachineJava.models;

import java.io.Serializable;

//java beans must be Serializable
public class Inventory implements Serializable {

    private int Id;

    private int Qty;

    private int ProductId;

    private Product Product;

    private int VendingMachineId;

    //java beans require empty constructor
    public Inventory() {

    }

    //because we have an empty constructor that meets the requirements for a java bean
    //we can now use a constructor with the filled out arguments
    public Inventory(int Id, int Qty, int ProductId, Product Product, int VendingMachineId) {

        this.Id = Id;
        this.Qty = Qty;
        this.ProductId = ProductId;
        this.Product = Product;
        this.VendingMachineId = VendingMachineId;
    }

    //getter for property Id
    public int getId() {
        return Id;
    }

    //setter for property Id
    public void setId(int Id) {
        this.Id = Id;
    }

    //getter for property Qty
    public int getQty() {
        return Qty;
    }

    //setter for property Qty
    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    //getter for property ProductId

    public int getProductId() {
        return ProductId;
    }

    //setter for property ProductId
    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    //getter for property Product
    public Product getProduct() {
        return Product;
    }

    //setter for property Product
    public void setProduct(Product Product) {
        this.Product = Product;
    }

    //getter for property VendingMachineId
    public int getVendingMachineId() {
        return VendingMachineId;
    }

    //setter for property VendingMachineId
    public void setVendingMachineId(int VendingMachineId) {
        this.VendingMachineId = VendingMachineId;
    }
}
