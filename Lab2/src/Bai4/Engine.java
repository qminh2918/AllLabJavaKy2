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
public class Engine {
    private String engineId;
    private String engineName;
    private String manufacturer;
    private int yearMaking;
    private float price;
    Scanner scan = new Scanner(System.in);
    
    public Engine(){}

    public Engine(String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.manufacturer = manufacturer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
     public void input() {
        System.out.print("\n Ma may:");
            engineId=scan.nextLine();
        System.out.print("\n Ten may:");
            engineName=scan.nextLine();
         System.out.print("\n Ten nha san xuat:");
            manufacturer=scan.nextLine();
        System.out.print("\n Nam san xuat:");
            yearMaking=scan.nextInt();
        System.out.println("\n Gia ban:");
            price=scan.nextFloat();
        
    }
    
    public void display()
 {
    System.out.print("\n Ma may:"+engineId);
    System.out.print("\n Ten may:"+engineName);
    System.out.print("\n Ten nha san xuat:"+manufacturer);
    System.out.print("\n Nam san xuat:"+ yearMaking);
    System.out.print("\n Gia ban :"+price);
 }
    

}
