import java.util.Scanner;
public class MayG{
  public static void main(String [] args){
   
    Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the first number: ");
	int uno= scan.nextInt();
	System.out.println("Enter the second number: ");
	int dos= scan.nextInt();
	
	
	if (uno > dos) {
		System.out.println("Make your dreams cometrue");
	}
	else if (dos == uno){
		System.out.println("Never give up");
	}
    else {
		System.out.println("Do your best!");
	}
	
  
  }


}