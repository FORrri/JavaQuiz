package quiz02;

public class Person {
	
	String name;
	int age;
	int height;
	long weight;
	
	void info(){
		
		System.out.println("이름 : "+name);
		System.out.println("키 :"+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("나이 : "+age+"세");
		
		
		
	}
	
	//프로그래머가 생성자를 만들면 , 기본 생성자를 자동으로 만들지 않음.
	
	
	Person(){
		
//		name = "mold";
//		height = 100;
//		weight = 50;
//		age = 30;
		
		
	}
	
	
	
	Person(String Nname,int Hheight,long Wweight, int Aage){
		
		name = Nname;
		height = Hheight;
		weight = Wweight;
		age = Aage;
		
		
		
		
	}
	
	

}
