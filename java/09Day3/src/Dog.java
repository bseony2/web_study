
public class Dog extends Pet{

	private String gender;
	private String color; //다른 애완동물에 없는 속성 가정...
	
	//동작
	//다른 애완동물에 없는 기능 가정... 
	
	public Dog(){super();}
	public Dog(String name, int age){super(name, age);}
	public Dog(String name, int age, String gender, String color) {
		//super();  //자동추가
		super(name, age);
		this.gender = gender;
		this.color = color;
	}
	
	public void cry() {
		System.out.println("멍멍");
	}
	public void eat() {
		System.out.println("쩝쩝");
	}
	public void sleep() {
		System.out.println("쿨쿨~");
	}
	public void run() {
		System.out.println("발발~");
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
