package net.proselyte;

public class TwoPoints {

    //attributes
    private int x;
    private int y;

    //constructor
    public TwoPoints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getter and setter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //override method
    @Override
    public String toString() {
        return "TwoPoints{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
