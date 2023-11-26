/*----------------------------------------------------------------------------------------------------------------------
	charAt metoduna pozitif ya da negatif bakımdan sınırlar dışında değer verildiğinde exception oluşur. Verilecek 
	indeks değerleri [0, length) aralığında olmalıdır.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App { 
	public static void main(String [] args) 
	{	
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		
		System.out.printf("ch = %c%n", s.charAt(5));
	}	
}

