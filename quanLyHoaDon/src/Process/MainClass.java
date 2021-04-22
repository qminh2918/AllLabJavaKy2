/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Interface.Trangchu;

/**
 *
 * @author MINH
 */
public class MainClass {
    public  static Interface.Trangchu index = new Trangchu();
    public static Database.clsConnectDB connection = new Database.clsConnectDB();
    public static void main(String[] args) {
        Interface.Trangchu mainForm = new Interface.Trangchu();
        mainForm.show();
    }
}
