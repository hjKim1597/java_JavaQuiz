package quiz01;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		
//		int x = 4;  // 소수인지 아닌지 확인
//		
//		int cnt = 0;
//		for(int i = 1; i <= x; i++) {
//			if( x % i == 0 ) { // i는 약수
//				cnt++;
//			}
//		}
//		
//		System.out.println("");
		
		/*
		 * 어떤 수 x가 주어질 때 x까지의 수 중 소수들의 합을 출력
		 * 소수는 약수가 1과 자기자신인 수 입니다.
		 * 예시
		 * 5 까지의 소수합은 2 + 3 + 5 = 10 입니다
		 * 6 까지의 소수합은 2 + 3 + 5 = 10 입니다
		 * 7 까지의 소수합은 2 + 3 + 5 + 7 = 17 입니다
		*/

		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= y; i++) {
			// 약수 검사를 하기 전에 cnt는 다시 초기화
			int cnt = 0;
			
			for(int j = 1; j <= i; j++) {
				if( i % j  == 0) {  // i의 약수
					cnt++;
				 }		
			} // 반복문을 돌고 나오면 약수 개수가 나옴
			
			if( cnt == 2 ) { // i는 소수
				sum += i;
			}
		} 
		System.out.println(sum);
	}
}
