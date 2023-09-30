/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıdaki açıklamalara göre ilgili metotları yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
		- getDayOfYear metodu parametresi ile değerlere ilişkin tarihin yılın kaçıncı günü olduğu bilgisine geri
		dönecektir. Metot tarihin geçersiz olması durumunda -1 değerine ger dönecektir
		
		 - getDayOfWeek metodu parametresi ile değerlere ilişkin tarihin haftanın hangi gününe karşılık geldiği bilgisine
		 geri dönecektir. Geçersizlik durumu kontrol edilmeyecektir. Haftanın hangi gününe geldiği bilgisi şu şekilde
		 bulunabilir: 01.01.1900 ile ilgili tarih arasındaki gün sayısı hesaplanır ve 7 değerine modu alınır. Bu durumda
		 sıfır Pazar, 1 pazartesi, ..., 6 cumartesi'ye karşılık gelir
		 
		 - getDayOfWeek metodu parametresi ile değerlere ilişkin tarihi geçerli bir tarihse şu şekilde yazdıracakdır:
		 		 
		 	01/03/2023 Çarşamba yılın 60. günüdür 
		 			 	
		 tarih geçersizse şu şekilde yazdıracaktır:
		 
		  	Geçersiz tarih!...
		 	
		 - Varolan metotların yapısını (isim, parametreler ve geri dönüş değeri gibi) değiştirmeden istediğiniz 
		 metodu ekleyebilirsiniz		 
		  
		 - Metotlar şu ana kadar görülen bilgiler ile yapılacaktır
		
	Not: İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		DemoDateApp.run();
	}
}

class DemoDateApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.println("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			DateUtil.printDateTR(day, month, year);
						
			if (day == 0 && month == 0 && year == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	
	public static void printDateTR(int day, int month, int year)
	{
		//TODO
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		//TODO
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		//TODO
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && 1900 <= year && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4, 6, 9, 11:		
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
