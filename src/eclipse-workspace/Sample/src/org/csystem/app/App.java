/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte App sınıfının sqrt metodu çağrılır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

import static java.lang.Math.log10;


class App { 
	public static void main(String [] args) 
	{	
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("sqrt(%f) = %f%n", a, sqrt(a));
		System.out.printf("log(%f) = %f%n", a, log10(a));
	}	
}


