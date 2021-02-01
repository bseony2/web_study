
// Cat is a Pet ==> 상속관계로 지정가능

public class Cat extends Pet{

//부모의 name, age 삭제 
	private String gender;
	//name, age 관련 get/set 삭제 
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//동작
	public void cry() {
		System.out.println("야옹~");
	}
	public void eat() {
		System.out.println("생선 먹기");
	}
	public void sleep() {
		System.out.println("새근새근~");
	}
	
	
	public Cat(String name, int age, String gender) {
		super(name, age);
		// this.name = name;
		// this.age = age;
		this.gender = gender;
	}
	
	

	
	
}
