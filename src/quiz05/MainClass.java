package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		MyAccount ma = new MyAccount("카리나", "1234", 6000);
		
		ma.withDraw(3000);
		System.out.println("잔액: " + ma.getBalance());
		
	}
}
