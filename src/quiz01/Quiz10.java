package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();

		if(x>y && x>z) {
			if(y>z) {
				System.out.println(x+" "+y+" "+z);
			}else {
				System.out.println(x+" "+z+" "+y);
			}

		}else if(y>x && y>z) {
			if(x>z) {
				System.out.println(y+" "+x+" "+z);
			}else {
				System.out.println(y+" "+z+" "+x);
			}
		}else {
			if(x>y) {
				System.out.println(z+" "+x+" "+y);
			}else {
				System.out.println(z+" "+y+" "+x);
			}
		}

	}
}


//숙제내용
//정수를 3개를 입력 받습니다.
//
//입력 순서에 상관없이
//
//큰값 중간값 작은값 의 형태로 출력해주세요.
//
//
//(같은수의 입력은 없다고 가정합니다)
//숙제힌트
//조건을 잘 생각해야 하는 문제