package student;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("홍길동", 15, 170, 80));
        list.add(new Student("한사람", 13, 180, 70));
        list.add(new Student("임걱정", 16, 175, 65));

        System.out.print("나이가 제일 많은 학생 이름 : ");
        int maxAge = Integer.MIN_VALUE;
        Student maxAgeStudent = new Student();
        for(Student s : list){
            if(s.getAge() > maxAge) {
                maxAgeStudent = s;
                maxAge = s.getAge();
            }
        }
        System.out.println(maxAgeStudent.studentInfo());


        System.out.print("신장이 제일 큰 학생 이름 : ");
        int maxHeight = Integer.MIN_VALUE;
        Student maxHeightStudent = new Student();
        for(Student s : list){
            if(s.getHeight() > maxHeight) {
                maxHeightStudent = s;
                maxHeight = s.getHeight();
            }
        }
        System.out.println(maxHeightStudent.studentInfo());


        System.out.print("몸무게가 제일 큰 학생 이름 : ");
        int maxWeight = Integer.MIN_VALUE;
        Student maxWeightStudent = new Student();
        for(Student s : list){
            if(s.getWeight() > maxWeight) {
                maxWeightStudent = s;
                maxWeight = s.getWeight();
            }
        }
        System.out.println(maxWeightStudent.studentInfo());
    }

}
