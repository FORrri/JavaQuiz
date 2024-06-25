package quiz01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max, mid, min;

        if (a > b && a > c) { // a가 가장 큰 경우
            max = a;
            if (b > c) { // b가 중간인 경우
                mid = b;
                min = c;
            } else { // c가 중간인 경우
                mid = c;
                min = b;
            }
        } else if (b > a && b > c) { // b가 가장 큰 경우
            max = b;
            if (a > c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else { // c가 가장 큰 경우
            max = c;
            if (a > b) {
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        }  System.out.println(max + " " + mid + " " + min);
		
	}
}
/*
 * 숙제내용
정수를 3개를 입력 받습니다.

입력 순서에 상관없이

큰값 중간값 작은값 의 형태로 출력해주세요.


(같은수의 입력은 없다고 가정합니다)
 */

