package org.csystem.app.io.file.input;

import java.io.*;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.*;

public class ReadDoublesDataInputStreamApp {
    private static void readFile(String path)
    {
        try (FileInputStream fis = new FileInputStream(path);
             DataInputStream dis = new DataInputStream(fis)) {
            while (true)
                write("%f ", dis.readDouble());
        }
        catch (EOFException ignore) {
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