import java.util.Scanner;

public class Tempterature{
    public static void main(String []args){
    
    double farenheit = 0.0;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter temperature in celcius: ");    
    double temperature = scanner.nextDouble();

    farenheit = (temperature * (9/5)) + 32

    System.out.println("Enter temperature in farenheit: " + farenheit); 
    }
}
