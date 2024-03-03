/*--------------------------------------------------------
	FILE NAME	: Pair.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 3rd March 2024

	Pair class that represents a tuple

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.tuple;

public final class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F first, S second)
    {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> of(F first, S second)
    {
        return new Pair<>(first, second);
    }


    public boolean equals(Object other)
    {
        return other instanceof Pair<?, ?> p && first.equals(p.first) && second.equals(p.second);
    }

    //...

    public String toString()
    {
        return String.format("(%s, %s)", first, second);
    }

}
