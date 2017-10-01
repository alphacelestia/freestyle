package amath.leetcode.easy;

public class Line {
    private Point begin, end;

    public Line(double x1, double y1, double x2, double y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Point getBegin() {
        return begin;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public double getBeginX() {
        return begin.getX();
    }
    public void setBeginX(double x) {
        begin.setX(x);
    }
    public double getBeginY() {
        return begin.getY();
    }
    public void setBeginY(double y) {
        begin.setY(y);
    }
    public double[] getBeginXY() {
        return begin.getXY();
    }
    public void setBeginXY(double x, double y) {
        begin.setXY(x,y);
    }
    public double getEndX() {
        return end.getX();
    }
    public void setEndX(double x) {
        end.setX(x);
    }
    public double getEndY() {
        return end.getY();
    }
    public void setEndY(double y) {
        end.setY(y);
    }
    public double[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(double x, double y) {
        end.setXY(x,y);
    }
    public String toString() {
        return "Line[being="+begin+", end="+end+"]";
    }
    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        return (end.getY()-begin.getY())/(end.getX()-begin.getX());
        //return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
    }

    public double distance(Point p) {
        double x1,y1,x2,y2,x0,y0,d;
        x1 = begin.getX();
        y1 = begin.getY();
        x2 = end.getX();
        y2 = end.getY();
        x0 = p.getX();
        y0 = p.getY();
        d = (y2-y1)*x0-(x2-x1)*y0+x2*y1-y2*x1;
        d = Math.abs(d);
        d = d/this.getLength();
        return d;
    }

    public double distance(double x, double y) {
        double x1,y1,x2,y2,d;
        x1 = begin.getX();
        y1 = begin.getY();
        x2 = end.getX();
        y2 = end.getY();
        d = (y2-y1)*x-(x2-x1)*y+x2*y1-y2*x1;
        d = Math.abs(d);
        d = d/this.getLength();
        return d;
    }

    public boolean intersects(Line another) {
        double u1,u2,v1,v2;
        u1 = this.end.getX()-this.begin.getX();
        u2 = this.end.getY()-this.begin.getY();
        v1 = another.end.getX()-another.begin.getX();
        v2 = another.end.getY()-another.begin.getX();
        return v2/u2==v1/u1;
    }
}
