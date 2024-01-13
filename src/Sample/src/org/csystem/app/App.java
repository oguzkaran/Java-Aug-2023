/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki, Font sınıfının setColor ve GameObject sınıfının move metotlarının parametre isimleri bir fikir verse de
	parametrelerin türleri hangi değerleri alabileceğine yönelik bir fikir vermemektedir. Şüphesiz bu dokümantasyondan
	anlaşılabilir ancak kod açısından metotlar okunabilir/algılanabilir yazılmamıştır. Ayrıca bu metotlar çağrılırken
	verilen değerler de client code'ların okunabilirliğini/algılanabilirliğini azaltmaktadır. Yani aşağıdaki sınıflar
	ve ilgili metotları (setColor ve move) özel bir durum yoksa iyi tasarlanmanmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Font f = new Font();
		GameObject g = new GameObject();

		//...

		f.setColor(0);
		//...
		f.setColor(2);

		//...
		f.setColor(4);

		g.move(0);

		//...
		g.move(1);

		//...

		g.move(3);
	}
}

//Red = 0, Green = 1, Blue = 2, White = 3, Black = 4
class Font {
	public void setColor(int color)
	{
		//...
	}
}

//Right = 0, Top = 1, Left = 2, Bottom = 3
class GameObject {
	public void move(int direction)
	{
		//...
	}
}