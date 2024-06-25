package quiz18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz02 {

	public static void main(String[] args) {
		/*
		롤 큐 만들기
		 */
		String[] tiers = {"브론즈", "실버", "골딱이"};
		Random random = new Random();

		Queue<Member> member = new LinkedList<>();
		for (int i = 0; i < 300; i++) {
			int id = member.hashCode(); // ID는 고유한 해시코드값

			String tier = tiers[random.nextInt(tiers.length)];

			member.add(new Member(id, tier));
		}


		///////////////////////////////////////////////////////////
		/////////////////////////여기서 부터 문제/////////////////////
		System.out.println("========현재 게임을 신청한 순서=======");
		System.out.println(member);
		Queue<Member> bronze = new LinkedList<>(); //브론즈만 모음
		Queue<Member> silver = new LinkedList<>(); // 실버만 모음
		Queue<Member> gold = new LinkedList<>(); // 골드만 모음






		List<List<Member>> results = new ArrayList<>();
		int match = 1; // cnt 번째 팀
		while(member.isEmpty()==false) {



			//			String x = member.peek().getTier();
			//			if(x.equals("골딱이")) {
			//				gold.offer(member.poll());
			//			}else if(x.equals("실버")) {
			//				silver.offer(member.poll());
			//			}else if(x.equals("브론즈")) {
			//				bronze.offer(member.poll());
			//			}
			Member m = member.poll();

			if(m.getTier().equals("브론즈")) { //멤버의 티어를 확인함.
				bronze.offer(m);
				if(bronze.size()==5) {
					matching(match,bronze);
					match++;
				}
			}else if(m.getTier().equals("골딱이")) {
				gold.offer(m);
				if(gold.size()==5) {
					matching(match,gold);
					match++;
				}
			}
			else if(m.getTier().equals("실버")) {
				silver.offer(m);
				if(silver.size()==5) {
					matching(match,silver);
					match++;
				}
				

			}



			


	}
	
		System.out.println("쩌리=");
	while(bronze.isEmpty()==false) {
		System.out.println(bronze.poll());
	}
	while(silver.isEmpty()==false) {
		System.out.println(silver.poll());
	}
	while(gold.isEmpty()==false) {
		System.out.println(gold.poll());
	}




}
//소비하는 메서드 // 5명이 찼을때만 전달됨
public static void matching(int match, Queue<Member> member) {


	System.out.println(match+"번째 팀");
	while(member.isEmpty()==false) {
		System.out.println(member.poll());
	}


}


}




/*
 * member큐에는 게임을 신청한 순서대로 값이 담기게 됩니다.
 * 
 * 게임은 동일한 tier를 가지는 5명씩 한팀을 이루게 됩니다.
 * 
 * 예를들어
 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드 ... 로 신청되었다면
 * 골드 5명이 먼저 한팀으로 먼저 소비 되어야 합니다.
 * 
 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드, 실버, 실버, 브론즈, 실버, 실버 ... 로 신청되었다면
 * 골드 5명 -> 실버 5명이 소비 되어야 합니다
 * 
 * 
 * 랜덤한 member큐 가 주어질 때, 먼저 소비되어야 하는 팀별로 매칭 팀을 출력해주면 됩니다.
 * 
 * 
 * 
 * 
 * 
 */

