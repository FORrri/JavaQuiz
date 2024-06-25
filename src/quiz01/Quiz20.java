package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		/*
		 * 가로 세로 길이의 사각형을 출력합니다.
		 * 단 윤곽만 출력하시오.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int a = scan.nextInt();
		System.out.print("세로>");
		int b = scan.nextInt();
		
		for(int i =1; i<=b; i++) { // 세로
			for(int j =1; j<=a; j++) { // 가로
				if(i==1||j==1||i==b) {
				System.out.print("*");
				}
				else {
				System.out.print(" ");
			}
			}System.out.println("*");
		
	}

}
}
