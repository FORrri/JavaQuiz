package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		//두 수 사이의 합 * 다시 풀어보기

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int max = 0;
		int min =0;
		int sum = 0;

		if(a>b) {
			max = a;
			min =b;
		}else {
			max= b;
			min= a;

			for(int i=min; i<=max; i++) {
				sum+=i;
				
			}
			System.out.println(max==min ? 0 : sum);
		}	







	}

}


//숙제내용
//정수 2개를 입력 받습니다.
//
//이 정수 사이의 합을 구해주세요.
//
//예를들어
//1 5가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다
//5 1가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다
//
//만약 같은 수라면 0이 출력 됩니다.