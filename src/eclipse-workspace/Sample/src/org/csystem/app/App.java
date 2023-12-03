/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı Random referansı ile int türden count bilgisi için, her biri rasgele 
	üretilmiş count tane Türkçe karakterden oluşan yazıya geri dönen generateRandomTextTR ve  her biri rasgele  üretilmiş
	count tane İngilizce karakterden oluşan yazıya geri dönengenerateRandomTextEN metotlarını StringUtil sınıfı içerisinde
	yazınız ve aşağıdaki kod ile test ediniz   
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import org.csystem.util.string.StringUtil;

class App { 
	public static void main(String [] args) 
	{	
		StringUtilGenerateRandomTextTest.run();
	}
}

class StringUtilGenerateRandomTextTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random random = new Random();
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count <= 0)
				break;
				
			System.out.printf("Text:%s%n", StringUtil.generateRandomTextEN(random, count));
			System.out.printf("YAzı:%s%n", StringUtil.generateRandomTextTR(random, count));
		}
	}
}
