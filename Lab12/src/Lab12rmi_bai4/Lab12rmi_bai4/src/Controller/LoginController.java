/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import Model.LoginModel;
import java.rmi.*;
/**
 *
 * @author Pham Tuan
 */
public class LoginController {
    public static void main(String[] args) {
        try {
             Registry reg = LocateRegistry.createRegistry(1099);
             LoginModel lp =new LoginModel();
             reg.rebind("login",lp);
             System.out.println("Server is ready");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
