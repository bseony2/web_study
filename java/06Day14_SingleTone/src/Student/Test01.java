package Student;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    static List<Student> studentList = new ArrayList<Student>();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 명의 학생을 추가 하시겠습니까? "); int many = scan.nextInt();

        for(int i=0;i<many;i++){
            System.out.print("이름 : ");String name = scan.next();
            System.out.print("한국어 : ");int korean = scan.nextInt();
            System.out.print("영어 : ");int english = scan.nextInt();
            System.out.print("수학 : ");int math = scan.nextInt();
            System.out.print("과학 : ");int science = scan.nextInt();
            System.out.println("===============================");
            studentList.add(new Student(name, korean, english, math, science));
        }


        for(int i=0;i<many;i++){
            System.out.println(studentList.get(i).getxxx());
        }
        scan.close();
    }
}