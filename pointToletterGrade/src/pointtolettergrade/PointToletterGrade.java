
package pointtolettergrade;
    import java.util.Scanner;
    
 class student {
    private String name;
    private double point;
    
    public String getName() {
        return name;
    }
    public double getPoint() {
        return point;
    }
  public student(String name, double point) {
      this.name = name;
      if( 0 <= point && point <= 10) {
          this.point = point;
      }
  }
}
public class PointToletterGrade {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap ten hoc sinh");
       String ten = input.nextLine();
       System.out.println("Nhap diem hoc sinh");
       double diem = input.nextDouble();
       student student1 = new student(ten, diem);
       
       if(0 < student1.getPoint() && student1.getPoint() < 4) {
           System.out.printf("diem cua %s la %s %n", student1.getName(), "F");
       } else if (4 <= student1.getPoint() && student1.getPoint() <= 5.4) {
            System.out.printf("diem cua %s la %s %n", student1.getName(), "D");
       } else if (5.5 <= student1.getPoint() && student1.getPoint() <= 6.9) {
           System.out.printf("diem cua %s la %s %n", student1.getName(), "C");
       } else if (7 <= student1.getPoint() && student1.getPoint() <= 8.4) {
             System.out.printf("diem cua %s la %s %n", student1.getName(), "B");
       } else if (8.5 <= student1.getPoint() && student1.getPoint() <= 10) {
            System.out.printf("diem cua %s la %s %n", student1.getName(), "A");
       }
    }
    
}

