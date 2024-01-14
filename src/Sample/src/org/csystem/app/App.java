/*----------------------------------------------------------------------------------------------------------------------
	enum sınıfına sabitler dışında da elemanlar eklenebilir. Bunun için son sabit bildiriminden sonra noktalı virgül
	konmalıdır. enum sınıfına klasik sınıflarda olduğu gibi veri elemanı, ctor ve metot eklenebilmektedir. enum sınıfına
	herhangi bir ctor eklenmemişse klasik sınıflarda olduğu gibi default ctor derleyici tarafından içi boş ve otomatik
	olarak yazılır. Ancak klasik sınıflarda default ctor public yazılırken, enum sınıflarında ister derleyici yazsın
	ister programcı yazsın bir ctor public olarak yazılamaz. ctor ya private ya da no-modifier olarak yazılabilir. enum
	sınıflarında ctor için no-modifier private ile aynı anlamdadır. Ancak diğer elemanlar için yin eklasik sınıflardaki
	erişim belirliyiciler geçerlidir. ctor'un private olması (aslında private'dan da öte) enum sınıfı türünden nesnenin
	sınıf dışında yaratılamauacağı anlamındadır. enum sınıfı için sınıf içerisinde de aynı enum sınıfı türünden bir nesne
	yaratılamaz. Yani enum sınıflarının ctor'ları private erişiminde ötesinde bir erişime sahiptir. Bu durumda bir
	enum sınıfı türünden nesne sayısı sabit sayısı kadardır.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		Random random = new Random();
		Scanner kb = new Scanner(System.in);
		Month [] months = Month.values();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		for (int i = 0; i < count; ++i) {
			Month month1 = months[random.nextInt(months.length)];
			Month month2 = months[random.nextInt(months.length)];
			int diff = month1.ordinal() - month2.ordinal();

			if (diff > 0)
				System.out.printf("%s ile %s arasında %d ay vardır%n", month2.toString(), month1.toString(), diff);
			else if (diff < 0)
				System.out.printf("%s ile %s arasında %d ay vardır%n", month1.toString(), month2.toString(), -diff);
			else
				System.out.printf("%s ile %s aynı aylardır%n", month1.toString(), month2.toString());
		}
	}
}


enum Month {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
}

