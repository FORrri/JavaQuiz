package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	
	public static void main(String[] args) {
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		String match = "[0-9]{6}-[0-9]+\\s[0-9A-Z]+가-힣]+";
		
		String id = "[0-9]{6}-[0-9]+";
		String gs = "GS25|GS";
		String item = "\\([가-힣]+\\)";
		String price ="[0-9]+,[0-9]+원?"; 
		
		String[] arr = {str, str2, str3};
		

		//arr 상품번호 , GS25, (상품명), 가격을 정규표현식으로 나눠서 출력
		
		
		for(int i=0; i<arr.length; i++) {
			Matcher m1 = Pattern.compile(id).matcher(arr[i]);
			Matcher m2 = Pattern.compile(gs).matcher(arr[i]);
			Matcher m3 = Pattern.compile(item).matcher(arr[i]);
			Matcher m4 = Pattern.compile(price).matcher(arr[i]);
			
			if(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println("상품번호 : "+m1.group()+" GS브랜드 : "+m2.group()+" 상품명 : "+m3.group()+" 가격 : "+m4.group());
			}

		
	}
	}
}


