/*----------------------------------------------------------------------------------------------------------------------
   Aşağıdaki demo örneği inceleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;
import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

class App {
    public static void main(String[] args)
    {
        Factory factory = new Factory();

        while (true) {
            A x = factory.create();

            Util.doWork(x);
            ThreadUtil.sleep(1000);
        }
    }
}

class Util {
    public static void doWork(A a)
    {
        Console.writeLine("---------------------------------------------------------------");

        Console.writeLine("Dynamic type:%s", a.getClass().getName());
        a.foo();
        Console.writeLine("---------------------------------------------------------------");
    }
}

class Factory {
    private final Random m_random = new Random();

    public A create()
    {
        return switch (m_random.nextInt(5)) {
            case 0 -> new B();
            case 1 -> new C();
            case 2 -> new D();
            case 3 -> new E();
            default -> new F();
        };
    }
}

class F extends D {
    public void foo() //override
    {
        Console.writeLine("F.foo");
        super.foo();
    }
}

class E extends C {
    public void foo() //override
    {
        Console.writeLine("E.foo");
        super.foo();
    }
}

class D extends A {
    public void foo() //override
    {
        Console.writeLine("D.foo");
        super.foo();
    }
}

class C extends B {
    public void foo() //override
    {
        Console.writeLine("C.foo");
        super.foo();
    }
}

class B extends A {
    public void foo() //override
    {
        Console.writeLine("B.foo");
        super.foo();
    }
}

class A {
    public void foo() //virtual method
    {
        Console.writeLine("A.foo");
    }

    public final void bar() //not a virtual method
    {
        Console.writeLine("A.bar");
    }
}
