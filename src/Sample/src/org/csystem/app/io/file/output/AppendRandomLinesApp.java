package org.csystem.app.io.file.output;

import org.csystem.util.string.StringUtil;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.writeErrLine;

public class AppendRandomLinesApp {
    private static void writeFile(String path, int count)
    {
        Random random = new Random();

        try (BufferedWriter bw = Files.newBufferedWriter(Path.of(path), StandardCharsets.UTF_8,
                StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            for (int i = 0; i < count; ++i)
                bw.write(StringUtil.generateRandomTextEN(random, random.nextInt(5, 16)) + "\r\n");
        }
        catch (IOException ex) {
            writeErrLine("IO error occurred:%s",ex.getMessage());
        }
    }

    public static void run(String[] args)
    {
        checkLengthEquals(2, args.length, "wrong number of arguments");

        try {
            int count = Integer.parseInt(args[1]);

            if (count <= 0)
                throw new NumberFormatException();

            writeFile(args[0], count);
        }
        catch (NumberFormatException ignore) {
            writeErrLine("Invalid count value");
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