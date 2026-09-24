import java.util.Scanner;

public class MilesToKM{
    public static void main(String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter distance in miles: ");    
    double miles = scanner.nextDouble();

    double kilometres = miles * 1.60934;
    
    System.out.println("Distance in miles: " + miles); 
    
    System.out.println("Distance in kilometres: " + kilometres); 
    }
}
