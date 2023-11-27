package stream.examples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	
	private Integer code;
	private String name;
	private Double price;
	
	public Product() {
		this.code = 0;
		this.name = "";
		this.price = 0.0;
	}

	public Product(Integer code, String name, Double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}

class OrderProductByPrice implements Comparator<Product> 
{ 
	@Override
    public int compare(Product p1, Product p2) 
    { 
        return p1.getPrice().compareTo(p2.getPrice()); 
    } 
} 

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Product> listProduct = new ArrayList<Product>(); 
		
		listProduct.add(new Product(1000, "Refrigerator 470L", 2999.00));
		listProduct.add(new Product(2000, "TV UHD 50''", 3500.00));
		listProduct.add(new Product(1001, "TV UHD 65''", 5000.00));
		listProduct.add(new Product(3000, "Microondas 20L", 399.00));
		listProduct.add(new Product(1001, "Refrigerator 120L", 900.00));
		listProduct.add(new Product(4000, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
		listProduct.add(new Product(1002, "Refrigerator 500L", 3100.00));
		
		System.out.println("Using a 'old form'...");
		
		//Create refrigerator only list
		List<Product> listRefrigerator = new ArrayList<Product>();
		for(Product p : listProduct) {
			if(p.getName().contains("Refrigerator")) {
				listRefrigerator.add(p);
			}
		}
		
		//Sort the list of refrigerators by increasing price
		Collections.sort(listRefrigerator, new OrderProductByPrice());
		
		//Creates a list of refrigerator names only in capital letters
		List<String> listWithNameRefrigerator = new ArrayList<String>();
		for(Product p : listRefrigerator) {
			listWithNameRefrigerator.add(p.getName().toUpperCase());
		}
		
		for(String name : listWithNameRefrigerator) {
			System.out.println(name);
		}
		
		/*************************************************************/
		
		System.out.println("\nUsing Java Streams...");
		
		//Gets a data stream (stream)
		listProduct.stream()
		
		//Interface Predicate - filter the names of the Products it contains 'Refrigerator'
		.filter(p -> p.getName().contains("Refrigerator"))
		
		//Interface Comparator - sort the price in ascending order according to the class implementation OrderProductByPrice
		.sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()))
		
		//Interface Function - apply a given function (toUpperCase) to the elements of this stream
		.map(p -> p.getName().toUpperCase())
		
		//Interface Consumer - loop through each element of the stream and display them in the console
		.forEach(System.out::println);
	}

}
