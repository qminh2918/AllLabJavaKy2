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
public class Student extends Person{
    private double mh1;
    private double mh2;
    private double tinhtb;
    private String danhgia;

    public Student() {
    }

    public Student(double mh1, double mh2, double tinhtb, String danhgia, String hoten, String diachi) {
        super(hoten, diachi);
        this.mh1 = mh1;
        this.mh2 = mh2;
        this.tinhtb = tinhtb;
        this.danhgia = danhgia;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public double getMh1() {
        return mh1;
    }

    public void setMh1(double mh1) {
        this.mh1 = mh1;
    }

    public double getMh2() {
        return mh2;
    }

    public void setMh2(double mh2) {
        this.mh2 = mh2;
    }

    public double getTinhtb() {
        return tinhtb;
    }

    public void setTinhtb(double tinhtb) {
        this.tinhtb = tinhtb;
    }

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
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
