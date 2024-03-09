/*--------------------------------------------------------
	FILE NAME	: Triple.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 9th March 2024

	Triple class that represents a tuple

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.tuple;

public final class Triple<F, S, T> {
    public final F first;
    public final S second;
    public final T third;

    public Triple(F first, S second, T third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <F, S, T> Triple<F, S, T> of(F first, S second, T third)
    {
        return new Triple<>(first, second, third);
    }

    public boolean equals(Object other)
    {
        return other instanceof Triple<?,?,?> t
                && first.equals(t.first) && second.equals(t.second) && third.equals(t.third);
    }

    //...

    public String toString()
    {
        return String.format("(%s, %s, %s)", first, second, third);
    }
}
