package day19_Scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVar;
    /*
    class leveldaki var lara değer atamasakta java kabul ediyor
     */

    public static void main(String[] args) {
        /*
        bir var.static oluşturulduysa objeler için değil
        class için geçerlidir
         */
        System.out.println(staticSayi);//10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi);//12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi);//20
    }

    public static void staticMethod(){
        System.out.println(staticSayi);//10
    }
    public void staticOlmayanMethod(){
        /*
        static var.lar class içerisinden
        heryerden ulaşabilir.
        static olsun veya olmasın static var.ları göerebilr
        ve değiştirebilirler
        farklı methodalrda static var.lın hnagi değeri alaçağını
        bilmekl istiyorsK CLASIN BAŞINDAN İTİBAREN KODUN
        çalışmasını takip etmeliyiz
        method ne zaman çeğırılırsa ozamn static var.içindeki değeri kullanabiliirz
         */
        System.out.println(staticSayi);//12
        staticSayi=20;
        /*
        instnac bir varın değerini bulmak için
        objenin oluşturulmasımnda itibaren istenen satıra kadar takip etmeliyiz

        static var da ise classın en başından istenen satıra kadar
        kodu takip edip satatic var.ın son değerini bulmak gerekir
         */

    }
}
