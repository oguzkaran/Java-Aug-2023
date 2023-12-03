/*--------------------------------------------------------
	FILE NAME	: StringUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 3rd December 2023
	
	Utility class for string operations
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.string;

import java.util.Random;

public class StringUtil {
	public static int countString(String s1, String s2)
	{
		int count = 0;
		int index = -1;

		while ((index = s1.indexOf(s2, index + 1)) != -1)
			++count;
		
		return count;
	}
	
	public static int countStringIgnoreCase(String s1, String s2)
	{
		return countString(s1.toLowerCase(), s2.toLowerCase());
	}
	
	public static String generateRandomTextEN(Random random, int count)
	{
		//TODO:
	}
	
	public static String generateRandomTextTR(Random random, int count)
	{
		//TODO:
	}
	
	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}	
}
