/*----------------------------------------------------------------------------------------------------------------------
	NYPT'de özellikle veri elemanlarının gizlenmesine encapsulation denilmektedir. Bu anlamda bu kavrama veri/bilgi
	gizleme (data/information hiding) de denilmektedir. Bu kavram aslında gerçek hayattan programlamaya aktarılmıştır.
	Örneğin, televizyon izleyen bir kişi televizyonun kumandası ile nasıl haberleştiğini bilmek zorunda değildir. Yani
	bunu bilmesi ya da bilmeemsi izlemesini etkilemez. Bu durumda aslında bu kısım televizyonu izleyenden gizlenmiştir.
	Çünkü gerek yoktur. Ancak televiyonu üreten açısından bunun bilinmesi gerekir.

	Bir sınıf için iki bakış açısı söz konusudur: Sınıfı yazan bakış açısı, sınıfı kullanan bakış açısı.
	Sınıfı yazan, sınıfa ilişkin tüm detayları ve sınıfı kullanan bakış açısını da bilmelidir. Sınıfı kullanan ise
	içsel detayları bilmek zorunda değildir. Bu anlamda sınıfı yazana hizmet veren anlamında "server codes", kullanana
	ise hizmet alan anlamında "client codes" da denilmektedir. Aslında bu kavramlar geneldir. Sınıfların elemanlarının
	gizlenmesi ile NYPT'de kullanılmaktadır.

	Bir sınıfın veri elemanı gizlendiğinde, dışarıdan değerinin değiştirilmesi ve/veya değerinin elde edilmesi gerekebilir.
	Bunun için veri elemanına erişen public metotların yazılması gerekir. Gizlenmiş bir veri elemanının değerini değiştirmek
	için yazılan public metoda set metodu (setter/mutator) denir ve bir convention olarak (genelde) set öneki ile başlatılır.
	Gizlenmiş bir veri elemanının değerini elde etmek için yazılan public metoda get metodu (getter/accessor) denir ve
	bir convention olarak (genelde) get öneki ile başlatılır. Veri elemanı boolean türdense tipik olarak getter is ile
	başlatılır. Gizlenenen bir eleman için mutator ve accessor metotlarının yazılıp yazılmayacağı sınıfa yani domain'e
	bağlıdır. Bazı veri elemanları için hiç biri yazılmayabilirken, bazı veri elemanları için bir tanesi, bazı veri
	elemanları için ise ikisi de yazılabilir.

	Bir sınıfın public ve protected bölümleri dökumante edilir. private ve no-modifier bölümleri dökumante edilmez.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Date d = new Date();

		d.setDay(234);
	}
}

class Date {
	private int m_day, m_month, m_year;
	private int m_dayOfWeek;

	//...

	public void setDay(int day)
	{
		//...
		m_day = day;
	}

	public int getDay()
	{
		return m_day;
	}

	public void setMonth(int month)
	{
		//...
		m_month = month;
	}

	public int getMonth()
	{
		return m_month;
	}

	public void setYear(int year)
	{
		//...
		m_year = year;
	}

	public int getYear()
	{
		return m_year;
	}

	public int getDayOfWeek()
	{
		return m_dayOfWeek;
	}
}

