/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8server;

/**
 *
 * @author kuxut
 */
import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
public class Lab8Server {
    public static boolean snt(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String argv[]) throws Exception
    {
        String sentence_from_client;
        String sentence_to_client = null;
        
        //Tạo socket server, chờ tại cổng '6543'
        ServerSocket welcomeSocket = new ServerSocket(6543);
        
        while(true) {
            //chờ yêu cầu từ client
            Socket connectionSocket = welcomeSocket.accept();
            
            //Tạo input stream, nối tới Socket
            BufferedReader inFromClient =
                new BufferedReader(new
                    InputStreamReader(connectionSocket.getInputStream())); 
            
            //Tạo outputStream, nối tới socket
            DataOutputStream outToClient =
                new DataOutputStream(connectionSocket.getOutputStream());
            
            //Đọc thông tin từ socket
            sentence_from_client = inFromClient.readLine();
            System.out.println("thong tin tu client gui den la: "+sentence_from_client);
            int i = Integer.parseInt(sentence_from_client);
            if(snt(i)){
            sentence_to_client = (i) +" la so nguyen to" + '\n';
            }
            //ghi dữ liệu ra socket
            outToClient.writeBytes(sentence_to_client); 
            return;
        }
        
    }
}