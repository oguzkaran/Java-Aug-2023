package org.csystem.app.io.file.copy;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.*;

import static org.csystem.util.console.CommandLineUtil.checkLengthGreaterOrEqual;
import static org.csystem.util.console.Console.*;

public class CopyExistFilesViaOptionApp {
    private static void displayMenu()
    {
        writeLine("Choose an option:");
        writeLine("1.Overwrite");
        writeLine("2.Append");
        writeLine("Skip for other options");
    }

    private static void overwriteFile(Path path, Path destFilePath) throws IOException
    {
        Files.copy(path, destFilePath, StandardCopyOption.REPLACE_EXISTING);
        writeLine("'%s' copied successfully", destFilePath.getFileName());
    }

    private static void appendFile(Path path, Path destFilePath) throws IOException
    {
        try (OutputStream outputStream = Files.newOutputStream(destFilePath, StandardOpenOption.APPEND)) {
            Files.copy(path, outputStream);
            writeLine("'%s' append successfully", destFilePath.getFileName());
        }
    }

    private static void doOption(int option, Path path, Path destFilePath) throws IOException
    {
        switch (option) {
            case 1 -> overwriteFile(path, destFilePath);
            case 2 -> appendFile(path, destFilePath);
            default -> writeLine("'%s' Skipped!...", path);
        }
    }

    private static void doIfExists(Path path, Path destFilePath) throws IOException
    {
        writeLine("'%s' found:", destFilePath.getFileName());
        displayMenu();
        doOption(readInt("Option:", "Invalid value!..."), path, destFilePath);
    }

    private static void copyFiles(Path dest, String [] args) throws IOException
    {
        for (int i = 1; i < args.length; i++) {
            Path path = Path.of(args[i]);

            if (Files.notExists(path)) {
                writeErrLine("'%s' not found", args[i]);
                continue;
            }

            Path destFilePath = dest.resolve(path.getFileName());

            if (Files.notExists((destFilePath))) {
                Files.copy(path, destFilePath);
                writeLine("'%s' copied successfully", destFilePath.getFileName());
            }
            else
                doIfExists(path, destFilePath);
        }
    }

    private static void checkAndCopy(String [] args) throws IOException
    {
        try {
            copyFiles(Files.createDirectories(Path.of(args[0])), args);
        }
        catch (FileAlreadyExistsException ex) {
            writeErrLine("'%s' is not a directory", ex.getFile());
        }
    }

    public static void run(String[] args)
    {
        checkLengthGreaterOrEqual(2, args.length, "usage: java org.csystem.app.io.file.copy.CopyExistFilesViaOptionApp <dest directory> <file path1> <file path2> ... <file pathN>");

        try {
            checkAndCopy(args);
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
