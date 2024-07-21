package org.csystem.app.io.file.output;

import org.csystem.util.converter.BitConverter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.*;

public class AppendStringsFromStdInUTF8FixedLengthApp {
    private static int readFixedLen(String path)
    {
        try (FileInputStream fis = new FileInputStream(path)) {
            byte  [] buf = new byte[Integer.BYTES];

            if (fis.read(buf) != Integer.BYTES)
                throw new IOException("Invalid file format!...");

            return BitConverter.toInt(buf);
        }
        catch (FileNotFoundException ex) {
            writeErrLine("File not found:%s", path);
        }
        catch (IOException ex) {
            writeErrLine("IO problem occurred:%s", ex.getMessage());
        }

        return -1;
    }

    private static void writeLen(String path, int len)
    {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(BitConverter.getBytes(len));
        }
        catch (IOException ex) {
            writeErrLine("IO problem occurred:%s", ex.getMessage());
        }
    }

    private static void writeFile(String path, int fixedLen)
    {
        boolean exists = false;

        if (fixedLen == 0) {
            exists = true;
            fixedLen = readFixedLen(path);
        }

        if (fixedLen == -1)
            return;

        if (!exists)
            writeLen(path, fixedLen);

        try (FileOutputStream fos = new FileOutputStream(path, true)) {
            while (true) {
                String str = readString("Input string:");

                if ("exit".equals(str))
                    break;

                str += '\0';

                byte [] bufStr = BitConverter.getBytes(str);

                if (bufStr.length > fixedLen) {
                    writeLine("String is too long to store");
                    continue;
                }

                bufStr = Arrays.copyOf(bufStr, fixedLen);

                fos.write(bufStr);
            }
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
        checkLengthEquals(1, args.length, "wrong number of arguments");

        try {
            int fixedLen = 0;

            if (Files.notExists(Path.of(args[0]))) {
                fixedLen = readInt("Input fixed length value:");

                if (fixedLen <= 0)
                    throw new NumberFormatException();
            }

            writeFile(args[0], fixedLen);
        }
        catch (NumberFormatException ignore) {
            writeErrLine("Invalid length value!...");
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