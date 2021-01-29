package school;
import java.util.Collections;

public class StudentTest {
    
    public static void main(String[] args) {
        Student[] studentList = new Student[3];
        studentList[0] = new Student("홍길동", 15, 170, 80);
        studentList[1] = new Student("한사람", 13, 180, 70);
        studentList[2] = new Student("임걱정", 16, 175, 65);

        double ageTotal = 0;
        double heightTotal = 0;
        double weightTotal =0 ;
        int maxAge = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        int minHeight = Integer.MAX_VALUE;
        int maxWeight = Integer.MIN_VALUE;
        int minWeight = Integer.MAX_VALUE;
        
        System.out.println("이름\t나이\t신장\t몸무게");
        for(int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].printStudentInfo());
            ageTotal += studentList[i].getAge();
            heightTotal += studentList[i].getHeight();
            weightTotal += studentList[i].getWeight();

            if(maxAge<studentList[i].getAge()){maxAge = studentList[i].getAge();}
            if(minAge>studentList[i].getAge()){minAge = studentList[i].getAge();}
            if(maxHeight<studentList[i].getHeight()){maxHeight = studentList[i].getHeight();}
            if(minHeight>studentList[i].getHeight()){minHeight = studentList[i].getHeight();}
            if(maxWeight<studentList[i].getWeight()){maxWeight = studentList[i].getWeight();}
            if(minWeight>studentList[i].getWeight()){minWeight = studentList[i].getWeight();}

        }
        System.out.println();
        System.out.printf("나이 평균 : %.3f\n",ageTotal/3);
        System.out.printf("신장 평균 : %.3f\n",heightTotal/3);
        System.out.printf("몸무게 평균 : %.3f\n",weightTotal/3);
        System.out.println();
        for(int i=0;i<studentList.length;i++){
            if(studentList[i].getAge()==maxAge){System.out.println("나이가 가장 많은 학생 : "+studentList[i].getName());}
            if(studentList[i].getAge()==minAge){System.out.println("나이가 가장 적은 학생 : "+studentList[i].getName());}
            if(studentList[i].getHeight()==maxHeight){System.out.println("신장이 가장 큰 학생 : "+studentList[i].getName());}
            if(studentList[i].getHeight()==minHeight){System.out.println("신장이 가장 작은 학생 : "+studentList[i].getName());}
            if(studentList[i].getWeight()==maxWeight){System.out.println("몸무게가 가장 많이 나가는 학생 : "+studentList[i].getName());}
            if(studentList[i].getWeight()==minWeight){System.out.println("몸무게가 가장 적게 나가는 학생 : "+studentList[i].getName());}

        }
        
    }
}
