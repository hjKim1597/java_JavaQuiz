package quiz01;

import java.util.Scanner;

public class Quiz06 {
	
	/*
	놀이기구를 탑승하려면 키는 140 이상, 나이는 8세 이상 이어야 합니다.
	키와 나이를 입력받아서
	놀이기구에 탑승할 수 있다면, "탑승 가능"
	탑승할수 없다면 "탑승 불가능"
	을 출력해주세요
	*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("키를 입력하세요");
		double height = scan.nextDouble();
		
		System.out.print("나이를 입력하세요");
		int age = scan.nextInt();
		
		if( height >= 140 & age >= 8) {
			System.out.println("탑승 가능");
		}
		
		else {
			System.out.println("탑승 불가능");
		}
		
		
		
		
	}
}
