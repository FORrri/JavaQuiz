package quiz16;

import java.util.Scanner;

public class StringQuiz02 {
	public static void main(String[] args)  {
		/* 주민번호 검증메서드 masking(String) : string
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		 * 
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자
		 * 검증데이터 950101-2000000 -> 여자
		 * 검증데이터 9501012000000 -> 여자
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("주민번호를 입력하세요.");
			String ssn = scan.nextLine();

			try {
				String x = masking(ssn); // 마스킹 메서드 타고 나와서 (검증값)
				char gendercode = ssn.replace("-","").charAt(6);
				String gender = (gendercode == '1' || gendercode == '3') ? "남자" : "여자";
                System.out.println("검증데이터: " + x + " -> " + gender + " 입니다.");
                break;
				}
		
			catch (Exception e) {
				System.out.println("유효하지 않습니다.");
			}
			
		}




	}
	private static String masking(String ssn) throws Exception {

		ssn=ssn.replace("-",""); // 하이픈빼주고

		if(ssn.length()!=13 ) { // 13보다 큰지
			System.out.println("주민번호는 13자리여야 합니다.");
			throw new Exception();
		}

		char gender = ssn.charAt(6);
		if(gender != '1' && gender !='2' && gender !='3' && gender !='4') {
			System.out.println("유효하지 않는 성별코드입니다. ");
			throw new Exception();
		}
//		if(gender==1 || gender == 3) {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}

		return ssn.substring(0,6)+"-*******";
	}




}
