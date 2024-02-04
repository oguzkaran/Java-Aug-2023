/*----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfının set metodu ilgili indeksteki elemanı değiştirmek kullanılır. Bu metot O(1) karamaşıklıktadır.
    Indek olarak [0, size) aralığı dışında bir değer verildiğinde exception oluşur. Metot değiştirme yapmadan önce tutulan
    elemana ilişkin referansa gerid döner
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;

import java.util.ArrayList;
import java.util.Random;

class App {
    public static void main(String[] args)
    {
        ArrayList texts = new ArrayList();
        Random random = new Random();

        while (true) {
            int n = Console.readInt("Bir sayı giriniz:");

            if (n <= 0)
                break;

            String text = StringUtil.generateRandomTextTR(random, n);

            Console.writeLine(text);

            texts.add(text);
        }

        StringBuilder sb = new StringBuilder();

        for (Object o : texts) {
            String s = (String)o;

            sb.append(s).append(" ");
        }

        Console.writeLine(sb.toString());

        String oldText = (String)texts.set(2, "ankara");


        Console.writeLine("Old text:%s", oldText);

        sb = new StringBuilder();

        for (Object o : texts) {
            String s = (String)o;

            sb.append(s).append(" ");
        }

        Console.writeLine(sb.toString());
    }
}

