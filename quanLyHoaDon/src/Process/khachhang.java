/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

/**
 *
 * @author MINH
 */
public class khachhang {
    private String makh,tenkh,dthoai;

    public khachhang() {
    }

    public khachhang(String makh, String tenkh, String dthoai) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.dthoai = dthoai;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }
    
}
