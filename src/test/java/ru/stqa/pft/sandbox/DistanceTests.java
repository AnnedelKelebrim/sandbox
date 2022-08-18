package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {
    @Test
    public void testDistance() {
        Point a = new Point(3, 7);
        Point b = new Point(9, 5);
        Assert.assertEquals(a.distance(b), 6.324555320336759);
    }

    @Test
    public void testDistanceNegativeNumbers() {
        Point a = new Point(-3, 7);
        Point b = new Point(9, -5);
        Assert.assertEquals(a.distance(b), 16.97056274847714);
    }

    @Test
    public void testDistanceZero() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Assert.assertEquals(a.distance(b), 0);
    }
}
