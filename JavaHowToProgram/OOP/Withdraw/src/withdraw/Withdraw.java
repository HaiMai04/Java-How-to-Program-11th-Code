package withdraw;
import java.util.Scanner;
class Account {
    private String name;
    private double balance;
    public Account(String name, double balance) {
        this.name = name;
       if(balance > 0) {
           this.balance = balance;
       }
    }
    public void Withdraw(double withdrawAmount) {
        if(withdrawAmount > 0 && withdrawAmount < balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("So du khong du");
        }
    }
    
    public void Deposit(double depositAmount) {
        if(depositAmount > 0) {
            balance = balance + depositAmount;
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    
}

public class Withdraw {

    public static void main(String[] args) {
       Account hai = new Account("hai", 9999);
       Account trung = new Account("trung", -9999);
       System.out.printf("tai khoan cua %s la: %.2f%n", hai.getName(), hai.getBalance());
       System.out.printf("tai khoan cua %s la: %.2f%n", trung.getName(), trung.getBalance());
       
       Scanner input = new Scanner(System.in);
       System.out.printf("Nhap so tien %s muon rut:%n", hai.getName());
       double depositAmount = input.nextDouble();
       hai.Withdraw(depositAmount);
       System.out.printf("so du con lai cua %s la: %.2f", hai.getName(), hai.getBalance());
    }
    
}
