/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Ideapad
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    
    static class MyNumber{
        public int value;
    }
    
    public static MyNumber changeData(MyNumber number){
        System.out.println(System.identityHashCode(number));
        number.value = number.value + 1;
        return number;
    }
       
    public static void main(String[] args) {
        MyNumber x = new MyNumber();
        System.out.println(System.identityHashCode(x));
        
        x.value = 1000;
        MyNumber res = changeData(x);
        System.out.println(System.identityHashCode(res));

        System.out.println(x.value);
        System.out.println(res.value);
        
    }
    
}
