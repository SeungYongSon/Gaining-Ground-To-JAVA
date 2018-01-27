package C8040210;

/*

    452p. 챕터 8 실습문제 4번

    사용자로부터 두 개의 텍스트 파일 이름을 입력받고
    첫 번째 파일 뒤에 두 번째 파일을 덧붙여 새로운 파일을 생성하는
    프로그램을 작성하라.

 */

import java.io.*;
import java.util.Scanner;

public class C8040210 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("파일의 전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        String str1, str2;

        str1 = in.nextLine();  // Terrific-JAVA\2018-School-Vacation-Homework\C8040210\test1.txt
        str2 = in.nextLine(); // Terrific-JAVA\2018-School-Vacation-Homework\C8040210\test2.txt

        int c;

        try{
            BufferedReader br = new BufferedReader(new FileReader(str1));
            BufferedWriter bw = new BufferedWriter(new FileWriter("newfile.txt"));
            while((c = br.read()) != -1){
                bw.write((char)c);
            }

            br = new BufferedReader(new FileReader(str2));
            while((c = br.read()) != -1){
                bw.write((char)c);
            }

            br.close();
            bw.close();

            System.out.println("결과가 newfile.txt 파일에 저장되었습니다.");
        }catch (FileNotFoundException e){
            System.out.println("파일을 찾을 수 없음.");
        }
        catch (IOException e){
            System.out.println("입출력 오류 ");
        }
    }
}
