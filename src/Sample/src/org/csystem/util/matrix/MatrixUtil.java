/*--------------------------------------------------------
	FILE NAME	: MatrixUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 30th December 2023

	Utility class for matrix operations

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.matrix;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class MatrixUtil {
    public static int [][] generateRandomMatrix(Random random, int row, int col, int origin, int bound)
    {
        int [][] a = new int[row][col];

        ArrayUtil.fillRandomArray(random, a, origin, bound);

        return a;
    }


    public static int [][] generateRandomSquareMatrix(Random random, int n, int origin, int bound)
    {
        return generateRandomMatrix(random, n, n, origin, bound);
    }


    public static boolean isMatrix(int [][] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (a[0].length != a[i].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a.length == a[0].length;
    }


}
