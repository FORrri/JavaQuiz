package quiz09;

public class MainClass {
	
	public static void main(String[] args) {
		//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
		Computer computer = new Computer();
		
		computer.computerInfo();
		
//		
//		//setter
//		KeyBoard key = new KeyBoard();
//		Monitor mon = new Monitor();
//		Mouse mou = new Mouse();
//		computer.setKey(key);
//		computer.setMon(mon);
//		computer.setMou(mou);
		
		
		//getter
//		KeyBoard k = computer.getKey();
		Monitor m = computer.getMon();
//		Mouse o = computer.getMou();
//		k.info();
		m.info();
//		o.info();
		
		
		
		
	}
	

}
