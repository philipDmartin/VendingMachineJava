package com.vendingMachineJava;

import com.vendingMachineJava.models.PurchaseTransaction;
import com.vendingMachineJava.services.*;
import com.vendingMachineJava.models.VendingMachineStateEnum;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
//import javax.swing.JOptionPane;

public abstract class vmForm implements ActionListener {

//COMPONENTS
    public JPanel vmPanel;

    public JButton insertQuarterButton;

    public JButton ejectQuarterButton;

    public JButton spriteButton;

    public JButton cokeButton;

    public JButton transactionHistoryButton;

    public JTextArea vmViewer;

    public JTextArea stateViewer;

//GETTERS and SETTERS
    public JButton getInsertQuarterButton() {
        this.insertQuarterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ManageState(VendingMachineStateEnum.HASQUATER);
                vmViewer.setText("Now You Can Select A Soda");
            }
        });

        return insertQuarterButton;
    }

    public void setInsertQuarterButton(JButton insertQuarterButton) {
        this.insertQuarterButton = insertQuarterButton;
    }

    public JButton getEjectQuarterButton() {
      this.ejectQuarterButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.ManageState(VendingMachineStateEnum.NOQUARTER);
            vmViewer.setText("Please Insert A Quater");
        }
    });

        return ejectQuarterButton;
    }

    public void setEjectQuarterButton(JButton ejectQuarterButton) {
        this.ejectQuarterButton = ejectQuarterButton;
    }

    public JButton getSpriteButton() {
        this.spriteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ManageState(VendingMachineStateEnum.SOLD);
                vmViewer.setText("You Have Selected Sprite Now Despensing");
            }
        });

        return spriteButton;
    }

    public void setSpriteButton(JButton spriteButton) {
        this.spriteButton = spriteButton;
    }

    public JButton getCokeButton() {
        this.cokeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ManageState(VendingMachineStateEnum.SOLD);
                vmViewer.setText("You Have Selected Coke Now Despensing");
            }
        });

        return cokeButton;
    }

    public void setCokeButton(JButton cokeButton) {
        this.cokeButton = cokeButton;
    }

    public JButton getTransactionHistoryButton() {

        PurchaseTransactionService myPurchaseTransactionService;
        List<PurchaseTransaction> myPurchaseTransactionList;

        myPurchaseTransactionService = new PurchaseTransactionService();
        myPurchaseTransactionList = myPurchaseTransactionService.GetAll();

        Main.ManageState(Main.programState);

        String strAllPurchaseTransactions = "";

        for (PurchaseTransaction purchaseTransaction : myPurchaseTransactionList) {
            strAllPurchaseTransactions += "Quarters Amount:" + " " + purchaseTransaction.getPurchaseTotal() + ", " + "Poduct:" + " " + purchaseTransaction.getProduct().getName() + ", " + "Qty:" + " " + purchaseTransaction.getPurchaseQty() + ", " + "Timestamp:" + " " + purchaseTransaction.getTime() + ", " + "Machine:" + " " + purchaseTransaction.VendingMachine().Name;
            strAllPurchaseTransactions += System.lineSeparator();

        }

        vmViewer.setText(strAllPurchaseTransactions);

        return transactionHistoryButton;
    }

    public void setTransactionHistoryButton(JButton transactionHistoryButton) {

        this.transactionHistoryButton = transactionHistoryButton;
    }

    public JTextArea getVmViewer() {
        return vmViewer;
    }

    public void setVmViewer(JTextArea vmViewer) {
        this.vmViewer = vmViewer;
    }

    public JTextArea getStateViewer() {
        return stateViewer;
    }

    public void setStateViewer(JTextArea stateViewer) {
        this.stateViewer = stateViewer;
    }
}
