package org.csystem.tuple.test;

import org.csystem.tuple.Triple;
import org.csystem.util.console.Console;

import java.util.ArrayList;
import java.util.Random;

public class TripleOfTest {
    public static void run()
    {
        ArrayList<Triple<Integer, Integer, Integer>> points = new ArrayList<>();
        Random random = new Random();
        
        while (true) {
            int val = random.nextInt(-100, 100);

            if (val == 0)
                break;

            points.add(Triple.of(random.nextInt(-100, 100), random.nextInt(-100, 100), random.nextInt(-100, 100)));
        }

        for (Triple<Integer, Integer, Integer> point : points)
            Console.writeLine(point);
    }

    public static void main(String[] args)
    {
        run();
    }
}
