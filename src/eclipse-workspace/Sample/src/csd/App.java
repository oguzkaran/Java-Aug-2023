/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir sayıdan küçük en büyük asal sayıya geri dönen previousClosestPrime isimli metodu 
	yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		NumberUtilPreviousClosestPrimeTest.run();
	}
}

class NumberUtilPreviousClosestPrimeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			long n = Long.parseLong(kb.nextLine());		
			
			
			System.out.printf("%d. sayısından küçük en büyük asal sayı:%d%n", n, NumberUtil.previousClosestPrime(n));
			
			if (n == 0)
				return;
		}
	}
}

class NumberUtil {
	public static long previousClosestPrime(long val)
	{
		//TODO:				
	}
	
	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
	
		for (long i = 11; i * i <= val; i += 2)		
			if (val % i == 0)
				return false;
		
		return true;		
	}
}


