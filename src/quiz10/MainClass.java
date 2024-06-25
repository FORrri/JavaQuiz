package quiz10;

public class MainClass {
	public static void main(String[] args) {
		
		MyCart cart = new MyCart(10000);
		cart.buy(new Tv());
		cart.buy(new Radio());
		cart.buy(new Computer());
		cart.buy(new Computer());
		cart.buy(new Computer());
		cart.buy(new Computer());
		cart.buy(new Computer());
		cart.buy(new Computer());
		cart.buy(new Computer());
		cart.info();
		
		
		
		
		
	}



}
