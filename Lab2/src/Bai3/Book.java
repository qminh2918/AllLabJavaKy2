/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;
    Scanner scan = new Scanner(System.in);

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }
    
    public Book (){}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
     public void input() {
        System.out.print("\n Ten sach:");
            bookName=scan.nextLine();
        System.out.print("\n Tac gia:");
            bookAuthor=scan.nextLine();
         System.out.print("\n Nha xuat ban:");
            producer=scan.nextLine();
        System.out.print("\n Nam phat hanh:");
            yearPublishing=scan.nextInt();
        System.out.println("\n Gia ban:");
            price=scan.nextFloat();
        
    }
    
    public void display()
 {
    System.out.print("\n Ten sach:"+bookName);
    System.out.print("\n Tac gia:"+bookAuthor);
    System.out.print("\n Nha xuat ban:"+producer);
    System.out.print("\n Nam phat hanh:"+ yearPublishing);
    System.out.print("\n Gia ban 1 san pham:"+price);
 }
    
       
}
