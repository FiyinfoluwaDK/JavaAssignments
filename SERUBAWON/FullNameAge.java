import java.util.Scanner;

public class FullNameAge{
    public static void main(String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter first name: ");    
    String firstName = scanner.nextLine();

    System.out.println("Enter last name: ");    
    String lastName = scanner.nextLine();

    System.out.println("What year were you born?: ")
    int year = scanner.nextInt();
    
    int age = 2025 - year;
    System.out.println("First Name: " + firstName); 
    System.out.println("Last Name: " + lastName); 
    System.out.println("Age: " + age); 
    }
}
