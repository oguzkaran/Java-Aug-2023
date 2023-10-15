/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte koşul operatörünün üçüncü operandı b ifadesidir
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
		
		result = (a > b ? a + 100 : b) - 200; //**
		
		System.out.printf("result = %d%n", result);
	}
}

