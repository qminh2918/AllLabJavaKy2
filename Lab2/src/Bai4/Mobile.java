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

    @Override
    public void setPrice(float price) {
        super.setPrice(price); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setYearMaking(int yearMaking) {
        super.setYearMaking(yearMaking); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getYearMaking() {
        return super.getYearMaking(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEngineName(String engineName) {
        super.setEngineName(engineName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEngineName() {
        return super.getEngineName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEngineId(String engineId) {
        super.setEngineId(engineId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEngineId() {
        return super.getEngineId(); //To change body of generated methods, choose Tools | Templates.
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
