/*----------------------------------------------------------------------------------------------------------------------
	Program içerisinde derleyicinin görmezden geleceği yazılara "yorum satırları (comment lines)" denir. Java'da iki
	çeşit yorum satırı kullanılmaktadır. Aşağıda örnekleri gösterilmiştir. İç içe yorum satırlarının kullanımında
	dikkatli olunmalıdır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

//App sınıfı
class App {
/*
	Burası da 
	derleyici tarafından dikkate alınmayacak
*/
	public static void main(String [] args) 
	{
		
		System.out.println("Hello, World"); //Burası derleyici tarafından dikkate alınmayacak
	}
}
