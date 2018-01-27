package C7090210;

/*

    413p. 챕터 7 실습문제 9번

    하나의 학생 정보는 Student 클래스로 표현한다.
    Student 클래스에는 이름, 학과, 학번, 학점 평균을 나타내는 필드가 있다.
    여기서 학번을 String 타입으로 선언한다.

    키보드에서 학생 정보를 5개 입력받아 학번을 '키' 로 하여 HashMap<String, Student>에 저장하고
    학번으로 학생 정보를 검색하여 출력하는 프로그램을 작성하라.

    다음과 같은 해시맵을 이용하하라.
    HashMap<String, Student> dept = new HashMap<String, Student>();

 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class C7090210 {

    public static void main(String[] args){

        HashMap<String, Student> dept = new HashMap<String, Student>();

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
            while (true){
                schoolNum = in.next();
                if(schoolNum.equals("-1")) System.out.println("다시 입력하세요!!!");
                else break;
            }
            System.out.print("학점 평균 : ");
            avg = in.nextDouble();

            dept.put(schoolNum ,new Student(name, department, schoolNum, avg));
        }

        String search;
        Set<String> keys;
        Iterator<String> it;
        boolean found = false;

        while(true){
            System.out.println("검색을 끝내고 싶으면 -1 을 입력하세요.");

            search = in.next();

            if(search.equals("-1")) break;

            keys = dept.keySet();
            it = keys.iterator();

            while(it.hasNext()){
                String key = it.next();
                if(search.equals(key)){
                    dept.get(key).ShowStudent();
                    found = true;
                }
            }
            if(!found) System.out.println("찾지 못했습니다...");
            else found = false;
        }
    }
}
