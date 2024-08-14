package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		/*
		 1. java() 
		 매개변수로 정수를 받는다
		 매개변수 1 -> return "자";
		 매개변수 2 -> return "자바";
		 매개변수 3 -> return "자바자";
		 매개변수 4 -> return "자바자바";
		 
		 2. sum()
		 매개변수로 정수를 1개 받는다
		 매개변수의 약수 합계를 리턴
		 매개변수 5 -> return 1 + 5
		 매개변수 6 -> return 1 + 2 + 3 + 6
		 
		 3. primeNum()
		 매개변수 2개를 받아서 순서 상관없이 두 수 사이의 합계를 리턴
		 1, 2 => return 1 + 2;
		 2, 1 => return 1 + 2;
		 1, 1 => return 0;
		 */
		
		System.out.println(java(3));
		System.out.println(sum(5));
		System.out.println(primeNum(1,2));
		
		
	}
	
	static String java(int a) {
		
		String str = "";
		
		for(int i = 0; i < a; i++) {
			if(i % 2 == 0) {
				str = "자";
			}
			else {
				str = "바";
			}
		}
		return str;
	}

	
	static int sum(int b) {
		
		int total = 0;
		
		for(int i = 0; i <= b; i++) {
			if(b % i == 0) {
				total += i;
			}
		}
		return total;		
	}
	
	
	static int primeNum(int a, int b) {
		/* 
		 if (a == b) return 0;
		 int max = a > b ? a : b;
		 int min = a > b ? b : a;
		
		 int sum = 0;
		 for(int i = min; i <= max; i++) {
		 	sum += i;
		 }
		*/
		
		if(a == b) {
			return 0;
		}
		else {
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			int total = 0;
			for(int i = min; i <= max; i++) {
				total += i;
			}
			return total;
		}
	 }
}



	
	
	
	
	
