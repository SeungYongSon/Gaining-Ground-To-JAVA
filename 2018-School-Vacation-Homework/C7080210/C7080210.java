package C7080210;

/*

    413p. 챕터 7 실습문제 8번

    다음은 String 만 다루는 MyClass 코드이다.


    public class MyClass {
        private String s;
        public MyClass(String s){
            this.s = s;
        }

        void setS(String s){
            this.s = s;
        }
        String getS(){
            return s;
        }
    }


    MyClass 를 제네릭 클래스 MyClass<E>로 일반화하고,
    이를 이용하는 main() 메소드를 만들어 프로그램을 완성하라.

 */

public class C7080210 {

    public static void main(String[] args){

        MyClass<String> mc = new MyClass<String>("JAVA");

        mc.setS("Hello, JAVA!!!");

        System.out.println(mc.getS());
    }
}
