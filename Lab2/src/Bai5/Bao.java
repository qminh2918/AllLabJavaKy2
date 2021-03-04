/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Date;

/**
 *
 * @author MINH
 */
public class Bao extends TaiLieu{
    private Date ngayPhatHanh;

    public Bao() {
    }

    public Bao(Date ngayPhatHanh, String maTailieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTailieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
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
    
    
}
