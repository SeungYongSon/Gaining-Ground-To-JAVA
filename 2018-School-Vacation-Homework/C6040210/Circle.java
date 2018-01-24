package C6040210;

public class Circle {

    int x, y, radius;

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean equals(Circle c){
        if(c.radius == this.radius) return true;
        else return false;
    }
}
