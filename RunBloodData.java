import java.util.Scanner;
    public class RunBloodData {
        public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
        
		System.out.print("Enter blood type of patient: ");
		String input1 = scan.nextLine();
		
		System.out.print("Enter the Rhesus factor (+ or -): ");
		String input2 = scan.nextLine();
		
		BloodData bd = new BloodData (input1,input2);
		System.out.println(bd.getBloodType() + bd.getRhFactor() + " " + "is added to the blood bank. " );
		
		System.out.print("Enter blood type of patient: ");
		String input3 = scan.nextLine();
		
		System.out.print("Enter the Rhesus factor (+ or -): ");
		String input4 = scan.nextLine();
		
		BloodData bd1 = new BloodData (input3,input4);
		System.out.println(bd1.getBloodType() + bd1.getRhFactor() + " " + "is added to the blood bank. " );
		
	
		
		}
	}	