package quiz01;

import java.util.Scanner;

public class Quiz16 {
	
	public static void main(String[] args) {
		
		/*
		 *  어떤 수 N 까지의 약수의 합계를 구하세요
			1까지 약수의 합은 1 입니다
			10까지 약수의 합은 1 + 2 + 5 + 10 = 18 입니다
		 */
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		
		int i = 1;
		int sum = 0;
		while (i <= n) {
			
			if (n %i == 0) {
				sum += i;
			}
	
			i++;	
			} System.out.println(sum);
	
	 scan.close();
	
	
	}

}
