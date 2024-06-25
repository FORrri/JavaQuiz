package quiz01;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		//		//
		//		int x= 4; // 소수인지 or 아닌지 확인
		//		int cnt = 0;
		//		for(int i=1; i<=x; i++) {
		//			if(x%i==0) { // i는 약수
		//				cnt++;
		//			}
		//		}System.out.println(cnt == 2 ? "소수 " : "소수가 아님");
		//

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int sum = 0;
		
		//디버깅
		start:for(int i=1; i<=x; i++) {
			int cnt = 0;
			for(int j = 1; j<=i; j++) {
				//				System.out.println(i+"-"+j);
				if(i%j==0) { // i의 약수
					cnt++;}
				
				if(cnt>2) { //더 반복문을 돌릴 필요가 없음.
					
					continue start;
				}
			} // 이 반복문을 돌고 나오면 , 약수 개수가 나옴.
			if(cnt==2) { //i는 소수라고 할 수 있음.
				sum+=i;
//				System.out.print(i+"+");
			}

		}System.out.println("="+sum);
	}
}



//숙제내용
//어떤 수 x가 주어질 때 x까지의 수 중 소수들의 합을 출력해주세요.
//
//소수?
//소수는 약수가 1과 자기자신인 수 입니다.
//
//예시
//5 까지의 소수합은 2 + 3 + 5 = 10 입니다
//6 까지의 소수합은 2 + 3 + 5 = 10 입니다
//7 까지의 소수합은 2 + 3 + 5 + 7 = 17 입니다
//숙제힌트
//중첩반복을 사용해야 하는문제.
//어떤 값이 소수인지 확인해서 더한다.