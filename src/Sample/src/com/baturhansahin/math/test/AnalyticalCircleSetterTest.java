package com.baturhansahin.math.test;

import com.baturhansahin.math.AnalyticalCircle;

import java.util.Random;
import java.util.Scanner;

public class AnalyticalCircleSetterTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        AnalyticalCircle c = new AnalyticalCircle();

        System.out.printf("(%f, %f),%s%n", c.getX(), c.getY(), c.toString());
        for (int i = 0; i < count; ++i) {
            double radius = random.nextDouble(-10, 11);
            double x = random.nextDouble(-1000, 1000);
            double y = random.nextDouble(-1000, 1000);

            System.out.println("--------------------------------------------------");
            System.out.printf("Generated radius:%f, (%f, %f)%n", radius, x, y);
            c.setRadius(radius);
            c.setCenter(x, y);
            System.out.printf("(%f, %f),%s%n", c.getX(), c.getY(), c.toString());
            System.out.println("--------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
