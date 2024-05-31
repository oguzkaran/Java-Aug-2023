/*--------------------------------------------------------
	FILE NAME	: Console.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 31st May 2024

	Utility class for console operations

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.console;

import java.util.Scanner;

public final class Console {
    private static final Scanner KB = new Scanner(System.in);

    private Console()
    {
    }

    public static int readInt()
    {
        return readInt("");
    }

    public static int readInt(String prompt)
    {
        return readInt(prompt, "");
    }

    public static int readInt(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                write(prompt);
                return Integer.parseInt(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                write(errorPrompt);
            }
        }
    }

    public static long readLong()
    {
        return readLong("");
    }

    public static long readLong(String prompt)
    {
        return readLong(prompt, "");
    }

    public static long readLong(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                write(prompt);
                return Long.parseLong(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                write(errorPrompt);
            }
        }
    }

    public static double readDouble()
    {
        return readDouble("");
    }

    public static double readDouble(String prompt)
    {
        return readDouble(prompt, "");
    }

    public static double readDouble(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                write(prompt);
                return Double.parseDouble(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                write(errorPrompt);
            }
        }
    }

    public static short readShort()
    {
        return readShort("");
    }

    public static short readShort(String prompt)
    {
        return readShort(prompt, "");
    }

    public static short readShort(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                write(prompt);
                return Short.parseShort(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                write(errorPrompt);
            }
        }
    }

    public static byte readByte()
    {
        return readByte("");
    }

    public static byte readByte(String prompt)
    {
        return readByte(prompt, "");
    }

    public static byte readByte(String prompt, String errorPrompt)
    {
        while (true) {
            try {
                write(prompt);
                return Byte.parseByte(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                write(errorPrompt);
            }
        }
    }

    public static boolean readBoolean()
    {
        return readBoolean("");
    }

    public static boolean readBoolean(String prompt)
    {
        return readBoolean(prompt, "");
    }

    public static boolean readBoolean(String prompt, String errorPrompt)
    {
        while (true) {
            write(prompt);
            String str = KB.nextLine();

            if (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("true"))
                return Boolean.parseBoolean(str);

            write(errorPrompt);
        }
    }

    public static char readChar(String message)
    {
        return readChar(message, "");
    }

    public static char readChar(String message, String errorMessage)
    {
        String str;

        while (!(str = readString(message)).isEmpty() && str.length() != 1)
            write(errorMessage);

        return str.isEmpty() ? '\n' : str.charAt(0);
    }


    public static String readString(String prompt)
    {
        write(prompt);
        return KB.nextLine();
    }

    public static void write(String fmt, Object...params)
    {
        System.out.printf(fmt, params);
    }

    public static void write(Object o)
    {
        write("%s", o);
    }

    public static void writeLine()
    {
        System.out.println();
    }

    public static void writeLine(String fmt, Object...params)
    {
        write(fmt + "\n", params);
    }

    public static void writeLine(Object o)
    {
        writeLine("%s", o);
    }

    public static void writeErr(String fmt, Object...params)
    {
        System.err.printf(fmt, params);
    }

    public static void writeErr(Object o)
    {
        writeErr("%s", o);
    }

    public static void writeErrLine()
    {
        System.err.println();
    }

    public static void writeErrLine(String fmt, Object...params)
    {
        writeErr(fmt + "\n", params);
    }

    public static void writeErrLine(Object o)
    {
        writeErrLine("%s", o);
    }
}
