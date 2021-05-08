package com.vendingMachineJava;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.JOptionPane;

public abstract class vmForm implements ActionListener {

//COMPONENTS
    public JPanel vmPanel;

    private JButton insertQuarterButton;

    private JButton ejectQuarterButton;

    private JButton spriteButton;

    private JButton cokeButton;

    private JButton transactionHistoryButton;

    private JTextArea vmViewer;

    private JTextArea stateViewer;

//GETTERS and SETTERS
    public JButton getInsertQuarterButton() {
        this.insertQuarterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stateViewer.setText("Has Quater");
                vmViewer.setText("Now You Can Select A Soda");
                spriteButton.setEnabled(true);
                cokeButton.setEnabled(true);
                ejectQuarterButton.setEnabled(true);
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
            stateViewer.setText("Has No Quater");
            vmViewer.setText("Please Select A Soda");
            spriteButton.setEnabled(false);
            cokeButton.setEnabled(false);
            ejectQuarterButton.setEnabled(false);
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
                stateViewer.setText("Sold");
                vmViewer.setText("You Have Selected Sprite Now Despensing");
                spriteButton.setEnabled(false);
                cokeButton.setEnabled(false);
                ejectQuarterButton.setEnabled(false);
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
                stateViewer.setText("Sold");
                vmViewer.setText("You Have Selected Coke Now Despensing");
                spriteButton.setEnabled(false);
                cokeButton.setEnabled(false);
                ejectQuarterButton.setEnabled(false);
            }
        });

        return cokeButton;
    }

    public void setCokeButton(JButton cokeButton) {
        this.cokeButton = cokeButton;
    }

    public JButton getTransactionHistoryButton() {
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
