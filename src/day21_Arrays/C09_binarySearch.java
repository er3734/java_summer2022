package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
        bin search nethodu sırlanmıs arrayde aradığımız elementin indexini dondurur
        ya aradığımız elemnt arrayde yoksa?
        (string de indexof olamayan elementler için -1 değerini dondurur)

        Aradığımız element arrayde yoksa java hem olmadığını hemnde olsaydı
        nerede olacağını bize dönürür

        olmadığını ifade için - kullanır  olsaydı nerede olacağını belirtmek için
        index değil  sıralama kullanır
         */

        int []sayilar={3,7,15,4,27,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[3, 4, 7, 10, 15, 27]
        System.out.println(Arrays.binarySearch(sayilar,4));//1
        System.out.println(Arrays.binarySearch(sayilar,15));//4
        System.out.println(Arrays.binarySearch(sayilar,11));//-5
        System.out.println(Arrays.binarySearch(sayilar,6));//-3
        System.out.println(Arrays.binarySearch(sayilar,-100)); //-1
    }
}
