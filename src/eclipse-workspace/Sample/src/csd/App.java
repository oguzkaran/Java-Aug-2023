/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının asal olup olmadığını test eden isPrime isimli
	metodu yazınız
	Asal Sayı: Yalnızca 1'e ve kendisine bölünebilen pozitif sayılara asal sayı denir
	
	Kural: Bir sayı karekökünden küçük olan asal sayıların hiç birisine bölünmüyorsa asaldır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		NumberUtilIsPrimeTest.run();
	}
}

class NumberUtilIsPrimeTest {
	public static void run()
	{			
		for (long i = -10; i <= 100; ++i)
			if (NumberUtil.isPrime(i))
				System.out.printf("%d ", i);
		
		System.out.println();
		
		System.out.println(NumberUtil.isPrime(1_000_003));
	}
}

class NumberUtil {
	public static boolean isPrime(long val)
	{
		if (val < 1)
			return false;
		
		for (long i = 2; i <= val / 2; ++i)
			if (val % i == 0)
				return false;
		
		return true;
	}
}
