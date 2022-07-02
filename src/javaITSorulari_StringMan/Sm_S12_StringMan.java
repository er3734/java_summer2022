package javaITSorulari_StringMan;

public class Sm_S12_StringMan {
    public static void main(String[] args) {
       //S12 Bir Dize'nin başında büyük harf olup olmadığını ve
        // sonunda nokta olup olmadığını kontrol etmek için kod yazın.
        String str="sasaslasajsaıhsas";
        if (str.charAt(0)>='A'&&str.charAt(0)<='Z'){
            System.out.println("ilk harf büyük");
        }else {
            System.out.println("ilk harf buyuk olmalı");
        }
        if (str.charAt(str.length()-1)=='.'){
            System.out.println("sonu noktyala bitiyor");
        }else
            System.out.println("sonunda nokta yok");

    }
}
