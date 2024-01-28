/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Object iVal = 127; // auto boxing: Integer.valueOf(127)
		int val = (int)iVal; // auto unboxing: ((Integer)iVal).intValue()

		System.out.println(val);
	}
}

