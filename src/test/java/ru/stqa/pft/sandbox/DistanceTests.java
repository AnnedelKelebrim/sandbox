package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {
    @Test
    public void testDistance() {
        Point a = new Point(3, 7);
        Point b = new Point(9, 5);
        Assert.assertEquals((int) a.distance(b), 6);
    }

    @Test
    public void testDistanceNegativeNumbers() {
        Point a = new Point(-3, 7);
        Point b = new Point(9, -5);
        Assert.assertEquals((int) a.distance(b), 16);
    }

    @Test
    public void testDistanceZero() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Assert.assertEquals((int) a.distance(b), 0);
    }
}
