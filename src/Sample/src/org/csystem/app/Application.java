package org.csystem.app;

import org.csystem.util.console.Console;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;

public class Application {

    public static void run(String[] args)
    {
        //checkLengthEquals(2, args.length, "wrong number of arguments");

        String sep = System.lineSeparator();

        Console.writeLine("%s", sep.length() == 1 ? "LF" : "CRLF");
    }
}