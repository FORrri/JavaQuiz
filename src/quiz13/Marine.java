package quiz13;

public class Marine extends Unit {
	
	public static int attack = 6;
	public static int armor = 0;
	
	public Marine(int x, int y) {
		super(x, y, 60);
		// TODO Auto-generated constructor stub
	}

	public void location() {
		System.out.println("현재 위치: ("+x + ", " + y + ")");
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void stop() {
		// 현재 위치에 정지
		
	}

	

}



//	    
//
//	        



