package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1.java()
		 * 매개변수로 정수를 받습니다.
		 * 매개변수가 1 > return "자"   //홀수"자" 짝수"바"
		 * 매개변수 2> return "자바"
		 * 매개변수 3 > return "자바자"
		 * 매개변수 4 > return "자바자바"
		 */
		
		/*
		 * sum()
		 * 매개변수로 정수를 1개 받습니다.
		 * 매개변수의 약수의 합계를 리턴
		 * 매개변수 5 > return 1+5
		 * 매개변수 6 > return 1+2+3+6
		 */
		
		/*
		 * primeNum()
		 * 매개변수 2개를 받아서 , 순서 상관없이 , 두수 사이의 합계를 리턴.
		 * 1, 2 => return 1+2;
		 * 2, 1 => return 1+2;
		 * 1,1 => return 0;
		 */
		
		System.out.println(sum(5));
		System.out.println(primeNum(1,2));
		
		
	}
	
	
		
	static String java(int x) {
		String javax = "";
		
		for(int i=1; i<=x; i++) {
			if(i%2==0) {
				javax+="바";
				
		}else {
			javax+="자";
		}
		}
		
		
				
				
				
		return javax;
	}	



    static int sum(int k) {
    	int sum=0;
    	
    	for(int i =1; i<=k; i++) {
    		if(k%i==0) {
    			sum+=i;
    		}
    	}
    	
    	
    	return sum;
    }


static int primeNum(int a , int b) {
	
	if(a==b) return 0; //프로그램 종료하는 역할 return.
	
	
	int max = a>b ? a:b;
	int min = b>a? b:a;
	
	int sum=0;
	for(int i = min; i<=max; i++) {
		sum+=i;
		
	}
	return sum;
}
	
	
	
//	int sum = 0;
//	int mola = 0;
//	if(z>y) {
//		z=mola;
//		for(int i=y; y<mola; y++) {
//			sum+=i;
//		}
//	}else if(z<y) {
//		y=mola;
//		for(int i=z; z<mola; z++) {
//			sum+=i;}
//	
//	
//	}else {
//		sum=0;
//	}
//	
	
//	
//	return sum;
//}

	
	
}

	
	
	
	
	
	
	



