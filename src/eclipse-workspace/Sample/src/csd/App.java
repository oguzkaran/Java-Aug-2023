
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scannner(System.in);
		
		
		while (true) {
			System.out.print("Birinci sayıyı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("İkinci sayıyı giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			
			
			
			
			if (a == 0 && b == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

