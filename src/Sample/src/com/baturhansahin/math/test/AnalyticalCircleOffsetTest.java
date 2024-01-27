package com.baturhansahin.math.test;

import com.baturhansahin.math.AnalyticalCircle;

import java.util.Random;
import java.util.Scanner;

public class AnalyticalCircleOffsetTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            double radius = random.nextDouble(-10, 11);
            double x = random.nextDouble(-1000, 1000);
            double y = random.nextDouble(-1000, 1000);
            double dx = random.nextDouble(-100, 100);
            double dy = random.nextDouble(-100, 100);

            System.out.println("--------------------------------------------------");
            System.out.printf("Generated radius:%f, (%f, %f), dx = %f, dy = %f%n", radius, x, y, dx, dy);
            AnalyticalCircle c = new AnalyticalCircle(radius, x, y);

            System.out.printf("(%f, %f),%s%n", c.getX(), c.getY(), c.toString());
            c.offset(dx, dy);
            System.out.printf("(%f, %f),%s%n", c.getX(), c.getY(), c.toString());
            System.out.println("--------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
