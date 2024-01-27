/*----------------------------------------------------------------------------------------------------------------------
	Object sınıfı doğrudan ya da dolaylı olarak her sınıfın taban sınıfı olduğuna göre her türden referans Object türden
	bir referansa doğrudan atanabilir. Aşağıdaki demo örneği inceleyiniz
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
		Object x;

		for (int i = 0; i < count; ++i) {
			x = factory.create();

			System.out.printf("Dynamic Type:%s%n", x.getClass().getName());
			//....
		}
	}
}

class ObjectFactory {
	private final Random m_random = new Random();

	public Object create()
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
	public int a;
	//...
}

