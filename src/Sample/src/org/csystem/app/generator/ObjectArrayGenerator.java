package org.csystem.app.generator;

import org.csystem.math.Complex;
import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.Point;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class ObjectArrayGenerator {
    private final Random m_random = new Random();

    //String, Integer, Point, Circle, Complex, Boolean, Character
    private Object createObject()
    {
        return switch (m_random.nextInt(7)) {
            case 0 -> StringUtil.generateRandomTextTR(m_random, m_random.nextInt(5, 11));
            case 1 -> m_random.nextInt(-128, 127);
            case 2 -> Point.createCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 3 -> new Circle(m_random.nextDouble(-10, 10));
            case 4 -> m_random.nextBoolean();
            case 5 -> (char)((m_random.nextBoolean() ? 'A' : 'a') + m_random.nextInt(26));
            default -> new Complex(m_random.nextDouble(-10, 10), m_random.nextDouble(-10, 10));
        };
    }

    public Object [] createObjects(int count)
    {
        Object[] objects = new Object[count];

        while (count-- > 0)
            objects[count] = createObject();

        return objects;
    }
}
