package quiz12;

public class Rect extends Shape{
	//사각형은 생성될 때 도형이름과, 변의 길이를 받고 초기화합니다.
	//getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
	//main에서 객체를 생성해서 확인하세요


	public Rect(String name, int side) { // 생성자를 통해서 도형이름과 변의길이를 받고,
		super(name); //도형 이름을 부모님이 들고있으며 따라 쓴다. 
		this.side=side; // 내가 갖고 있는 side
		// TODO Auto-generated constructor stub
	}

	private int side;

	@Override
	public double getArea() {
		
		return side*side;
	}

	
}
