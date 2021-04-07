package com.vendingMachineJava;

import javax.swing.*;
import java.awt.*;

public class vmForm {

    public JPanel vmPanel;

    private JButton insertQuarterButton;

    private JButton ejectQuarterButton;

    private JButton spriteButton;

    private JButton cokeButton;

    private JButton transactionHistoryButton;

    private JTextArea vmViewer;

    private JTextArea stateViewer;

    public vmForm() {

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
//    public JTextArea getVmViewer() {
//        return vmViewer;
//    }
//
//    public void setVmViewer(JTextArea vmViewer) {
//        vmViewer = vmViewer;
//    }
//
//    public JTextArea getStateViewer() {
//        return stateViewer;
//    }
//
//    public void setStateViewer(JTextArea stateViewer) {
//        this.stateViewer = stateViewer;
//    }

    private void initComp() {
        // TODO: place custom component creation code here
        this.vmPanel = new JPanel();
        this.insertQuarterButton = new JButton();
        this.ejectQuarterButton = new JButton();
        this.spriteButton = new JButton();
        this.cokeButton = new JButton();
        this.transactionHistoryButton = new JButton();
        this.vmViewer = new JTextArea();
        this.stateViewer = new JTextArea();
    }

}
