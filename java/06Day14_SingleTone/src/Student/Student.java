package Student;

public class Student {
    String name;
    int korean;
    int english;
    int math;
    int science;
    public Student(){}
    public Student(String name, int korean, int english, int math, int science){
        this.name = name;
        this.english = english;
        this.science = science;
        this.math = math;
        this.korean = korean;
    }
    public double getAvg(){
        return ((double)english + (double)science + (double)math + (double)korean)/4.0;
    }
    public String getGrade(){
        if(90<=getAvg() && getAvg()<=100)  
            return "A학점";
        else if(70<=getAvg() && getAvg()<90)  
            return "B학점";
        else if(50<=getAvg() && getAvg()<70)  
            return "C학점";
        else if(30<=getAvg() && getAvg()<50)  
            return "D학점";
        else return "F학점";
    }
    public String getxxx(){
        return name + " 평균 : " + getAvg() + " 학점 : " + getGrade();
    }

}
