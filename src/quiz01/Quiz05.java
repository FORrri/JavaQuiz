package quiz01;

public class Quiz05 {
	
	public static void main(String[] args) {
		/*
		 * quiz 02 문제를 if~else 문장으로 변경
		 */ 
	int a = (int)(Math.random()*11)-5;
	
	if(a>0) {
	System.out.println("랜덤값:"+a);
	} else { 
		System.out.println("절대값:"+-a);
	}
	
	
	int result; // 결과값을 저장할 변수
	if(a<0) { 
		result = -a;
	} else {
		result = a;
	}
	
	System.out.println(result);
	
	
	
}

}
/*
 *  0~10범위의 랜덤한 정수를 생성하고 , 5에서 빼주면 범위는 -5~5가 됩니다.
 *  이 값을 가지고 , 3항 연산식을 이용해서 절대값 (언제나 양수값)을 출력하세요.
 * 
 */


//int z = (int)(Math.random()*11)-5;
//System.out.println("랜덤값:" + z);
//System.out.println("절대값:"+(z<0? -z:z));

