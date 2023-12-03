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
	public static String capitalize(String s)
	{
		return s.isEmpty() ? "" : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}
	
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
		return generateRandomText(random, count, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	public static String generateRandomTextTR(Random random, int count)
	{
		return generateRandomText(random, count, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
	}
	
	public static String generateRandomText(Random random, int count, String sourceText)
	{
		StringBuilder sb = new StringBuilder(count);
		int len = sourceText.length();
		
		for (int i = 0; i < count; ++i)
			sb.append(sourceText.charAt(random.nextInt(len)));
		
		return sb.toString();
	}
	
	public static boolean isPangramEN(String s)
	{
		//TODO:
	}
	
	public static boolean isPangramTR(String s)
	{
		//TODO:
	}
	
	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}	
}
