/*----------------------------------------------------------------------------------------------------------------------
	Koşul operatörğ doğrudan if deyimine deyimine alternatif olmasa da bazı durumlarda okunabilirliği artırmak için
	kullanılır. 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = a + (a > b ? a : b);
		
		System.out.printf("result = %d%n", result);
	}
}