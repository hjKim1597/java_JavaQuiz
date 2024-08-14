package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz29 {
	
	public static void main(String[] args) {
		
		// 백준 2차원 배열 2566번
		/*
		 * 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 
		 * 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
		 * 
		 * 최댓값은 90이고, 이 값은 5행 7열에 위치한다.
		 * 
		 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 
		 * 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
		 */
		
//		int[] arr = {3, 23, 85, 34, 17, 74, 25, 52, 65},
//					{10, 7, 39, 42, 88, 52, 14, 72, 63},
//					{87, 42, 18, 78, 53, 45, 18, 84, 53},
//					{34, 28, 64, 85, 12, 16, 75, 36, 55},
//					{21, 77, 45, 35, 28, 75, 90, 76, 1},
//					{25, 87, 65, 15, 28, 11, 37, 28, 74},
//					{65, 27, 75, 41, 7, 89, 78, 64, 39},
//					{47, 47, 70, 45, 23, 65, 3, 41, 44},
//					{87, 13, 82, 38, 31, 12, 29, 29, 80}
		
		int arr[][] = new int[9][9];
		
		int row = 0;
		int column = 0;
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
				
		for(int i = 0; i < arr.length; i++) {  // 행 반복
			
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
				
				
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
				
				if(max == arr[i][j]) {
					row = i+1;
					column = j+1;
				}	
			}

		}
		
		System.out.println(max);
		System.out.println(row + " " + column);
		
	
	}
}
