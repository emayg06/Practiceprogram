import java.util.*;
public class Factorial{

 public static int factorial(int n){
   if(n==0)
      return 1;
	else
	  return(n * factorial(n-1));
	  
 }
  public static void main(String []args){
   int fact,number;
   Scanner scan = new Scanner (System.in);
   System.out.print("Enter a number to calculate factorial: ");
   number = scan.nextInt();
   fact = factorial(number);
   System.out.println("Factorial of " + number + " is " + fact);
  }
}