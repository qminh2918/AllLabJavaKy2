/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class Product {
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1SP;
    Scanner scan=new Scanner(System.in);
    
    public Product () {}

    public Product(String maHH, String tenHH, float soLuong) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }

    @Override
    public String toString() {
        return "Product{" + "maHH=" + maHH + ", tenHH=" + tenHH + ", soLuong=" + soLuong + ", gia1SP=" + gia1SP + '}';
    }
    
    public void input() {
        System.out.print("\n Ma hang hoa:");
            maHH=scan.nextLine();
        System.out.print("\n Ten hang hoa:");
            tenHH=scan.nextLine();
        System.out.print("\n So luong:");
            soLuong=scan.nextFloat();
        System.out.println("\n Gia ban 1 san pham:");
            gia1SP=scan.nextFloat();
        
    }
    
    public void display()
 {
    System.out.print("\n Ma hang hoa:"+maHH);
    System.out.print("\n Ten hang hoa:"+tenHH);
    System.out.print("\n So luong:"+soLuong);
    System.out.println("\n Gia ban 1 san pham:"+gia1SP);
 }
       
}
