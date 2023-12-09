/*----------------------------------------------------------------------------------------------------------------------
	Soru: Aşağıdaki repeat metodunu döngü kullanmadan ve Java 11 ile eklenen repeat metodunu kullanmadan yazınız.
		public static String repeat(char ch, int count)
		{
			StringBuilder sb = new StringBuilder(count);

			while (count-- > 0)
				sb.append(ch);

			return sb.toString();
		}
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		System.out.println(Util.repeat1('x', 4));
		System.out.println(Util.repeat2('x', 4));
	}
}

class Util {
	public static String repeat1(char ch, int count)
	{
		return String.format("%0" + count + "d", 0).replace('0', ch);
	}

	public static String repeat2(char ch, int count)
	{
		return String.format("%" + count + "c", ' ').replace(' ', ch);
	}
}

