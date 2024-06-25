package quiz01;

import java.util.Scanner;

public class Quiz13 {
	 public static void main(String[] args) {
			
		 Scanner scan = new Scanner(System.in);
		 
		 

		 int n = scan.nextInt();
		
		 int cnt = 0;
		 int i = 1;
		 while(i<=n) { 
			 //조건 - 4의 배수이면서 8의 배수가 아니면 개수를 증가 +
			if(i%4==0 && i%8!=0) {
				cnt++;
				
				 
			}
			i++;
		
		 }
		 System.out.print(cnt);
			 
			 
		 }
		 
		 
	}
	