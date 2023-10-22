/*----------------------------------------------------------------------------------------------------------------------
	Homework-002-2.sorunun bir çözümü
	(Not:Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		PrintPrimeFactorsApp.run();
	}
}

class PrintPrimeFactorsApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int val = kb.nextInt();		
			
			NumberUtil.printPrimeFactors(val);
			
			if (val == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class NumberUtil {
	public static void printPrimeFactors(int val)
	{
		if (val == 0)
			return;
		
		val = Math.abs(val);
		
		
	}
}