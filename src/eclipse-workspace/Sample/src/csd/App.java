/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte ** ile belirtilen kod parçasında add metodu yeni a değeri için de çağrılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki tane sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int result;
		
		result = NumberUtil.add(a, b);
		
		//...
		System.out.println(result);
	}
}

class NumberUtil {
	public static int add(int a, int b)
	{
		return a ;
	}
}
