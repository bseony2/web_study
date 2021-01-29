public class Dog {
    private String name;
    private int age;
    private String gender;
    private String color;

    public void cryDog(){
        System.out.println("멍멍~");
    }
    public void eatDog(){
        System.out.println("사료 먹기");
    }
    public void sleepDog(){
        System.out.println("쿨쿨~");
    }
    public void runDog(){
        System.out.println("발발~");
    }

    public Dog(String name, int age, String gender, String color){
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }
}
