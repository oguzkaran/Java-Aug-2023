package org.csystem.app;

import java.io.File;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.writeErrLine;
import static org.csystem.util.console.Console.writeLine;

public class Application {

    public static void run(String[] args)
    {
        checkLengthEquals(1, args.length, "wrong number of arguments");

        try {
            File f = new File(args[0]);

            writeLine(f.mkdirs() ? "%s created" : "%s exists", f.getName());
        }
        catch (Throwable ex) {
            writeErrLine("Problem occurred:%s", ex.getMessage());
        }
    }
}
