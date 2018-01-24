package C6080210;

import java.util.NoSuchElementException;
import java.util.Scanner;

/*

    365p. 챕터 6 실습문제 8번

    ctrl-z 가 입력될 때까지 키보드로부터 문자를 읽고 사용자가 입력한 문자열에서
    제일 긴 단어를 출력하는 프로그램을 작성하라.
    단어는 공백으로 분리한다.

 */

public class C6080210 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String tmp, tmp2 = "";

        try {
            while(true) {
                tmp = in.nextLine();
                if(tmp2.length() < tmp.length()){
                    tmp2 = tmp;
                }
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("가장 길은 단어 : " + tmp2);
        }
    }
}
