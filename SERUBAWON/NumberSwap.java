import java.util.Scanner;

public class NumberSwap{
    public static void main(String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter first number");
    int firstNumber = scanner.nextInt();
    
    System.out.println("Enter second number");
    int secondNumber = scanner.nextInt();
    
    int temporary = secondNumber;
    secondNumber = firstNumber;
    firstNumber = temporary;
    
    System.out.println(firstNumber);
    System.out.println(secondNumber);
    
    }
}
