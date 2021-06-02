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
public interface Account extends Remote {
    //Trả về ngân hàng quản lý tài khoản này
    public BankManager getBankManager() throws RemoteException;
 //Trả về Client của tài khoản này
 public Client getClient() throws RemoteException;
 //Lấy số dư tài khoản
 public float getBalance() throws RemoteException;
 //Chỉnh sửa số dư tài khoản
 public void setBalance(float bal) throws RemoteException;
 //phương thức rút tiền có kiểm tra số dư trước khi rút. Trả về amount
 public long getCash (long amount) throws RemoteException;
 //gửi tiền
 public void deposit(float amount) throws RemoteException;
 //rút tiền
 public void withdraw(float amount) throws RemoteException;
}
