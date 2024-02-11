package org.csystem.factory;

import org.csystem.math.geometry.Point;

import java.util.Random;

public class RandomPointFactory {
    private final Random m_random;

    public RandomPointFactory(Random random)
    {
        m_random = random;
    }

    public Point create(double origin, double bound)
    {
        return Point.createCartesian(m_random.nextDouble(origin, bound), m_random.nextDouble(origin, bound));
    }

    public Point create(int origin, int bound)
    {
        return Point.createCartesian(m_random.nextInt(origin, bound), m_random.nextInt(origin, bound));
    }
}
