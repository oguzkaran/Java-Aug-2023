/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki demo örnekte dolaylı olarak içiçe try blokları vardır. run metodunu yazan programcı dökumanı içerisinde
    fırlattığı exception'ları belirtir. Dikkat edilirse run metodu IndeterminateException fırlatmamaktadır. Bu metot
    dökumanında UndefinecException ve NumberFormatException fırlattığını söyler. Örnekte NumberFormatException
    fırlatıldığında yakalayan uygun bir catch bloğu bulunamadığından program abnormal bir biçimde sonlanır. Örneği
    çeşitli değerler ile çalıştırıp sonuçları gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        try {
            DemoApp.run();
        }
        catch (UndefinedException ignore) {
            Console.writeLine("Undefined!...");
        }

        Console.writeLine("main ends!...");
    }
}


class DemoApp {
    public static void run()
    {
        try {
            double val = Console.readDouble("Input a value:");
            double result = MathUtil.log(val);

            Console.writeLine("log(%f) = %f", val, result);
        }
        catch (IndeterminateException ignore) {
            Console.writeLine("run:Indeterminate!...");
        }

        Console.writeLine("run ends!...");
    }
}

class MathUtil {
    public static double log(double a)
    {
        if (a == 0)
            throw new UndefinedException();

        if (a < 0)
            throw new IndeterminateException();

        return Math.log(a);
    }
}

class UndefinedException extends RuntimeException {
    //...
}

class IndeterminateException extends RuntimeException {
    //...
}