/*----------------------------------------------------------------------------------------------------------------------
	reverse metodun başka bir implementasyonu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();
		Random random = new Random();

		for (int i = 0; i < count; ++i) {
			System.out.println("----------------------------------------------------");
			int [] a = ArrayUtil.generateRandomArray(random, random.nextInt(5, 11), 0, 100);

			ArrayUtil.print(2, a);
			ArrayUtil.reverse(a);
			ArrayUtil.print(2, a);
			System.out.println("----------------------------------------------------");
		}
	}
}

class Util {
	public static void reverse(int [] a)
	{
		int left = 0;
		int right = a.length - 1;

		while (left < right)
			swap(a, left++, right--);
	}

	public static void swap(int [] a, int i, int k)
	{
		int temp = a[i];

		a[i] = a[k];
		a[k] = temp;
	}
}
