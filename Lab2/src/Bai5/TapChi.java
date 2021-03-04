/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author MINH
 */
public class TapChi extends TaiLieu{
    private int soPhatHanh,thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int soPhatHanh, int thangPhatHanh, String maTailieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTailieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    @Override
    public void setSoBanPhatHanh(int soBanPhatHanh) {
        super.setSoBanPhatHanh(soBanPhatHanh); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSoBanPhatHanh() {
        return super.getSoBanPhatHanh(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        super.setTenNhaXuatBan(tenNhaXuatBan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTenNhaXuatBan() {
        return super.getTenNhaXuatBan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaTailieu(String maTailieu) {
        super.setMaTailieu(maTailieu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaTailieu() {
        return super.getMaTailieu(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    
    
}
