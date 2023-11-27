package reflect.examples;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Product{
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}

public class Reflect {
	public static void main(String[] args) {

		//Product instance
		Product p = new Product("TV", 3000.00);
		
		//Class instance
		Class c = p.getClass();
		
		//all methods from product class
		Method[] methods = c.getDeclaredMethods();
		
		for(Method m : methods) {
			System.out.println(m.getName());
			
			Parameter[] parameters = m.getParameters();
			
			for(Parameter pr : parameters) {
				System.out.println(pr);
			}
		}
	}
}
