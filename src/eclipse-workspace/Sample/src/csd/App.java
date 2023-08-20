/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Java derleyicisi akışın herhangi bir noktaya kesinlikle gelemeyeceğini anladığında genel olarak 
	error oluşturur. Bu tip kod parçalarına "unreachable codes" da denilmektedir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args) 
	{
		int result;
		
		result = NumberUtil.add() * 2; 
		
		System.out.println(result);
	}
}

class NumberUtil {
	public static int add() //error
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		
		return a + b;
		System.out.println("Unreachable code"); //error
	}
}
