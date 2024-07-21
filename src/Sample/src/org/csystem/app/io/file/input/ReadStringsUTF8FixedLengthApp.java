package org.csystem.app.io.file.input;

import org.csystem.util.converter.BitConverter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.writeErrLine;
import static org.csystem.util.console.Console.writeLine;

public class ReadStringsUTF8FixedLengthApp {
    private static int readFixedLength(FileInputStream fis) throws IOException
    {
        byte [] buf = new byte[Integer.BYTES];

        if (fis.read(buf) != Integer.BYTES)
            throw new IOException("Invalid file format!...");

        return BitConverter.toInt(buf);
    }

    private static void readFile(String path)
    {
        try (FileInputStream fis = new FileInputStream(path)) {
            int fixedLen = readFixedLength(fis);
            byte [] bufStr = new byte[fixedLen];

            while (true) {
                int n = fis.read(bufStr);

                if (n < 0)
                    break;

                if (n != fixedLen)
                    throw new IOException("Invalid file format!...");

                String str = BitConverter.getString(bufStr);

                int idx = str.indexOf('\0');

                str = str.substring(0, idx);

                writeLine("(%s) -> Length:%d", str, str.length());
            }
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
        checkLengthEquals(1, args.length, "wrong number of arguments");

        try  {
            readFile(args[0]);
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