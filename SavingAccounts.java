public class SavingAccounts{// This is the class Name

   private double balance;// This is the instance Variable that stores the balance.
        public static double interestRate = 0; // Used double it has a decimal point.
        public SavingAccounts()//This is the constructor.
       { 

        balance = 0; // This is the end of Constructor.
		
        }
         public static void getInterestRate(double newRate){ // This is the static Method with a parameter() of double newRate.
		 
			interestRate= newRate; // In this method newRate is assign to interestRate.
		 }
		 public static double getInterestRate(){ // This is the static method that has the double data type.
		  return interestRate; // You'll return to interestRate
		 }
		 public double getBalance(){// A non-static Method that has a data type double
		 return balance; // You'll return to balance
		 }
		 public void deposit(double amount)//will show your current balance
		 {
		 balance += amount;// Will sum up or update the amount of your balance
		 }
		 public double withdraw(double amount){ // This is a method with a parameter() of double amount
		 
		 if(balance >= amount){// the condition that has the value of balance greater than or equal the amount
		 
		 amount -=balance; //This will show the deduction amount from balance
		  
		 }
		  else 
		  {
		  
		  amount = 0;// amount equal to zero.
		  
		  }
		   return amount;// Return to amount.
		   
		 }   	
	public void addInterest()// A void method that has avariable name "interest" with a double data type.
	{
		double interest = balance * interestRate; // This will multiply the balance to interestRate.
		
		balance = balance + interest;// Then will sum the balance and interest.
		
	}
	public static void showBalance(SavingAccounts account)// This will show your balance.
	{
		System.out.print(account.getBalance());//This will show your current balance.
	}
		   
	

}