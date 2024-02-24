/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın içerisinde tüm metotların dışında static anahtar sözcüğü ile bildirilen bloklara "static initializer"
    denilmektedir. Sınıfın static initializer'ı sınıfın bir elemanı ilk kez kullanıldığında bir kez olmak üzere
    çalıştırılır. Sınıf içerisinde birden fazla static initializer bildirilebilir. Çalıştırılma sırası bildirim sırası
    ile aynıdır. static initializer static metot etkisindedir. Sınıfın static initializer'ı içerisinde final ve static
    olarak bildirilmiş veri elemanlarına değer verilebilir. Sınıfın birden fazla static initializer'ı varsa şüphesiz
    yalnızca bir tanesinde değer verilebilir.

    Bir sınıfın içerisinde tüm metotlşarın dışında bildirilen bloklara "non-static initializer" denilmektedir. Sınıfın
    non-static initializer'ı herhangi bir ctor'dan önce çalıştırılır. Yani ctor'un başına gizlice non-static initializer
    kodları yerleştirilir. Sınıf içerisinde birden fazla non-static initializer bildirilebilir. Çalıştırılma sırası
    bildirim sırası ile aynıdır. Non-static initializer non-static metot etkisindedir. Sınıfın non-static initializer'ı
    içerisinde final olarak bildirilmiş non-static veri elemanlarına değer verilebilir. Sınıfın birden fazla non-static
    initializer'ı varsa şüphesiz yalnızca bir tanesinde değer verilebilir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.InputMismatchException;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        try {
            DemoApp.run();
        }
        catch (InputMismatchException | MathException ex) {
            String message = ex.getMessage();

            Console.writeLine("Exception occurred%s", message != null ? ":" + message : "");
        }
        Console.writeLine("main ends!...");
    }
}

class DemoApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a number:");
        double val = kb.nextDouble();

        Console.writeLine("log(%f) = %f", val, MathUtil.log(val));
    }
}

class MathUtil {
    public static double log(double a)
    {
        if (a == 0)
            throw new NegativeInfinityException("Undefined");

        if (a < 0)
            throw new NaNException("Indeterminate");

        return Math.log(a);
    }
}

class NaNException extends MathException {
    public NaNException(String message)
    {
        super(message, MathExceptionStatus.NAN);
    }
}

class NegativeInfinityException extends MathException {
    public NegativeInfinityException(String message)
    {
        super(message, MathExceptionStatus.NEGATIVE_INFINITY);
    }
}

class MathException extends RuntimeException {
    private final MathExceptionStatus m_mathExceptionStatus;

    public MathException(String message, MathExceptionStatus mathExceptionStatus)
    {
        super(message);
        m_mathExceptionStatus = mathExceptionStatus;
    }

    public String getMessage()
    {
        return String.format("Message:%s, Status:%s", super.getMessage(), m_mathExceptionStatus);
    }

    public MathExceptionStatus getMathExceptionStatus()
    {
        return m_mathExceptionStatus;
    }
}

enum MathExceptionStatus {
    NAN, INFINITY, NEGATIVE_INFINITY, POSITIVE_INFINITY, UNDEFINED, INDETERMINATE
}