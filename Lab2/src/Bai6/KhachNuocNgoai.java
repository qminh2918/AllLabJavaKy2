/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Date;

/**
 *
 * @author MINH
 */
public class KhachNuocNgoai extends KhachHang{
    private String quoctich;

    public KhachNuocNgoai() {
    }

    public KhachNuocNgoai(String quoctich, String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        super(maKH, hotenKH, soLuong, dongia, thanhtien, ngayHD);
        this.quoctich = quoctich;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    @Override
    public void setNgayHD(Date ngayHD) {
        super.setNgayHD(ngayHD); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getNgayHD() {
        return super.getNgayHD(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setThanhtien(double thanhtien) {
        super.setThanhtien(thanhtien); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getThanhtien() {
        return super.getThanhtien(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDongia(double dongia) {
        super.setDongia(dongia); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDongia() {
        return super.getDongia(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSoLuong(int soLuong) {
        super.setSoLuong(soLuong); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSoLuong() {
        return super.getSoLuong(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHotenKH(String hotenKH) {
        super.setHotenKH(hotenKH); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHotenKH() {
        return super.getHotenKH(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaKH(String maKH) {
        super.setMaKH(maKH); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaKH() {
        return super.getMaKH(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
