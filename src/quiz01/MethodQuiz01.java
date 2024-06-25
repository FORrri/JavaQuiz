package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		System.out.println(method3(1,2,3.45));
		System.out.println(method4(2));
		method5(2,"bbb");
		System.out.println(maxNum(2,17));
		System.out.println(abs(-23));
		
		

	}
	
	
	
	static double method3(int a,int b, double c) {
		double sum=0;
		
		sum+=a+b+c;
		
		
		return sum;
	}
	
	static String method4(int k) {
		
		String sue="";
		
		
		
//		if(k%2==0){
//			return "짝수";
//		}else {
//			return "홀수";
//		}
		
		if(k%2==0) {
			sue = "짝수";
			
		}else
			sue = "홀수";
		
		
		return sue;
	
	}
	
	static void method5(int z , String r) {
		
		
		
		for(int i=1; i<=z ; i++) {
			System.out.print(r);
		}
		
		
		
	}
	
	static int maxNum(int v , int w) {
		
		return v>w ? v:w;
		
//		int max=0;
//		
//		if(v<w) {
//			max+=w;
//			
//		}else if(v>w) {
//			max+=v;
//		}
//		
//		
//		return max;
	}

    static int abs(int a) {
    	
   
    return a<0? -a:a;
    }


}
