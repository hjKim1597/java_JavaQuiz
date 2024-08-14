package quiz04;

public class Calculator {

	int result;
	double pi = 3.14;
	
	int add (int a) {
		result += a;
		return result;
	}
	
	double circle (int r) {
		double circle = pi * r * r;
		return circle;
	}
	
}
