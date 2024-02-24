/*--------------------------------------------------------
	FILE NAME	: Circle.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 24th February 2024

	Circle class that represents a circle

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.math.geometry;

public class Circle {
    protected static final double DELTA = 0.000001;
    private double m_radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public void setRadius(double radius)
    {
        if (radius < 0)
            throw new IllegalArgumentException(String.format("Radius must be non-negative:%f", radius));

        m_radius = radius;
    }

    public double getRadius()
    {
        return m_radius;
    }

    public double getArea()
    {
        return Math.PI * m_radius * m_radius;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * m_radius;
    }

    public boolean equals(Object other)
    {
        return other instanceof Circle c && Math.abs(m_radius - c.m_radius) < DELTA;
    }

    //hashCode

    public String toString()
    {
        return String.format("Radius:%f, Area:%f, Circumference:%f", m_radius, getArea(), getCircumference());
    }
}
