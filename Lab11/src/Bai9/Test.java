/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;
import java.util.Properties;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;  
import javax.mail.internet.*;  

/**
 *
 * @author kuxut
 */
public class Test {
    public static void main(String[] args) throws AddressException {  
  
  String host="mail.google.com";  
  final String user="readme@gmail.com";
  final String password="writeityourself";
  String to="receiver@gmail.com";
  InternetAddress[] iAdressArray = null;
        try {
            iAdressArray = InternetAddress.parse(to);
        } catch (AddressException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  
   Properties props = new Properties();  
   props.put("mail.smtp.auth", true);
   props.put("mail.smtp.starttls.enable", true);
   props.put("mail.smtp.host", "smtp.gmail.com");
   props.put("mail.smtp.port", "587"); 
     
   Session session = Session.getDefaultInstance(props,  
    new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
	//Nhớ là đéo có thư viện activation với javax.mail thì đéo chạy được code đâu
    try {  
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.setRecipients(Message.RecipientType.CC, iAdressArray);
     message.setSubject("I meo được gửi tự động");  
     message.setText("Đây là thư điện tử được gửi tự động từ máy tính");  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {
         System.out.println("message sent unsuccessfully..."); 
         e.printStackTrace();}  
 }  
}
