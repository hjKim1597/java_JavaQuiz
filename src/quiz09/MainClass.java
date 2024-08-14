package quiz09;

public class MainClass {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.computerInfo();
		
//		Computer computer = new Computer(new Monitor());
		Monitor mo = computer.getMonitor();
		mo.info();
	}
}

