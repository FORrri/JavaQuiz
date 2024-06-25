package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz25 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int n = scan.nextInt();
		int arr[] = new int[n]; // n을 받으면 , 크기가 n인 배열이 만들어진다.

		int i = 0;
		while(i<arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		int max= arr[0]; // 배열의 첫번째 요소
		int min= arr[0];
		
		int j=0;
		while(j<arr.length) {
			
			if(arr[j]>max) {
				max = arr[j];
			}
			if(arr[j]<min) {
				min = arr[j];
			}
		
			
			j++;
		}System.out.print(min+" "+max);
		
		
		
	}
}

		
//			if(max<arr[i]) {
//				max=arr[i];
//			}
//			if (min>arr[i]) {
//				min=arr[i];
//			
//			}
//		
//		
//		}
//		
//		System.out.print(min+" ");
//		System.out.print(max);
//	}
//
//}


//문제
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
//둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
//모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//출력
//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.