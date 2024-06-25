package quiz01;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		//누적할 변수는 밖에 
		int okcnt = 0;
		int nocnt = 0;
		
		while(true) {
			//초기화 할 변수는 반복문 안에
			int x = (int)(Math.random())*100;
			int n = (int)(Math.random())*100;	
			
		
		//랜덤한 문제 생성
		System.out.println("--------------");
		System.out.println(x+""+"+"+n+""+"="+"?");
		System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
		System.out.print(">");
		//입력
		int answer = scan.nextInt();
		//비교
		if(answer ==0) {
			System.out.println("프로그램 정상 종료");
			System.out.println("정답갯수:"+okcnt);
			System.out.println("오답갯수:"+nocnt);
			break;
			
		}
		
		if(x+n == answer) {
			okcnt++;
			System.out.println("정답입니다.");
			
		}else { 
			nocnt++;
			System.out.println("오답입니다.");
			
		}
			
			
			
		
	}

}
}


