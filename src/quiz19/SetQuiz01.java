package quiz19;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	
	public static void main(String[] args) {
		/*
		 * 1~45까지 중복되지 않는 로또번호 6개 만들기
		 * 
		 * 1. 랜덤객체를 사용해서 1~45까지 랜덤수를 생성
		 * 2. List or Set을 사용해서 랜덤한 로또번호 6개를 만들면 됩니다.
		 */
		
		 Set <Integer> set = new TreeSet<>(); //HashSet
		 Random random = new Random();
		 
		 while(set.size()<6) {
//			 set.add((int) (Math.random()*45));
			 set.add(random.nextInt(45)+1); // 1~45 * 외워야함
			 
		 }
		 System.out.println(set.toString());
	}
	
}
