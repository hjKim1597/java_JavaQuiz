package quiz10;

import java.util.Arrays;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; // 상품을 저장할 배열
	private int i = 0; // 상품개수
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	
	public MyCart(int money) {
		this.money = money;
	}
	
	/* 
	 * 3. buy(모든 상품을 받도록 선언)
	 * 접근제어자 퍼블릭
	 * 
	 * 가진 돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진 돈이 충분하면 물건의 가격을 money에 빼고
	 * add(상품)을 호출해 줍니다.
     */ 	
	
	public void buy(Product p) {
		if(money < p.price) {
			System.out.println("금액부족");
			return;
		}
		else {
			money -= p.price;
			add(p);
		}
	}
	
	/* 
	 * 4. add(모든 상품을 받도록 선언)
	 * 접근제어자 프라이빗
	 *
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 */
	
	private void add(Product p) { // Tv, Radio, Computer에 전달 
		
		if(i >= cart.length) {
			Product[] cart2 = new Product[cart.length*2];
			for(int j = 0; j < cart.length; j++) {
				cart2[j] = cart[j];
			}
			
			cart = cart2;
			cart2 = null;
		}
//		위와 다른 방법 
//		if(i>= cart.length) {
//		cart = Arrays.copyOf(cart, cart.length * 2) }
			
		cart[i] = p;
		i++;
	}
	
	
	/*
	 * 5.info()
	 * 
	 * instanceof 를 적용해보면 좋을것 같아요
	 *
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */

	public void info() {
		
		int sum = 0;
		
		for(int j = 0; j < i; j++) {
			
			if(cart[j] instanceof Computer) {
				System.out.println("컴퓨터");
			}
			else if(cart[j] instanceof Radio) {
				System.out.println("라디오");
			}
			else if(cart[j] instanceof Tv) {
				System.out.println("TV");
			}
	
			// 장바구니 안에 물건들의 가격 합
			sum += cart[j].price;
		}
		System.out.println("장바구니의 총합: sum");
		System.out.println("남은 금액: " + money);
	}
}
	
