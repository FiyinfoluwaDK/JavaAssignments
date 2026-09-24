import java.util.Scanner;

public class SizeSelection{
    public static void main(String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter number): ");
    int x = scanner.nextInt();
    
    if (x > 20)
        System.out.println("Big");
    if (x > 10)
        System.out.println("Medium");    
    else
        System.out.println("small");
    }
}
