import java.util.Scanner;

public class NumberSwap{
    public static void main(String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter student score(0-50): ");
    int score = scanner.nextInt();
    
    if (score >= 0 && score <= 50){
        int scoreHundred = score * 2;
        System.out.println("Initial score: " + score);
        System.out.println("Score out of Hundred: " + scoreHundred);
        
        }
    }
}
