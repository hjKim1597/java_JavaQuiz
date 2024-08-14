package quiz11;

import java.util.Arrays;

public class MyArrays {
	/*
	 * Arrays.toString() 메서드 내가 만들기
	 * 
	 * 1. MyArrays는 외부에서 객체로 생성할 수 없어야 한다
	 * 	  -> 생성자에 접근제어자를 이용해서 객체생성을 하지 못하도록
	 * 
	 * 2. 메서드 호출 시에는 static 키워드를 이용해서 사용하도록 만든다
	 * 
	 * 3. int[]이나 String[]이나 char[]이 전달되더라도 동일하게 동작하도록 메서드 오버로딩
	 */
	
	private MyArrays() { // 외부에서 객체 생성 불가
	}
	
	public static String toString(int[] arr) {
		
		// 문자열의 합
		// [ + 배열요소 +, + 배열요소 ..... + ]
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1 )
				break;
			str += ", ";
		}
		str += "]";
				
		return str;
	}
	
	public static String toString(String[] arr2) {
		String str = "[";
		for(int i = 0; i < arr2.length; i++) {
			str += arr2[i];
			if(i == arr2.length - 1 )
				break;
			str += ", ";
		}
		str += "]";
				
		return str;
	}
	
	public static String toString(char[] arr3) {
		String str = "[";
		for(int i = 0; i < arr3.length; i++) {
			str += arr3[i];
			if(i == arr3.length - 1 )
				break;
			str += ", ";
		}
		str += "]";
				
		return str;
	}
}
