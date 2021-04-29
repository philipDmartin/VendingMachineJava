package com.vendingMachineJava;

import com.vendingMachineJava.models.*;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static VendingMachine myVendingMachine;

//    public static InventoryService myInventoryService;

    public static VendingMachineStateEnum programState;

    public static void ManageState(VendingMachineStateEnum currentState) {
        Main.programState = currentState;

//        JTextArea stateView = vmForm.Application.OpenForms["Form1"].Controls["stateViewer"] as JTextArea;

        switch (currentState) {
//            case VendingMachineStateEnum.NOQUARTER:
//                vmForm.ActiveForm.Controls["insertQuarterButton"].Enabled = true; //Insrt
//
//                vmForm.ActiveForm.Controls["ejectQuarterButton"].Enabled = false; //Eject
//
//                vmForm.ActiveForm.Controls["spriteButton"].Enabled = false; //Sprite
//                vmForm.ActiveForm.Controls["spriteButton"].Text = "Sprite" + Environment.NewLine + "(" + GetInventory("Sprite") + ")"; //Sprite
//
//                vmForm.ActiveForm.Controls["cokeButton"].Enabled = false; //Coke
//                vmForm.ActiveForm.Controls["cokeButton"].Text = "Coke" + Environment.NewLine + "(" + GetInventory("Coke") + ")"; //Coke
//
//                vmForm.ActiveForm.Controls["purchaseTransactionButton"].Enabled = true; //Purchase Transaction
//                break;
        }
    }

    public static void main(String[] args) {
        // write your code here

        vmForm myVmForm = new vmForm();
        JFrame frame = new JFrame("Vending Machine");
        frame.setContentPane(myVmForm.vmPanel);
        frame.setVisible(true);
        frame.setBounds(600, 600, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
