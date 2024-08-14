package quiz01;

import java.util.Scanner;

public class Quiz23 {
	
	public static void main(String[] args) {
		
		/*
		 * updown게임
		 * 
		 * 1 ~ 100까지 임의의 숫자를 하나 생성한다 (정답 값이라고 가정)
		 * 
		 * 스캐너를 통해서 값을 입력받고,
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요"
		 * 입력받은 값보다 크면 "더 큰 수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도횟수를 출력하고, 종료하면 된다
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int ran = (int)(Math.random()*100) + 1;
		int cnt = 0;
		
		
		while(true) {
			
			System.out.print("정답입력>");
			int num = scan.nextInt();
			
			if(ran == num) {
				System.out.println("정답입니다");
				cnt++;
				System.out.println("시도횟수: " + cnt);
				break;
			}
			
			else if(ran < num) {
				System.out.println("더 작은 수를 입력하세요");
				cnt++;
			}	
			else {
				System.out.println("더 큰 수를 입력하세요");
				cnt++;
			}
				
			
		}
		
		
		
	}

}
