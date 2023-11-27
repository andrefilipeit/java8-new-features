package lambda.examples;

import java.util.ArrayList;
import java.util.List;

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


public class WithArguments {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV 55'", 1500.99));
		list.add(new Product("Refrigerator LG'", 2500.99));
		list.add(new Product("Videogame'", 900.99));
		list.add(new Product("Computer'", 3000d));
		list.add(new Product("SmartPhone'", 599.99));
		
		//lambda expression with argument
		list.forEach( (p) -> System.out.println(p.getName() + " = " + p.getPrice()) );

		//lambda expression with 2 arguments 
		list.sort( (p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
		
		System.out.println(" ");
		list.forEach( (p) -> System.out.println(p.getName() + " = " + p.getPrice()) );
	}
}
