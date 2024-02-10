/*--------------------------------------------------------
	FILE NAME	: ThreadUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 10th February 2024

	Utility class for thread operations

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.thread;

public final class ThreadUtil {
    private ThreadUtil()
    {}

    public static void sleep(long milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException ignore) {

        }
    }
}
