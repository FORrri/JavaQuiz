package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		/*
		 * 빠른 입력을 통해서 , 사용자로부터 입력을 받습니다.
		 * 사용자가 "그만"을 적을 때 까지 입력을 받아주면 됩니다.
		 * 입력받을 내용을 , BufferWriter를 이용해서 , 파일을 쓰세요
		 * 파일명은 자유
		 * 단 사용자가 엔터를 칠때마다 데터는 써져야 합니다.
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\text4.txt";
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in)); //키보드로 입력
			bw = new BufferedWriter(new FileWriter(path));
			
			while(true) {
			
				System.out.println("입력하세요>");
				
				String str = br.readLine();
				if(str.equals("그만")) {
					break;
				}
				
				bw.write(str+"\n"); //파일로 쓰기
				bw.flush(); // 버퍼를 비운다.
	
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
	}

}
