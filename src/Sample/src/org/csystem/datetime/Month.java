/*-------------------------------------------------------------
	FILE		: Month.java
	AUTHOR		: Java-Mar-2023 Group
	Last UPDATE	: 24th February 2023

	Month enum class

	Copyleft (c) 1993 C and System Programmers Association
	All Right Free
-------------------------------------------------------------*/
package org.csystem.datetime;

public enum Month {
	JAN(31, "Ocak"), FEB(28, "Şubat"), MAR(31, "Mart"), APR(30, "Nisan"), MAY(31, "Mayıs"), JUN(30, "Haziran"),
	JUL(31, "Temmuz"), AUG(31, "Ağustos"), SEP(30, "Eylül"), OCT(31, "Ekim"), NOV(30, "Kasım"), DEC(31, "Aralık");
	private final int m_days;
	private final String m_nameTR;

	Month(int days, String nameTR)
	{
		m_days = days;
		m_nameTR = nameTR;
	}

	static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public int getDays(int year)
	{
		return ordinal() == 1 && isLeapYear(year) ? 29 : m_days;
	}

	public String getNameTR()
	{
		return m_nameTR;
	}
}
