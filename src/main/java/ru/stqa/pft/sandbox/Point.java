package ru.stqa.pft.sandbox;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point p1, Point p2) {
        double diff1 = p2.x - p1.x;
        double diff2 = p2.y - p1.y;
        return Math.sqrt((diff1 * diff1) + (diff2 * diff2));
    }
}