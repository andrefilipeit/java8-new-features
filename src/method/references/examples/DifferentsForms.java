package method.references.examples;

interface FigureD{
	void draw();
}

class FigDConcrete{
	public static void drawFigConcrete() {
		System.out.println("with method reference");
	}
}

public class DifferentsForms {
	
	public static void main(String[] args) {
	
		//anonymous class
		FigureD fig1 = new FigureD() {
			
			@Override
			public void draw() {
				System.out.println("with anonymous class");
			}
		};
		fig1.draw();
		
		
		//lambda expression
		FigureD fig2 = () -> System.out.println("with lambda no arguments");
		fig2.draw();
		
		FigureD fig3 = FigDConcrete::drawFigConcrete;
		fig3.draw();
	
	}
}
