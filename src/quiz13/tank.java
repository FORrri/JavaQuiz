package quiz13;

public class tank extends Unit {
	public boolean modeFlag = false;
	int hp = 100;
	
	public tank(int x, int y) {
		super(x,y,200);
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

    public void changeMode() {
    	modeFlag = modeFlag? false : true;
    	 System.out.println("공격 모드 변경");
    }
}

