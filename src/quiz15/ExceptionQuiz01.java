package quiz15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuiz01 {
	
	public static void main(String[] args) {
	
		/*
		 * 1. main에서 scanner를 사용해서 2개의 정수값을 입력받음
		 * 2. divide(정수 2개)를 입력받는 메서드에 전달하기
		 * 3. divide 메서드에서는 a / b를 진행하는데 b가 0인 경우 경우 예외를 강제 생성해서 종료하는 구문을 작성
		 * 4. main에서 입력받을 때는 문자인 경우 예외처리를 진행하고 다시 입력받음
		 * 
		 * 예외 종류
		 * InputMismatchException - 문자가 들어갈 경우 오류
		 * ArithmeticException - 0인 경우 오류
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print("정수1> ");
				int a = scan.nextInt();
				System.out.print("정수2> ");
				int b = scan.nextInt();
				
				int result = divide(a, b);
				
				System.out.println("결과: " + result);
				break;
			} 
			catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				scan.nextLine();
			}
			catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
	
	public static int divide(int a, int b) throws ArithmeticException {

		if(b == 0) {
			throw new ArithmeticException();
		}		
		return a/b;
	}
}