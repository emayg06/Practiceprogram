import java.util.Scanner;
	
   public class Ilay{
	   public static void main(String args[]){
		   Scanner scan=new Scanner(System.in);
		   
		   String userName,password,nickName;
		   int age,barangay,cellphoneNumber;
		   
		   System.out.println("What is your name?");
		   userName=scan.nextLine();
		   System.out.println("What is your password?");
		   password=scan.nextLine();
		   System.out.println("What is your nickName?");
		   nickName=scan.nextLine();
		   System.out.println("How old are you?");
		   age=scan.nextInt();
		   System.out.println("Enter your  Barangay?");
		   barangay=scan.nextInt();
		   System.out.println("Enter your cellphoneNumber?");
		   cellphoneNumber=scan.nextInt();
	   }
   }