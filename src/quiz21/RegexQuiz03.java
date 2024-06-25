package quiz21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. buffered 사용해서 건담.txt를 읽어들입니다.
		 * 2. 정규 표현식을 사용해서 
		 * 일련번호 , 
		 * 지점(건담베이스 강남점),
		 * 등급[등급],
		 * 상세내용,
		 * 가격으로 나누어서 출력
		 * 힌트) 상세내용은 정규 표현식으로 불가능하므로 , 
		 * 시작지점 , 끝지점을 사용해서 문자열 자르기
		 */
		
		String path="C:\\Users\\user\\Desktop\\course\\java\\upload\\건담.txt";
		
		BufferedReader br = null;
		
		String id = "\\d{8}-\\d{2}-\\d{12,13}";
		String cp="건담[가-힣]+ [가-힣]+";
		String grade = "\\[[A-Z가-힣]+\\]";
		String price="[0-9]+,*[0-9]+원";
		int cnt = 0; //행확인
		

		
		try {
			br = new BufferedReader(new FileReader(path));
			String str;
			while((str=br.readLine())!=null) {
				Matcher m1 = Pattern.compile(id).matcher(str);
				Matcher m2 = Pattern.compile(cp).matcher(str);
				Matcher m3 = Pattern.compile(grade).matcher(str);
				Matcher m4 = Pattern.compile(price).matcher(str);
				cnt++;
				
				
				if(m1.find()&& m2.find() && m3.find() && m4.find()) {
					System.out.println(m1.group());
					System.out.println(m2.group());
					System.out.println(m3.group());
					System.out.println(m4.group());
					int startIdx = m3.end();
					int endIdx = m4.start();
					System.out.println(str.substring((startIdx), (endIdx)).trim());
					
				}
				System.out.println(cnt);
				
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
		
	}

}
