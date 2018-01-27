package C7050210;

/*

    411p. 챕터 7 실습문제 5번

    하나의 학생 정보는 Student 클래스로 표현한다.
    Student 클래스에는 이름, 학과, 학번, 학점 평균을 나타내는 필드가 있다.
    키보드로 학생 정보를 5개 입력받아 ArrayList<Student>에 저장한후에
    ArrayList<Student>의 모든 학생 정보를 출력하는 프로그램을 작성하라.

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class C7050210 {

    public static void main(String[] args){

        ArrayList<Student> al = new ArrayList<Student>();

        Scanner in = new Scanner(System.in);

        String name;
        String department;
        String schoolNum;
        double avg;

        for (int i = 0; i< 5; i++){
            System.out.println(i+1 + "번째");

            System.out.print("이름 : ");
            name = in.next();
            System.out.print("학과 : ");
            department = in.next();
            System.out.print("학번 : ");
            schoolNum = in.next();
            System.out.print("학점 평균 : ");
            avg = in.nextDouble();

            al.add(new Student(name, department, schoolNum, avg));
        }

        Iterator<Student> it = al.iterator();
        int n = 0;

        while(it.hasNext()){
            n++;
            Student tmp = it.next();
            tmp.ShowStudent(n);
        }
    }
}
