package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*
		 * 프로그램이 실행되면 , 랜덤한 덧셈 문제를 출력해줍니다.
		 * 이 랜덤한 수의 범위는 1~100 사이의 값입니다.
		 * (math.random() +1) *100
		 * 
		 * 그만 풀고 싶을때 0을 누르면되며,
		 * 프로그램 정상 종료라고 나오고
		 * 사용자가 답안을 입력할 때 마다 , 정답 또는 오답 카운트가 누적 됩니다. 
		 * 정답과 오답 갯수가 출력됩니다.
		 * 
		 * cnt++
		 * 
		 * 
		 * 
		 */

		
		int o = 0;
		int x = 0;


		while(true) {
			int arr = (int) ((double)Math.random()*100);
			int abc = (int) ((double)Math.random()*100);
			
			System.out.println(arr+"+"+ abc+"="+"?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int z = scan.nextInt();

			if(arr+abc==z) {
				
				System.out.println("정답입니다.");
				o++;
				
				
			}else if(z==0){ 
				System.out.println("프로그램 정상 종료");
				System.out.println("정답:"+o);
				System.out.println("오답:"+x);
				break;
				
			}else if(arr+abc!=z) {
				System.out.println("틀렸습니다.");
				x++;
			}
		}
	}
}


