package org.csystem.app;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.writeErrLine;
import static org.csystem.util.console.Console.writeLine;

public class Application {
    private static void delete(Path path)
    {
        try {
            Files.delete(path);
            writeLine("%s deleted", path.getFileName());
        }
        catch (DirectoryNotEmptyException ignore) {
            writeErrLine("Directory not empty:%s", path.getFileName());
        }
        catch (IOException ex) {
            writeErrLine("IO Problem occurred:%s", ex.getMessage());
        }
    }

    public static void run(String[] args)
    {
        checkLengthEquals(1, args.length, "wrong number of arguments");

        try {
            Path path = Path.of(args[0]);
            if (Files.exists(path))
                delete(path);
            else
                writeErrLine("No such file %s", path.getFileName());

        }
        catch (Throwable ex) {
            writeErrLine("Problem occurred:%s", ex.getMessage());
        }
    }
}