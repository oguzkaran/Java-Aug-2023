/*----------------------------------------------------------------------------------------------------------------------
	Değişken isimlendirme kuralları:
	Bu kurallar Java'da tüm değişken atomlar için geçerlidir.
	
	- Değişken isimleri sayısal bir karakter ile başlatılamaz. Uygun bir karakter ile başlatılıp istenildiği kadar 
	sayısal karakter kullanılabilir.
	
	- Değişken ismi alfabetik bir karakter ile başlatılabilir
	
	- Değişken isminde _ karakteri kullanılabilir. Hatta değişken ismi _ karakteri ile başlatılabilir.
	
	- Java 8 ile birlikte _ karakterinin tek başına kullanılması deprecated olmuştur. Java 9 ile birlikte de artık 
	geçersiz duruma gelmiştir.
	
	- Anahtar sözcükler tek başına değişken ismi olarak kullanılamaz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		int _;
	}
}