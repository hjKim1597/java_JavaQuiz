package quiz01;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		int bucket = 10; // 바구니 크기
		int apple = (int)(Math.random() * 150) + 1; // 사과의 개수 1부터 150
		
		// 사과의 개수가 정해질 때, 3항 연산식을 이용해서 필요한 바구니의 개수를 구해라
		System.out.println(apple % bucket == 0 ?  apple/bucket : apple/bucket + 1 );  
	}
}
