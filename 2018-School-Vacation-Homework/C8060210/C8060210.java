package C8060210;

/*

    452p. 챕터 8 실습문제 6번

    자바 소스 파일을 읽어들여서 맨 앞에 행 번호를 붙여서 화면에 출력하는 프로그램을 작성하라.

 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class C8060210 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("파일의 전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("자바 파일명을 입력하세요. : ");

        String str = in.nextLine(); // Terrific-JAVA\2018-School-Vacation-Homework\C8060210\Test.java

        try{
            BufferedReader br = new BufferedReader(new FileReader(str));

            int lineNum = 1;
            String line;
            while((line = br.readLine()) != null){
                System.out.print(lineNum + ": ");
                System.out.println(line);
                lineNum++;
            }
        }catch (FileNotFoundException e){
            System.out.println("파일을 찾을 수 없음.");
        }catch (IOException e){
            System.out.println("입출력 오류.");
        }
    }
}
