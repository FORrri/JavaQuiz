package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 사용자에게 수정하고 싶은 이름을 입력받아서,
		 * 해당 이름이 존재하면 , 수정할 이름을 새롭게 입력받습니다.
		 * 
		 *  만약에 값이 없으면 "이름은 존재하지 않습니다."
		 *  search / Insert
		 *  for / if / else
		 *  Array.toString
		 *  문자열의 비교
		 *  문자열.equals(비교 할 문자열)
		 *  
		 */
		
		
		String[]arr = {"강타","문희준","토니안","이재원","장우혁"};
		
		boolean flag = false; //찾으면 true로 변경을 할 것임
		
		System.out.print("수정할 학생의 별명을 입력 ");
		System.out.println(">");
		String name = scan.next();
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals(name)) { //같으면 t , 같지 않으면 f 
				System.out.println(name+"님의 별명을 변경합니다.");
				System.out.print(">");
				String change = scan.next();
				arr[i]=change;
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println(name + "은 없습니다.");
		}
		
		
		
		
	}
}
			
			

			

	
