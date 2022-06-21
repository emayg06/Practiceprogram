class Quadrilateral{
	
	void showDescription(){
		System.out.println("- is quadrilateral");
	}
}
class Rectangle extends Quadrilateral{
	
	void showDescription(){
		System.out.println("-has 4 right angles");
		super.showDescription();
	}
}
class Square extends Rectangle{
	
	void showDescription(){
		System.out.println("-has 4 equal sides");
		super.showDescription();
		
	}	
}
class Parallelogram extends Quadrilateral{
	
	void showDescription(){
		System.out.println("-has 2 pairs of parallel sides");
		super.showDescription();
		
	}
		
}
class Rhombus extends Parallelogram{
	
	void showDescription(){
		System.out.println("-has 4 congruent sides");
		super.showDescription();
	}
}
class Trapezoid extends Quadrilateral{
	
	void showDescription(){
		System.out.println("-has 1 pair of parallel sides");
	}
}