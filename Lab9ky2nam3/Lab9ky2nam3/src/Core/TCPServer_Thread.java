/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author Van Anh
 */
public class TCPServer_Thread extends Thread
{
 private ServerSocket mServer;
 private JTextArea mTxaStatus; //JTextArea để lưu status của Server
 public TCPServer_Thread(JTextArea txaStatus)
 {
 mTxaStatus = txaStatus;
 }
 @Override
 @SuppressWarnings("deprecation")
 public void run()
 {
 try
 {
 String so1,so2,so3;
 int tong;
            setmServer(new ServerSocket(1234));
            getmTxaStatus().append("Server đã sẵn sàng!\nĐang chờ dữ liệu...\n\n");
 while(true)
 {
 Socket connectionSocket = getmServer().accept();
 DataInputStream inFromClient = new
DataInputStream(connectionSocket.getInputStream());
 DataOutputStream outToClient = new
DataOutputStream(connectionSocket.getOutputStream());
 so1 = inFromClient.readLine();
 so2 = inFromClient.readLine();
                getmTxaStatus().append("Đã nhận 2 số a = " + so1 +", b = "+ so2 +"\n");
 int a = Integer.parseInt(so1);
 int b = Integer.parseInt(so2); 

 tong = a + b;
 so3 = String.valueOf(tong);
                getmTxaStatus().append("Thực hiện phép tính a + b\n");
 outToClient.writeBytes(so3+'\n');
                getmTxaStatus().append("Đã gửi kết quả về cho Client thành công\n\n");
 }
 }
 catch(IOException | NumberFormatException ex)
 {
 Logger.getLogger(TCPServer_Thread.class.getName()).log(Level.SEVERE,null, ex);
            getmTxaStatus().append("Server đã xảy ra lỗi\n");
 }
 }
 @SuppressWarnings("deprecation")
 public void StopServer()
 {
 super.stop();
 try {
            getmServer().close();
 } catch (IOException ex) {
Logger.getLogger(TCPServer_Thread.class.getName()).log(Level.SEVERE,null, ex);
 }
 }

    /**
     * @return the mServer
     */
    public ServerSocket getmServer() {
        return mServer;
    }

    /**
     * @param mServer the mServer to set
     */
    public void setmServer(ServerSocket mServer) {
        this.mServer = mServer;
    }

    /**
     * @return the mTxaStatus
     */
    public JTextArea getmTxaStatus() {
        return mTxaStatus;
    }

    /**
     * @param mTxaStatus the mTxaStatus to set
     */
    public void setmTxaStatus(JTextArea mTxaStatus) {
        this.mTxaStatus = mTxaStatus;
    }
}