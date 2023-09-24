/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir n değeri için n-inci Fibonacci sayısına geri dönen nthFibonacciNumber isimli
	metodu NumberUtil sınıfı içerisinde aşağıdaki açıklamalara göre yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
		- n değerinin pozitif olup olmadığı kontrolü yapılmayacaktır
		- Fibonacci sayılarına ilişkin seri şu şekildedir
			0 1 1 2 3 5 8 13 21 ...	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		NumberUtilNthFibonacciNumberTest.run();
	}
}

class NumberUtilNthFibonacciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			System.out.printf("%d.Fibonacci sayısı:%d%n", n, NumberUtil.nthFibonacciNumber(n));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int nthFibonacciNumber(int n)
	{
		//TODO:
	}
}