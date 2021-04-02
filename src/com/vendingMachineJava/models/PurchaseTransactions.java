package com.vendingMachineJava.models;

import java.util.Date;
import java.io.Serializable;

//java beans must be Serializable
public class PurchaseTransactions implements Serializable {

    private int Id;

    private int PurchaseTotal;

    private int PurchaseQty;

    private Date Time;

    private int ProductId;

    private Product Product;

    private int VendingMachineId;

    private VendingMachine VendingMachine;

    //java beans require empty constructor
    public PurchaseTransactions() {

    }

    //because we have an empty constructor that meets the requirements for a java bean
    //we can now use a constructor with the filled out arguments
    public PurchaseTransactions(int Id, int PurchaseTotal, int PurchaseQty, Date Time, int ProductId, Product Product, int VendingMachineId, VendingMachine VendingMachine) {

        this.Id = Id;
        this.PurchaseTotal = PurchaseTotal;
        this.PurchaseQty = PurchaseQty;
        this.Time = Time;
        this.ProductId = ProductId;
        this.Product = Product;
        this.VendingMachineId = VendingMachineId;
        this.VendingMachine = VendingMachine;
    }

    //getter for property Id
    public int getId() {
        return Id;
    }

    //setter for property Id
    public void setId(int Id) {
        this.Id = Id;
    }

    //getter for property PurchaseTotal
    public int getPurchaseTotal() {
        return PurchaseTotal;
    }

    //setter for property PurchaseTotal
    public void setPurchaseTotal(int PurchaseTotal) {
        this.PurchaseTotal = PurchaseTotal;
    }

    //getter for property PurchaseQty
    public int getPurchaseQty() {
        return PurchaseQty;
    }

    //setter for property PurchaseQty
    public void setPurchaseQty(int PurchaseQty) {
        this.PurchaseQty = PurchaseQty;
    }

    //getter for property Time
    public Date getTime() {
        return Time;
    }

    //setter for property Time
    public void setTime(Date Time) {
        this.Time = Time;
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

    //setter for property ProductId
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

    //getter for property VendingMachine
    public VendingMachine VendingMachine() {
        return VendingMachine;
    }

    //setter for property VendingMachine
    public void setVendingMachine(VendingMachine VendingMachine) {
        this.VendingMachine = VendingMachine;
    }
}
