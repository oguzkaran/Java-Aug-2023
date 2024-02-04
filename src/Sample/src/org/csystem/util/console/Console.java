/*--------------------------------------------------------
	FILE NAME	: Console.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 4th February 2024

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

    public static int readInt(String prompt)
    {
        return Integer.parseInt(KB.nextLine());
    }

    public static long readLong(String prompt)
    {
        return Long.parseLong(KB.nextLine());
    }

    public static double readDouble(String prompt)
    {
        return Double.parseDouble(KB.nextLine());
    }

    public static String readString(String prompt)
    {
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

    public static void writeLine(String fmt, Object...params)
    {
        write(fmt + "\n", params);
    }

    public static void writeLine(Object o)
    {
        writeLine("%s", o);
    }
}
