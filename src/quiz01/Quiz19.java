package quiz01;

import java.util.Scanner;

public class Quiz19 {
	
	public static void main(String[] args) {
		/*
		 *  두 수 사이의 합
		 *  정수 2개를 입력 받습니다
		 *  예를들어 1, 5가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다.
		 *  5, 1가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다
		 *  만약 같은 수라면 0이 출력 됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sum = 0;
		
		
		if (num1 > num2) {
			for(int i =1; i <= num1; i++) {
				sum += i;
			}
		}
			 
		else if (num1 < num2) {
			for(int i =1; i <= num2; i++) {
			    sum += i;
			}
		}
		
		else {
			System.out.println(0);
		}
		
		System.out.println(sum);
		 

//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		int max = 0;
//		int min = 0;
//		
//		int sum = 0; // 합계
//		
//		if ( a > b ) {
//			max = a;
//			min = b;
//		}
//		
//		else {
//			max = b;
//			min = a;
//		}
//		
//		for(int i = min; i <= max; i++) {
//			sum += i;
//		}
//		
//		 System.out.println(max == min ? 0 : sum);
		
		
	}
}


