package org.csystem.app.generator;

import org.csystem.math.Complex;
import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.Point;
import org.csystem.primitive.wrapper.IntValue;

import java.util.Scanner;

public class DemoObjectArrayGeneratorApp {
    private static void doForObjects(Object [] objects)
    {
        for (Object object : objects) {
            System.out.println("-----------------------------------------------------------------------------");
            String typeStr = object.getClass().getName();

            System.out.printf("Type:%s%n", typeStr);

            switch (object) {
                case IntValue iVal -> {
                    int val = iVal.getValue();

                    System.out.printf("%d * %d = %d%n", val, val, val * val);
                }
                case String str -> System.out.printf("%s, %s%n", str, str.toUpperCase());
                case Point p -> System.out.printf("{x: %f, y: %f}%n", p.getX(), p.getY());
                case Circle c -> System.out.printf("{Radius:%f, Area:%f, Circumference:%f}%n", c.getRadius(), c.getArea(), c.getCircumference());
                case Complex z -> System.out.printf("Conjugate:%s%n", z.conjugate().toString());
                default -> {}
            }

            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        ObjectArrayGenerator generator = new ObjectArrayGenerator();

        System.out.print("Input count:");
        int count = kb.nextInt();

        doForObjects(generator.createObjects(count));
    }

    public static void main(String[] args)
    {
        run();
    }
}
