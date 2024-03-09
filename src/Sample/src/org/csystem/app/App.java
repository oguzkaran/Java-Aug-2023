/*----------------------------------------------------------------------------------------------------------------------
    Generic türden bir nesne new operatörü ile doğrudan yaratılamaz. Benzer şekilde generi türden bir dizi de new
    operatörü ile doğrudan yaratılamaz. Bunun için pek çok yöntem vardır. Burada aşağıdaki yöntemle nesne yaratma ele
    alınacaktır. Aşağıdaki yöntemde nesne için önce Object türden nesne yaratılmış sonra tür dönüştürme operatörü ile 
    generic türe dönüştürülmüştür. Benzer şekilde dizi için önce Object türden bir dizi yaratılmış sonra generic dizi
    referansına explicit olarak dönüştürülmüştür. Diğer yöntemler burada ele alınmayacaktır.

    Anahtar Notlar: Bu yöntemde bir çok static kod analizi aracı uyarı verebilecektir. Bu uyarı ve nedeni şu aşamda
    önemsizdir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

class Sample<T> {
    private T m_t;
    private T [] m_a;

    public Sample(int size)
    {
        m_t = (T)new Object();
        m_a = (T[])new Object[size];
    }

    //...
}

