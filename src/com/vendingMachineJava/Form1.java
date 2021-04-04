package com.vendingMachineJava;

import javax.swing.*;
import java.awt.*;

public class Form1 {

    private JPanel Form1;

    private JButton insertQuarterButton;


    private JButton ejectQuarterButton;

    private JButton spriteButton;

    private JButton cokeButton;

    private JButton transactionHistoryButton;

    private JTextArea Screen;

    private JTextArea stateScreenTextArea;

    public Form1 (JButton insertQuarterButton, JButton ejectQuarterButton, JButton spriteButton, JButton cokeButton, JButton transactionHistoryButton, JTextArea Screen, JTextArea stateScreenTextArea) {
        this.insertQuarterButton = insertQuarterButton;
        this.ejectQuarterButton = ejectQuarterButton;
        this.spriteButton = spriteButton;
        this.cokeButton = cokeButton;
        this.transactionHistoryButton = transactionHistoryButton;
        this.Screen = Screen;
        this.stateScreenTextArea = stateScreenTextArea;
    }

    public JTextArea insrtQ() {
        String butS = "yo";
        this.Screen = butS;
        return insrtQ();
    }

//    public JButton getInsertQuarterButton() {
//        return insertQuarterButton;
//    }
//
//    public void setInsertQuarterButton(JButton insertQuarterButton) {
//        this.insertQuarterButton = insertQuarterButton;
//    }
//
//    public JButton getEjectQuarterButton() {
//        return ejectQuarterButton;
//    }
//
//    public void setEjectQuarterButton(JButton ejectQuarterButton) {
//        this.ejectQuarterButton = ejectQuarterButton;
//    }
//
//    public JButton getSpriteButton() {
//        return spriteButton;
//    }
//
//    public void setSpriteButton(JButton spriteButton) {
//        this.spriteButton = spriteButton;
//    }
//
//    public JButton getCokeButton() {
//        return cokeButton;
//    }
//
//    public void setCokeButton(JButton cokeButton) {
//        this.cokeButton = cokeButton;
//    }
//
//    public JButton getTransactionHistoryButton() {
//        return transactionHistoryButton;
//    }
//
//    public void setTransactionHistoryButton(JButton transactionHistoryButton) {
//        this.transactionHistoryButton = transactionHistoryButton;
//    }
//
    public JTextArea getScreen() {
        return Screen;
    }

    public void setScreen(JTextArea screen) {
        Screen = screen;
    }
//
//    public JTextArea getStateScreenTextArea() {
//        return stateScreenTextArea;
//    }
//
//    public void setStateScreenTextArea(JTextArea stateScreenTextArea) {
//        this.stateScreenTextArea = stateScreenTextArea;
//    }

}
