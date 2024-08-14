package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		System.out.println(method3(3, 4, 5.5));
		System.out.println(method4(8));
		method5("반복", 5);
		System.out.println(maxNum(6, 9));
		System.out.println(abs(-2));
	}
	
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	
	static String method4(int e) {
		
		String str = "";
		
		if(e % 2 == 0) {
			str = "짝수";
		}
		else {
			str = "홀수";
		}
		return str;
	}
	
	static void method5(String f, int g) {
		for(int i = 0; i <= g; i++ ) {
			System.out.println(f);
		}
	}
	
	static int maxNum(int h, int i) {
		// return h > i ? h : i ;
		if(h > i) {
			return h;
		}
		else {
			return i;
		}
	}
	
	static int abs(int num) {
		// return num < 0 ? -num : num;
		if(num > 0) {
			return num;
		}
		else {
			return -num;
		}
	}
	
	
}
