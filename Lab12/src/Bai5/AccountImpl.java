/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.io.Serializable;
import java.rmi.RemoteException;
/**
 *
 * @author MINH
 */
public class AccountImpl implements Account, Serializable {

    private BankManager bankManager;
    private Client Client;
    private float balance;
    private String accountNumber;

    public AccountImpl(BankManager bankManager, Client Client, String accountNumber, float bal) {
        this.bankManager = bankManager;
        this.Client = Client;
        this.balance = bal;
        this.accountNumber = accountNumber;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        balance -= amount;
    }

    public BankManager getBankManager() throws RemoteException {
        return bankManager;
    }

    public Client getClient() throws RemoteException {
        return Client;
    }

    public float getBalance() throws RemoteException {
        return balance;
    }

    public void setBalance(float bal) throws RemoteException {
        balance = bal;
    }

    public long getCash(long amount) throws 
            RemoteException {
        if (amount > balance) {
            throw new RemoteException();
        }
        balance = balance - amount;
        return amount;
    }
}
