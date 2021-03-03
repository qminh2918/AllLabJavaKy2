/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class Manager {

    static void menu() {
        System.out.println("1 nhap thong tin n dien thoai ");
        System.out.println("2 nhap thong tin n o to");
        System.out.println("3 Hien thi thong tin ca dien thoai va o to");
        System.out.println("4 tim kiem theo ten nha san xuat");
        System.out.println("5 thoat");
    }

    public static void main(String[] args) {
        int n = 0;
        Mobile mb = new Mobile();
        Mobile[] mbList = null;
        Car c = new Car();
        Car[] cList = null;
        do {
            menu();
            System.out.println("Nhap vao lua chon cua ban :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhap vao so luong dien thoai:");
                    m = Integer.parseInt(sc.nextLine());
                    mbList = new Mobile[m];
                    for (int i = 0; i < m; i++) {
                        mbList[i] = new Mobile();
                        mbList[i].input();
                    }
                }
                break;
                case 2: {
                    int m;
                    System.out.println("Nhap vao so luong o to:");
                    m = Integer.parseInt(sc.nextLine());
                    cList = new Car[m];
                    for (int i = 0; i < m; i++) {
                        cList[i] = new Car();
                        cList[i].input();
                    }
                }
                break;
                case 3: {
                    if (mbList == null) {
                        System.out.println("ban chua nhap du lieu dien thoai");
                    } else {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < mbList.length; i++) {
                            System.out.println("thong tin dien thoai thu " + (i + 1));
                            mbList[i].display();
                        }
                    }
                    if (cList == null) {
                        System.out.println("ban chua nhap du lieu o to");
                    } else {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < cList.length; i++) {
                            System.out.println("thong tin o to thu " + (i + 1));
                            cList[i].display();
                        }
                    }
                }
                break;
                case 4: {
                    System.out.println("Nhap ten nha san xuat:");
                    String nhasx = sc.nextLine();
                    int dem = 0;
                    for (int i = 0; i < mbList.length; i++) {
                        if (mbList[i].getManufacturer().equals(nhasx)) {
                            mbList[i].display();
                            dem++;
                        }
                    }
                    for (int i = 0; i < cList.length; i++) {
                        if (cList[i].getManufacturer().equals(nhasx)) {
                            cList[i].display();
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        System.out.println("khong co sach ban muon tim");
                    }
                }
                break;
                case 5:
                    break;
                default: {
                    System.out.println("khong co lua chon cua ban ");
                    break;
                }
            }
        } while (n != 5);
    }
}
