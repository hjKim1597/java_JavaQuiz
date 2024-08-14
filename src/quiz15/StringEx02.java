package quiz15;

import java.util.Scanner;

public class StringEx02 {
	
	public static void main(String[] args) {
		
		/* 주민번호 검증메서드 masking(String) : String
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static 메서드를 만들어주세요.
		 * 
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남, 여가 아니라면 throws 처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking 메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자
		 * 검증데이터 950101-2000000 -> 여자
		 * 검증데이터 9501012000000 -> 여자
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */
		
		try {
			System.out.println(masking("950101-1000000"));
			System.out.println(masking("950101-2000000"));
			System.out.println(masking("9501012000000"));
			System.out.println(masking("950101-5000000"));
			System.out.println(masking("9501015000000"));
			System.out.println(masking("950101511111"));
		} 
		catch (Exception e) {
			System.out.println("잘못된 주민번호입니다.");
		}
	}
	
	public static String masking(String id) throws Exception {
		
		id = id.replace("-", "");
		
		
		if(id.length() != 13 ) {
			throw new Exception();
		}
		
		char s = id.charAt(6);
		
		switch(s) {
		case '1' :
			System.out.println("남자");
			break;
		case '2' :
			System.out.println("여자");
			break;
		default:
			throw new Exception();
		}
		
		return id.substring(0,6) + "-*******";
	}
}
