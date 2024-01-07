/*--------------------------------------------------------
	FILE NAME	: Point.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 7th January 2024
	
	Point class that represents a 2-dimensional point
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
	private double m_x, m_y;

	private Point(double a, double b, boolean polar)
	{
		m_x = polar ? a * Math.cos(b) : a;
		m_y = polar ? a * Math.sin(b) : b;
	}

	public static Point createCartesian(double x, double y)
	{
		return new Point(x, y, false);
	}

	public static Point createPolar(double radius, double theta)
	{
		return new Point(radius, theta, true);
	}

	public double getX()
	{
		return m_x;
	}

	public void setX(double x)
	{
		m_x = x;
	}

	public double getY()
	{
		return m_y;
	}

	public void setY(double y)
	{
		m_y = y;
	}

	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.m_x, other.m_y);
	}
	
	public double distance(double a, double b)
	{
		return sqrt(pow(m_x - a, 2) + pow(m_y - b, 2));
	}
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		m_x += dx;
		m_y += dy;
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", m_x, m_y);
	}
}
