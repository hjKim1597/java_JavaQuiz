package quiz15;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class StringEx03 {
	
	public static void main(String[] args) {
		
		//회문비교 -> "다시 합창 합시다"
		/*
		1. String palindromeCheck(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
		2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
		3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
		4. 문장은 공백을 포함하여 받을 수 있습니다.
		5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
		6. 힌트)
		* 함수를 이용하여 공백을 제거하세요. 힌트: replace() 
		* 문장의 길이의 중간값을 구하세요. 
		* 첫문장과, 마지막문장을 비교하며 중간으로 이동
		* for문에서 charAt()을 사용해서 반대로 잘라 붙이세요. (or 빌더를 이용 하여 문자를 뒤집어 비교)
		*/
		
//		palindromeCheck("다시 합창 합시다");
		System.out.println(palindromeCheck("다시 합창 합시다"));
		System.out.println(palindromeCheck("다시 합창"));
	}
	
	private static String palindromeCheck(String str) {
		
//		str = str.replace(" ", "");
//		boolean x = new StringBuffer(str).reverse().toString().equals(str);
//		return x ?  "회문" : "회문이 아닙니다";
		
		str = str.replace(" ", "");
		System.out.println(str);
		
		for(int i = 0; i < str.length()/2; i++) {
			// 맨 앞글자 == 맨 뒷글자
			if(str.charAt(i) != str.charAt(str.length() - 1 + i)); {
				return "회문이 아닙니다";
			}
		}
		return "회문입니다";
	}
}

