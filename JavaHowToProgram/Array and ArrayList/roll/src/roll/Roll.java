
package roll;
import java.security.SecureRandom;
public class Roll {
    
    public static void main(String[] args) {
       int a =0, b=0, c=0, d=0, e=0;
      SecureRandom number = new SecureRandom();
    for (int i = 0; i < 50000; i++) {
        int face = 1 + number.nextInt(5);
        switch(face) {
            case 1:
                a++;
                break;
            case 2:
                b++;
                break;
            case 3:
                c++;
                break;
            case 4:
                d++;
                break;
            case 5:
                e++;
                break;
            
        }
   }
        System.out.printf("%d-%d-%d-%d-%d",a,b,c,d,e);
    }
    
}
