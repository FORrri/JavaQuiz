package quiz13;

public class DropShip extends Unit{
	
	public DropShip(int x, int y) {
		super(x,y,60);
	}
	public void location() {
		System.out.println("현재 위치: ("+x + ", " + y + ")");
	}


	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void stop() {
        System.out.println("정지합니다.");
	}
}
