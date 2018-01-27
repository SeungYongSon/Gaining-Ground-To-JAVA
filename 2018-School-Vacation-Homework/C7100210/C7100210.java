package C7100210;

/*

    414p. 챕터 7 실습문제 10번

    지명과 위치 정보를 저장하고 관리하고자 한다. 지명은 String 타입으로,
    위치 정보를 위도와 경도를 가진 Location 이라는 클래스로 선언하고,
    지명을 '키' 로 하여 HashMap<String, Location>에 키보드로 입력받아 5개의 요소를 저장하고,
    지명으로 검색하는 프로그램을 작성하라.

 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class C7100210 {

    public static void main(String[] args){

        HashMap<String, Location> hm = new HashMap<String, Location>();

        Scanner in = new Scanner(System.in);

        String locationName;
        double latitude;
        double longitude;

        for (int i = 0; i< 5; i++){
            System.out.println(i+1 + "번째");

            System.out.print("지명 : ");
            while (true){
                locationName = in.next();
                if(locationName.equals("-1")) System.out.println("다시 입력하세요!!!");
                else break;
            }
            System.out.print("위도 : ");
            latitude = in.nextDouble();
            System.out.print("경도 : ");
            longitude = in.nextDouble();

            hm.put(locationName ,new Location(locationName, latitude, longitude));
        }

        String search;
        Set<String> keys;
        Iterator<String> it;
        boolean found = false;

        while(true){
            System.out.println("검색을 끝내고 싶으면 -1 을 입력하세요.");

            search = in.next();

            if(search.equals("-1")) break;

            keys = hm.keySet();
            it = keys.iterator();

            while(it.hasNext()){
                String key = it.next();
                if(search.equals(key)){
                    System.out.println("지명: "+ key);
                    System.out.println("위도: "+ hm.get(key).getLatitude());
                    System.out.println("경도: "+ hm.get(key).getLongitude());
                    found = true;
                }
            }
            if(!found) System.out.println("찾지 못했습니다...");
            else found = false;
        }
    }
}
