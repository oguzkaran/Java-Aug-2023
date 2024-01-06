/*----------------------------------------------------------------------------------------------------------------------
	Bazı durumlarda sınıfın public bölümünde de değişiklik yapılması gerekebilir. Bu durumda değişikliği değişikliği
	doğrudan yapmak yerine, eskisi korunup deprecated yapılabilir. Şüphesiz bu durum yine domain'e bağlıdır. Örneğin
	Date sınıfımızda getMonth metodu (bir sebepten) getMonthValue olarak değiştirilmek istenebilir. Bu durumda getMonth
	metodu da deprecated yapılıp korunur ve getMonthValue eklenir. Bu durum şüphesiz sınıf dökumanlarında belirtilir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Date d = new Date(11, 7, 1983);

		System.out.printf("%02d/%02d/%04d%n", d.getDay(), d.getMonth(), d.getYear());
		d.setDay(6);
		d.setMonth(9);
		d.setYear(2021);
		System.out.printf("%02d/%02d/%04d%n", d.getDay(), d.getMonth(), d.getYear());
	}
}

class Date {
	private String m_date;
	private int m_dayOfWeek;

	//...

	public Date(int day, int month, int year)
	{
		//06/09/2021
		//...
		m_date = String.format("%02d/%02d/%04d", day, month, year);
		//...
	}

	public void setDay(int day)
	{
		//...
		m_date = String.format("%02d/%02d/%04d", day, getMonth(), getYear());
		//...
	}

	public int getDay()
	{
		return Integer.parseInt(m_date.substring(0, 2));
	}

	public void setMonth(int month)
	{
		//...
		m_date = String.format("%02d/%02d/%04d", getDay(), month, getYear());
		//...
	}

	public int getMonth()
	{
		return Integer.parseInt(m_date.substring(3, 5));
	}

	public void setYear(int year)
	{
		//...
		m_date = String.format("%02d/%02d/%04d", getDay(), getMonth(), year);
		//...
	}

	public int getYear()
	{
		return Integer.parseInt(m_date.substring(6));
	}

	public int getDayOfWeek()
	{
		return m_dayOfWeek;
	}
}
