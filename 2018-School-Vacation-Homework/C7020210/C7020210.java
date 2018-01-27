package C7020210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class C7020210 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        ArrayList<Character> al = new ArrayList<Character>();

        for(int i = 0; i< 5; i++){
            char tmp = in.next().charAt(0);
            if((tmp  >= 'A' && tmp <= 'D') || tmp == 'F')
                al.add(in.next().charAt(0));
        }

        double score=0.0;

        for(int i=0; i<al.size(); i++) {
            char ch = al.get(i);
            switch(ch) {
                case 'A' : score = 4.0; break;
                case 'B' : score = 3.0; break;
                case 'C' : score = 2.0; break;
                case 'D' : score = 1.0; break;
                case 'F' : score = 0.0; break;
            }
            System.out.print(score + " ");
        }
    }
}
