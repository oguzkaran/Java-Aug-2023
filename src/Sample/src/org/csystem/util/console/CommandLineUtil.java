/*--------------------------------------------------------
	FILE NAME	: CommandLineUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 25th May 2024

	Utility class for command line operations

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.console;

public final class CommandLineUtil {
    private CommandLineUtil()
    {
    }

    public static void checkLengthEquals(int len, int argsLen, String message)
    {
        checkLengthEquals(len, argsLen, message, 1);
    }

    public static void checkLengthEquals(int len, int argsLen, String message, int exitCode)
    {
        if (argsLen != len) {
            Console.writeErrLine(message);
            System.exit(exitCode);
        }
    }

    public static void checkLengthGreater(int len, int argsLen, String message)
    {
        checkLengthGreater(len, argsLen, message, 1);
    }

    public static void checkLengthGreater(int len, int argsLen, String message, int exitCode)
    {
        if (argsLen <= len) {
            Console.writeErrLine(message);
            System.exit(exitCode);
        }
    }

    public static void checkLengthGreaterOrEqual(int len, int argsLen, String message)
    {
        checkLengthGreaterOrEqual(len, argsLen, message, 1);
    }

    public static void checkLengthGreaterOrEqual(int len, int argsLen, String message, int exitCode)
    {
        if (argsLen < len) {
            Console.writeErrLine(message);
            System.exit(exitCode);
        }
    }

    public static void checkLengthLEss(int len, int argsLen, String message)
    {
        checkLengthLess(len, argsLen, message, 1);
    }

    public static void checkLengthLess(int len, int argsLen, String message, int exitCode)
    {
        if (argsLen >= len) {
            Console.writeErrLine(message);
            System.exit(exitCode);
        }
    }

    public static void checkLengthLessOrEqual(int len, int argsLen, String message)
    {
        checkLengthLessOrEqual(len, argsLen, message, 1);
    }

    public static void checkLengthLessOrEqual(int len, int argsLen, String message, int exitCode)
    {
        if (argsLen > len) {
            Console.writeErrLine(message);
            System.exit(exitCode);
        }
    }


}
