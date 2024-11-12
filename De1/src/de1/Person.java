
package de1;


public class Person {
    private String hoTen;
    private String diaChi;
    private String ngaySinh;
    private String gioiTinh;

    public Person() {
    }

    public Person(String hoTen, String diaChi, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void hienThiTHongTin() {
        System.out.printf("%-15s%-15s%-15s%-15s",getHoTen(), getDiaChi(),getNgaySinh(),getGioiTinh());
    }
    
}
