package com.example.listview;

public class traiCay {
    private String tenTraiCay;
    private String chucNang;
    private int hinhAnh;

    public traiCay(String tenTraiCay, String chucNang, int hinhAnh) {
        this.tenTraiCay = tenTraiCay;
        this.chucNang = chucNang;
        this.hinhAnh = hinhAnh;
    }

    public String getTenTraiCay() {
        return tenTraiCay;
    }

    public void setTenTraiCay(String tenTraiCay) {
        this.tenTraiCay = tenTraiCay;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
