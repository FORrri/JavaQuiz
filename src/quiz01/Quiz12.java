package quiz01;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		
		/*
		 * 어떤 수 n을 입력 받아서 n까지의 구구단 모형의 출력을 완성
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int n = scan.nextInt();
		
		
		System.out.println("구구단:"+n+"단");
		int i = 1;
		while(i<=9) {
			
			
			System.out.println(n+"x"+i+" "+"="+(n*i));
			i++;
		}
		
		
	}

}
