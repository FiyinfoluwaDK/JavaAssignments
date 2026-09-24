import java.util.Scanner;

public class Cashier{
    public static void main(String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter item price: ");    
    double quantity = scanner.nextDouble();

    System.out.println("Enter quantity: ");    
    double price = scanner.nextDouble();

    double subTotal =  price * quantity;
    double VAT = subtotal * 0.20;
    double grandTotal = subtotal + VAT;
    
    System.out.println("GrandTotal: " + grandTotal); 
    }
}
