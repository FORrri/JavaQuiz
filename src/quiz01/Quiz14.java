package quiz01;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);



		int n = scan.nextInt(); // 반복횟수
		int x = scan.nextInt(); // 배수
//		int i = 1;
//		while(i<=n) { 
//			if(i%x==0)
//				System.out.println(i+" ");
//			
//		}
//		
//		i++;
//	}
//
//}
		int i = x;
		while(i<=n) {
			System.out.print(i+" ");
			i+=x;
			
		}
	}
}
