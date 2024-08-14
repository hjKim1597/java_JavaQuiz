package quiz02;

public class AccountMain {
	
	public static void main(String[] args) {
		

	Account myAcc = new Account("홍나린", "0520", 6000);	
	
	
	myAcc.deposite(1000);
	myAcc.withDraw(2000);
	
	int pBalance = myAcc.getBalance();
//	System.out.println(myAcc.name + "님의 계좌 잔액은: " + pBalance + "원입니다");
	System.out.println("현재잔액: " + pBalance );
	}
}
