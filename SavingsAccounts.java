public class SavingAccounts{

   private double balance;
        public static double interestRate = 0;
        public SavingAccounts(); //The constructor
       { 

        balance = 0;
		//The end of constructor

        }
         public static void getInterestRate(double newRate){ // This will show your current balance
		 
		 newRate = interestRate;
		 }
		 public static double getInterestRate(){
		  return interestRate;
		 }
		 public double getbalace(){
		 return balance;
		 }
		 public void deposit(double amount)
		 {
		 balance += amount;
		 }
		 public double withdraw(double amount){
		 
		 if(balance >= amount){
		 
		 amount -=balance;
		  
		 }
		  else 
		  {
		  
		  amount = 0;
		  
		  }
		   return amount;
		   
		   	
	public void addInterest()
	{
		double interest = balance * interestRate;
		
		balance = balance + interest;
		
	}
	public static void showBalance (SavingsAccount account)
	{
		System.out.print(account.getBalance());
	}
		   
	

}