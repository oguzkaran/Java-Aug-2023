/*--------------------------------------------------------
	FILE NAME	: BitConverter.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 29th June 2024

	Utility class for converting primitive types and
	String to/from byte array

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.converter;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class BitConverter {
    private BitConverter()
    {
    }

    public static byte[] getBytes(int a)
    {
        return ByteBuffer.allocate(Integer.BYTES).putInt(a).array();
    }

    public static byte[] getBytes(long a)
    {
        return ByteBuffer.allocate(Long.BYTES).putLong(a).array();
    }

    public static byte[] getBytes(short a)
    {
        return ByteBuffer.allocate(Short.BYTES).putShort(a).array();
    }

    public static byte[] getBytes(byte a)
    {
        return new byte[] {a};
    }

    public static byte[] getBytes(double a)
    {
        return ByteBuffer.allocate(Double.BYTES).putDouble(a).array();
    }

    public static byte[] getBytes(float a)
    {
        return ByteBuffer.allocate(Float.BYTES).putFloat(a).array();
    }

    public static byte[] getBytes(char a)
    {
        return ByteBuffer.allocate(Character.BYTES).putChar(a).array();
    }

    public static byte [] getBytes(String str)
    {
        return getBytes(str, StandardCharsets.UTF_8);
    }

    public static byte [] getBytes(String str, Charset charset)
    {
        return str.getBytes(charset);
    }

    public static byte[] getBytes(boolean a)
    {
        return new byte[]{(byte)(a ? 1 : 0)};
    }

    public static int toInt(byte [] buf)
    {
        return ByteBuffer.wrap(buf).getInt();
    }

    public static long toLong(byte [] buf)
    {
        return ByteBuffer.wrap(buf).getLong();
    }

    public static short toShort(byte [] buf)
    {
        return ByteBuffer.wrap(buf).getShort();
    }

    public static byte toByte(byte [] buf)
    {
        return buf[0];
    }

    public static double toDouble(byte [] buf)
    {
        return ByteBuffer.wrap(buf).getDouble();
    }

    public static float toFloat(byte [] buf)
    {
        return ByteBuffer.wrap(buf).getFloat();
    }

    public static char toChar(byte [] buf)
    {
        return ByteBuffer.wrap(buf).getChar();
    }

    public static boolean toBoolean(byte [] buf)
    {
        return buf[0] == 1;
    }

    public static String getString(byte [] buf)
    {
        return getString(buf, StandardCharsets.UTF_8);
    }

    public static String getString(byte [] buf, Charset charset)
    {
        return new String(buf, charset);
    }
}
