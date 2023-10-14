/*----------------------------------------------------------------------------------------------------------------------	 
	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c;
		
		c = Math.sqrt(a) + Math.round(b);
	
		System.out.printf("c = %f%n", c);
	}
}
