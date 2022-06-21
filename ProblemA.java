import java.util.Scanner;

public class ProblemA{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Meal: ");
		String meal = scan.next();
		
		System.out.print("Enter Drink: ");
		String drink = scan.next();
		
		System.out.print("Enter Quantity: ");
		int quan = scan.nextInt();
		
		String Meal;
		int amountMeal;
		
		switch(meal){
			case "A":
				Meal = "Chicken & Spaghetti";
				amountMeal = 150;
				break;
			case "B":
				Meal = "Hamburger & Fries";
				amountMeal = 145;
				break;
			case "C":
				Meal = "Cheesedog";
				amountMeal = 100;
				break;
			case "D":
				Meal = "Pizza";
				amountMeal = 80;
				break;
			default:
				Meal = "Invalid Meal";
				amountMeal = 0;
				break;
		}
		
		String Drinks;
		int amountDrinks;
		switch(drink){
			case "S":
				Drinks = "Small Drink";
				amountDrinks = 30;
				break;
			case "M":
				Drinks = "Medium Drink";
				amountDrinks = 35;
				break;
			case "L":
				Drinks = "Large Drink";
				amountDrinks = 45;
				break;
			default:
				Drinks = "Invalid Drink";
				amountDrinks = 0;
				break;
		}
		
		System.out.println("Order: "+ Meal + " " + Drinks);
		System.out.println("Total: "+ ((amountMeal+amountDrinks)*quan));
		
		
	}
}
