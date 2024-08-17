package org.csystem.app.io.file.regioninfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.csystem.util.console.CommandLineUtil.checkLengthEquals;
import static org.csystem.util.console.Console.writeErrLine;
import static org.csystem.util.console.Console.writeLine;

public class RegionInfoApp {
    private static void readFile(String path)
    {
        try (BufferedReader br = Files.newBufferedReader(Path.of(path), StandardCharsets.UTF_8)) {
            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String [] regionInfo = line.split("[,]");

                if (regionInfo.length != 4)
                    throw new IOException("Invalid file format!...");

                int rowNumber = Integer.parseInt(regionInfo[0]);
                String alias = regionInfo[1].isBlank() ? "[Unknown]" : regionInfo[1];
                double latitude = Double.parseDouble(regionInfo[2]);
                double longitude = Double.parseDouble(regionInfo[3]);

                writeLine("%d-%s-%f-%f", rowNumber, alias, latitude, longitude);
            }
        }
        catch (NumberFormatException ignore) {
            writeErrLine("Invalid numeric value!...");
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
        catch (Throwable ex) {
            writeErrLine("Problem occurred:%s", ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        run(args);
    }
}