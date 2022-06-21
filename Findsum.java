import java.util.Scanner;
public class FindSum{
    static int num, sum;
	static int find_sum(int y){
	if (y == 1 || y == 0){
	    return y;
	}
	
	else {
	return(y + find_sum(y-1));
	
	}    
  }

public static void main(String []args){
  Scanner scan= new Scanner(System.in);
  System.out.print("Enter a number: ");
  num = scan.nextInt();
  sum = find_sum(num);
  System.out.println("The sum of the first" + " " + num + " " + "integers is: " + sum + ".");

  }
  
  
}


  