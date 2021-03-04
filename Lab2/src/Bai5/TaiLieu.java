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
public class TaiLieu {
    private String maTailieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTailieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTailieu = maTailieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTailieu() {
        return maTailieu;
    }

    public void setMaTailieu(String maTailieu) {
        this.maTailieu = maTailieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }    
}
