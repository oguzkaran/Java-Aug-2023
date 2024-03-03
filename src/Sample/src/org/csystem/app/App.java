/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki örnekte metodun generic tür paramtre ismi sınıfın generic tür parametre ismi ile aynı olabilir. Faaliyet
    alanı kuralları böylesi isimlendirme geçerlidir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Sample.foo(10);
        Sample.foo("ankara");
    }
}

class Sample<T> {
    public static <T> void foo(T t)
    {
        //...
    }
}
