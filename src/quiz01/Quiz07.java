package quiz01;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		
		/*
		 * 숫자 2개를 입력 받아, 큰 숫자를 출력하는 프로그램 코드를 작성하세요.
		 * 같은 수라면 0을 출력하면 됩니다
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>");
		int x = scan.nextInt();
		
		System.out.println("숫자를 입력하세요>");
		int y = scan.nextInt();
		
		if (x == y) {
			System.out.print(0);
		}
		
		else if( x > y) {
			System.out.print(x);
		}
		
		else {
			System.out.print(y);
		}
		
		scan.close();
		
	}
}
