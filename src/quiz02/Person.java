package quiz02;

public class Person {
	
	String name;
	int age;
	int tall;
	
	// 생성자를 프로그래머가 만드면, 기본 생성자를 자동으로 만들지 않음 
	Person() {
	}
	
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	
	
	void info() {
		System.out.println("이름 :" + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + tall);
	}




}

