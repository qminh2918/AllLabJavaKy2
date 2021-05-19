/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author MINH
 */
public class ClientImpl implements Client, Serializable {

    private BankManager bankManager;
    private String ClientName;

    public ClientImpl(BankManager bm, String name) {
        this.bankManager = bm;
        this.ClientName = name;
    }

    public BankManager getBankManager() throws RemoteException {
        return bankManager;
    }

    public String getName() throws RemoteException {
        return ClientName;
    }
}
