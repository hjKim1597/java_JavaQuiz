package quiz01;

import java.util.Arrays;

public class Quiz27 {
	
	public static void main(String[] args) {
		
		/*
		 * 배열의 앞에 data를 추가하려고 한다
		 1. 새로운 배열 + 1 생성
		 2. 기존 배열을 다음 인덱스 번째로 옮겨 담는다.
		 3. 0번째에 data를 추가
		 */
				
		int[] arr = {10,20,30,40,50};
		int data = 100;
		
		int[] newArr = new int[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i+1] = arr[i];
		}
		
		newArr[newArr.length - newArr.length] = data;
		// newArr[0] = data; // 앞에 추가
 		System.out.println(Arrays.toString(newArr));
		
		
		

	}

}
