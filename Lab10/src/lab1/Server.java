/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author MINH
 */
public class Server {

    public static void main(String argv[]) throws IOException {
        DatagramSocket s = new DatagramSocket(1234);
        System.out.println(" Lắng nghe..");
        while (true) {
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
            s.receive(packet);
            String message = new String(packet.getData(), 0, 0, packet.getLength());
            System.out.println("Tín hiệu từ " + packet.getAddress().getHostName() +"- "+message );
}
}
}
