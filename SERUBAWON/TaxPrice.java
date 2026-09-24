import java.util.Scanner;

public class TaxPrice{
    public static void main(String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter first number: ");    
    double price = scanner.nextDouble();

    double tax = price * 0.075;
    double total = price + tax;
    
    System.out.println("Total tax price: " + total); 
    }
}
