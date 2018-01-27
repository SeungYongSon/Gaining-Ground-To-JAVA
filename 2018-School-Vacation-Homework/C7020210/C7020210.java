package C7020210;

/*

    410p. 챕터 7 실습문제 2번

    Scanner 클래스를 사용하여 5개의 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장하고,
    ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
    출력하는 프로그램을 작성하라.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class C7020210 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        ArrayList<Character> al = new ArrayList<Character>();

        for(int i = 0; i< 5; i++){
            char tmp = in.next().charAt(0);
            if((tmp  >= 'A' && tmp <= 'D') || tmp == 'F')
                al.add(tmp);
            else {
                i--;
                System.out.println("Try Again.");
            }
        }

        double score = 0.0;

        for(int i = 0; i< al.size(); i++) {
            char ch = al.get(i);
            switch(ch) {
                case 'A' : score = 4.0; break;
                case 'B' : score = 3.0; break;
                case 'C' : score = 2.0; break;
                case 'D' : score = 1.0; break;
                case 'F' : score = 0.0; break;
            }
            System.out.print(score + " ");
        }
    }
}
