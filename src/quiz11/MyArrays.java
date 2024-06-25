package quiz11;


public class MyArrays {

	public static int a;
	public static String b;
	public static char c;

	/*
	 * Arrays.toString() 메서드 내가 만들기
	 * 1. MyArrays는 외부에서 객체로 생성할 수 없어야 됩니다.
	 * ->생성자에 접근 제어자를 이용해서 객체 생성을 하지 못하도록.
	 * 
	 * 2. 메서드 호출 시에는 static 키워드를 이용해서 사용하도록 만들어줍니다.
	 * 
	 * 3. int[]이나 String[]이나 Char[]이 전달되더라도 동일하게 동작하도록 
	 * 메서드 오버로딩을 시켜야 함.
	 * 
	 */
	private MyArrays() {

	}
	public String toString(int[] arr) {


		String str = "[";
		for(int i = 0; i<arr.length; i++) {
			
			str+=arr[i];
			if(i==arr.length-1) break;
			str+=",";
		
			}
		str+="]";
		
		return str;
}
	

	

	public String toString(String[] arr) {


		String str = "[";
		for(int i = 0; i<arr.length; i++) {
			
			str+=arr[i];
			if(i==arr.length-1) break;
			str+=",";
		
			}
		str+="]";
		
		return str;
}
	public String toString(char[] arr) {


		String str = "[";
		for(int i = 0; i<arr.length; i++) {
			
			str+=arr[i];
			if(i==arr.length-1) break;
			str+=",";
		
			}
		str+="]";
		
		return str;
}

}







