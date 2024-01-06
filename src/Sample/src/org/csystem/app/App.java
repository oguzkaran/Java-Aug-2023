/*----------------------------------------------------------------------------------------------------------------------
	Singleton sınıfın lazy implementasyonu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1 == s2 ? "Aynı nesne" : "Farklı nesneler");
	}
}

class Singleton {
	private static Singleton ms_instance;
	private int m_value;

	private Singleton()
	{
	}

	public static Singleton getInstance()
	{
		if (ms_instance == null)
			ms_instance = new Singleton();

		return ms_instance;
	}

	public int getValue()
	{
		return m_value;
	}

	public void setValue(int value)
	{
		m_value = value;
	}
}