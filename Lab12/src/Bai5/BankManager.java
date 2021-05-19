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
public interface BankManager extends Remote {

    //Phương thức lấy tài khoản theo mã
    public Account getAccount(String accountNumber) throws RemoteException;
    //Phương thức lấy Client theo tên

    public Client getClient(String ClientName) throws RemoteException;
    //phương thức lấy mã khách hàng theo mã tài khoản

    public int getCustomerId(int accountId) throws RemoteException;
    //phương thức gửi tiền vào tài khoản

    public void deposit(String idAccount, float Amount) throws
            RemoteException;
    //phương thức rút tiền

    public void withdraw(String idAccount, float Amount) throws
            RemoteException;
}
