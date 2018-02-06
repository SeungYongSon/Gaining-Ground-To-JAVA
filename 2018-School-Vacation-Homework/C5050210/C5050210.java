package C5050210;

/*

    304p. 챕터 5 실습문제 5번

	추상 클래스의 서브 클래스 만들기에 필요한 추상 메소드 오버라이딩과
	super()의 사용에 관한 문제이다. 다음과 같은 MyPoint 추상 클래스가 있다.

	    abstract class MyPoint {
            int x;
            int y;
            public MyPoint(int x, int y){
                this.x = x;
                this.y = y;
            }

            protected abstract void move(int x, int y); // 새로운 x, y 위치로 이동
            protected  abstract void reverse(); // (x, y)에서 (y, x)로 위치 변경
            protected void show(){
                System.out.println(x + "," + y);
            }
        }

    MyPoint를 상속받은 MyColorPoint 클래스를 작성하라.
    MyColorPoint의 생성자는 MyColorPoint(int x , int y, String color)로 하라.
    그리고 다음과 같은 main() 메소드를 삽입하여 실행하도록 하라.

        public static void main(String[] args){
            MyPoint p = new MyColorPoint(2, 3, "Blue");
            p.move(3, 4);
            p.reverse();
            p.show();
        }

 */
 
public class C5050210 {

    public static void main(String[] args){

        MyPoint p = new MyColorPoint(2, 3, "Blue");
        p.move(3, 4);
        p.reverse();
        p.show();
    }
}
