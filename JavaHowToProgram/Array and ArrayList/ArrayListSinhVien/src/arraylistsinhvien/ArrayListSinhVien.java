package arraylistsinhvien;
import java.util.Scanner;
import java.util.ArrayList;

class sinhvien {
    private int maSV;
    private String tenSV;
    
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }   
    public int getMaSV() {
        return maSV;
    }
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    public String getTenSV() {
        return tenSV;
    }
    public sinhvien(String tenSV, int maSV) {
        this.tenSV = tenSV;
        this.maSV = maSV;
    }
}

public class ArrayListSinhVien {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       ArrayList<sinhvien> Sinhvien = new ArrayList<>();
       
       System.out.println("nhap so sinh vien");
       int soSV = input.nextInt();

       input.nextLine();
       
        
       for(int i = 0; i < soSV; i++) {
           System.out.println("Nhap ten sinh vien thu " + (i + 1));
           String name = input.nextLine();
           System.out.println("Nhap ma sinh vien :");
           int id = input.nextInt();

          input.nextLine();

           Sinhvien.add(new sinhvien(name, id));
       }
       System.out.println("Danh sach sinh vien");
       System.out.printf("%-5s %-15s %-15s %n","STT", "ten sinh vien", "ma sinh vien");
       for(int i = 0; i < Sinhvien.size(); i++) {
          sinhvien sinhvien1 = Sinhvien.get(i);
          System.out.printf("%-5d %-15s %-15d %n", (i + 1), sinhvien1.getTenSV(), sinhvien1.getMaSV());
           
       }
       
    }
    
}