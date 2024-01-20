/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki demo örnekte Taxi ile Client ve Driver arasındaki ilişkileri inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String[] args)
	{
		Driver driver = new Driver("Ali Serçe", 100);
		Taxi taxi = new Taxi(driver/*...*/);

		Client client1 = new Client("secati", "Secati Şahin");

		taxi.take(client1);

		//...

		Client client2 = new Client("selami", "Selami Veli");

		taxi.take(client2);

		//...
	}
}

class Taxi {
	private Driver m_driver;
	//...

	public Taxi(Driver driver)
	{
		//...
		m_driver = driver;
	}

	public void take(Client client)
	{
		System.out.printf("Driver:%s%n", m_driver.toString());
		//...

		System.out.println("take!...");

		System.out.printf("Client:%s%n", client.getUsername());
	}

	//...
}

class Client {
	private String m_username;
	private String m_name;
	//...


	public Client(String username, String name)
	{
		m_username = username;
		m_name = name;
	}

	public String getUsername()
	{
		return m_username;
	}

	public void setUsername(String username)
	{
		m_username = username;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public String toString()
	{
		return String.format("Username:%s", m_username);
	}
	//...
}

class Driver {
	private String m_name;
	private int m_rating;

	//...

	public Driver(String name, int rating)
	{
		m_name = name;
		m_rating = rating;
	}

	public String getName()
	{
		return m_name;
	}

	public void setName(String name)
	{
		m_name = name;
	}

	public int getRating()
	{
		return m_rating;
	}

	public void setRating(int rating)
	{
		m_rating = rating;
	}

	public String toString()
	{
		return String.format("Name:%s, Rating:%d", m_name, m_rating);
	}

	//...
}

