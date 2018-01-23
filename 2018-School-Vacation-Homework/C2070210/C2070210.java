package C2070210;

import java.util.Scanner;

/*

    112p. 챕터 2 실습문제 7번

    2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50, 50) 과 (100, 100)의
    두 점으로 이루어진 사각형이 있다고 하자. 이때 키보드로부터 한 점을 구성하는
    정수 x와 y 값을 입력받고 점 (x, y)가 이 직사각형 안에 있는지 판별하는 프로그램을
    작성해라.

 */


public class C2070210 {

    public static void main(String[] args){

        int x,y;
        Scanner in = new Scanner(System.in);

        System.out.println("점 (x,y)의 좌표를 입력하시오. ");
        x = in.nextInt();
        y = in.nextInt();

        if((x >= 50 && x <= 100) && (y >= 50 && y <= 100)){
                System.out.println("사각형 안에 점이 있습니다.");
        }else{
            System.out.println("사각형 안에 점이 없습니다.");
        }
    }
}