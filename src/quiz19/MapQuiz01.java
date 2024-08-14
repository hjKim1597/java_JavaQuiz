package quiz19;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {
	
	public static void main(String[] args) {
		
		Map<String, String> users = new HashMap<>();

		users.put("kim1234", "kkk1234");
		users.put("lee5678", "lll5678");
		users.put("park4321", "ppp4321");

		/*
		 * <로그인 입력값 검증>
		 * 1. 입력받은 아이디가 맵에 입력된 키값에 
		      해당하는지의 여부를 검사하여(containsKey 메서드 활용)
		 * 2. 맞다면 다시한번 비밀번호의 값과 비교하여 비밀번호도 일치하면
		      "로그인 성공"을 콘솔에 출력하고 반복문을 탈출하세요.
		 * 3. 비밀번호가 다르다면 "비밀번호가 틀렸습니다"를 출력하세요.
		 * 4. 입력받은 아이디가 맵에 입력된 키값이 아니라면 
		      "아이디가 존재하지 않습니다"를 출력하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("아이디> ");
			String id = scan.next();
			
			if(users.containsKey(id) ) { //있으면 true
				System.out.print("비밀번호> ");
				String pw = scan.next();
				String value = users.get(id); //키에 해당하는 값
				
				if(pw.equals(value)) {
					System.out.println("로그인 성공");
					break;
				} 
				else {
					System.out.println("비밀번호를 다시 확인하세요");
				}
			} 
			else {
				System.out.println("아이디가 존재하지 않습니다");
			}
		}
	}
}