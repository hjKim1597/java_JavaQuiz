package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		// 정수 1개를 입력받아 짝수면 1, 홀수면 0을 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int num = scan.nextInt();
		System.out.println(num % 2 == 0 ? 1 : 0);
		
		System.out.println("-------------------------");
	
		// 사과의 개수를 입력 받아 사과 개수 + 10 
		Scanner scan1 = new Scanner(System.in);
		System.out.print("사과의 몇개인가요?");
		int apple = scan.nextInt();
		System.out.println(apple + 10);
		*/
		
		
		/* 
		 *  스캐너를 활용해서 이름과 나이를 입력
		 *  20세 이상이면 성인입니다.
		 *  19세 이하라면 미성년자입니다.
		 *  를 풀력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		String name = scan.next();
		
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		
		String result = age >=20 ? "성인" : "미성년자";
		System.out.println( name + "님의 나이는 " + age + "살이며, " + result + "입니다");

		scan.close();
		

	}
}
