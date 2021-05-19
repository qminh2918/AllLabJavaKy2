/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author MINH
 */
public interface Client {

    //Phương thức trả về ngân hàng quản lý Client này
    public BankManager getBankManager() throws RemoteException;

    //Phương thức trả về tên của Client
    public String getName() throws RemoteException;

}
