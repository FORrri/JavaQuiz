package quiz20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		/*
		 * 1.스캐너로 읽을 파일명을 확장자 포함 입력 받습니다.
		 * 
		 * 2.upload 폴더에 파일이 있다면 , 이 파일을 uploadcopy로 복사해주세요
		 * 파일이 없으면 "파일명이 없습니다" 예외구문을 출력합니다.
	
		 */
		Scanner scan = new Scanner (System.in);
		System.out.print("복사할 파일을 확장자명과 함께 입력하세요>");
		String path = scan.next();
		
		String Inputpath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\"+path;
		String Outputpath = "C:\\Users\\user\\Desktop\\course\\java\\uploadcopy\\"+path;
		
		InputStream ios = null;
		OutputStream fos = null;
		
		byte[]arr=new byte[1000];
		int result;
		try {
			ios = new FileInputStream(Inputpath);
			fos = new FileOutputStream(Outputpath);
			while((result = ios.read(arr))!=-1) {
				
			
				fos.write(arr,0,result);
			}
			System.out.println("파일이 정상적으로 copy 되었습니다");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일명이 없습니다");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				ios.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
