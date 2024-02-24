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
            IX ix = factory.create();

            Util.doWork(ix);
            ThreadUtil.sleep(1000);
        }
    }
}

class Util {
    public static void doWork(IX ix)
    {
        Console.writeLine("---------------------------------------------------------------");

        Console.writeLine("Dynamic type:%s", ix.getClass().getName());
        ix.foo();
        Console.writeLine("---------------------------------------------------------------");
    }
}

class Factory {
    private final Random m_random = new Random();

    public IX create()
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
    public void foo()
    {
        Console.writeLine("F.foo");
        super.foo();
    }
}

class E extends C {
    public void foo()
    {
        Console.writeLine("E.foo");
        super.foo();
    }
}

class D extends A {
    public void foo()
    {
        Console.writeLine("D.foo");
        super.foo();
    }
}

class C extends B {
    public void foo()
    {
        Console.writeLine("C.foo");
        super.foo();
    }
}

class B extends A {
    public void foo()
    {
        Console.writeLine("B.foo");
        super.foo();
    }
}

class A implements IX {
    public void foo()
    {
        Console.writeLine("A.foo");
    }
}

interface IX {
    void foo();
}