package quiz04;

public class MainClass {
	
	public static void main(String[] args) {
		
		/* 요구사항
		 * Calculator를 부모클래스로 선언하세요.
		 * Calculator를 상속받는 Computer클래스를 생성합니다.
		 * 
		 * Calculator의 멤버변수 int result, double pi를 선언하세요
		 * Calculator의 메서드
		 * add(int) - result에 값을 누적시키는 기능
		 * circle(int) - pi를 이용해서 원의 넓이를 리턴하는 기능  (원의넓이: PI * r * r)
		 * ------------------------------------------------------------------
		 * Computer 클래스의 메서드
		 * circle() - 메서드를 오버라이딩 하고, pi를 대신하는 Math.PI를 사용해서 원의 넓이를 구하세요.
		 * rect(double) - 정사각형의 넓이를 리턴
		 * rect(double, double) - 직사각형의 넓이를 리턴
		 * rect(double, double, double) - 직육면체의 넓이를 리턴
		 * 		
		 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
		 */
		
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(8));
		System.out.println("계산기로 원의 넓이:" + cal.circle(3));
		
		Computer com = new Computer();
		System.out.println("컴퓨터로 원의 넓이:" + com.circle(3));
		
		System.out.println("사각형의 넓이: " + com.rect(3, 3));
		
		System.out.println("직육면체의 넓이: " + com.rect(3,3,3));
		
		
		
		
		
		
		
		
		
		
		
	}

}
