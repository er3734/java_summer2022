package day22_MultiDimensionalArray;

import java.util.Arrays;

public class C01_MulitiDA {
    public static void main(String[] args) {
        /*
        tek katlı arraylerde rrayi direkt yazdıramıyoruz çümkü array
        non primitiv edata türüdür her an non primitive data direkt yazdırılamayabilir

        ancak arrayin içerisi,ndeki elementleri direkt yazdırbiliyoruz
        çünkü genelde primitive data türü veya string elementler kullanılıyord

        mdarraylerde en dikkat edeceğimiz konu ulaşmak istediğimiz
        elementin bir array mi yoksa primitivr data mı olduğudur

         */
        int [][]sayilar={{1,2,4,5},{3,4}};
        /*
        burada sayilar arrayini düşünürsek içinde 2 tab-be inner array var
        sayilar[0]==[1,2,4,5]
        ancak en içerdekli elementlere ulaşırsak direkt yazdırabiliriz
         */
        System.out.println(sayilar[0]);//aray olduğu için direkt yazdırılamaz [I@19dfb72a
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]
        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3
        System.out.println(Arrays.toString(sayilar));//[[I@19dfb72a, [I@17c68925]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]
        /*
        arrayi iki şeklde declare edbiliyorduk
        1.de elemenları direkt yazabiliyotrduj
        int [][]sayilar={{1,2,4,5},{3,4}};
        2. outer ve inner arraylşerin uzunlukalarını belirterek olusturabiliriz
        int[][]sayilar=new int[3][4]
        anvak 2. yöbtemle yaptığımızda inner arraylerin farklı uzunlıkta olamaz
         */

    }
}
