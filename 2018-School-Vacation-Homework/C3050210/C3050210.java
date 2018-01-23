import java.util.Scanner;

/*

    164p. 챕터 3 실습문제 6번

    키보드로부터 정수를 10개 입력받아 배열에 저장하고 증가하는 순서로
    정렬하고 이들을 출력하는 프로그램을 작성하라.

 */

public class C3050210 {

    public static void main(String[] args){

        int[] intArr = new int[10];

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < intArr.length; i++){
            intArr[i] = in.nextInt();
        }

        for(int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                if(j+1 == intArr.length) continue;
                if (intArr[j] > intArr[j + 1]) {
                    int tmp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tmp;
                }
            }
        }

        System.out.print("정렬 결과 : ");

        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
    }
}

/*
4
5
3
2
1
6
7
8
10
9
 */