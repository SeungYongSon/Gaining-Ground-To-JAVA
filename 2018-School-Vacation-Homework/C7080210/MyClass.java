package C7080210;

public class MyClass<E> {
    private E s;
    public MyClass(E s){
        this.s = s;
    }

    void setS(E s){
        this.s = s;
    }
    E getS(){
        return s;
    }
}
