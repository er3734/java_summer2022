package javaITSorulari_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class S13 {
    public static void main(String[] args) {
        //Kullanıcıdan 2 Dize girmesini isteyin. Dizelerin karakterleri ve karakter sayıları aynıysa
        // konsola "Anagram" yazdırın. Aksi takdirde, konsolda "Not Anagram" yazdırın. Vakaları yoksay.
        // Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

        Scanner scan=new Scanner(System.in);
        System.out.println("1. kelimeyi giriniz ");
        String str1=scan.next();
        System.out.println("1. kelimeyi giriniz ");
        String str2=scan.next();

        String []str1Dizi=str1.toLowerCase().split("");
        Arrays.sort(str1Dizi);
        String[]str2Dizi=str2.toLowerCase().split("");
        Arrays.sort(str2Dizi);
        if (str1Dizi.length!=str2Dizi.length){
            System.out.println("angram değil");
        }else if (Arrays.equals(str1Dizi,str2Dizi)){
            System.out.println("kelimeler angramdır");
        }else {
            System.out.println("anagram değildir");
        }

    }
}
