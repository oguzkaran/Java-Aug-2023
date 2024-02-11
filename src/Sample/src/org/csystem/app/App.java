/*----------------------------------------------------------------------------------------------------------------------
   Object sınıfının equals isimli Object parametreli ve geri dönüş değeri boolean olan sanal bir metodu vardır. Bu metot
   aynı türden iki nesne için mantıksal eşitlik karşılaştırmasında kullanılır. İki nesne için eşitlik kavramı söz konusuysa
   equals metodu override edilir. Bu da Java'da bir convention'dır. Object sınıfının equals metodu klasik adres karşılaştırması
   yapar. JavaSE ve üçüncü parti pek çok kütüphane içerisinde equals metodunu Object türü üzerinden çağıran sınıflar ve
   dolayısıyla metotları bulunmaktadır. Örneğin ArrayList sınıfının indexOf ve lastIndexOf metotları arama işlemini
   null adres araması yapılmıyorsa equals metodunu çağrırarak yaparlar. Bu durumda ArrayList içerisinde tutulan referansın
   dinamik türüne göre override edilmişse, override edilen equals çağrılmış olur. Bu durumda ilgili tür için mantıksal
   eşitlik karşılaştırması yapılmış olur.

   Anahtar Notlar: Bir sınıfta equals metodu override ediliğinde, Object sınıfının hashCode metodu da override edilir veya
   tersine hashCode metodu override edildiğinde equals metodu da override edilir. Yani bu iki metot bir sınıf içerisinde
   ya ikisi birden override edilir ya da ikisi de override edilmez. hashCode metodu "Java ile Uygulama Geliştirme 1"
   kursunda elde alınacaktır. Buradaki equals metodu override edilmiş sınıflarda override edilmeyecektir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;

class App {
    public static void main(String[] args)
    {
        Random r = new Random();

        System.out.println(r);
    }
}

