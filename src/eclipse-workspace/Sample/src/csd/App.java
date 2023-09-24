/*----------------------------------------------------------------------------------------------------------------------
	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		EXIT_LOOP:
		for (int i = 2; i <= 20; ++i) 
			EXIT_INNER_LOOP:
			for (int j = 3; j <= 40; ++j) 
				for (int k = 30; k >= 3; --k) {
					System.out.printf("(%d, %d, %d)%n", i, j, k);
					
					if ((i +  j + k) % 11 == 0)
						break EXIT_LOOP;
					
					if ((i +  j + k) % 7 == 0)
						break EXIT_INNER_LOOP;
				}	
					
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

