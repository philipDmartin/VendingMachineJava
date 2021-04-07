package com.vendingMachineJava;
import com.vendingMachineJava.models.*;
import javax.swing.*;
import java.awt.*;

public class Main {


    private static vmForm myVmForm;


    public static void main(String[] args) {
	// write your code here

        vmForm myVmForm = new vmForm();
        JFrame frame = new JFrame("Vending Machine");
        frame.setContentPane(myVmForm.vmPanel);
        frame.setVisible(true);
        frame.setBounds(600,600,600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
