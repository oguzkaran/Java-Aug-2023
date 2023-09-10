/*----------------------------------------------------------------------------------------------------------------------
	 Sınıf Çalışması: Klavyeden katsayıları girilen ikinci dereceden bir denklemin köklerini bulan programı yazınız
	 Not: İleride daha iyisi yazılacaktır 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		QuadraticEquationApp.run();		
	}
}

class QuadraticEquationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Kaysayıları giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		QuadraticEquation.findRoots(a, b, c);		
	}
}

class QuadraticEquation {
	public static double calculateDelta(double a, double b, double c)
	{
		return b * b - 4  * a * c;
	}
	
	public static void findRoots(double a, double b, double c)
	{
		double delta = calculateDelta(a, b, c);
		
		if (delta >= 0) 
			printRoots(a, b, delta);		
		else
			System.out.println("Gerçek kök yok");		
	}
	
	public static void printRoots(double a, double b, double delta)
	{
		double sqrtDelta = Math.sqrt(delta);
		double x1 = (-b + sqrtDelta) / (2 * a);
		double x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);
		
	}	
}

