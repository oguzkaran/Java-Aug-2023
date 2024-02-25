package com.baturhansahin.random;

import java.util.random.RandomGenerator;

public class MyRandom implements RandomGenerator {
    private long m_seed;

    public MyRandom()
    {
        m_seed = System.currentTimeMillis();
    }

    public MyRandom(long seed)
    {
        m_seed = seed;
    }

    public long nextLong()
    {
        return (m_seed = m_seed * 123456789L / 23456789L) * 100;
    }

    //...
}
