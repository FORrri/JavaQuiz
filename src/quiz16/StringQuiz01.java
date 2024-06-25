package quiz16;

import java.util.Scanner;

public class StringQuiz01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력하세요>");
			String id = scan.nextLine(); //공백 포함해서 값을 받을 수 있음.
			id = id.replace(" ","").toLowerCase();
			
			if(id.length()>=5&& id.equals(id.toLowerCase())) {
				System.out.println("아이디가 등록되었습니다");
				System.out.println("아이디는"+id+"입니다.");
				break;
				
			}else {
				System.out.println("다시 입력하세요");
			}
		}

		/*
		 * 1. 스캐너를 통해서 공백을 포함한 id를 입력 받습니다.
		 * 2. 공백을 제거한 아이디가 5글자 미만이면 , 다시 입력을 받으세요
		 * 3. 아이디는 소문자 이어야 합니다.
		 * 
		 * 아이디가 5글자 이상이면 , "아이디가 등록되었습니다"를 출력하고 프로그램 종료.
		 * 
		 */
	}

}
