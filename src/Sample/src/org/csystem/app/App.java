/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte kullanılan for-each döngü deyiminin yaklaşık karşılığı şu şekildedir:

	{
		int val;

		for (int i = 0; i < a.length; ++i) {
			val = a[i];
			System.out.printf("%d ", val);
		}
	}
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		int [] a = {1, 2, 3, 4};

		for (int val : a)
			System.out.printf("%d ", val);

		System.out.println();
	}
}

