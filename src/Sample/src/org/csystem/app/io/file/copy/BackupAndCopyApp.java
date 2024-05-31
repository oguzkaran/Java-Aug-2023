package org.csystem.app.io.file.copy;

import org.csystem.io.file.copy.BackupAndCopy;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.writeErrLine;

public class BackupAndCopyApp {
    private static void run(String [] args)
    {
        checkLengthEquals(2, args.length, "usage: java org.csystem.app.io.file.copy.BackupAndCopyApp <src> <dest>");

        try {
            BackupAndCopy backupAndCopy = new BackupAndCopy(args[0], args[1]);

            backupAndCopy.copy("-bak");
        }
        catch (InvalidPathException ex) {
            writeErrLine("Invalid path:", ex.getInput());
        }
        catch (NoSuchFileException ex) {
            writeErrLine("Source file not found!...");
        }
        catch (IOException ex) {
            writeErrLine("IO problem occurred:%s", ex.getMessage());
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
