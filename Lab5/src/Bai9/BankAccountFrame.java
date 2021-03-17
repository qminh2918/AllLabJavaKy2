/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import javax.swing.*;

/**
 *
 * @author kuxut
 */
public class BankAccountFrame extends JFrame{
    public BankAccountFrame() {
super("Bank Account Test");
add(new BankAccountComponent());
pack();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
new BankAccountFrame();
}
}
