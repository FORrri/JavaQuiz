package quiz01;

public class Quiz18 {

	public static void main(String[] args) {

		//for문 사용
		
		//1번 7~100까지 정수 중에서 7의 배수를 가로로 출력
	
		for(int i = 7; i<=100; i+=7) {
			if(i%7==0) {
				System.out.print(i+" ");
				
			}
			
		}
		
		
		//2번 1~100까지 정수 중에서 9의 배수의 개수를 출력
		int cnt=0;
		for(int a = 1 ; a<=100; a++) {
			if(a%9==0) {
				cnt++;
			}

		}
		System.out.println("\n\n"+cnt);
		
		
		
		//3번 50~100까지 두 수 사이의 합계를 출력
		int sum = 0;
		for(int b = 50; b<=100; b++) {
			sum+=b;
		}

		System.out.println("\n"+sum);


		
		//4번 A~Z 문자열의 합 출력 ABCDEF..Z = 65
		int abc =0;
		for(char i='A'; i<='Z'; i++) {

			abc+=i;
		}System.out.println("\n"+abc+"\n");
		
		
		String str = "";
		for(char i='A'; i<='Z'; i++) {
			str+=i;
		}
		System.out.print(str);

	}
}
