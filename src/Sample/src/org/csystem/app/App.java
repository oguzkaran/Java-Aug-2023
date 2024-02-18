/*----------------------------------------------------------------------------------------------------------------------
    Sanal bir metotta throws bildirimi yapılmışsa, override etme işleminde şunlardan biri yapılabiilir:
    1. throws listesindeki exception sınıfı kaldırılabilir. Bu durumda throws listesi de kaldırılabilir.
    2. Türemiş sınıfta override edilen metotta throws listesine taban sınıftaki ilgili metodun throws listesindeki
    exception sınıfları veya onlardan türemiş olan exception sınıfları yazılabilir. Aksi durumda error oluşur. Aşağıdaki
    örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }

}

class E extends A {
    public void foo() throws MathException //error
    {
        //...
    }
}

class D extends A {
    public void foo() throws IndeterminateException
    {
        //...
    }
}

class C extends A {
    public void foo()
    {
        //...
    }
}

class B extends A {
    public void foo() throws NaNException
    {
        //...
    }
}


abstract class A {
    public abstract void foo() throws NegativeInfinityException, NaNException;
}

class IndeterminateException extends NaNException {
    public IndeterminateException(String message)
    {
        super(message);
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

class MathException extends Exception {
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
