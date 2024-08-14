package quiz01;

import java.util.Scanner;

public class Quiz17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		int[] arr = {1000, 500, 100, 50, 10};
		
		int i = 0;
		while (i<arr.length) {
		System.out.print(arr[i]+" "+ money / arr[i]+" "); // 몫
		money %= arr[i]; // money = money % arr[i]; // 나머지
		i++;
		}
		scan.close();
	}
}
