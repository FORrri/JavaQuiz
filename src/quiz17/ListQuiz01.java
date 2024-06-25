package quiz17;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListQuiz01 {

	public static void main(String[] args) {
		/*

		 * 
		 * 1. 숫자를 저장하는 리스트를 만들고 , 1~20까지 값을 순서대로 저장
		 * 2.UserV0를 저장할 수 있는 리스트를 만들고 , User객체 3개 저장
		 * 3.2번에 저장된 list 안에, 이름과 나이를 반복문으로 전부 출력
		 * 4.2번에 저장된 list 안에, "홍길동"이 있다면 , 
		 * 홍길동 객체의 이름과 나이를 출력
		 * 5. 2번에 저장된 list 안에, "홍길동"이 있다면 , 홍길동 객체를 삭제 
		 *
		 *
		 */
		//1
		List<Integer> list = new ArrayList<>(); //1. 숫자를 저장하는 리스트를 만들고 , 1~20까지 값을 순서대로 저장
		for(int i=1 ; i<=20; i++) {
			list.add(i);
		}
		System.out.println(list);
		//2
		List<UserV0> user = new ArrayList<>();//list의 user v0타입의 user가 들어있는 Arraylist를 생성
		user.add(new UserV0("홍길동",20)); //user.add로 userV0타입의 ("홍길동",20)의 user를 list에 넣는다.
		user.add(new UserV0("한정우",23));
		user.add(new UserV0("고길동",25));

		System.out.println("-----------1,2----------");

		//3
		for(int i = 0 ; i<user.size(); i++) {
			UserV0 vo = user.get(i);
			System.out.println(vo.getName()+","+vo.getAge());
		}


		//		for(UserV0 List : user) {
		//			System.out.println("이름: "+List.getName()+"/ 나이: "+List.getAge());
		//		}

		System.out.println("----------3-----------");

		//4

		for(int i = 0 ; i<user.size();i++) {
			UserV0 vo = user.get(i);
			if(vo.getName().equals("홍길동")) {
				System.out.println("홍길동이 있습니다.");
				System.out.println(vo.getName()+","+vo.getAge());
			}
		}


		//		for (UserV0 List : user) {
		//			if ("홍길동".equals(List.getName())) //true 일 때 ,{
		//				System.out.println("이름: " + List.getName() + ", 나이: " + List.getAge());
		//			break;
		//		}
		System.out.println("-------------4---------");

		//5.

		for(int i= 0 ; i<user.size(); i++) {
			if(user.get(i).getName().equals("홍길동")) {
				user.remove(i);
			}

		}

		for(UserV0 List : user) {
			System.out.println("이름: "+List.getName()+"/ 나이: "+List.getAge());

		}
		
		System.out.println("------------------5----------");
	}
}





