package student;

public class Student {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Student(){}
    public Student(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String studentInfo(){
        return name;
    }


    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return this.age;}
    public void setAge(int age) {this.age = age;}
    public int getHeight() {return this.height;}
    public void setHeight(int height) {this.height = height;}
    public int getWeight() {return this.weight;}
    public void setWeight(int weight) {this.weight = weight;}
}
