package method.references.examples;

interface Figure{
	Triangle draw(Double width, Double height);
}

class Triangle{
	public Triangle(Double width, Double height) {
		System.out.println("Drawing rectangle with Width: " + width);
	}
}

public class Constructor {
	public static void main(String[] args) {
		
		Figure fig1 = Triangle::new; 
		
		fig1.draw(2.5, 2.5);
		
	}
}
