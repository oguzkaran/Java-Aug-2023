/*--------------------------------------------------------
	FILE NAME	: StringUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 2nd December 2023
	
	Utility class for string operations
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.string;

public class StringUtil {
	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
}
