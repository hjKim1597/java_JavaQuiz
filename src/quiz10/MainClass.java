package quiz10;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
		 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
		 * 남은금액 출력
		 * 메인에서 buy메서드 실행 
		 * 
		 */
		
		MyCart cart = new MyCart(10000);
		cart.buy(new Tv());
		cart.buy(new Radio());
		cart.buy(new Computer());
		cart.buy(new Computer());
		cart.buy(new Computer());
	
		cart.info();
		
		}
}
