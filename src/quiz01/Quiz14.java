package quiz01;

import java.util.Scanner;

public class Quiz14 {
	
	public static void main(String[] args) {
		
		/*
		 * 어떤수 N까지 정수 중의 4의 배수이면서 8의 배수가 아닌 수의 개수를 출력해주세요
		 */
		
		 Scanner scan = new Scanner(System.in);
	        
	        int n = scan.nextInt();
			
			int i = 1;
			int cnt = 0;
			while (i<=n) {
				
				if (i %4 == 0 && i %8 !=0) {
					cnt+=1; // cnt++;
				} 
			
				i++;
			} System.out.println(cnt);
		
			scan.close();
	}
}

