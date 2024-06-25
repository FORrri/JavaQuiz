package quiz16;

import java.util.Scanner;

public class StringQuiz03 {

	public static void main(String[] args)  {

		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String pal = scan.nextLine();
		pal=palindromeCheck(pal);
		System.out.println(pal);


	}

	private static String palindromeCheck(String x) {
		
//		x=x.replace(" ", "");
//
//		boolean z = new StringBuffer(x).reverse().toString().equals(x);
//		return z ? "회문" : "회문이 아닙니다";
//		
//	}
		
		x=x.replace(" ", "");
		int leng = x.length();

		for(int i=0; i<leng/2; i++) { //맨 앞글자 == 맨 뒤글자
			
//			x.charAt(i) == x.charAt(x.length()-1-i);
			
			if(x.charAt(i)!=x.charAt(leng-1-i)) {
				return "회문이 아닙니다";

			}
		}	
		return "회문입니다.";

	}
}

//회문비교 -> "다시합창합시다"
/*
			1. String palindromeCheck(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
			2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
			3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
			4. 문장은 공백을 포함하여 받을 수 있습니다.
			5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
			6. 힌트)
 * 함수를 이용하여 공백을 제거하세요. 힌트: replace() 
 * 문장의 길이의 중간값을 구하세요. 
 * 첫문장과, 마지막문장을 비교하며 중간으로 이동
 * for문에서 charAt()을 사용해서 반대로 잘라 붙이세요. (or 빌더를 이용 하여 문자를 뒤집어 비교)
 */




