package quiz01;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		int[] num = {1,2,3,4,5};
		int n = 3;
		System.out.println(Arrays.copyOf(num,n));
		
		// 백준 - N찍기 2741번
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println(i);
//		}
		
		// 백준 - A + B - 5 10952번
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		for(int i = 0; i <= 3; i++) {
//			Scanner scan = new Scanner(System.in);
//			
//		}
//		
//		System.out.println(a+b);
		
		
		// 백준 - 새싹 25083번 -> 백준은 리눅스이기 때문에 /r이 인식되지 않음
//		System.out.println("         ,r'\"7\n"
//				+ "r`-_   ,'  ,/\n"
//				+ " \\. \". L_r'\n"
//				+ "   `~\\/\n"
//				+ "      |\n"
//				+ "      |");
		
		// 백준 - 2차원 배열 2563번
		
		
		// 백준 - 조건문 2884번
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		int m = scan.nextInt();
//		
//		if(m-45 < 0) {
//			System.out.println((h-1) + " " + (m+15));
//			if(h == 0) {
//				System.out.println(23 + " " + (m+15));
//			}
//		}
//		
//		
//		else {
//			System.out.println(h + " " + (m-45));		
//		}
		
	
		// 백준 - 조건문 14681번
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		
//		if( a >= 1 && b >= 1) {
//			System.out.println("1");
//		}
//		else if(a <= -1 && b >= 1 ) {
//			System.out.println("2");
//		}
//		else if(a <= -1 && b <= -1) {
//			System.out.println("3");
//		}
//		else if(a >= 1 && b <= -1) {
//			System.out.println("4");
//		}
//		else {
//			System.out.println();
//		}
		
		// 백준 - 조건문 9498번
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
//		
//		switch(score / 10) {
//		
//		case 10:
//			System.out.println("A");
//			break;
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		}
		
		// 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		int i = scan.nextInt();
//			
//		char a = s.charAt(i-1);
//		System.out.println(a);
		
		/*
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
		*/
		
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
//		Scanner scan = new Scanner(System.in);
//		
//		int num = 1;
//		
//		System.out.println(num);
//		
//		while( num <=5) {
//			
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			
//			System.out.println(a + b);
//		}
//		
	
		/*
		 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		 * 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
		 * 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
		 * 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		
		
		if(y % 4 == 0 & y % 100 != 0 | y % 400 == 0) {
			System.out.println(1);
		}
		
		else {
			System.out.println(0);
		}
		
		*/
		
		/*
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.print(a + b);
		
		
		//두 정수 A와 B를 입력받은 다음, A-B를 출력
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.print(a - b);
		
		
		//두 정수 A와 B를 입력받은 다음, A×B를 출력
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.print(a * b);
		*/
		
		/*
		// 두 자연수 A와 B가 주어지고 A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		*/
	}
}
