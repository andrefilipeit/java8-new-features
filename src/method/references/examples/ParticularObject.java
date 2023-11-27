package method.references.examples;

interface Figure2D{
	void draw(Double width, Double height);
}

class Rectangle{
	public void drawRectangle(Double width, Double height) {
		System.out.println("Drawing rectangle with Width: " + width);
	}
}

public class ParticularObject {
	public static void main(String[] args) {
		
		//Lambda expression
		Figure2D fig1 = (w, h) -> System.out.println("Drawing figure with width: " + w + " and height: " + h);
		fig1.draw(8.0, 2.5);
		
		//Specific Object
		Rectangle rec = new Rectangle();
		//Method reference
		Figure2D fig2 = rec::drawRectangle;
		fig2.draw(10.5, 7.0);
	}
}
