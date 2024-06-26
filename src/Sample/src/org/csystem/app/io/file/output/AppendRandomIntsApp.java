package org.csystem.app.io.file.output;

import org.csystem.util.converter.BitConverter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.*;

public class AppendRandomIntsApp {
    private static void writeFile(String path, int count, int min, int bound)
    {
        try (FileOutputStream fos = new FileOutputStream(path, true)) {
            Random random = new Random();

            for (int i = 0; i < count; ++i) {
                int val = random.nextInt(min, bound);

                write("%d ", val);
                byte [] buf = BitConverter.getBytes(val);

                fos.write(buf);
            }

            writeLine();
        }
        catch (FileNotFoundException ignore) {
            writeErrLine("%s is directory", path);
        }
        catch (IOException ex) {
            writeErrLine("IO error occurred:%s",ex.getMessage());
        }
    }

    public static void run(String[] args)
    {
        checkLengthEquals(4, args.length, "wrong number of arguments");

        try {
            int count = Integer.parseInt(args[1]);
            int min = Integer.parseInt(args[2]);
            int bound = Integer.parseInt(args[3]);

            writeFile(args[0], count, min, bound);
        }
        catch (NumberFormatException ignore) {
            writeErrLine("Invalid count value!...");
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