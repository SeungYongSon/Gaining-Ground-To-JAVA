package C4010210;

/*

    235p. 챕터 4 실습문제 1번

    노래를 나타내는 Song이라는 클래스를 설계하라.
    Song 클래스는 다음과 같은 필드를 갖는다.

    노래의 제목을 나타내는 title
    가수를 나타내는 artist
    노래가 속한 앨범 제목을 나타내는 album
    노래의 작곡가를 나타내는 composer, 작곡가는 여러 명 있을 수 있다.
    노래가 발표된 연도를 나타내는 year
    노래가 속한 앨범에서의 트랙 번호를 나타내는 track

    생성자는 기본 생성자와 모든 필드를 초기화하는 생성자를 작성하고,
    노래의 정보를 화면에 출력하는 show()를 메소드를 작성하라.

    ABBA 의 "Dancing Queen" 노래를 Song 객체로 생성하고
    show()를 이용하여 이 노래의 정보를 출력하는 프로그램을 작성하라.

 */

public class C4010210 {

    public static void main(String[] args){

        Song dq = new Song("Dancing Queen", "ABBA", "Arrival", 7, new String[]{"Benny Andersson", "Björn Ulvaeus", "Stig Anderson"}, "1976/08/16");

        dq.show();

        dq.Allshow();
    }
}
