package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		/*
		 * 프로그램이 실행되면, 랜덤한 덧셈 문제를 출력
		 * 이 랜덤한 수의 범위는 1 ~ 100 사이의 값입니다.
		 * 
		 * 사용자가 답안을 입력할 때마다, 정답 또는 오답 카운트가 누적된다
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		int cnt1 = 0;
		
		while(true) {
			
			int a = (int)(Math.random()*100) + 1;
			// System.out.println(a);
			
			int b = (int)(Math.random()*100) + 1;
			// System.out.println(b);
			
			System.out.print(a);
			System.out.print(" + ");
			System.out.print(b);
			System.out.println(" = ? ");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print(">");
			int num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("프로그램 정상 종료");
				break;
			}	
				
			else if(num == a + b) {
				System.out.println("정답입니다");
				System.out.println("------------");
				cnt++;
			}
			
			else {
				System.out.println("틀렸습니다");
				System.out.println("------------");
				cnt1++;
			}
			
			
		}
		
		System.out.println("정답: " + cnt);
		System.out.println("오답: " + cnt1);
		
	}
}
