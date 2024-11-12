
package arrayliste;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
    
        
    
public class ArraylistE {
    public static void main(String[] args) {
        
    
   
        
       ArrayList<Integer> number = new ArrayList<>();
       number.add(10);
       number.add(20);
       number.add(30);
       number.add(40);
       
       System.out.println("Number = :" + number);
       System.out.println("phan tu so 2: " + number.get(2));
       
       number.set(3, 4);
       System.out.println("sau cap nhat" + number);
       
       number.remove(0);
       System.out.println("sau khi xoa " + number);
       
       System.out.println("kich thuoc cua ArrayList: " + number.size());
    
    }
    
}
