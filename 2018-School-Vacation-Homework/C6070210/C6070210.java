package C6070210;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*

    364p. 챕터 6 실습문제 7번

    ctrl-z 가 입력될 때까지 키보드로부터 문자를 읽고 사용자가 입력한 문자열에서
    단어를 분리하여 단어의 개수를 출력하는 프로그램을 작성하라.
    단어는 공백으로 분리한다.

 */

public class C6070210 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String tmp;
        int num = 0;

        try {
            while(true) {
                tmp = in.nextLine();
                StringTokenizer st = new StringTokenizer(tmp);
                num += st.countTokens();
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("단어의 개수 : " + num);
        }
    }
}
