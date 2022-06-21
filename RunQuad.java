import java.util.Scanner;
public class RunQuad{
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		Quadrilateral q = new Quadrilateral();
		Rectangle r = new Rectangle();
		Square s = new Square();
		Parallelogram p = new Parallelogram();
		Rhombus h = new Rhombus();
		Trapezoid t = new Trapezoid();
		
		System.out.print("Press R for Rectangle or S for Square. ");
		char let = scan.next().charAt(0);
		
		if(let == 'R' || let == 'r'){
			System.out.println("A rectangle: ");
			
			r.showDescription();
		}
		
		else if(let == 'S' || let == 's'){
			System.out.println("A square: ");
			
			s. showDescription();
		}
		
		System.out.println("Select from the following: ");
		System.out.println("R - Rectangle \n"+"S - Square \n"+"P - Parallelogram \n"+"H - Rhombus \n"+"T - Trapezoid");
		char letter = scan.next().charAt(0);
		
		if(letter == 'P' || letter == 'p'){
		  System.out.println("A Parallelogram");
		  
		  p.showDescription();
		}
		
		else if(letter == 'H' || letter == 'h'){
			System.out.println("A Rhombus");
			
			h.showDescription();
		}
		else if(letter == 'T' || letter == 't'){
			System.out.println("A Trapezoid");
			
			t.showDescription();
		}	
	}
}

