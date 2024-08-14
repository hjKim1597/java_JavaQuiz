package quiz01;

public class Quiz18 {

	public static void main(String[] args) {
		
		// for문 사용하기
		// 1. 7~100까지 정수 중에서 7의 배수를 가로로 출력하기
		// 2. 1~100까지 정수 중에서 9의 배수의 개수를 출력하기
		// 3. 50~100까지 두 수 사이의 합계를 출력하기
		// 4. A~Z까지 문자열의 합 출력하기 ABCDEFG..Z 'a'=65
		for (int i=7; i<=100; i++) {
			if (i %7==0) {
				System.out.print(i+" ");
			}
		}
		
		// 선생님 답 1
		for (int i=7; i<=100; i+=7) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
		
		
		int cnt = 0;
		for (int i=1; i<=100; i++) {
			if (i %9 ==0) {
				cnt+=1; //cnt++;
			} 
		} System.out.println(cnt);
		
		
		
		
		
		
		
		int sum = 0;
		for (int i=50; i<=100; i++) {
			sum += i;
		} System.out.println(sum);
		
		
		
		
		
		
		String str = "";
		for (char i=65; i<=90; i++) { // char i = 'A'; i<='Z'; i++
			str += i;
		} System.out.print(str);
		
		
		
		
		
	}
	
}
