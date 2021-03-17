/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author kuxut
 */
public class LogView extends JScrollPane implements ObServer {
    public LogView(String title) {
super(transactionArea);
setBorder(new TitledBorder(title));
}
public void update(Observable account, Object message) {
if ( message == null ) {
transactionArea.setText("");
}
else {
transactionArea.append((String)message);
}
}
private static final JTextArea transactionArea = new JTextArea(40,45);
}
