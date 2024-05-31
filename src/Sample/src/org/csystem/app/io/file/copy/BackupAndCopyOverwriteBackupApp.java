package org.csystem.app.io.file.copy;

import org.csystem.io.file.copy.BackupAndCopy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.readChar;
import static org.csystem.util.console.Console.writeErrLine;

public class BackupAndCopyOverwriteBackupApp {
    private static boolean overwrite(String path)
    {
        if (!Files.exists(Path.of(path + "-bak")))
            return true;
        char c;

        while ((c = readChar("Backup file exists. Do you want to overwrite?")) != 'N' && c != 'n' && c != 'Y' && c != 'y')
            ;

        return c == 'Y';
    }

    private static void run(String [] args)
    {
        checkLengthEquals(2, args.length, "usage: java org.csystem.app.io.file.copy.BackupAndCopyApp <src> <dest>");

        try {
            BackupAndCopy backupAndCopy = new BackupAndCopy(Path.of(args[0]), Path.of(args[1]));

            backupAndCopy.copy("-bak", overwrite(args[1]));
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
