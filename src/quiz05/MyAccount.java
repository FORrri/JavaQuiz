package quiz05;

import java.util.Scanner;

public class MyAccount extends Account {
	
	
	MyAccount (String pName, String pw, int bal){
		name = pName;
		password = pw;
		balance = bal;
	}



	void withDraw(int money){
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호>");
		String pw = scan.next();

		
		

		if(pw.equals(password)) {
			
		if(balance<money) {
			System.out.println("잔액부족");
			System.out.println("남은 계좌 금액 : "+balance+"원");
			return;
		}else {
			balance-=money;
			System.out.println("남은 계좌 금액 : "+balance+"원");
		}
		}
		else {
			System.out.println("남은 계좌 금액 : "+balance+"원");
		}
	
		

	}

	
	void deposit(int money) {
		Scanner scan = new Scanner(System.in);
		String pw = scan.next();
		if(pw.equals(password)) {
		
		if(password!=pw) {
			System.out.println("비밀번호가 일치하지 않습니다");
			System.out.println("남은 계좌 금액 : "+balance+"원");
			return;
		
		}
		balance+=money;
		System.out.println("계좌 입금 받았습니다.");
		System.out.println("남은 계좌 금액 : "+balance+"원");
		}
		
	}





	/*
	길동이는 Account를 상속받는 나의계좌를 만드려고 한다.
	기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.

	1. Account를 상속받고
	withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 
	비밀번호가 일치하면
	금액을 감소시키려고 한다.
	또한 balance보다 큰 금액을 출금하려는 
	경우에는 "잔액부족" 을 출력해주어야한다.
	withDraw() 메서드를 오버라이딩 해주세요.


	2. deposit 입금기능은 자유롭게 오버라이딩 해보세요.

	 */






}
