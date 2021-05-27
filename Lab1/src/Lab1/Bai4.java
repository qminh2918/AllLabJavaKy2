/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class Bai4 {
    public static void main(String[] args) {
        int a;
        System.out.println("nhap so tien dien");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int tiendien = 0;
        if(a > 50)
        {
            tiendien = 50*5000 + (a - 50)*12000;
        }
        else
        {
            tiendien = a*5000;
        }
        System.out.println("tien dien la:"+tiendien);
    }
}
