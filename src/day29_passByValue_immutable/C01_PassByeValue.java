package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByeValue {
    public static void main(String[] args) {
        /*
        4 eelmanlı bir aary olusturalım sonra ayrı bir methoddat
        bu arrayin 2. ve 4. elemanlatını 100 den kucuk rstagele
        bir sayı ile dğiştirelim ve yeni halini yazdıralım
         */

        int[]arr={5,7,8,10};

        elemanDegistir(arr);

        System.out.println("main methodun icinde diger method calistiktan sonra: "+Arrays.toString(arr));
    }

    public static void elemanDegistir(int[] arr) {

        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));//[5, 92, 8, 17]
    }
}
