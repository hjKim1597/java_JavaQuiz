package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		/*
		 * 가로, 세로를 입력 받아 사각형을 출력
		 * 단, 윤곽만 출력합니다
		 ************
		 *          *
		 *          *
		 *          *
		 ************
		 */

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();  // 가로
		int b = scan.nextInt();  // 세로
		
		for(int i = 1; i <= b; i++) { // 행
		
			for(int j = 1; j <= a; j++) { // 열 
				if(i <= b) {
					System.out.print("*");
				}
				else {
					System.out.println();
				}
				
			}
			
			System.out.println();	
			
		}
		
	}
}
