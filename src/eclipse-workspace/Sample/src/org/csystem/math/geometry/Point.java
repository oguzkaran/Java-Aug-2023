/*--------------------------------------------------------
	FILE NAME	: Point.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 19th November 2023
	
	Point class that represents a 2 dimensional point
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.math.geometry;

public class Point {
	public double x, y;
	
	public Point()
	{
		
	}
	
	public Point(double a)
	{
		x = a;
	}
	
	public Point(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public void print()
	{
		System.out.printf("(%f, %f)%n", x, y);
	}
}
