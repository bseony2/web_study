
public class Fish extends Pet{//자바는 단일 상속만 가능 

//2개 변수 삭제 , get, set 삭제 
	private double tailSize; //Fish에만 존재하는 속성 가정
	
	//동작
	public void swimFish() {
		System.out.println("어푸어푸~");
	}
	public Fish(String name, int age, double tailSize) {
		super();
		this.name = name;
		this.age = age;
		this.tailSize = tailSize;
	}
	
	public double getTailSize() {
		return tailSize;
	}
	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}
	
	
	
}
