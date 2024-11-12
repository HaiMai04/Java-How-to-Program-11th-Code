
package store;
import java.util.Scanner;

public class Store {
  private String name;
    private int number;
    private double price;
    private int quantity;
    private double invoice;
    public Store(String name, int number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }
    
    public void quantity() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%nenter %s quantity: ", name);
        this.quantity = input.nextInt();
    }
    
    public double invoice() {
        if(quantity < number) {
             invoice = quantity * price;
             number -= quantity;
        }
        return invoice;
    }
    
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getNumber() {
        return number;
    }
    public static void main(String[] args) {
       Store food = new Store("food", 100, 8);
       Store wood = new Store("wood", 78, 8);
       Store stone = new Store("stone", 25, 10);
       
       food.quantity();
       System.out.printf(" %d %s: %.2f", food.getQuantity(), food.getName(), food.invoice());
        System.out.printf("%n numer %s left is : %d", food.getName(), food.getNumber());
        
       wood.quantity();
       System.out.printf(" %d %s: %.2f", wood.getQuantity(), wood.getName(), wood.invoice());
         System.out.printf("%n number %s left is : %d", wood.getName(), wood.getNumber());
         
       stone.quantity();
     System.out.printf(" %d %s: %.2f", stone.getQuantity(), stone.getName(), stone.invoice());
      System.out.printf("%n number %s left is : %d", stone.getName(), stone.getNumber());
     System.out.printf("%ntotal invoice : %.2f", food.invoice() + wood.invoice() + stone.invoice());
     
    
   
    
    }
}
