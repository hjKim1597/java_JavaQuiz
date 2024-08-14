package quiz06;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car car = new Car("제네시스");
		Car car2 = new Car("벤틀리", 100);
		
//		car.run();
//		System.out.println("---------");
//		car2.run();
		
		car.accel(160); 
		// 처음은 this(model,0)에 의해 매개변수 speed로 들어가서 0이기 때문에 else문으로 빠지면서 speed에 160 값이 넣어짐
		car.accel(160); 
		// 처음 실행된 else문에 있던 this.speed에 160이 넣어져 speed가 바뀐 상태이기 때문에 2번 실행하면 속도를 올릴 수 없다고 출력됨
		
		
//		System.out.println(car.info());
		
	}

}
