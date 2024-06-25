package quiz14;

public class MelonMusic implements SongList{

	private String[] list = new String[100];
	private int count = 0; // 음악의 갯수를 나타냄
	@Override
	public void insertList(String song) {

		if(count==100) {
			System.out.println("더 이상 음악을 추가할 수 없습니다.");
		}
		list[count]=song;
		count++;
	}


	// TODO Auto-generated method stub


	@Override
	public void playList() {
		int ran = (int) (Math.random()*count);
		for(int i=0; i<count; i++) {
			System.out.println(list[ran]+">노래를 랜덤 재생합니다.");
		}

	}





	@Override
	public int playLength() {
		// TODO Auto-generated method stub
		System.out.println("총 "+count+"개의 곡이 추가되었습니다.");
	
		return count;
	}

	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */


}
