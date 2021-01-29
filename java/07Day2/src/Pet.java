

public class Pet {//부모클래스 

	String name;
	int age;
	 //기본생성자
			
	public Pet(){
		super();
	}
	public Pet(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}

	public void cry() {
		System.out.println("멍멍~");
	}
	public void eat() {
		System.out.println("사료 먹기");
	}
	public void sleep() {
		System.out.println("쿨쿨~");
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
		
		
}
