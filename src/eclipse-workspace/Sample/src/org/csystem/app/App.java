/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örneği inceleyiniz 
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

import org.csystem.util.string.StringUtil;

class App { 
	public static void main(String [] args) 
	{	
		StringUtilReverseTest.run();
	}
}

class StringUtilReverseTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("Yazının tersi:%s%n", StringUtil.reverse(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

