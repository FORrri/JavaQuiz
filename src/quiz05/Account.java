package quiz05;

public class Account {

	String name;
	String password;
	int balance;
	
	
	Account(){
		
	}

	Account(String Nname, String Pw, int bal){

		name = Nname;
		password = Pw;
		balance = bal;


	}
	

	void info(){

		System.out.println("이름:"+name);
		System.out.println("비밀번호:"+password);
		System.out.println("잔액:"+balance);



	}

	
	//입금 - 매개변수로 입력받은 값을 멤버변수 누적
	void deposit(int plus) {

		balance+=plus;

	}

	void withDraw(int minus) {

		balance-=minus;

	}
	int getBalance() {

		return balance; //클래스 외부에서 값을 가져갈 수 있음
	}




	



}
