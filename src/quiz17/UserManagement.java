package quiz17;

import java.util.ArrayList;
import java.util.List;

public class UserManagement implements IUserManagement{


	//값을 저장할 리스트
	private static List<UserV0> list = new ArrayList<>();

	
	//회원정보 추가 메서드
	public void insert(String name , int age) {
		UserV0 vo = new UserV0(name, age);
		list.add(vo);
	}
	
	
	//회원정보 출력 메서드
	public void printList() {
		for(int i=0; i<list.size(); i++) {
			UserV0 vo = list.get(i);
			System.out.println("성함 : "+ vo.getName() + " 나이 : "+vo.getAge());
		
		}
	}
	//회원 정보 검색
	public boolean search(String name) {
		boolean flag =false;
		
		for(int i=0; i<list.size(); i++) {
			UserV0 user = list.get(i);
			String n = user.getName();
			if(n.equals(name)) {
				System.out.println(user.getName()+"님 "+"안녕하세요~ "+"올해 나이는 "+user.getAge()+"입니다");
				flag = true;
			}
			
		}
		return flag;
	}
	
	public boolean delete(String name) {
		
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) { //삭제할 이름을 찾음.
				list.remove(i);
				System.out.println("정보 삭제 완료");
				break;
				
				
			}
		}return true;
	}
}