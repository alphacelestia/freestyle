package amath.leetcode.easy;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        System.out.println(p1);
        Point p2 = new Point();
        System.out.println(p2);

        p1.setX(3.0);
        p1.setY(4.0);
        System.out.println(p1);
        System.out.println("X is: "+p1.getX());
        System.out.println("Y is: "+p1.getY());

        p1.setXY(5.0,6.0);
        System.out.println(p1);
        System.out.println("X is: "+p1.getXY()[0]);
        System.out.println("Y is: "+p1.getXY()[1]);

        p2.setXY(10.0,11.0);
        System.out.println(p1.distance(10.0,11.0));
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance());
    }
}
