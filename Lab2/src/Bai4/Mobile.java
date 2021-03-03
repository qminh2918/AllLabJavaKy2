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
public class Mobile extends Engine{
    private String country;
    
    public Mobile(){}

    public Mobile(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Mobile(String country, String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.country = country;
    }
    
    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ngon ngu:" + country);
    }
    
    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nuoc san xuat: ");
        country = sc.nextLine();
    }
}
