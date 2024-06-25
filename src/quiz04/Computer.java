package quiz04;

public class Computer extends Calculator {

	double square;
	double x;
	
	//오버라이딩
	double circle(int a){

		return Math.PI * a * a;
	}
	
	//오버로딩
	double rect(double squarex) {
	
	
		return squarex * squarex;
	}
	
	double rect(double squarex , double squarey) {
		return squarex * squarey;
		
	
		
	}
	
	double rect(double squarex, double squarey , double squarez) {
		return squarex * squarey*squarez;
		
	}
}