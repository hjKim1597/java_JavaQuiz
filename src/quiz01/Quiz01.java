package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2; // 3
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65 
		
		//아래 값은 몇이 될까요?
		System.out.println(y += 10 - x++); // 13
		System.out.println(x+=2); // 5
		System.out.println( !('A' <= c && c <='Z') ); // false
		System.out.println('C'-c); // 2
		System.out.println(c+1); // 66 -> 이항 연산일 때민 int 타입으로 변환 
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c);  // C

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
