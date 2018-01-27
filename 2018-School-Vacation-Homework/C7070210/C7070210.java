package C7070210;

/*

    412p. 챕터 7 실습문제 7번

    아래의 C7070210 클래스는 해시맵을 인자로 받아 벡터를 리턴하는 hashToVector() 매소드를 가지고 있다.
    이 메소드는 해시맵 내의 '값(value)'을 모두 Vector<String>에 삽입하여 리턴한다.
    hashToVector()을 작성하라.

 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class C7070210 {

    public static Vector<String> hashToVector(HashMap<String, String> h){

        Vector<String> htv = new Vector<String>();

        Set<String> keys = h.keySet();

        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            String key = it.next();
            htv.add(h.get(key));
        }

        return htv;
    }

    public static void main(String[] args){
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("범죄", "112");
        h.put("화재", "119");
        h.put("전화번호", "114");
        Vector<String> v = hashToVector(h);
        for(int n = 0; n < v.size(); n++){
            System.out.println(v.get(n));
        }
    }
}
