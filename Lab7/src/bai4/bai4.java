/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.net.*;
import java.util.Enumeration;
/**
 *
 * @author kuxut
 */
public class bai4 {
public static void main(String[] args) throws Exception {
Enumeration interfaces = NetworkInterface.getNetworkInterfaces( );
while (interfaces.hasMoreElements( )) {
NetworkInterface ni = (NetworkInterface) interfaces.nextElement(
);
System.out.println(ni);
}
}
}
