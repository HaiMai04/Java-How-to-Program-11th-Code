
package de1;


public class Student extends Person {
    private String maSV;
    private String email;
    private double diemTongKet;

    public Student() {
    }

    public Student(String maSV, String email, double diemTongKet) {
        this.maSV = maSV;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public Student(String maSV, String email, double diemTongKet, String hoTen, String diaChi, String ngaySinh, String gioiTinh) {
        super(hoTen, diaChi, ngaySinh, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getEmail() {
        return email;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    @Override
    public void hienThiTHongTin() {
        super.hienThiTHongTin(); 
        System.out.printf("%-15s%-15s%-15f%n", getMaSV(), getEmail(), getDiemTongKet());
    }
    
}
