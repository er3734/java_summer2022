package javaITSoruları_ifStatments;

public class ifS_S07_if {
    public static void main(String[] args) {
        /*
        Tam ad için dilbilgisi kurallarını kontrol etmek için kodu yazın
        a) Kodunuz "ali Can", "Ali can", "ali can" için "baş harflerinde hata" yazmalıdır
        b) Kodunuz gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
            "Ali" veya "Can" veya "ali"
       c) Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır
       d) Kodunuz bir veya daha fazla boşluk için "Ad girilmedi" yazmalıdır.
       " " gibi karakterler veya""
       e) Adın herhangi bir karakteri varsa, kodunuz "Geçersiz Ad" yazmalıdır.
       Not: Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları
       basılmış. Örneğin; "ali3" için kodunuz "Baş harflerde hata", "Ad
       veya soyadı eksik" ve "Geçersiz Ad"
        */
        String isim="Erdi Balta";
        if (isim.charAt(0)>='A'&&isim.charAt(0)<='Z'){}
        else {
            System.out.println("büyük harfle başlamalıdır");}


    }
}
