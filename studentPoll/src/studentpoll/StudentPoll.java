
package studentpoll;

public class StudentPoll {
   
    public static void main(String[] args) {
        int[] answer ={1,2,4,5,3,2,4,2,4,3,4,2,4,1,4,7,8,5,7,2,4,1,3};
        int[] rating = new int[6];
        for(int respond = 0; respond < answer.length; respond++) {
            try {
                ++rating[answer[respond]];
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.printf("aswer[%d] : %d %n", respond, answer[respond]);
            }
        }
        System.out.printf("%s %10s %n","Rating", "Frequency" );
        for(int i = 1; i < rating.length; i++) {
            System.out.printf("%3d %10d %n",i, rating[i]);
        }
            }
         
    }
    

