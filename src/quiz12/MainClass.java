package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		Shape s = new Rect("사각형", 5);
		double square = s.getArea();
		System.out.println(s.getName());
		System.out.println(square);
		
		Shape c = new Circle("원형",3);
		double circle = c.getArea();
		System.out.println(c.getName());
		System.out.println(circle);
		
		
	}

}
