package quiz13;

public class DropShip extends Unit {

	public DropShip(int x, int y) {
		super(x, y, 60);
	}

	@Override
	public void location() {
		System.out.println("현재 위치: " + x + ", " + y);
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
