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

public class TestProduct {
    
 static void menu() {
        System.out.println("1. Nhập thông tin cho n sản phẩm");
        System.out.println("2. Hiển thị thông tin vừa nhập");
        System.out.println("3. Tìm ra sản phẩm có giá bán cao nhất");
        System.out.println("4. Sắp xếp theo thứ tự giảm dần của giá");
        System.out.println("5. Tìm trong danh sách hàng hóa có mặt hàng 'Sữa' hay không ?");
        System.out.println("6. Thoát");
 }
    public static void main(String[] args) {
        int n = 0;
        Product a = new Product();
        Product[] products = null;
        do{
            menu();
            System.out.println("Nhap vao lua chon cua ban: ");
            Scanner sc = new Scanner(System.in);
            switch(n){
                case 1: {
                    int m;
                    System.out.println("Nhap vao n:");
                    m = Integer.parseInt(sc.nextLine());
                    products = new Product[m];
                    for(int i =0;i<m;i++)
                    {
                        products[i]= new Product();
                        products[i].input();
                    }
                }break;
                
                case 2:{
                    if(products == null){
                        System.out.println("ban chua nhap du lieu");
                    }else{
                        System.out.println("Du lieu ban vua nhap la:");
                        for(int i=0;i<products.length;i++){
                            System.out.println("Thogn tin hang hoa thu "+(i+1));
                            products[i].display();
                        }
                    }
                }break;
                case 3:{
                    
                }break;
                
                case 4: {
                    if(products == null){
                        System.out.println("Ban chua nhap du lieu!");
                    }else {
                        a.sort(products);
                        System.out.println("Du lieu sau khi sap xep la:");
                        for(int i=0;i<products.length;i++){
                            System.out.println("thong tin hang hoa thu "+(i+1));
                            products[i].display();
                        }
                    }
                }break;
                
            }
        }while(n!=6);
    }
}
