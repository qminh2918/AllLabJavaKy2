/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author MINH
 */
public class Employee extends Person{
    private double hesoLuong;
    private double tinhluong;
    private String danhgia;

    public Employee() {
    }

    public Employee(double hesoLuong, double tinhluong, String danhgia, String hoten, String diachi) {
        super(hoten, diachi);
        this.hesoLuong = hesoLuong;
        this.tinhluong = tinhluong;
        this.danhgia = danhgia;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    public double getTinhluong() {
        return tinhluong;
    }

    public void setTinhluong(double tinhluong) {
        this.tinhluong = tinhluong;
    }

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDiachi(String diachi) {
        super.setDiachi(diachi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDiachi() {
        return super.getDiachi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHoten(String hoten) {
        super.setHoten(hoten); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHoten() {
        return super.getHoten(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
