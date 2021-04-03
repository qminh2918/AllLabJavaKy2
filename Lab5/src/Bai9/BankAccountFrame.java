/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class BankAccountFrame extends JFrame {
    public BankAccountFrame(){
        super("Bank Account Test");
        add(new Bai9.BankAccountComponent());
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new BankAccountFrame();
    }
}
