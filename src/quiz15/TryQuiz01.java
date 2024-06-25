package quiz15;

import java.util.Scanner;

public class TryQuiz01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("정수1>");
				int a = scan.nextInt(); // nextInt는 엔터값을 가지므로 값이 저장됨.
				System.out.println("정수2>");
				int b = scan.nextInt();
				int sum = a + b;
				System.out.println("합: " + sum);
				break;  
			} catch (Exception e) {
				System.out.println("정수로만 입력하세요");
				scan.nextLine();//엔터값 강제로 소모 (에러가 뜰 때 강제로 삭제)
			
			}
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}
}
