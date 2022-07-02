package day12_stringManupolition;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str= "1Bu2gu3n Jav*a- cok g3uz/el";

        //str ı bugun java cok guzel haline getirin

        //replace met.daki all un amacı aynı özellikteki tüm karekterleri kapsamasıdır
        //bütün satıları sil
        //bütün özel karekterleir sil

        //tum özel kareketeri sislelim dedeiğimizde spacelerde siliniyor
        //spaceleri korumal için en başta onların yerine cümlede bulunmayacak bir string kaoyalım
        //bir string koyalım
        //qazwsx
        str=str.replace(" ","qazwsx");
       // System.out.println(str);

        str=str.replaceAll("\\W","");
        //System.out.println(str);//1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");
        str=str.replace("qazwsx"," ");

        System.out.println(str);
    }
}
