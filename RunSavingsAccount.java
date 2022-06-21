/*import java.util.Scanner;
class RunSavingsAccount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		SavingsAccount savings = new SavingsAccount();
		
		System.out.print("Enter Interest Rate: ");
		savings.setInterestRate(sc.nextDouble());

		System.out.print("Enter deposit amount: ");
		savings.deposit(sc.nextDouble());
		System.out.println("Your balance is " + savings.getBalance());
		
		
		System.out.print("Press D for another deposit or W to withdraw: ");
		char let = sc.next().charAt(0);
		
		
		if(let == 'D' || let == 'd')
		{
			
			System.out.print("Enter Deposit amount: ");
			savings.deposit(sc.nextDouble());
			
			savings.deposit(let);
			
		}
		else if(let == 'W' || let == 'w')
		{
			
			System.out.println("Enter withdraw amount");
			savings.withdraw(sc.nextDouble());
			
			savings.withdraw(let);
			System.out.println("Your new balance is: " + savings.getBalance());
		}
		if (savings.getBalance() > 1000)
		{
			System.out.println("Your new balance is " + savings.getBalance());
		}
		
		
	}
}/*


import java.util.Scanner;
class RunSavingsAccount
{
	public static void main(String[] args)
	{
	
		SavingsAccount store = new SavingsAccount();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter interest rate: ");
		SavingsAccount.setInterestRate(s.nextDouble());
		
		System.out.print("Enter deposit amount: ");
		store.deposit(s.nextDouble());
		System.out.println("Your balance is" + store.getBalance());
		
		System.out.print("Press D for another Deposit or W to Withdraw");
		char ob = s.next().charAt(0);
		
		if(ob == 'D' || ob == 'd')
		{
			System.out.print("Enter deposit amount:  ");
			store.deposit(s.nextDouble());
			
			store.addInterest();
			System.out.println("Your balance is " + store.getBalance());
		}
		
		else if(ob == 'W' || ob == 'w')
		{
			System.out.print("Enter withdraw amount: ");
			store.withdraw(s.nextDouble());
			System.out.println("Your new balance is "+ store.getBalance());
		}
	}
}
