package C6040210;

/*

    364p. 챕터 6 실습문제 4번

    int 타입의 x, y, radius 필드를 가지는 Circle 클래스를 작성하라.
    equals() 메소드를 재정의하여 두 개의 Circle 객체의 반지름이 같으면
    두 Circle 객체가 동일한 것으로 판별하도록 하라.
    Circle 클래스의 생성자는 3개의 인자를 가지며 x, y, radius
    필드를 인자로 받아 초기화한다.

 */

public class C6040210 {

    public static void main(String[] args){
        Circle c1 = new Circle(3, 5, 5);
        Circle c2 = new Circle(2, 10, 5);

        System.out.println(c1.equals(c2));
    }
}
