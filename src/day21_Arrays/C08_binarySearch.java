package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        binay searc java da eleman aramanın kısa yoludur
        ancak bin.serch çalışması için once arrayin sıralı hale
        getrilmesi gerekir
        eğer sıralama yapmadan bin search yaparsanız sonucu bulamayabilir
        veya yanlış bulabilir
         */

        String [] harfler={"y","b","d","g","o","a"};

        String arananHarf="y";
        System.out.println(C03_Contains.contains1(harfler,arananHarf));

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        //bin serach bize aradığımız elemanın imdexini dondurur
        //Array sıralı olmadığı için arama sonucunu doğru bulamayabilir
       // emin olmak içi,n once sort yapmalıyız

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains1(harfler,arananHarf));
    }
}
