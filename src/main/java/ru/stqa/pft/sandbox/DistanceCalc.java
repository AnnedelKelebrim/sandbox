package ru.stqa.pft.sandbox;

public class DistanceCalc {
    public static void main(String[] args) {
        Point a = new Point(2, 7);
        Point b = new Point(5.8, 12.1);
        double d = Point.distance(a, b);
        System.out.println("Расстояние от точки а (x = " + a.x + ", y = " + a.y + ") до точки b (x = " + b.x + ", y = " + b.y + ") = " + d);
    }


}

