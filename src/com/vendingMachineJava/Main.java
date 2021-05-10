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
            case NOQUARTER:
                myVmForm.insertQuarterButton.setEnabled(true); //Insrt

                myVmForm.ejectQuarterButton.setEnabled(false); //Eject

                myVmForm.spriteButton.setEnabled(false); //Sprite
//                myVmForm.spriteButton.Text = "Sprite" + Environment.NewLine + "(" + GetInventory("Sprite") + ")"; //Sprite

                myVmForm.cokeButton.setEnabled(false);//Coke
//                myVmForm.cokeButton.Text = "Coke" + Environment.NewLine + "(" + GetInventory("Coke") + ")"; //Coke

                myVmForm.transactionHistoryButton.setEnabled(true); //Purchase Transaction
                break;
            case SOLD:
                myVmForm.insertQuarterButton.setEnabled(true); //Insrt

                myVmForm.ejectQuarterButton.setEnabled(false); //Eject

                myVmForm.spriteButton.setEnabled(false); //Sprite
//                myVmForm.spriteButton.Text = "Sprite" + Environment.NewLine + "(" + GetInventory("Sprite") + ")"; //Sprite

                myVmForm.cokeButton.setEnabled(false);//Coke
//                myVmForm.cokeButton.Text = "Coke" + Environment.NewLine + "(" + GetInventory("Coke") + ")"; //Coke

                myVmForm.transactionHistoryButton.setEnabled(true); //Purchase Transaction
                break;
            case HASQUATER:
                myVmForm.insertQuarterButton.setEnabled(false); //Insrt

                myVmForm.ejectQuarterButton.setEnabled(true); //Eject

//                if (GetInventory("Sprite")>0)
//                {
                      myVmForm.spriteButton.setEnabled(true);; //Sprite
////                    Form1.ActiveForm.Controls["button3"].Text = "Sprite" + Environment.NewLine + "(" + GetInventory("Sprite") + ")"; //Sprite
//
//                }
//                else
//                {
//                    Form1.ActiveForm.Controls["button3"].Enabled = false; //Sprite
////                    Form1.ActiveForm.Controls["button3"].Text = "Sprite" + Environment.NewLine + "(" +  "0" + ")"; //Sprite
//                }
//
//                if (GetInventory("Coke")>0)
//                {
                      myVmForm.cokeButton.setEnabled(true); //Coke
////                    Form1.ActiveForm.Controls["button4"].Text = "Coke" + Environment.NewLine + "(" + GetInventory("Coke") + ")"; //Coke
//                }
//                else
//                {
//                    Form1.ActiveForm.Controls["button4"].Enabled = false; //Coke
////                    Form1.ActiveForm.Controls["button4"].Text = "Coke" + Environment.NewLine + "(" + "0" + ")"; //Coke
//                }

                myVmForm.transactionHistoryButton.setEnabled(true); //Purchase Transaction
                break;

            case SOLDOUT:   //Sold out means both product is sold out
//                if (GetInventory("Sprite")>0)
//                {
//                    Form1.ActiveForm.Controls["button3"].Enabled = true; //Sprite
////                    Form1.ActiveForm.Controls["button3"].Text = "Sprite" + Environment.NewLine + "(" + GetInventory("Sprite") + ")"; //Sprite
//                }
//                else
//                {
//                    Form1.ActiveForm.Controls["button3"].Enabled = false; //Sprite
////                    Form1.ActiveForm.Controls["button3"].Text = "Sprite" + Environment.NewLine + "(" + "0" + ")"; //Sprite
//                }
//
//                if (GetInventory("Coke")>0)
//                {
//                    Form1.ActiveForm.Controls["button4"].Enabled = true; //Coke
////                    Form1.ActiveForm.Controls["button4"].Text = "Coke" + Environment.NewLine + "(" + GetInventory("Coke") + ")"; //Coke
//                }
//                else
//                {
//                    Form1.ActiveForm.Controls["button4"].Enabled = false; //Coke
////                    Form1.ActiveForm.Controls["button4"].Text = "Coke" + Environment.NewLine + "(" + "0" + ")"; //Coke
//                }

                myVmForm.insertQuarterButton.setEnabled(false); //Insrt

                myVmForm.ejectQuarterButton.setEnabled(false); //Eject

                myVmForm.spriteButton.setEnabled(false); //Sprite
//                Form1.ActiveForm.Controls["button3"].Text = "Sprite" + Environment.NewLine + "(" + GetInventory("Sprite") + ")"; //Sprite

                myVmForm.cokeButton.setEnabled(false); //Coke
//                Form1.ActiveForm.Controls["button4"].Text = "Coke" + Environment.NewLine + "(" + GetInventory("Coke") + ")"; //Coke

                myVmForm.transactionHistoryButton.setEnabled(true); //Purchase Transaction
                break;
        }

//        if ((Form1.ActiveForm.Controls["Button4"].Text == "Coke" + Environment.NewLine + "(" + 0 + ")") &&
//                (Form1.ActiveForm.Controls["Button3"].Text == "Sprite" + Environment.NewLine + "(" + 0 + ")"))
//        {
//            Form1.ActiveForm.Controls["button1"].Enabled = false; //Insrt
//            Program.programState = VendingMachineStateEnum.SoldOut;
//        }
//        else
//        {
//            Form1.ActiveForm.Controls["button1"].Enabled = true; //Insrt
//        }
//
//        }
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
