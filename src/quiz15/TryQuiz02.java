package quiz15;

import java.util.Scanner;

public class TryQuiz02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int ran = (int)(Math.random() * 100) + 1;
		
		
		while(true) {
			
			try {
				System.out.print("1과 100사이의 값을 입력하세요> ");
				int num = scan.nextInt();
				
				if(num > ran) {
					System.out.println("더 작은 값을 입력하세요");
				}
				else if(num < ran) {
					System.out.println("더 큰 값을 입력하세요");
				}
				else {
					System.out.println("정답입니다");
					break;
				}
				cnt++;	
			} 
			catch (Exception e) {
				System.out.println("잘못 입력했습니다");
				scan.nextLine();
				cnt++;
			}
		}
		System.out.println("시도 횟수는: " + cnt);
	}
}
