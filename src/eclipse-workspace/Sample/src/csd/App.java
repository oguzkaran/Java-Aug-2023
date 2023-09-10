/*----------------------------------------------------------------------------------------------------------------------
	 Aşağıdaki örneği inceleyiniz 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (!Util.isOdd(a))
			System.out.printf("Çift sayı girdiniz:%d%n", a);
		else
			System.out.printf("Tek sayı girdiniz:%d%n", a);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;		
	}
	
	public static boolean isOdd(int a)
	{
		return !isEven(a);
	}
}

