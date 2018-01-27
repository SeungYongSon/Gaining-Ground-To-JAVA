package C7090210;

public class Student {

    String name;
    String department;
    String schoolNum;
    double avg;

    public Student(String name, String department, String schoolNum, double avg){
        this.name = name;
        this.department = department;
        this.schoolNum = schoolNum;
        this.avg = avg;
    }

    public void ShowStudent(){
        System.out.println("이름 : " + this.name);
        System.out.println("학과 : " + this.department);
        System.out.println("학번 : " + this.schoolNum);
        System.out.println("학과 평균 : " + this.avg);
    }
}
