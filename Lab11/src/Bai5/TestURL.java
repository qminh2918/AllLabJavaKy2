/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author kuxut
 */
public class TestURL {
    public static void main(String[] args) throws Exception
 {
     String link;
     System.out.println("Nhập URL cần phân tích: ");
     Scanner scan=new Scanner(System.in);
     link=scan.nextLine();
     URL url = new URL(link);
     displayURL(url); 
 }
    private static void displayURL(URL url) 
 { 
 System.out.println("URL: " + url); 
 System.out.printf(" Protocol: %-32s Host: %-32s\n", 
 url.getProtocol(),url.getHost()); 
 System.out.printf(" Port: %-32d Path: %-32s\n", 
 url.getPort(),url.getPath()); 
 System.out.printf(" Authority: %-32s Query: %-32s\n", 
 url.getAuthority(),url.getQuery()); 
 System.out.println(" User Info: " + url.getUserInfo()); 
 }
}
