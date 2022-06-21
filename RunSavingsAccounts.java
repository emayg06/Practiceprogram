import java.util.Scanner;// Import the Scannerclass 
class RunSavingsAccounts{ // This is the class name

public static void main (String[] args){ // This is the main method that used public identifier to access anywhere
   Scanner scan = new Scanner (System.in);
   
   SavingAccounts savings = new SavingAccounts ();//This is the Object Instatiation
   
   System.out.println("Enter Interest Rate: ");// The user's will input the Interest Rate 
   savings.getInterestRate(scan.nextDouble()); //InterestRate that has the double dataType because there might be the value that has a decimal points.
   
   System.out.print("Enter deposit amount: ");// The user's will Enter the deposit amount
   savings.deposit(scan.nextDouble());//Deposit that has the double dataType because there might be the value that has a decimal points.
   System.out.println("Your balance is" + " " + savings.getBalance());// This will show your balance.
   
   System.out.print("Press D for another deposit or W to withdraw: ");//The user's will enter "D" or "W" 
		char ex = scan.next().charAt(0);// This where you can input a single character/letter.
		
		if(ex == 'D' || ex == 'd')//condition wherein, whether the user's will input small or big letter the expected output will show.
		{
			
			System.out.print("Enter deposit amount: ");// User's will enter the deposit amount.
			savings.deposit(scan.nextDouble());//used the double dataType because there might be a value that has a decimal point.
		    if(savings.getBalance() >= 1000);//In this condition show if savings is greater than equal to 1000.
			{
			 savings.addInterest();// will add your Interest
			System.out.println("Your new balance is " + " " + savings.getBalance());// This will show your new balance.
			}
			
		}
		else if(ex == 'W' || ex == 'w')//condition wherein, whether the user's will input small or big letter the expected output will show.
		{
			
			System.out.println("Enter withdraw amount");//The user's will enter the withdraw amount.
			savings.withdraw(scan.nextDouble());//withdraw that has double dataType because there might be the value that has a decimal points.
			
			savings.withdraw(ex);// This were the character is indicate
			System.out.println("Your new balance is: " + " " + savings.getBalance());// This will show your new balance.
		}
		
		
		
      
    }
   
}


