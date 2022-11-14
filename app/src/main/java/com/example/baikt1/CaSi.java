package com.example.baikt1;

public class CaSi {
    //hình ảnh, tên, nghệ danh, quốc gia số sao được bình chọn
    String ten,nghedanh,quoctich;
    int soSaoBinhChon,hinhAnh;


    public CaSi() {
    }

    public CaSi(String ten, String nghedanh, String quoctich, int soSaoBinhChon, int hinhAnh) {
        this.ten = ten;
        this.nghedanh = nghedanh;
        this.quoctich = quoctich;
        this.soSaoBinhChon = soSaoBinhChon;
        this.hinhAnh = hinhAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public int getSoSaoBinhChon() {
        return soSaoBinhChon;
    }

    public void setSoSaoBinhChon(int soSaoBinhChon) {
        this.soSaoBinhChon = soSaoBinhChon;
    }
    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
