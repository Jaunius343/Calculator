package com.Codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public App() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textbox.setText("1");
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