ort java.util.Scanner;	// it is used for the user to input and the program will read it.
public class CollegeList {
	
    public static void main(String[] args) {
    	
    	Person pe = new Person();
    	Employee em = new Employee();	// here is the other classes and i inputted here.
    	Student st = new Student();
    	Faculty fa = new Faculty();
    	
    	Scanner jr = new Scanner(System.in).useDelimiter("\n");	// this is to segregate the input of the user and can use space.
    	
    	System.out.println("Press E for Employee, F for Faculty, or S for Student: ");
    	String f = jr.next();
    	
    	if(f.equalsIgnoreCase("E")){	// i used if else to represent if the user chooses the correct string input then it will set it to true
    		System.out.println("Type Employee's Name, Contact Number, salary, and department.");
    		System.out.println("Press Enter For Every Input.");
    		String name = jr.next();
    		em.setName(name);
    		
    		String num = jr.next();
    		em.setContactNum(num);									// Here i inputted the setter to update the value of a variable.
    		
    		Double sal = jr.nextDouble();
    		em.setSalary(sal);
    		
    		String dep = jr.next();
    		em.setDepartment(dep);
    		
    		System.out.println("-----------------------------------------");
    		System.out.println("Name: " + em.getName());
    		System.out.println("Contact Number: " + em.getContactNum());		// here i put the getter to read the value of a variable which
    		System.out.println("Salary: " + em.getSalary());					// has the setters variable.
    		System.out.println("Department: " + em.getDepartment());
    	}
    	if(f.equalsIgnoreCase 
    		System.out.println("Press Y if you are a regular/tenured, Press N if not.");
    		String b = jr.next();
    		
    		if(b.equalsIgnoreCase("Y")){	// i used another if else statement to let the users input to access it if they press y or n.
    			System.out.println("Type your name, Contact Number, Salary, Department.");	//equalsignorecase is used to if wether you type
    			System.out.println("Press Enter For Every Input.");						//capital letters or not it would be ok and it will read.
    			String name = jr.next();
    			fa.setName(name);
    			
    			String num = jr.next();
    			fa.setContactNum(num);
    		
    			Double sal = jr.nextDouble();
    			fa.setSalary(sal);
    		
    			String dep = jr.next();
    			fa.setDepartment(dep);
    			
    				if(fa.isRegular()){	//here i used the boolean because it is true thats why it access this code. if true then it will proceed
    					System.out.println("-----------------------------------------");
    					System.out.println("Name: " + fa.getName());
    					System.out.println("Contact Number: " + fa.getContactNum());
    					System.out.println("Salary: " + fa.getSalary());
    					System.out.println("Department: " + fa.getDepartment());
   						System.out.println("Status: Regular/Tenured");
    				}
    				
    		}
    		if(b.equalsIgnoreCase("N")){
    			System.out.println("Type your name, Contact Number, Salary, Department.");
    			System.out.println("Press Enter For Every Input.");
    			String name = jr.next();
    			fa.setName(name);
    			
    			String num = jr.next();
    			fa.setContactNum(num);
    		
    			Double sal = jr.nextDouble();
    			fa.setSalary(sal);
    		
    			String dep = jr.next();
    			fa.setDepartment(dep);
    			
    				if(fa.isRegular()){	// same here i used here the boolean on the faculty.java
    					System.out.println("-----------------------------------------");
    					System.out.println("Name: " + fa.getName());
    					System.out.println("Contact Number: " + fa.getContactNum());
    					System.out.println("Salary: " + fa.getSalary());
    					System.out.println("Department: " + fa.getDepartment());
   						System.out.println("Status: Not Regular/Tenured");
    				}
    		}
    	}
    	if(f.equalsIgnoreCase("S")){
    		System.out.println("Type your Name, Contact Number, Course, and year level.");
    		System.out.println("Press Enter For Every Input.");
    		String name = jr.next();
    		st.setName(name);
    		
    		String num = jr.next();
    		st.setContactNum(num);
    		
    		String prog = jr.next();
    		st.setProgram(prog);
    		
    		Integer lvl = jr.nextInt();
    		st.setYearlevel(lvl);
    		
    		System.out.println("-----------------------------------------");
    		System.out.println("Name: " + st.getName());
    		System.out.println("Contact Number: " + st.getContactNum());
    		System.out.println("College Course: " + st.getProgram());
    		System.out.println("Year Level: " + st.getYearlevel());
    	}
        
    }
}
