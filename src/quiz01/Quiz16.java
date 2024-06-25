package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		//		숙제내용
		//		첫째 줄에 반복 횟수, 둘째 줄에 반복할 문자열이 주어집니다.
		//
		//		반복횟수 만큼 문자열을 붙여서 출력해 주세요.
		//문자열 합
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String x = scan.next();
		
		String str = "";
		
		int i = 1;
		while(i<=n) {
			
			str +=x;
			
			i++;
			
		}
		
		System.out.println(str);
	}
}






		//        int a = scan.nextInt();
		//		String b = scan.next();
		//		
		//		int i = 1;
		//		
		//		while(i<=a) {
		//			i++;
		//			System.out.print(b);
		//			} 
		//		
		//		}
		//		
		//
		//	}
		//
		//
