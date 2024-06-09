package org.csystem.app.io.file.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.*;

public class WriteRandomBytesApp {
    private static void writeFile(String path, int count)
    {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            Random random = new Random();

            for (int i = 0; i < count; ++i) {
                byte val = (byte)random.nextInt(-128, 127);

                write("%d ", val);
                fos.write(val);
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
        checkLengthEquals(2, args.length, "wrong number of arguments");

        try {
            int count = Integer.parseInt(args[1]);

            writeFile(args[0], count);
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