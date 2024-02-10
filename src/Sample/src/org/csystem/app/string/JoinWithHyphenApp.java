package org.csystem.app.string;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;

import java.util.ArrayList;

public class JoinWithHyphenApp {
    public static void run()
    {
        ArrayList texts = new ArrayList();
        String text;

        while (!(text = Console.readString("Input text:")).equals("quit"))
            texts.add(text);

        Console.writeLine(texts.toString());
        String str = ArrayUtil.join(texts, '-');
        Console.writeLine(str);
    }

    public static void main(String[] args)
    {
        run();
    }
}
