package ru.stqa.pft.sandbox;

public class DistanceCalc {
    public static void main(String[] args) {
        Point a = new Point(2, 7);
        Point b = new Point(5.8, 12.1);
        double d = distance(a, b);
        System.out.println("Рассточние от точки а (x = " + a.x + ", y = " + a.y + ") до точки b (x = " + b.x + ", y = " + b.y + ") = " + d);
    }

    public static double distance(Point p1, Point p2) {
        double diff1 = p2.x - p1.x;
        double diff2 = p2.y - p1.y;
        return Math.sqrt((diff1 * diff1) + (diff2 * diff2));
    }
}

