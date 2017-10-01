package amath.leetcode.easy;

public class Point {
    private double x, y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double[] getXY() {
        double[] cord;
        cord = new double[2];
        cord[0]=x;
        cord[1]=y;
        return cord;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(double x, double y) {
        double distance,dx,dy;
        dx = this.x-x;
        dy = this.y-y;
        distance = Math.sqrt(dx*dx+dy*dy);
        return distance;
    }
    public double distance(Point another) {
        double distance,dx,dy;
        dx = this.x - another.x;
        dy = this.y - another.y;
        distance = Math.sqrt(dx*dx+dy*dy);
        return distance;
    }
    public double distance() {
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
}
