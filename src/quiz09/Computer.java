package quiz09;

public class Computer {
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요 o
	private KeyBoard key;
	private Monitor mon;
	private Mouse mou;
	
	

	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요 o

	public Computer() {
		super();
		this.key = new KeyBoard();
		this.mon = new Monitor();
		this.mou = new Mouse();
		
	}
	
	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요. o

	public Computer(KeyBoard key, Mouse mou , Monitor mon) {
		this.key = key;
		this.mou = mou;
		this.mon=mon;
	}

	
	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요 o
	public void computerInfo() {
		key.info();
		mon.info();
		mou.info();
	}

	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	o
	
	public KeyBoard getKey() {
		return key;
	}
	
	public void setKey(KeyBoard key) {
		this.key = key;
	}
	
	public Monitor getMon() {
		return mon;
	}
	
	public void setMon(Monitor mon) {
		this.mon = mon;
	}
	
	public Mouse getMou() {
		return mou;
	}
	
	public void setMou(Mouse mou) {
		this.mou = mou;
	}

	
}
