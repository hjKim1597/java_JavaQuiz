package quiz02;

public class Account {
	
	String name;
	String password;
	int balance;
	
	Account(String pName, String pPassword, int pBalance){
		name = pName;
		password = pPassword;
		balance = pBalance;
	}
	
	// 입금 - 매개변수로 입력받은 값을 멤버변수로 누적
	void deposite(int a) {
		balance += a;
	}
	
	// 출금 
	void withDraw(int a) {
		balance -= a;
	}
	
	// 잔액조회
	int getBalance() {
		return balance; // 클래스 외부에서 값을 가져갈 수 있음
	}
}	

