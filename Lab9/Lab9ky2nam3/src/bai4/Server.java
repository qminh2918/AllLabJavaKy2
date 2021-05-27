/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ADMIN
 */
public class Server extends javax.swing.JFrame {

    private static ServerSocket ServerSocket = null;
    private static Socket ClientSocket = null;
    private static final int maxClientsCount = 10;
    private static final ClientThread[] threads = new ClientThread[maxClientsCount];

    public Server() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
                int portNumber = 2222;
                if (args.length < 1) {
                    System.out.println("Usage: java MultiThreadChatServer<portNumber>\n" + "Now using port number=" + portNumber);
                } else {
                    portNumber = Integer.valueOf(args[0]).intValue();
                }
                try {
                    ServerSocket = new ServerSocket(portNumber);
                } catch (IOException e) {
                    System.out.println(e);
                }
                while (true) {
                    try {
                        ClientSocket = ServerSocket.accept();
                        int i;
                        for (i = 0; i < maxClientsCount; i++) {
                            if (threads[i] == null) {
                                (threads[i] = new ClientThread(ClientSocket, threads)).start();
                                break;
                            }
                        }
                        if (i == maxClientsCount) {
                            DataOutputStream os = new DataOutputStream(ClientSocket.getOutputStream());
                            os.writeUTF("Server too busy. Try later.");
                            os.close();

                            ClientSocket.close();
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }
        });
    }
}
