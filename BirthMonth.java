import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
public class BirthMonth{
	public static void main (String []args){
		Set group1 = new HashSet();
		Set group2 = new HashSet();
		Set self = new HashSet();
		
		Scanner scan = new Scanner(System.in);
		
		int numb = 3;

        for (int x = 1; x <= numb; x++) {

            System.out.print("Enter birth month " + x + ":" );

            String group = scan.nextLine();
            Collections.addAll(group1, group);
        }
        
        int numb1 = 3;
		 for(int x = 1; x <= numb1; x++){
		    System.out.print("Enter birth month " + x + ":" );
			String groups = scan.nextLine();
            Collections.addAll(group2, groups);
        }
			System.out.println("Group 1: " + group1);
			System.out.println("Group 2: " + group2);
			
			System.out.print("Enter your birth month: ");
			self.add(scan.nextLine());
			
			Set union = new HashSet(group1);
	    	Set inter = new HashSet(group1);
	    	Set diff = new HashSet(group1);
			union.addAll(group2);
			inter.retainAll(group2);
			diff.removeAll(group2);
			
			System.out.println("Union: " + union);
			System.out.println("Intersection: " + inter);
			System.out.println("Difference: " + diff);
			
		   	if (union.containsAll(self)){
		   		System.out.print("You have the same birthmonth with your classmates. ");
		   		
		   	}
		   		else {
		   			System.out.print("You don't have the same birthmonth with your classmates. ");
		   		}	
	 }
}