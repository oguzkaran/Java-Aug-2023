/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

class App {
	public static void main(String[] args)
	{
		IntArrayGenerator generator = new IntArrayGenerator(new Random(), 10);

		ArrayUtil.print(2, generator.getA());

		ArrayUtil.swap(generator.getA(), 2, 4);

		ArrayUtil.print(2, generator.getA());
	}
}

class IntArrayGenerator {
	private Random m_random;
	private final int [] m_a;

	public IntArrayGenerator(Random random, int count)
	{
		m_random = random;
		m_a = ArrayUtil.generateRandomArray(m_random, count, 0, 100);
	}

	public int get(int i)
	{
		return Arrays.copyOf(m_a, m_a.length);
	}
}