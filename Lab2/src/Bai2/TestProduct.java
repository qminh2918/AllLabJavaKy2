/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        ArrayList<Product> ProductList = new ArrayList<>();
        do{
            menu();
            System.out.println("Nhap vao lua chon cua ban: ");
            Scanner sc = new Scanner(System.in);
             n = Integer.parseInt(sc.nextLine());
            switch(n){
                case 1: {
                    System.out.println("-----------------");
                    int m;
                    System.out.println("Nhap vao n:");
                    m = Integer.parseInt(sc.nextLine());
                    for(int i=0;i<m;i++){
                        System.out.println("Nhap vao nhan vien thu"+(i+1));
                        Product pr = new Product();
                        pr.input();
                        ProductList.add(pr);
                    }
                }break;
                case 2:{
                    System.out.println("-----------------");
                    if(ProductList.size() == 0){
                        System.out.println("ban chua nhap du lieu");
                    }else{
                        int i=0;
                        System.out.println("Du lieu ban vua nhap la:");
                        for(Product pr: ProductList){
                            i++;
                            System.out.println("Thong tin hang hoa thu "+i);
                            pr.display();
                        }
                    }
                   
                }break;
                case 3:{
                    System.out.println("-----------------");
                    float max =0;
                    for(Product pr: ProductList)
                    {
                        if(max < pr.getGia1SP()){
                            max = pr.getGia1SP();
                        }
                    }
                    System.out.println("Thong tin mat hang co gia cao nhat la: ");
                    for(Product pr: ProductList){
                        if(pr.getGia1SP()==max){
                            pr.display();
                        }
                    }
                }break;
//                case 4: {
//                    System.out.println("-----------------");
//                    Collections.sort(ProductList, new Comparator<Product>(){
//                       public int compare(Product pr1, Product pr2){
//                           return pr1.getGia1SP()>pr2.getGia1SP()?-1:1;
//                       }
//                    });
//                    System.out.println("Danh sach duoc sap xep giam dan theo gia la:")
//                            int i=1;
//                            for(Product pr: ProductList){
//                                System.out.println("san pham thu:"+i);
//                                pr.output();
//                                i++;
//                            }
//                }break;
                case 5:{
                    System.out.println("-----------------");
                    for(Product pr: ProductList){
                        if(pr.getTenHH().equals("sua")|| pr.getTenHH().equals("SUA"))
                            pr.display();
                    }
                }break;
                case 6:
                break;
                default: {
                    System.out.println("khong co lua chon cua ban ");
                }break;
            }
        }while(n!=6);
    }
}
