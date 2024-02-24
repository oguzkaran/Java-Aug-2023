/*------------------------------------------------------------------
	FILE		: DateTimeException.java
	AUTHOR		: Java-Auf-2023 Group
	LAST UPDATE	: 24th February 2023

	DateTimeException class

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.datetime;

public class DateTimeException extends RuntimeException {
    public DateTimeException(String message)
    {
        super(message);
    }

    public String getMessage()
    {
        return String.format("Invalid date and/or time values:%s", super.getMessage());
    }
}
