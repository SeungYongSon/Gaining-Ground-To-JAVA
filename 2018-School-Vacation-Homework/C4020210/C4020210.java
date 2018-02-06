package C4020210;

/*

    235p. 챕터 4 실습문제 2번

    다음과 같은 멤버를 가지는 직사각형을 표현하는 Rectangle 클래스를 작성하라.

    int 타입의 x1, y1, x2, y2 필드 : 사각형을 구성하는 두 점의 좌표
    생성자 2개 : 매개 변수 없는 생성자와 x1, y1, x2, y2의 값을 설정하는 생성자

    void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 좌표 설정
    int square() : 사각형 넓이 리턴
    void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
    boolean equals(Rectangle r) : 인자로 전달된 객체 r 과 현 객체가 동일한 직사각형이면 true 반환

    Rectangle 을 이용한 main() 메소드는 다음 밑에 코드와 같으며
    이 main() 메소드가 잘 작동하도록 하자.

 */

public class C4020210{

    public static void main(String[] args){

        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1, 1, 2, 3);

        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());
        if(r.equals(s)){
            System.out.println("두 삼각형은 같습니다.");
        }
    }
}
