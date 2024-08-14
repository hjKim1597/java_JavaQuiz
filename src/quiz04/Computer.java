package quiz04;

public class Computer extends Calculator{

	// 오버라이딩
	double circle (int r) {
		double circle = Math.PI * r * r;
		return circle;
	}
	
	double rect(double a) {
		double area = a * a;
		return area;
	}
	
	double rect(double b, double c) {
		double area = b * c;
		return area;
	}
	
	double rect(double a, double b, double c) {
		double area = a * b * c;
		return area;
	}
	
}
