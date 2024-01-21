/*----------------------------------------------------------------------------------------------------------------------
	Anımsanacağı gibi nitelikli ve niteliksiz isim arama genel kurallarında bir isim sınıf içerisinde aranıyorsa ve
	bulunamadıysa taban sınıfa, yoksa onun taban sınıfına ... bakılır. Hiç birinde yoksa bu adımda bulunamamış olur
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		B x = new B();
		C y = new C();

		x.foo();
		x.bar();
		y.foo();
		y.bar();
		y.tar();

		x.a = 10;
		x.b = 20;
		y.a = 23;
		y.b = 34;
		y.c = 45;
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