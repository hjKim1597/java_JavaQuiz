package quiz01;

import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
	
	/*
	 * abc
	 * acb
	 * bac
	 * bca
	 * cab
	 * cba
	 * 
	 */

	Scanner scan = new Scanner(System.in);


	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();

	int max = 0;
	int mid = 0;
	int min = 0;

	if(a>b && a>c) {
		max = a;

		if(b>c) {
			
			mid=b;
			min=c;
		} 
		else {
			
			mid=c;
			min=b;
		}

	} 
	else if (b<a && b>c) {
		max = b;

		if (a>c) {
			
		mid = a;
		min = c;
		} 
		else {
			
		mid = c;
		min = a;
		} 
	}	
	else {
		max = c;

		if (a>b) {

		mid = a;
		min = b;
		} 
		else {

		mid = b;
		min = a;

	}
}
	System.out.println(max+" "+mid+" "+min);


/* 

배열을 이용한 답	

int[] arr = {a,b,c};

Arrays.sort(arr, Collections.reverseOrder()); 내림차순으로 정렬

System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);

*/

	scan.close();
	}
}
