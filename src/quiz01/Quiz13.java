package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 수 x까지의 수 중에서 n의 배수를 찾아보려고 한다.
		   첫째 줄의 x와 n을 입력 받아 n의 배수를 가로로 출력하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		
		int i = 1;
		while (i<=x) {
		
			if (i %n == 0) {
				System.out.print(i+" ");
			}
			
			i++;
		}
		
		/* 선생님 답 
		 * int n = scan.nextInt(); 
		   int x = scan.nextInt();
		 * 
		 * int i = x;
		 * while (i <= n) {
		 * 	System.out.print(i+" ");
		 * 		i += x;
		 * 
		 * } 
		 * 
		 */
		
		
		
		
		scan.close();
	}
}
