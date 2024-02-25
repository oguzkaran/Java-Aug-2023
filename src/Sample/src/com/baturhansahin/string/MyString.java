package com.baturhansahin.string;

public class MyString implements CharSequence {
    private final char [] m_chars;

    public MyString(String str)
    {
        m_chars = str.toCharArray();
    }

    public int length()
    {
        return m_chars.length;
    }

    public char charAt(int index)
    {
        if (index < 0 || index >= m_chars.length)
            throw new IndexOutOfBoundsException("Invalid index");

        return m_chars[index];
    }

    public CharSequence subSequence(int start, int end)
    {
        return String.valueOf(m_chars).subSequence(start, end);
    }

    public String toString()
    {
        return String.valueOf(m_chars);
    }

    //...
}
