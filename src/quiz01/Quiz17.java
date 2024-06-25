package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {1000, 500, 100, 50, 10}; //0~4
		int money = scan.nextInt();
		int i = 0;
		
		while(i<arr.length) {
			System.out.println(arr[i]+" "+money/arr[i]+" ");
			money%=arr[i];
			i++;
		}
			

	}

}

//숙제내용
//금액 x원이 주어집니다
//가장 최선의 방법으로 거스름돈을 구하려고 합니다.
//
//예를 들어 17780원 이라면
//
//1000원 지폐 17개
//500원 동전 1개
//100원 동전 2개
//50원 동전 1개
//10원 동전 3개 가 필요합니다.
//
//배열 arr에는 아래처럼 동전이 주어집니다.
//int[] arr = {1000, 500, 100, 50, 10}
//
//이 배열을 활용해서 동전과 필요 개수를 순서대로 출력해주세요.
//숙제힌트
//int[] arr = {1000, 500, 100, 50, 10} 을 선언하고 활용하는 문제입니다.