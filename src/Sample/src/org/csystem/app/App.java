/*----------------------------------------------------------------------------------------------------------------------
    Generic arayüzler:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.ArrayList;
import java.util.Random;

class App {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        while (true) {
            int n = Console.readInt("Bir sayı giriniz:");

            if (n <= 0)
                break;

            numbers.add(random.nextInt(n));
        }

        StringBuilder sb = new StringBuilder();

        for (int val : numbers)
            sb.append(val).append(" ");

        Console.writeLine(sb);
    }
}