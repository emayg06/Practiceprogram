import java.util.Scanner;
import java.util.Stack;
 
public class Stack_Ex5 {
	
	Scanner scan;
	Stack<String> stack;
	
	int n;
 
	void push() {
		
		scan = new Scanner(System.in);
		stack = new Stack<String>();
		
		System.out.println("Stack - Insertion using Index");
		
		System.out.println("\nEnter 'n' value :");
		n = scan.nextInt();
		
		System.out.println("Enter the data - PUSH");
 
		for(int i=0; i<n; i++) {
			
			stack.push(scan.next());
		}
	}
	
	void display() {
		
		System.out.println("\nThe Stack");
			
		for(int i=0; i<stack.size(); i++) {
			
			System.out.println(stack.get(i));
		}
	}
	
	void AddIndex() {
		
		System.out.println("\nInsertion using Index");
		
		System.out.println("Enter the index :");
		int index = scan.nextInt();
		
		System.out.println("Enter the Element :");
		String element = scan.next();
		
		stack.add(index - 1, element);
 
		display();
	}
}
 
