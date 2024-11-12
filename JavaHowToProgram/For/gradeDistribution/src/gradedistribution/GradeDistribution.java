
package gradedistribution;


public class GradeDistribution {
        
    public static void main(String[] args) {
        int[] array = {0,0,0,0,0,0,1,2,4,2,1};
        for(int i = 0; i < array.length; i++) {
        if( i == 10) {
            System.out.printf("%n%d:", 100);
        }    else {
            System.out.printf("%n%d-%d:", i * 10, i *10 +9);
        }
        for(int x = 0; x < array[i]; x ++) {
            System.out.printf("*");
        }
    }
    
}
}