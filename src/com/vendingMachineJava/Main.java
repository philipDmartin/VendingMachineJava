package com.vendingMachineJava;
import com.vendingMachineJava.vmForm;
import com.vendingMachineJava.models.*;
import com.vendingMachineJava.services.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {

    public static VendingMachine myVendingMachine;

    public static InventoryService myInventoryService;

    public static VendingMachineStateEnum programState;

    public static vmForm myVmForm;

    //STATE MANAGER
    public static void ManageState(VendingMachineStateEnum currentState) {
        Main.programState = currentState;

        myVmForm.stateViewer.setText(Main.programState.toString());

        switch (currentState) {
            case VendingMachineStateEnum.NOQUARTER:
                vmForm.ActiveForm.Controls["insertQuarterButton"].Enabled = true; //Insrt

                vmForm.ActiveForm.Controls["ejectQuarterButton"].Enabled = false; //Eject

                vmForm.ActiveForm.Controls["spriteButton"].Enabled = false; //Sprite
                vmForm.ActiveForm.Controls["spriteButton"].Text = "Sprite" + Environment.NewLine + "(" + GetInventory("Sprite") + ")"; //Sprite

                vmForm.ActiveForm.Controls["cokeButton"].Enabled = false; //Coke
                vmForm.ActiveForm.Controls["cokeButton"].Text = "Coke" + Environment.NewLine + "(" + GetInventory("Coke") + ")"; //Coke

                vmForm.ActiveForm.Controls["purchaseTransactionButton"].Enabled = true; //Purchase Transaction
                break;
        }
    }

    //MAIN IMPLAMENTATION
    public static void main(String[] args) {
        // write your code here

        myVmForm = new vmForm() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        };
        JFrame frame = new JFrame("Vending Machine");
        frame.setContentPane(myVmForm.vmPanel);
        frame.setVisible(true);
        frame.setBounds(600, 600, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myVmForm.getInsertQuarterButton();
        myVmForm.getEjectQuarterButton();
        myVmForm.getSpriteButton();
        myVmForm.getCokeButton();
        Main.ManageState(VendingMachineStateEnum.NOQUARTER);
    }
}
