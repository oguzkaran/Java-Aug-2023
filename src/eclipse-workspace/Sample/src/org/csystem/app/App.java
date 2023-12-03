/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının Türkçe pangram olduğunu test eden isPangramTr ve İnglizce pangram
	olduğunu test eden isPangramEN metotlarını StringUtil sınıfı içerisinde yazınız ve test ediniz. 
	
	Pangram: İçerisinde özel isim geçmeyen ve ilgili dilin alfabesinde tüm karakterlerin kullanıldığı cümlelere denir.
	
	Programda özel isim ve anlamlı olması durumlarına bakılmayacaktır
	
	İnglizce Pangram: The quick brown fox jumps over the lazy dog
	Türkçe Pangram: Pijamalı hasta yağız şoföre çabucak güvendi
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

import org.csystem.util.string.StringUtil;

class App { 
	public static void main(String [] args) 
	{	
		StringUtilCapitalizeTest.run();
	}
}

class StringUtilCapitalizeTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.capitalize(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}