import java.util.Scanner;
class RunSavingAccounts{

public static void main (String[] args){
   Scanner scan = new Scanner (System.in);
   
   SavingAccounts savings = new SavingAccounts ();
   
   System.out.println("Enter Interest Rate: ");
   savings.setInterestRate(scan.nextDouble());
   
   System.out.print("Enter deposit amount: ");
   savings.deposit(scan.nextDouble());
   System.out.println("Your balance is" + " " + savings.getBalance());
   
   System.out.print("Press D for another deposit or W to withdraw: ");
		char let = scan.next().charAt(0);
		
		if(let == 'D' || let == 'd')
		{
			
			System.out.print("Enter Deposit amount: ");
			savings.deposit(scan.nextDouble());
			
			savings.deposit(let);
			
		}
		else if(let == 'W' || let == 'w')
		{
			
			System.out.println("Enter withdraw amount");
			savings.withdraw(scan.nextDouble());
			
			savings.withdraw(let);
			System.out.println("Your new balance is: " + savings.getBalance());
		}
		if (savings.getBalance() > 1000)
		{
			System.out.println("Your new balance is " + savings.getBalance());
		}
		
		

}



}