package C7010210;

/*

    410p. 챕터 7 실습문제 1번

    Scanner 클래스를 사용하여 10개의 실수 값을 키보드로부터 읽어 벡터에 저장한 후,
    벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.

 */

import java.util.Scanner;
import java.util.Vector;

public class C7010210 {

    public static void main(String[] args){

        Vector<Integer> vi = new Vector<Integer>();

        int max;

        Scanner in = new Scanner(System.in);
        for(int i = 0; i< 10; i++){
            vi.add(in.nextInt());
        }

        max = vi.get(0);

        for(int i = 1; i < vi.size(); i++) {
            if (max < vi.get(i)) max = vi.get(i);
        }

        System.out.println(max);
    }
}