package org.csystem.app;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;

public class Application {

    public static void run(String[] args)
    {
        checkLengthEquals(2, args.length, "wrong number of arguments");


    }
}