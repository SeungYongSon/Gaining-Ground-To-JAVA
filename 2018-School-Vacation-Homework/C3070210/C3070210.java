/*

    165p. 챕터 3 실습문제 7번

    4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게
    생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라,

 */

public class C3070210 {

    public static void main(String[] args){

        int[][] intArr = new int[4][4];

        for(int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length; j++){
                int tmp = (int) Math.round(Math.random() * 9 + 1);
                intArr[i][j] = tmp;
            }
        }

        for(int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length; j++) {
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
