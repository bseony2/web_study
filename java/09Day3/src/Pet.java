

public abstract class Pet {//부모클래스 

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

	public abstract void cry();
	public abstract void eat();
	public abstract void sleep();


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
