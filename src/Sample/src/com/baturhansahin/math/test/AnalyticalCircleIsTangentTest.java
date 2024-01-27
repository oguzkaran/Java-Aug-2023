package com.baturhansahin.math.test;

import com.baturhansahin.math.AnalyticalCircle;

public class AnalyticalCircleIsTangentTest {
    public static void run()
    {
        AnalyticalCircle ac1 = new AnalyticalCircle(3, 200, 100);
        AnalyticalCircle ac2 = new AnalyticalCircle(2, 196, 103);

        System.out.println(ac1.centerDistance(ac2));
        System.out.println(ac1.isTangent(ac2) ? "Teğet" : "Teğet değil");
    }

    public static void main(String[] args)
    {
        run();
    }
}
