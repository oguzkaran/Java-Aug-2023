/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden girilen iki tam sayının toplamını, çarpımını ve farkını açıklamalara göre ekrana bastıran
	programı yazınız: 
	Açıklamalar:
		- Girilen sayılar 10 ve 20 olsun. Ekran çıktısı şu şekilde olacaktır:
		  	10 + 20 = 30
		  	10 * 20 = 200
		  	10 - 20 = -10
		- Ekrana formatlı yazdırmak için printf metodunu kullanınız 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		double b = kb.nextDouble();
		
		System.out.format("a = %d, b = %.20f%n", a, b);
	}
}