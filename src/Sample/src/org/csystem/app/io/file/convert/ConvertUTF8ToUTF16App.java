package org.csystem.app.io.file.convert;

import org.csystem.util.converter.BitConverter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.readChar;
import static org.csystem.util.console.Console.writeErrLine;

public class ConvertUTF8ToUTF16App {
    private static void write(FileOutputStream fos, String str) throws IOException
    {
        byte [] bufStr = BitConverter.getBytes(str, StandardCharsets.UTF_16);
        byte [] bufLen = BitConverter.getBytes(bufStr.length);

        fos.write(bufLen);
        fos.write(bufStr);
    }

    private static void convert(String source, String dest)
    {
        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(dest)) {
            int n;
            byte [] bufLen = new byte[Integer.BYTES];

            while (true) {
                if ((n = fis.read(bufLen)) < 0)
                    break;

                if (n != Integer.BYTES)
                    throw new IOException("Invalid file format!...");

                byte [] bufStr = new byte[BitConverter.toInt(bufLen)];

                n = fis.read(bufStr);

                if (n != bufStr.length)
                    throw new IOException("Invalid file format!...");

                String str = BitConverter.getString(bufStr);

                write(fos, str);
            }
        }
        catch (FileNotFoundException ignore) {
            writeErrLine("%s is directory", source);
        }
        catch (IOException ex) {
            writeErrLine("IO error occurred:%s",ex.getMessage());
        }
    }

    public static void run(String[] args)
    {
        checkLengthEquals(2, args.length, "wrong number of arguments");

        try {
            Path sourcePath = Path.of(args[0]);
            Path destPath = Path.of(args[1]);

            if (Files.notExists(sourcePath)) {
                writeErrLine("'%s' does not exist", sourcePath);
                return;
            }

            if (Files.exists(destPath)) {
                char option = readChar(String.format("'%s' exists. Do you want to overwrite?[Y/N]", destPath.getFileName()));

                if (option != 'Y' && option != 'y')
                    return;
            }
            convert(args[0], destPath.toString());
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