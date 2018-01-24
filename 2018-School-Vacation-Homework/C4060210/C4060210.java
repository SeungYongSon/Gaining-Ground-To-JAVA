package C4060210;

/*

    237p. 챕터 4 실습문제 6번

    간단한 공연 예약 시스템을 만들어보자. 공연 예약 시스템의 내용은 다음과 같다.

    공연은 하루에 한번 있다.
    좌석은 S석, A석, B석 타입이 있으며 모두 10석의 좌석이 있다.
    공연 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다.
    예약은 한 자리만 예약할 수 있고 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.
    취소는 예약자의 이름을 입력하여 취소한다.
    없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메세지를 출력하고 사용자가 다시 시도하도록 한다.

 */

import java.util.Scanner;

public class C4060210 {

    public static int nextCustom(int i){
        Scanner in = new Scanner(System.in);
        int tmp;
        while(true){
            tmp = Integer.parseInt(in.next());
            if(tmp >= 0 && tmp <= i){
                return tmp;
            }else{
                System.out.println("잘못된 값입니다! 다시 입력해주세요!!!");
            }
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        ScheduleOfPerformances[][] sh = new ScheduleOfPerformances[3][10];

        for(int i = 0; i< 3; i++){
            for(int j = 0; j< 10; j++){
                sh[i][j] = new ScheduleOfPerformances();
            }
        }

        while(true){
            System.out.println("예약 <1>  , 조회 <2> , 취소 <3> , 끝내기 <4>  ");

            switch (nextCustom(4)){
                case 1:
                    int seatN;
                    char seat = 0;
                    String name;
                    int seatNum;
                    System.out.println("(* 선택을 잘못 하셨다면 입력 부분에서 숫자 0을 입력시 처음으로 돌아갑니다. *)");
                    System.out.println();
                    System.out.println("좌석 등급을 선택해 주세요.");
                    System.out.print("1. [S]    2. [A]    3. [B]  : ");
                    seatN = nextCustom(3);
                    if(seatN == 0) break;
                    switch (seatN) {
                        case 1:
                            seat = 'S';
                            break;
                        case 2:
                            seat = 'A';
                            break;
                        case 3:
                            seat = 'B';
                            break;
                        default: seat = 0;
                    }

                    System.out.print("이름 ? : ");
                    name = in.next();
                    if(name.equals("0")) break;

                    System.out.println("선택하신 등급의 현 좌석 상황 입니다. ___ 는 빈 자리 입니다.");
                    System.out.println("왼쪽 부터 1 ~ 10 순으로 번호가 있으며 빈자리를 선택해 주세요.");

                    System.out.print(Character.toString(seat) + " -> ");
                    for(int i = 0; i < sh[seatN-1].length; i++) System.out.print(sh[seatN-1][i].getName() +" ");

                    seatNum = nextCustom(10);
                    if(seatN == 0) break;
                    sh[seatN-1][seatNum-1].valueSet(name, seatNum, seat);
                    break;
                case 2:
                    System.out.println("=========================================================");
                    System.out.print("S ->  ");
                    for(int i = 0; i < sh[0].length; i++) System.out.print(sh[0][i].getName() +" ");
                    System.out.println();

                    System.out.print("A ->  ");
                    for(int i = 0; i < sh[1].length; i++) System.out.print(sh[1][i].getName() +" ");
                    System.out.println();

                    System.out.print("B ->  ");
                    for(int i = 0; i < sh[2].length; i++) System.out.print(sh[2][i].getName() +" ");
                    System.out.println();
                    System.out.println("=========================================================");
                    break;
                case 3:
                    System.out.print("예약을 취소할려면 이름을 입력하세요 : ");
                    name = in.next();
                    boolean found = false;
                    for(int i = 0; i< 3; i++){
                        for(int j = 0; j< 10; j++){
                            if(sh[i][j].getName().equals(name)){
                                sh[i][j] = new ScheduleOfPerformances();
                                found = true;
                                System.out.println("정상적으로 취소 되었습니다.");
                            }
                        }
                    }
                    if(!found) System.out.println("예약하신 분이 아닙니다!!");
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
