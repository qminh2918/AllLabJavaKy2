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
public class KhachVietNam extends KhachHang{
    private String loaiKH;
    private int dinhmuc;

    public KhachVietNam() {
    }

    public KhachVietNam(String loaiKH, int dinhmuc, String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        super(maKH, hotenKH, soLuong, dongia, thanhtien, ngayHD);
        this.loaiKH = loaiKH;
        this.dinhmuc = dinhmuc;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
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
