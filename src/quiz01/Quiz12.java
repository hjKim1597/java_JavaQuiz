package quiz01;

import java.util.Scanner;

public class Quiz12 {
	
	public static void main(String[] args) {
		
		/*
		 * 어떤 수 N 입력 받아서 N까지의 구구단을 출력할 것
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int n = scan.nextInt();
		System.out.println("구구단 :"+n+"단");
		int a = 1;
		int sum = n;
		while (a<=9) {
			sum = n*a;
			System.out.println(n+" x "+a+" = "+sum);
			a++;
		}
		
		scan.close();
		
	}

}
