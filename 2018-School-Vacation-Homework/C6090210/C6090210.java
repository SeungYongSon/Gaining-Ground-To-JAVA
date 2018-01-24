package C6090210;

/*

    365p. 챕터 6 실습문제 9번

    패키지 개념과 import 의 사용을 복합적으로 묻는 문제이다.
    2개의 패키지를가진 자바 응용프로그램을 작성해보자.
    패키지 lib 에는 a.class 가 있고 패키지 main 에는 C6090210.class 가 있다.
    클래스 a는 한개의 메소드 sum(int x, int y)가 있으며 x, y의 합을 리턴한다.
    클래스 C6090210 에는 main() 메소드가 있고 main()은 클래스 a의 인스턴스를 생성하고
    sum(2, 3)을 호출한다. 결과로서 5를 화면에 출력한다.
    a.java 와 m.java 를 각각 작성하여 프로그램을 완성하라.

 */

import C6090210.lib.a;

public class C6090210 {

    public static void main(String[] args){

        a a1 = new a();

        System.out.println(a1.sum(2, 3));
    }
}
