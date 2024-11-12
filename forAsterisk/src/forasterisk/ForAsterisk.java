
package forasterisk;


public class ForAsterisk {


    public static void main(String[] args) {
       int[] array = {1,3,5,7,9,7,5,3,1};
       for(int i = 0; i < array.length; i++) {
           System.out.printf("%n");
           for(int a = 0; a < array[i]; a++) {
               System.out.printf("*");
           }
       }
    }
    
}
