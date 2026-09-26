import java.util.Scanner;
public class Kata{
  public static void main(String[]args){

    
  } 


public static int maximum(int numberOne,int numberTwo){
  if(numberOne > numberTwo) return numberOne;
  else return numberTwo;
}

public static boolean isEven(int number){
  if (number % 2 == 0){ return true;}
  else return false;
}

public static boolean isPrimeNumber(int number){
  int factors = 0;
  for(int count = 1; count <= number; count++){
  if (number % count == 0){
      factors++;}
}
  if (factors == 2) return true;
  else return false;
}

public static int subtract(int numberOne,int numberTwo){
  int result = numberOne - numberTwo;
  if(0 > result) return -1 * result;
  else return result;
}

public static float divide(int numberOne,int numberTwo){
  float result = (numberOne * 1.0) / numberTwo;
  if(numberTwo == 0) return 0;
  else return result;
}

public static int factorOf(int number){
  for(int count = 1; count <= number; count++){
  if (number % count == 0){
      return count;}
}
}
  
public static boolean isPerfectSquare(int number){
  double squareRoot = Math.sqrt(number);
  int roundedSqrt = squareRoot;
  if (squareRoot == roundedSqrt) return true;
  else return false;
}

public static boolean isPalindrome(int number){
  if (int number.length() ==5){
    if(number.charAt(0) == number.charAt(4) && number.charAt(1) == number.charAt(3)) return true;
    else return false;
  }
}

public static long factorialOf(int number){
  int factorial = 1;
  for(int count = 1; count <= number; count++){
    factorial *= count;
  }
  return factorial;
}

public static long squareOf(int number){
  return number * number;
}
}
