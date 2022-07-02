package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf= 'a';
        // char yeniHarf=harf+1 kod bu durumda önce sağdaki işlemi yapar
        //char yeniHarf=97+1--> 98 yapar
        // caahr 98 olamadığından hata verir

        char yeniHarf=(char)(harf+1);//98 in char olarak değerini verir/ "b"

        System.out.println(yeniHarf);

        char h=98;
        System.out.println(h);//b
        //bazen bi ver. a oluşturuldupğu data türü dışından değer atanabilir
        // bunlar bazısını ot. olarak kabul eder



        double sayi2=10;
        System.out.println("sayi2 : " + sayi2);//10.0

        int sayi3='c';
        System.out.println("sayi : " + sayi3 );//ascii top. daki değer 99
        //jav eğer bu değer atamasında sorun olaşacığını görürse
        //otomatik olarak bu atamayı kabul etmez
        //sizden bu atamayı istiyorsanız sorumluluğu almanız bekler

        int sayi1=(int)7.3;
        System.out.println("sayi1 : " + sayi1);
        
        double a='9';

        System.out.println("a = " + a);



    }

}
