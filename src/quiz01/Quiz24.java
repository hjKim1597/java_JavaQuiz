package quiz01;

public class Quiz24 {
	
	public static void main(String[] args) {
		
		// 배열이 주어질 때, 배열 요소 중 가장 큰 값 하나만 출력
		
		int[] arr = {34, 64, 12, 34, 56, 100, 54, 21, 99};
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		
		
		
	}
}
