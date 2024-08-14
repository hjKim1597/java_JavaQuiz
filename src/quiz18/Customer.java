package quiz18;

public class Customer implements Comparable<Customer> {

	private String name;
	private int number;
	
	public Customer() {
	}

	public Customer(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// 큐의 대소비교 지정
	@Override
	public int compareTo(Customer o) {
		return Integer.compare(this.number, o.getNumber());
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", number=" + number + "]";
	}	
}