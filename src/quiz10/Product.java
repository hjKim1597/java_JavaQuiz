package quiz10;

public class Product {

	public int price;
	public String name;
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	String info() {
		return "목록: " + name;
	}
}
