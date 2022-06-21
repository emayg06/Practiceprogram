import java.util.Scanner;
import java.util.Stack;
public class FruitBasket{
   
   public static void main(String [] args){
       
  Scanner scan = new Scanner(System.in);
  Stack basket = new Stack ();
  
  basket.push("apple");
  basket.push("orange");
  basket.push("mango");
  basket.push("guava");
  
   System.out.println("Catch and eat any of these fruits: " + basket);
   
   int numb;
  
  System.out.print("How many fruits would you like to catch?: ");
  numb = scan.nextInt();
  
  System.out.println("Choose a fruit to catch. Press A,O,M, or G. ");
  
  
  int a = 4;
  for ( int b = 1; b <= a; b++){
      System.out.print("Fruit" + " " + b +" of " + a + " : ");
      char ex = scan.next().charAt(0);
  
     if (ex =='A' || ex == 'a')
	 {
	
	 basket.push("apple");
	 }
	 else if (ex == 'O' || ex == 'b'){
	
	 basket.push("orange");
	 }
	 else if (ex == 'M' || ex == 'm'){
	
	 basket.push("mango");
	 }
	 else if (ex == 'G' || ex == 'g'){
	 
	 basket.push("guava");
	 }
	
  }
     System.out.println("Your basket now has: " + basket);
     
     int op = 3;
     
     for (int b = 1; b <= op; b--)
     {
         System.out.println("Press E to eat a fruit: ");
         char ekis = scan.next().charAt(0);
         if ( ekis == 'E' || ekis == 'e')
         {
           basket.pop ();
           if(basket.isEmpty())
           {
            System.out.println("No more fruits");
            break;
            
           }
           else
           {
               System.out.println("Fruit(s) in the basket: " + basket);
           }
         }
     }
      
      
  
   }	 
}
