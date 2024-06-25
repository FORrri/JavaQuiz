package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//백준 2차원 배열 - 2566번
		//값을 순서대로 저장하는 것 부터 시작.
		
		int arr[][]=new int[9][9];
		int max = 0;
		int xindex = 0;
		int yindex = 0;
		
		for(int i = 0 ; i<arr.length; i++) {
			 
			for(int j = 0 ; j<arr[i].length;j++) {
				int index = scan.nextInt();
				arr[i][j]=index;
				if(max<=arr[i][j]) {
					max = arr[i][j];
					xindex=i;
					yindex=j;
					
				}
				
			}
		}
		System.out.println(max);
		System.out.println((xindex+1)+" "+(yindex+1));
		
//		for(int k = 0; k<arr.length; k++) {
//			for(int j=0; j<arr[k].length; j++) {
				
				
//			}
		}
		
		
		

	}

//첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에
//두고 차례로 출력한다.
//최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.