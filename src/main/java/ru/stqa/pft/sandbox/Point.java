package ru.stqa.pft.sandbox;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p) {
        double diff1 = p.x - this.x;
        double diff2 = p.y - this.y;
        return Math.sqrt((diff1 * diff1) + (diff2 * diff2));
    }
}