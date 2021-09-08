package com.Codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class App {
    private JPanel panelMain;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton xButton1;
    private JButton a4Button;
    private JButton a0Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton minusButton;
    private JButton a3Button;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton a1Button;
    private JButton button16;
    private JButton button1;
    private JButton cButton;
    private JButton CEButton;
    private JButton button4;
    private JLabel textbox;

    private BigDecimal firstNumber;
    private BigDecimal secondNumber;
    private boolean isActionAssigned;
    private String actionAssigned;

    private void numberPress(String num){
        if(isActionAssigned){
            textbox.setText(num);
            isActionAssigned = false;
        } else if(textbox.getText().equals("0")){
            textbox.setText(num);
        } else {
            textbox.setText(textbox.getText() + num);
        }
    }

    public App() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberPress("0");
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isActionAssigned){
                    secondNumber = new BigDecimal(textbox.getText());
                    firstNumber = firstNumber.add(secondNumber);
                    textbox.setText(firstNumber.toString());
                } else {
                    firstNumber = new BigDecimal(textbox.getText());
//                    System.out.println(firstNumber.toString());
                    isActionAssigned = true;
                    actionAssigned = "+";
                }

            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isActionAssigned){
                    secondNumber = new BigDecimal(textbox.getText());
                    firstNumber = firstNumber.subtract(secondNumber);
                    textbox.setText(firstNumber.toString());
                } else {
                    firstNumber = new BigDecimal(textbox.getText());
                    //System.out.println(firstNumber.toString());
                    isActionAssigned = true;
                    actionAssigned = "-";
                }
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = null;
                secondNumber = null;
                isActionAssigned = false;
                actionAssigned = null;
                textbox.setText("0");
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textbox.getText().equals("0")){

                } else {
                    textbox.setText("0");
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textbox.getText().length() == 1){
                    textbox.setText("0");
                } else {
                    textbox.setText(textbox.getText().substring(0,(textbox.getText().length() - 1)));
                }
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(actionAssigned.equals("+")){
                    secondNumber = new BigDecimal(textbox.getText());
                    firstNumber = firstNumber.add(secondNumber);
                    textbox.setText(firstNumber.toString());
                }
                if(actionAssigned.equals("-")){
                    secondNumber = new BigDecimal(textbox.getText());
                    firstNumber = firstNumber.subtract(secondNumber);
                    textbox.setText(firstNumber.toString());
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
