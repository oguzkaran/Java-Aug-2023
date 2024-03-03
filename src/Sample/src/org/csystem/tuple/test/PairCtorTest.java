package org.csystem.tuple.test;

import org.csystem.tuple.Pair;
import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;

import java.util.ArrayList;
import java.util.Random;

public class PairCtorTest {
    public static void run()
    {
        ArrayList<Pair<Integer, String>> pairs = new ArrayList<>();
        Random random = new Random();

        while (true) {
            int val = random.nextInt(-100, 100);

            if (val == 0)
                break;

            pairs.add(new Pair<>(val, StringUtil.generateRandomTextTR(random, random.nextInt(5, 11))));
        }

        for (Pair<Integer, String> p : pairs)
            Console.writeLine(p);
    }

    public static void main(String[] args)
    {
        run();
    }
}
