package quiz13;

public class MainClass {
	public static void main(String[] args) {
		Unit m=new Marine(0,0);
		m.move(3, 2);
		m.location();
		Unit d=new tank(1,2);
		d.move(3, 2);
		d.location();
		Unit t=new DropShip(2,3);
		t.move(3, 2);
		t.location();
	}
	
	
	

}
