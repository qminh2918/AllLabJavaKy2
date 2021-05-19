/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.rmi.*;
import Interface.LoginInterface;
import java.lang.Object;
import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Pham Tuan
 */
public class LoginModel extends UnicastRemoteObject implements LoginInterface{  
    public LoginModel()throws RemoteException{
        
    }

    public boolean getLogin(String user, String pass) throws RemoteException {
        boolean found = false;
        try {
            if(user.equals("admin")&&pass.equals("123")){
                return found =true;
            }else{
               return found =false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return found;
    }
    
}
