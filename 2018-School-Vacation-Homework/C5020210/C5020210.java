package C5020210;

/*

    302p. 챕터 5 실습문제 2번

    236p. 챕터 4 실습문제 5번을 수정해서 완성해보자.
    더하기(+), 빼기(-), 곱하기(*), 나누기(/)를 수행하는
    각 클래스 Add, Sub, Mul, Div 를 만들어라.
    이들은 모두 다음 필드와 메소드를 가진다.

    int 타입의 a, b 필드 : 연산하고자 하는 피연산자
    void setValue(int a, int b) : 피연산자를 객체 내에 설정한다.
    int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 그 결과를 리턴한다.

    Add, Sub, Mul, Div 클래스에 공통된 필드와 메소드가 존재하므로
    새로운 추상 클래스 Calc 를 정의하고 이들이 Calc 를 상속받게 하라.

    main() 메소드에서는 키보드로부터 두 정수와 계산하고자 하는 연산자를 입력받은 후
    Add, Sub, Mul, Div 중에서 이 연산을 실행할 수 있는 객체를 생성하고
    setValue() 와 calculate()를 호출하여 그 결과 값을 화면에 출력하는 프로그램을 작성하라.

 */

import java.util.Scanner;

public class C5020210 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("두 정수와 연산자를 입력하시오 ");

        int a = in.nextInt();
        int b = in.nextInt();
        char ch = in.next().charAt(0);

        switch (ch){
            case '+' :
                Add ad = new Add();
                ad.setValue(a, b);
                System.out.println(ad.calculate());
                break;
            case '-' :
                Sub sb = new Sub();
                sb.setValue(a, b);
                System.out.println(sb.calculate());
                break;
            case '*' :
                Mul ml = new Mul();
                ml.setValue(a, b);
                System.out.println(ml.calculate());
                break;
            case '/' :
                Div dv = new Div();
                dv.setValue(a, b);
                System.out.println(dv.calculate());
                break;
            default :
                System.out.println("기호를 잘못 입력하셨습니다.");
        }
    }
}
