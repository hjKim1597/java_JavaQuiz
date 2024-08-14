package quiz02;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person idol = new Person("카리나", 25, 166);
		
		Person idol2 = new Person();
		idol2.name = "윈터";
		idol2.age = 23;
		idol2.tall = 165;
		
		idol.info();
		idol2.info();		
	}
}
