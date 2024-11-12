package javatest.chuong3;

import java.util.Scanner;

class Account{
    private String mName;
    private String password;
    public void setName(String name) {
        this.mName = name;
    }
    public String getName() {
        return this.mName;
    }

    public void setPass(String pass) {
        this.password = pass;
    }
    public String getPass() {
        return this.password;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();
        System.out.printf("Initial name is %s\n", myAccount.getName());
        System.out.println("Please enter the name");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.printf("Name is %s\n", myAccount.getName());
        System.out.println("Nhap mat khau");
        String thePass = input.nextLine();
        myAccount.setPass(thePass);
        System.out.printf("Mat khau cua ban la %s", myAccount.getPass());
    }   

}

    
