package quiz02;

public class Accountmain {

	public static void main(String[] args) {

		Account myacc = new Account("홍길동","1234",3600);


		myacc.deposit(800);
		myacc.withDraw(1900);

		int bal = myacc.getBalance();
		myacc.info();
		System.out.println(myacc.name+"님의 계좌 잔액은: "+bal+"원 입니다.");






	}

}
