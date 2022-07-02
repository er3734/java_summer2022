package day10_StringManipolution;

import java.util.Locale;

public class C02_toLowercasatoUpperCase {
    public static void main(String[] args) {

        String str= "Beni psikopata bağlamayın";

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        // dil yoksa forlan.. yapılır

        System.out.println(str.toUpperCase(Locale.ENGLISH));

        /*
        eger büyük küçük harf konusunda local bir dili esas almak isterseniz
        bu method kullanılır
         */

    }
}
