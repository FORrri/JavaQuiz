package quiz20;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class FileQuiz03 {
	
	public static void main(String[] args) {
		/*
		 * 상혁이가 입사한 회사에서 , 매일오전 아침 7시에 연계사(회사)에서
		 * 날짜 유형의 CSV파일을 매일 전송을 해줍니다.
		 * ex)2024_06_04_data.csv
		 * 주의할 점은 내일이 되면 2024_06_05_data.csv이 됩니다.
		 * 
		 * 그래서 상혁이는 아침마다 , csv파일을 읽어서 우리의 데이터베이스에 저장하는
		 * 프로그램 코드를 생성해야 합니다.
		 * 
		 * 1.Buffered를 사용해서 오늘 날짜 패턴_data.csv 파일을 읽어서 한줄에 하나씩 출력을 하세요
		 * 2. 읽은 데이터는 , 구분자로 만들어져 있는데 ,기준으로 데이터를 분리해서 getter setter를 가지는 
		 * data 클래스에 저장하고 ,이 객체를 List에 저장하면 됩니다.
		 *
		 *힌트)
		 *Date 사용 , Data객체는 , 본인이 생성하고 ArrayList 사용
		 * 
		 * 
		 */

		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd");
		String file = "_data.csv";
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\";
		String datepath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\"+LocalDate.now()+"data.csv";
	
		List <Data> list = new ArrayList<>();
		BufferedReader br = null;
		BufferedWriter bw = null;
 		try {
			br = new BufferedReader(new FileReader(path+df.format(date)+file));
			
			bw = new BufferedWriter(new FileWriter(datepath));
			String str;
			
			while((str=br.readLine())!=null){
				
				String arr[]=str.split(",");
				Data data = new Data(arr[0],arr[1],arr[2],arr[3]);
				list.add(data);
				bw.write(data.toString() + "\n"); // 한 줄씩 데이터를 CSV 형식으로 저장
                System.out.println(data); // 콘솔 출력
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
 		
		
		
		
		
		
		
		
		
	}

}
