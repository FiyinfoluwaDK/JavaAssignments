import java.util.Scanner;

public class NameAge{
    public static void main(String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter name: ");
    String name = scanner.nextLine();
    
    System.out.println("Enter age: ");
    int age = scanner.nextInt();
    
    System.out.println("hello, " + name + " You are " + age + "years old");
    
    }
}
