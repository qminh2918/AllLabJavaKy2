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
public class Sach extends TaiLieu{
    private String tenTacGia;
    private String tenSach;
    private int soTrang;

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

    public Sach() {
    }

    public Sach(String tenTacGia, String tenSach, int soTrang, String maTailieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTailieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
