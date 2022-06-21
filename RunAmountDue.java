import java.util.Scanner;
public class RunAmountDue{

     public static void main (String [] args){
      Scanner scan = new Scanner(System.in);
	  
	  AmountDue due = new AmountDue();
	  
	  System.out.println("Press any of the following then enter values seperated by spaces: ");
	  System.out.println("1- Price only");
	  System.out.println("2 - Price and quantity");
	  System.out.println("3 - Price,quantity, and display amount");
	  
	  int num = scan.nextInt();
	  
	  if (num == 1)
	  {
		  double uno = scan.nextDouble();
		  due.computeAmountDue(uno);
		  System.out.println("Amount due is " + " " + due.computeAmountDue(uno));
	  }
	  else if (num == 2)
	  {
		  
		  double uno = scan.nextInt();
		  double dos = scan.nextInt();
		  due.computeAmountDue(uno,dos);
		  System.out.println("Amount due is " + " " + due.computeAmountDue(uno,dos));
		  
	  }
	  else if(num == 3)
	  {
		  double uno = scan.nextInt();
		  double dos = scan.nextInt();
		  double tres = scan.nextInt();
		  due.computeAmountDue(uno,dos,tres);
		  System.out.println("Amount due is " + " " + due.computeAmountDue(uno,dos,tres));
		  
	  }
		 
		  

      
   }

}