import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
  public class StudentList{
	  
	  public static void main(String [] args){
		  Scanner scan = new Scanner(System.in);
		  
		    HashMap<String,String> students = new LinkedHashMap <>();
			
		 int numb= 3;
		 for(int x = 1; x <= numb; x++){
	     System.out.print("Enter students number " + x + ":");
		 String studentsnumb = scan.nextLine();
		 System.out.print("Enter first name " + x + ":");
		 String fname = scan.nextLine();
		 
		 students.put(studentsnumb, fname);
		 
		}
		System.out.println("StudentList: "); 
		for(Map.Entry e: students.entrySet()){
			System.out.println(e.getKey () + " " + e.getValue());
		}
		 Object [] studentsnumb2 = students.keySet().toArray();
		   
	      System.out.print("Enter your student number: ");
		  String studentsnumb = scan.nextLine();
		  
		  System.out.print("Enter first name: ");
		  String fname = scan.nextLine();
		  
		  students.remove(studentsnumb2[2]);
		  students.put(studentsnumb,fname);
		  
		  System.out.println("StudentList: " );
		  for(Map.Entry e: students.entrySet()){
			  System.out.println(e.getKey() + " " + e.getValue()); 
		  }
	  }
  }
  

   
   
   