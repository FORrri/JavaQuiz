package quiz17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {

		//간단한 회원정보 관리 프로그램
		//클래스와 인터페이스를 활용해서 분리.
		Scanner scan = new Scanner(System.in);
		//유저를 관리할 클래스
		UserManagement manage = new UserManagement();
		

		while(true) {
			System.out.println("------------------------------");
			System.out.println("[1.회원등록 2.회원전체보기 3.회원정보검색 4.회원정보삭제 5.프로그램종료]");
			System.out.print("메뉴>");
			int menu = scan.nextInt();

			if(menu==1) {
				System.out.print("이름을 입력하세요 > ");
				String name = scan.next();
				System.out.print("나이를 입력하세요 > ");
				int age = scan.nextInt();
				
				//메서드 호출
				manage.insert(name, age);	
				System.out.println("정상적으로 등록되었습니다. 반갑습니다");
				//스캐너로 이름 , 나이를 입력받아서 User 객체에 저장하고 , 리스트에 하나 추가
			}
			else if(menu==2) {
//				for(UserV0 member : list) {
//					System.out.println("성함: "+member.getName()+" 나이:"+member.getAge());
				System.out.println("==============회원 정보 출력=============");
				manage.printList();

				//list안에 저장된 모든 회원정보를 반복문으로 출력
			}
			else if(menu==3) {
				System.out.println("===========회원정보 검색============");
				System.out.println("이름을 입력하세요 > ");
				String name = scan.next();
				boolean flag = manage.search(name);

				if(!flag) { //위의 flag boolean 변환을 못했다.
					System.out.println(name + "님은 없는 회원입니다.");
				}
			}

				//찾을 이름을 입력 받아서 , 이름이 있다면 , 이름과 나이를 출력합니다.
				//단 찾는 이름이 없으면 , "(name)님은 없습니다" 를 출력합니다.
			
			else if(menu==4) {
				System.out.println("========회원정보삭제=========");
				System.out.print("이름을 입력하세요 > ");
				String del = scan.next();
				
				boolean flag = manage.delete(del);

				}

				//삭제할 이름을 입력받아서 , 이름과 동일한 user객체를 삭제
				//단 첫번째로 발견되는 User만 삭제


			else if(menu==5) {
				System.out.println("시스템 종료되었습니다 이용해주셔서 감사합니다");
				System.exit(0);
				//프로그램 종료
			}




		}



	}

}
