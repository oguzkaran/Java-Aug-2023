package org.csystem.app.io.file.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.*;

public class ReadByteArrayApp {
    private static void writeBytes(byte[] data, int count)
    {
        for (int i = 0; i < count; ++i)
            write("%d ", data[i]);
    }

    private static void readFile(String path, int blockSize)
    {
        try (FileInputStream fis = new FileInputStream(path)) {
            byte [] data = new byte[blockSize];
            int n;

            while ((n = fis.read(data)) > 0)
                writeBytes(data, n);

            writeLine();
        }
        catch (FileNotFoundException ignore) {
            writeErrLine("%s not found", path);
        }
        catch (IOException ex) {
            writeErrLine("IO error occurred:%s",ex.getMessage());
        }
    }

    public static void run(String[] args)
    {
        checkLengthEquals(2, args.length, "wrong number of arguments");

        try  {
            readFile(args[0], Integer.parseInt(args[1]));
        }
        catch (NumberFormatException ignore) {
            writeErrLine("Invalid block size value!...");
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