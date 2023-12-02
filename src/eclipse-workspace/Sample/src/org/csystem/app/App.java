/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir iki yazıdan birincisi içerisinde, ikincisinden kaç tane olduğuna geri
	dönen countString isimli metodu StringUtil sınıfı içerisinde yazınız ve test ediniz. Benzer şekilde case-insensitive
	olarak çalışan countStringIgnoreCase isimli metoda yazınız. 
	Örneğin: aaa yazısı içerisinde aa'dan 2 tane olmalı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

import org.csystem.util.string.StringUtil;

class App { 
	public static void main(String [] args) 
	{	
		StringUtilCountStringTest.run();
	}
}

class StringUtilCountStringTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.printf("Count:%d%n", StringUtil.countString(s1, s2));
			System.out.printf("Count:%d%n", StringUtil.countStringIgnoreCase(s1, s2));
		}
	}
}
