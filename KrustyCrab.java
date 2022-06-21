import java.util.Scanner;

public class KrustyCrab {
	
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.print(" ----------- START -------------");
		String ans = scan.nextLine();
		System.out.print("Enter your username: " + ans);
		String Uname = scan.nextLine();
		System.out.println("Welcome to Krusty Crab" + " " + Uname);
		
		System.out.println("================================================");
		System.out.println("You are in the middle of Bikini Bottom and you saw a restaurant named KrustyCrab ");
		System.out.println("        		");
		
    	
		Squidward sq = new Squidward();
		sq.makeMenu();
		
		Customer cs = new Customer();
		System.out.println("                  ");
		System.out.println("Choose your order");
		System.out.print("Enter your Krabby Meal: ");
		String meal = scan.next();
		System.out.print("Enter your Krabby Drinks: ");
		String drink = scan.next();
		System.out.print("Enter Quantity: ");
		int quan = scan.nextInt();
		
		String selectedKrabbyMeal;
		int amountMeal;
		switch(meal){
		case "A":
			  selectedKrabbyMeal = "Krabby Pattie w/ Sea Cheese"; 
			  amountMeal = 50;
			  break;
	    case "B":
			  selectedKrabbyMeal = "Double Krabby Patty w/ Sea Cheese";
			  amountMeal = 150;
			  break;
		case "C":
			  selectedKrabbyMeal = "Tripple Krabby Patty w/ Sea Cheese";
			  amountMeal = 250;
			  break;
		 default:
			  selectedKrabbyMeal = "Invalid Meal";
			  amountMeal = 0;
			  break;
		}
		String selectedKrabbyDrinks;
		int amountDrinks;
		switch(drink){
		case "D":
			  selectedKrabbyDrinks = "Super SeaWeed Shake";
			  amountDrinks = 50;
			  break;
		case "E":
			  selectedKrabbyDrinks = "Sea Foam Soda";
			  amountDrinks = 100;
			  break;
			  default:
			  selectedKrabbyDrinks = "Invalid Drinks";
			  amountDrinks = 0;
			  break;
				}
				System.out.println("Order: " + selectedKrabbyMeal + " " + selectedKrabbyDrinks);
				System.out.println("Total: "  + ((amountMeal+amountDrinks)*quan));
 			 
			 Spongebob sb = new Spongebob();
			 sb.makeMeal();
	}
	  }
		
		

