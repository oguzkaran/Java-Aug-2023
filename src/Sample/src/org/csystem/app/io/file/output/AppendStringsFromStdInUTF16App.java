package org.csystem.app.io.file.output;

import org.csystem.util.converter.BitConverter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.readString;
import static org.csystem.util.console.Console.writeErrLine;

public class AppendStringsFromStdInUTF16App {
    private static void writeFile(String path)
    {
        try (FileOutputStream fos = new FileOutputStream(path, true)) {
            while (true) {
                String str = readString("Input string:");

                if ("exit".equals(str))
                    break;

                byte [] bufStr = BitConverter.getBytes(str, StandardCharsets.UTF_16);
                byte [] bufLen = BitConverter.getBytes(bufStr.length);

                fos.write(bufLen);
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
            writeFile(args[0]);
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