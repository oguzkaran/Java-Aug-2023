package org.csystem.app.io.file.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.writeErrLine;
import static org.csystem.util.console.Console.writeLine;

public class CopyFileApp {
    public static void run(String[] args)
    {
        checkLengthEquals(2, args.length, "usage: java org.csystem.app.io.file.copy.CopyFileApp <src> <dest>");

        try (FileInputStream fis = new FileInputStream(args[0])) {
            //...
            Files.copy(fis, Path.of(args[1]), StandardCopyOption.REPLACE_EXISTING);
            writeLine("File copied successfully");
        }
        catch (FileNotFoundException ignore) {
            writeErrLine("'%s' not found", args[0]);
        }
        catch (IOException ex) {
            writeErrLine("IO Problem occurred:%s", ex.getMessage());
        }
        catch (Throwable ex) {
            writeErrLine("Problem occurred:%s", ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
