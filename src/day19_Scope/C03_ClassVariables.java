package day19_Scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        farklı bir clasta calışırken herhangi bir clas adını yazıp
        noktaya basarsak adını yazdığımız classtaki tüm static
        class uyelerini göerbilir ve kullanbiliriz
         */

        C02_StaticVariables.staticMethod();//10
        System.out.println(C02_StaticVariables.staticSayi);//10
        System.out.println(C02_StaticVariables.degersizStaticVar);//0
        /*
        class level var.lara değer atayıp atamamak bize kalmıştır
        istersek değer ataması yaparız istemezsek değer atamayız
        eğer değer atmışsak java atadığımız o değeri kabul eder
        değer atamazsak o zaman java bu var.lara default bir
        değer taması yapar
        int-->0;
        Sitring-->null
        boolean-->false
        char-->'' hiçlik
         */

        /*
        başka classtaki instance var.lara obje oluşturarak ulaşabiliriz
         */
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        //bu method içinde static sayı 20 oldu
        System.out.println(obje1.isim);//mehmet
        System.out.println(obje1.degersizInstanceVar);//0
        obje1.staticOlmayanMethod();//20
        /*
        farklı bir classtn C02 calsından method ve var.ları
        kullandığımda C02 clasının tamamı değil sadece benım çağırdığım
        kısım class uyeleri calışır

         */
    }
}
