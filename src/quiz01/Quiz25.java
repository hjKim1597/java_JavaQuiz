package quiz01;

import java.util.Scanner;

public class Quiz25 {
	
	public static void main(String[] args) {
		
		// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
//		int num = (int)(Math.random() * 100) +  1;
//		int[] arr = {num};
//		System.out.println(num);
//		for(int i = 1; i < arr.length; i++) {
//			System.out.println(arr);
//		}
		
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] arr = new int[num];
	
		int i = 0; 
		while( i < arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		
		int max = arr[0];  // 배열의 첫번째 요소
		int min = arr[0];  
		
		for(int j = 0; j <= arr.length; j++) {
			if(max < arr[j]) {
				max = arr[j];
			}
			
			if(min > arr[j]){
				min = arr[j];
			}
		}
		System.out.println(min + " " + max);
	}

}
