package org.csystem.app;

import org.csystem.util.console.Console;

public class Application {
    public static void run(String[] args)
    {
        Console.writeLine(System.getProperty("file.separator") .charAt(0) == '/' ? "Unix-Linux" : "Windows");
        Console.writeLine(System.getProperty("os.arch"));
        Console.writeLine(System.getProperty("os.name"));
        Console.writeLine(System.getProperty("os.version"));
        Console.writeLine(System.getProperty("java.vendor"));
        Console.writeLine(System.getProperty("user.name"));
    }
}
