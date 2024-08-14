package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		Shape c = new Circle("원형", 3);
		System.out.println(c.getArea());
		
		Shape r = new Rect("사각형", 5);
		System.out.println(r.getArea());
	}
}
