/*----------------------------------------------------------------------------------------------------------------------
	Taban sınıf türünden bir referans türemiş sınıf türünden bir referansa implicit olarak dönüşemez ancak explicit olarak
	dönüşebilir. Bu kavrama downcasting denir. Aslında tür dönüştürme operatörü derleme işlemini geçmek içindir. Çalışma
	zamanında kaynak referansın dinamik türünün tür dönüştürme operatörüne yazılan türü kapsayıp kapsamamasına bakılır.
	Buradaki kapsama nesnesel kapsamadır. Eğer kapsıyorsa haklı dönüşümdür akış devam eder, kapsamıyorsa haksız dönüşümdür
	ve exception oluşur. Aşağıdaki demo örnekte B, C ve E dışındaki dinamik türler için haksız dönüşümden dolayı exception
	oluşur. Örneği çalıştırıp sonuçları gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		ObjectFactory factory = new ObjectFactory();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();
		A x;
		B y;

		for (int i = 0; i < count; ++i) {
			x = factory.create();

			System.out.printf("Dynamic Type:%s%n", x.getClass().getName());

			y = (B)x;
			//...
		}
	}
}

class ObjectFactory {
	private final Random m_random = new Random();

	public A create()
	{
		return switch (m_random.nextInt(6)) {
			case 0 -> new B();
			case 1 -> new C();
			case 2 -> new D();
			case 3 -> new E();
			case 4 -> new F();
			default -> new A();
		};
	}
}

class F extends D {
	//...
}

class E extends C {
	//...
}

class D extends A {
	//...
}

class C extends B {
	//...
}

class B extends A {
	//...
}


class A {
	//...
}
