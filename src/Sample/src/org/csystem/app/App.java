/*----------------------------------------------------------------------------------------------------------------------
   Polymorphism:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.ArrayList;

class App {
    public static void main(String[] args)
    {
        ArrayList numbers = new ArrayList();
        int val;

        while ((val = Console.readInt("Bir sayı giriniz:")) != 0)
            numbers.add(val);

        Console.writeLine("Size:%d",  numbers.size());

        numbers.clear();
        Console.writeLine("Size:%d",  numbers.size());
    }
}

