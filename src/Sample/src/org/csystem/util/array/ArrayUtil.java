/*--------------------------------------------------------
	FILE NAME	: ArrayUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 17th December 2023

	Utility class for array operations

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void fillRandomArray(Random random, int [] a, int origin, int bound)
    {
        fillRandomArray(random, a, a.length, origin, bound);
    }

    public static void fillRandomArray(Random random, int [] a, int count, int origin, int bound)
    {
        for (int i = 0; i < count; ++i)
            a[i] = random.nextInt(origin, bound);
    }

    public static int [] generateRandomArray(Random random, int count, int origin, int bound)
    {
        int [] a = new int[count];

        fillRandomArray(random, a, origin, bound);

        return a;
    }

    public static int [] histogramData(int [] a, int n)
    {
        int [] result = new int[n + 1];

        for (int i = 0; i < result.length; ++i)
            ++result[a[i]];

        return result;
    }

    public static boolean isEmpty(int [] a)
    {
        return a.length == 0;
    }

    public static int max(int [] a)
    {
        int result = a[0];

        for (int i = 0; i < a.length; ++i)
            result = Math.max(a[i], result);

        return result;
    }

    public static int min(int [] a)
    {
        int result = a[0];

        for (int i = 0; i < a.length; ++i)
            result = Math.min(a[i], result);

        return result;
    }

    public static void print(int [] a)
    {
        print(1, a);
    }

    public static void print(int n, int [] a)
    {
        print(n, a, a.length);
    }

    public static void print(int [] a, int count)
    {
        print(1, a, count);
    }

    public static void print(int n, int [] a, int count)
    {
        print(n, a, count, " ", "\n");
    }

    public static void print(int [] a, int count, String sep, String end)
    {
        print(1, a, count, sep, end);
    }

    public static void print(int n, int [] a, int count, String sep, String end)
    {
        String fmt = String.format("%%0%dd%%s", n);

        for (int i = 0; i < count; ++i)
            System.out.printf(fmt, a[i], sep);

        System.out.print(end);
    }

    public static void reverse(int [] a)
    {
        for (int i = 0; i < a.length / 2; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static int [] reversed(int [] a)
    {
        int [] result = new int[a.length];

        for (int i = a.length - 1; i >= 0; --i)
            result[result.length - 1 - i] = a[i];

        return result;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }
}
