/*----------------------------------------------------------------------------------------------------------------------
	Türetme ilişkisinde nesnesel bir kapsama söz konusudur. Bu ilişkide türemiş sınıf nesnesi içerisinde taban sınıf
	kadarlık bir bölüm de bulunur. Bu anlamda bakıldığında türemiş sınıfa eklenmiş non-static veri elemanları aslında
	taban sınıf nesnesini genişletmiş olur. Bu durumda türemiş sınıf nesnenin bellekte kapladığı alan en az taban sınıf
	nesnesinin uzunluğu + türemiş sınıfa eklenen non-static veri elemanlarının toplam uzunluğu kadardır. Aslında türemiş
	sınıfa eklenen veri elemanı ile nesne genişlemiş (extend) olur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		B x = new B();
		C y = new C();

		x.a = 10;
		x.b = 20;
		y.a = 23;
		y.b = 34;
		y.c = 45;

		//...
	}
}

class C extends B {
	public int c;
	public void tar()
	{
		System.out.println("C.tar");
	}
	//...
}

class B extends A {
	public int b;
	public void bar()
	{
		System.out.println("B.bar");
	}
	//...
}

class A {
	public int a;
	public void foo()
	{
		System.out.println("A.foo");
	}
	//...
}
