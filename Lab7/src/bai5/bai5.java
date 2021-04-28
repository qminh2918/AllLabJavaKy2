/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;
import static java.lang.System.out;
import java.net.*;
import java.util.Collections;
import java.util.Enumeration;
/**
 *
 * @author kuxut
 */
public class bai5
{
public static void main(String args[]) throws SocketException {
Enumeration<NetworkInterface> nets =
NetworkInterface.getNetworkInterfaces();
for (NetworkInterface netIf : Collections.list(nets)) {
out.printf("Display name: %s\n", netIf.getDisplayName());
out.printf("Name: %s\n", netIf.getName());
displaySubInterfaces(netIf);
out.printf("\n");
}
}
static void displaySubInterfaces(NetworkInterface netIf) throws
SocketException {
Enumeration<NetworkInterface> subIfs = netIf.getSubInterfaces();
for (NetworkInterface subIf : Collections.list(subIfs)) {
out.printf("\tSub Interface Display name: %s\n",
subIf.getDisplayName());
out.printf("\tSub Interface Name: %s\n", subIf.getName());
}
}
}