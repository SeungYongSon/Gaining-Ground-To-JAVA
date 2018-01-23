package C4020210;

public class Rectangle {

    int x1, y1;
    int x2, y2;

    public Rectangle(){ }

    public Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int square(){
        int[] tmp = new int[4];

        if(this.x1 < 0) tmp[0] = this.x1 * -1;
        else tmp[0] = this.x1;

        if(this.y1 < 0) tmp[1] = this.y1 * -1;
        else tmp[1] = this.y1;

        if(this.x2 < 0) tmp[2] = this.x2 * -1;
        else tmp[2] = this.x2;

        if(this.y2 < 0) tmp[3] = this.y2 * -1;
        else tmp[3] = this.y2;

        return (tmp[0] + tmp[2]) * (tmp[1] + tmp[3]);
    }

    public void show(){
        System.out.println("x1 : " + this.x1 +  ". y1  : " + this.y1);
        System.out.println("x2 : " + this.x2 +  ". y2  : " + this.y2);
        System.out.println("넓이 : " + square());
    }

    public boolean equals(Rectangle r){
        Rectangle a = Rectangle.this;
        if(r.getClass().isInstance(a)) return true;
        else return false;
    }
}
