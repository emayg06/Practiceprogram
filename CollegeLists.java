import java.util.Scanner;

  public class CollegeLists{
	  
	  public static void main (String [] args){
		   
		  
		  Student s = new Student();
		  Employee e = new Employee();
		  Faculty f = new Faculty();
		  
		   Scanner ex = new Scanner(System.in);
		  
		  System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
		  String x = ex.next();
		  
		  if (x.equalsIgnoreCase("E")){
			
		  System.out.println("Type employee's name, contact number, salary and department.");
		  System.out.println("Press Enter after every input.");
		  
		  s.setName(ex.nextLine());g
		  s.setContactNum(ex.nextLine());
		  e.setSalary(ex.nextDouble());
		  e.setDepartment(ex.nextLine());
		  
		  System.out.println("----------------------------------------------------");
		  
		  System.out.println("Name: " + s.getName());
		  System.out.println("Contact Number: " + s.getContactNum());
		  System.out.println("Salary: " + e.getSalary());
		  System.out.println("Department: " + e.getDepartment());
		  
		  }

          else if (x.equalsIgnoreCase("S")){
			  System.out.println("Type employee's name, contact number,salary and department.");
			  System.out.println("Press Enter after every input.");
			  
			  s.setName(ex.nextLine());
			  s.setContactNum(ex.nextLine());
			  s.setProgram(ex.nextLine());
			  s.setYearLevel(ex.nextLine());
			  
			  System.out.println("----------------------------------------------------");
			  
			  System.out.println("Name: " + s.getName());
			  System.out.println("Contact Number: "  + s.getContactNum());
			  System.out.println("Program: " + s.getProgram());
			  System.out.println("YearLevel: " + s.getYearLevel());
		  }		  
		  	
		  	else if(x.equalsIgnoreCase("F")){
			 System.out.println("Press Y if the faculty member is regular/tenured or N if not.");
			  
			else if (x.equalsIgnoreCase("Y")){
			System.out.println("Press E for Employee, F for Faculty, or S for Student: " );
		    System.out.println("Type employee's name, contact number, salary and department.");
		    System.out.println("Press Enter after every input.");
			s.setName(ex.nextLine());
			s.setContactNum(ex.nextLine());
			e.setSalary(ex.nextDouble());
			e.setDepartment(ex.nextLine());
			
			System.out.println("-------------------------------------");
			
			System.out.println("Name: " + s.getName());
			System.out.println("Contact Number: " + s.getContactNum());
			System.out.println("Salary: " + e.getSalary());
			System.out.println("Department: " + e.getDepartment());
			System.out.println("Status :Regular/Tenured");
			
		}
		  else (x.equalsIgnoreCase("N")){
			System.out.println("Press E for Employee, F for Faculty, or S for Student: " );
		    System.out.println("Type employee's name, contact number, salary and department.");
		    System.out.println("Press Enter after every input.");
			s.setName(ex.nextLine());
			s.setContactNum(ex.nextLine());
			e.setSalary(ex.nextDouble());
			e.setDepartment(ex.nextLine());
			
			System.out.println("-------------------------------------");
			
			System.out.println("Name: " + s.getName());
			System.out.println("Contact Number: " + s.getContactNum());
			System.out.println("Salary: " + e.getSalary());
			System.out.println("Department: " + e.getDepartment());
			System.out.println("Status :Regular/Tenured");
		   }
		  
		  
		  }
	  }
   }

