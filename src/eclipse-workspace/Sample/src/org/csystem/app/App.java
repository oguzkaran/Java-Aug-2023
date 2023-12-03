/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıda prototipleri verilen metotları StringUtil sınıfı içerisinde yazınız ve test ediniz
		public static String padLeading(String s, int newLen, char ch);
		public static String padLeading(String s, int newLen);
		public static String padTrailing(String s, int newLen, char ch);
		public static String padTrailing(String s, int newLen);
	Açıklamalar:
		- padLeading metodunun 3 parametreli overload'u aldığı yazının uzunluğu newLen ile aldığı değerden küçükse
		yazıyı baştan, üçüncü parametresi ile aldığı karakter ile besleyecektir. Örneğin:
		 	padLeading("ankara", 11, 'x');
		 çağrısı için 
		 	xxxxxankara
		 yazısına dönecektir.
		 newLen değeri yazının uzunluğundan büyük değilse aynı yazıya geri dönecektir
		 
		 - padLeading metodunun 2 parametreli overload'u yazıyı space ile besleyecektir
		 
		 - padTrailing metotları, padLeading metotlarının sondan besleyen versiyonları olarak yazılacaktır
		 
		 - Java 11 öncesine yazıyor varsayılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App { 
	public static void main(String [] args) 
	{	
		TrimLeadingTarilingTest.run();
	}
}

class TrimLeadingTarilingTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", Util.trim(s));
			System.out.printf("(%s)%n", Util.trimLeading(s));
			System.out.printf("(%s)%n", Util.trimTrailing(s));
		}
	}
}

class Util {
	public static String trim(String s)
	{
		return trimTrailing(trimLeading(s));
	}
	
	public static String trimLeading(String s)
	{
		int len = s.length();
		int i = 0;
		
		for (; i < len && Character.isWhitespace(s.charAt(i)); ++i)
			;
		
		return s.substring(i);
	}
	
	public static String trimTrailing(String s)
	{
		int i = s.length() - 1;
		
		for (; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
			;
		
		return s.substring(0, i + 1);
	}
}