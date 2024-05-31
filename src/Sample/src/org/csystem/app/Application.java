package org.csystem.app;

import java.nio.file.*;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.writeErrLine;
import static org.csystem.util.console.Console.writeLine;

public class Application {

    public static void run(String[] args)
    {
        checkLengthEquals(2, args.length, "wrong number of arguments");

        try {
            Path src = Path.of(args[0]);
            Path dest = Path.of(args[1]);

            Files.move(src, dest);
        }
        catch (NoSuchFileException ex) {
            writeLine("Source file not found!...");
        }
        catch (DirectoryNotEmptyException ex) {
            writeLine("Target directory is not empty!...");
        }
        catch (InvalidPathException ex) {
            writeErrLine("Invalid path: %s", ex.getMessage());
        }
        catch (Throwable ex) {
            writeErrLine("Problem occurred:%s", ex.getMessage());
        }
    }
}