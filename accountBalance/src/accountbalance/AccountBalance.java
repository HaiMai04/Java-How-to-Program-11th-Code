
package accountbalance;

import java.util.Scanner;

class account {
    private String aName;
    private double aBalance;
    public account(String name, double balance) {
        this.aName = name;
        if(balance > 0.0) {
        this.aBalance = balance;
        }
    }
    public void deposit(double depositAmount) {
        if(depositAmount > 0.0) {
            aBalance = aBalance + depositAmount; 
        }
    }
    public double getBalance() {
        return aBalance;
    }
    public void setName(String name) {
        this.aName = name;
    }
    public String getName() {
        return aName;
    }
}


public class AccountBalance {

    
    public static void main(String[] args) {
        account account1 = new account("Hai", 90.0);
        account account2 = new account("Nam", -10.0);
        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
        
         Scanner input = new Scanner(System.in);
        
         System.out.println("Nhap so tien gui cho tai khoan 1 :");
         double depositAmount1 = input.nextDouble();
         System.out.printf("them vao %.2f cho tai khoan 1%n", depositAmount1);
         account1.deposit(depositAmount1);
          System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
         
          System.out.println("Nhap so tien gui cho tai khoan 2 :");
         double depositAmount2 = input.nextDouble();
         System.out.printf("them vao %.2f cho tai khoan 2%n", depositAmount2);
         account2.deposit(depositAmount2);
        
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
    }
    
}
