package quiz01;

import java.util.Scanner;

public class Chatgpt {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i<=N) {
			if(i%2==0) {
				
				sum+=i;
				
			}++i;
		}
		
		System.out.println(sum);
		}
	}


//숙제:
//어떤 수 N까지의 모든 짝수의 합을 구하는 프로그램을 작성하세요.