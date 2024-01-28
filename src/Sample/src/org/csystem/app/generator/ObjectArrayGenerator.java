package org.csystem.app.generator;

import org.csystem.math.Complex;
import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.Point;
import org.csystem.primitive.wrapper.IntValue;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class ObjectArrayGenerator {
    private final Random m_random = new Random();

    //String, IntValue, Point, Circle, Complex
    private Object createObject()
    {
        return switch (m_random.nextInt(5)) {
            case 0 -> StringUtil.generateRandomTextTR(m_random, m_random.nextInt(5, 11));
            case 1 -> IntValue.of(m_random.nextInt(-128, 127));
            case 2 -> Point.createCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 3 -> new Circle(m_random.nextDouble(-10, 10));
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
