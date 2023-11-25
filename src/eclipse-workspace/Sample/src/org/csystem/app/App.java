/*----------------------------------------------------------------------------------------------------------------------
	Yıldızlı import bildirimi (import on demand declaration): Yıldızlı import bildiriminin genel biçimi şu şekildedir:
		import <paket ismi>[.<alt paket ismi>].*;
	Niteliksiz arama genel kurallarına göre paket içerisnde bulunamayan bir isim yıldızlı import bildirimlerine ilişkin
	paketlerde aranır. Burada tüm yıldızlı import bildirimlerine bakılır ancak alt ve üst paketlere yine bakılmaz. Yani 
	bu bildirim isim arama genel kurallarına göre, paket içerisine isim aarama anlamında başka bir paketi adeta enjekte 
	etmektir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.*;
import org.csystem.math.geometry.*;
import org.csystem.math.*;

class App { 
	public static void main(String [] args) 
	{	
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Bir sayı giriniz:");
		
		int count = kb.nextInt();
		
		for (int i = 0; i < count; ++i) {
			Complex z = new Complex(r.nextDouble(3.4, 5.6), r.nextDouble(3.4, 5.6));
			Point p = new Point(r.nextDouble(3.4, 5.6), r.nextDouble(3.4, 5.6));
			
			System.out.println("------------------------");
			z.print();
			p.print();
			System.out.println("------------------------");
		}
	}
}



