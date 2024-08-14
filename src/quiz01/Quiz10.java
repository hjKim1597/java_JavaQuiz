package quiz01;

import java.util.Scanner;

public class Quiz10 {
	
	public static void main(String[] args) {
		/*
		 * 숫자, 연산자, 숫자 를 입력하여 사칙연산을 수행합니다.
		 * 사용할 수 있는 연산자는 (+, -, *, /) 입니다.
		 * 4가지 연산자 외에 다른 연산자를 입력하면 "잘못입력"을 출력합니다.
		 * 5 + 4 = 9, 5 / 4 = 1
		 * 숫자 문자 숫자 를 입력받아 연산결과를 출력하는 프로그램을 switch문으로 만들어주세요.
		 */
	
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String b = scan.next(); // +, -, /, *
		int c = scan.nextInt();

		switch(b) {

		case "+": 
			System.out.print(a+c);
			break;
		case "-":
			System.out.println(a-c);
			break;
		case "/":
			System.out.println(a/c);
			break;
		case "*":
			System.out.println(a*c);
			break;
		default:
			System.out.println("잘못입력");
			break;
		}
	}
}
